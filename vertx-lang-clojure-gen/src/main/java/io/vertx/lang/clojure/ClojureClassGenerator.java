package io.vertx.lang.clojure;

import io.vertx.codegen.*;
import io.vertx.codegen.format.KebabCase;
import io.vertx.codegen.writer.CodeWriter;
import io.vertx.lang.clojure.utils.ClojureUtils;

import java.io.StringWriter;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

import static io.vertx.lang.clojure.utils.ClojureUtils.*;

public class ClojureClassGenerator extends AbstractClojureCodeGenerator<ClassModel> {
    private boolean handlerRendered;
    private boolean functionRendered;

    public ClojureClassGenerator() {
        super();
        this.name = "Clojure";
        this.kinds = Collections.singleton("class");
    }

    @Override
    public String render(ClassModel model, int index, int size, Map<String, Object> session) {
        handlerRendered = false;
        functionRendered = false;

        final StringWriter buffer = new StringWriter();
        final CodeWriter writer = new CodeWriter(buffer);
        writer.println("(ns " + model.getType().translatePackageName("clojure") + "."
            + model.getType().getRaw().getSimpleName(KebabCase.INSTANCE) + ")");
        writer.println();

        Set<String> imports = new TreeSet<>();

        // Mapping between function+arity and arg list
        Map<String, List<String>> paramMap = new HashMap<>();

        // Mapping between function and mapping function+arity and arg list
        Map<String, Map<String, List<String>>> methods = new HashMap<>();

        model.getMethods().forEach(methodInfo -> {
            if (model.getMethodMap().get(methodInfo.getName()) == null) {
                throw new RuntimeException("Method not found! "
                    + model.getType().getSimpleName() + "#" + methodInfo.getName());
            }

            getImports(model, imports, methodInfo);
            getMethodsAndArgsName(paramMap, methods, methodInfo);
        });

        renderImports(writer, imports);
        writer.println();

        String className = model.getType().getRaw().getSimpleName();
        String objName = className.substring(0, 1).toLowerCase() + className.substring(1);
        String kebabCaseObjName = clojurifyName(objName);

        methods.forEach(renderMethod(model, writer, className, kebabCaseObjName));

        // TODO Get methods that takes Handler as arg to simply accept a one-arg function.
        if (imports.contains("io.vertx.core.Handler") && !handlerRendered) {
            renderHandlerMethod(writer);
        }
        if (imports.contains("java.util.function.Function") && !functionRendered) {
            renderFunctionMethod(writer);
        }

        return buffer.toString();
    }

    private BiConsumer<String, Map<String, List<String>>> renderMethod(ClassModel model, CodeWriter writer, String className, String kebabCaseObjName) {
        return (methodName, value) -> {
            if ("handler".equals(methodName)) {
                renderHandlerMethod(writer);
                handlerRendered = true;
            } else if ("function".equals(methodName)) {
                renderFunctionMethod(writer);
                functionRendered = true;
            } else {
                MethodInfo methodInfo = model.getMethodMap().get(methodName).get(0);
                if (methodName.equals(className)) {
                    renderCtor(model, writer, methodName, value);
                } else if (methodInfo.isStaticMethod()) {
                    renderStaticMethod(model, writer, methodName, value);
                } else {
                    renderMethod(writer, kebabCaseObjName, methodName, value);
                }
            }
            writer.println();
        };
    }

    private void renderMethod(CodeWriter writer, String kebabCaseObjName, String methodName, Map<String, List<String>> value) {
        String s = clojurifyName(methodName);
        if (s.startsWith("is-")) {
            s = s.replaceAll("^is\\-", "") + "?";
        }
        writer.print("(defn " + s);
        value.forEach((key, value1) -> {
            writer.println();
            List<String> methodArgs = new ArrayList<>();
            methodArgs.add(kebabCaseObjName);
            methodArgs.addAll(value1);
            String args = methodArgs.stream().map(ClojureUtils::clojurifyName).collect(Collectors.joining(" "));
            writer.println("  ([" + args + "]");
            writer.print("    (." + methodName + " " + args + "))");
        });
        writer.println(")");
    }

    private void renderStaticMethod(ClassModel model, CodeWriter writer, String methodName, Map<String, List<String>> value) {
        writer.print("(defn " + clojurifyName(methodName));
        value.forEach((key, value1) -> {
            writer.println();
            String args = value1.stream().map(ClojureUtils::clojurifyName).collect(Collectors.joining(" "));
            writer.println("  ([" + args + "]");
            writer.print("    (" + model.getType().getRaw().getSimpleName() + "/" + methodName + " " + args + "))");
        });
        writer.println(")");
    }

    private void renderCtor(ClassModel model, CodeWriter writer, String methodName, Map<String, List<String>> value) {
        writer.print("(defn " + clojurifyName(methodName));
        value.forEach((key, value1) -> {
            writer.println();
            String args = value1.stream().map(ClojureUtils::clojurifyName).collect(Collectors.joining(" "));
            writer.println("  ([" + args + "]");
            writer.print("    (new " + model.getType().getRaw().getSimpleName() + " " + args + "))");
        });
    }

    private void renderImports(CodeWriter writer, Set<String> imports) {
        imports.stream().filter(s -> s.startsWith("io.vertx") || s.startsWith("java.util")).forEach(s -> {
            writer.println("(import " + s + ")");
        });
    }

    private void getImports(ClassModel model, Set<String> imports, MethodInfo methodInfo) {
        for (ParamInfo paramInfo: methodInfo.getParams()) {
            if (paramInfo.getType().getRaw() != null) {
                imports.add(paramInfo.getType().getRaw().getName());
            }
        }
        imports.add(model.getType().getRaw().getName());
    }

    private void getMethodsAndArgsName(Map<String, List<String>> paramMap, Map<String, Map<String, List<String>>> methods, MethodInfo methodInfo) {
        String key = methodInfo.getName() + "#" + methodInfo.getParams().size();
        List<String> params = paramMap.get(key);
        List<String> paramList = Collections.EMPTY_LIST;
        if (params == null) {
            paramList = methodInfo.getParams()
                .stream()
                .map(ParamInfo::getName)
                .collect(Collectors.toList());
        } else {
            paramList = new ArrayList<>();
            for (int i = 0; i < methodInfo.getParams().size(); i++) {
                if (methodInfo.getParam(i).getName().contains(params.get(i))) {
                    paramList.add(params.get(i));
                } else {
                    paramList.add(methodInfo.getParam(i).getName() + "-or-" + params.get(i));
                }
            }
        }
        paramMap.put(key, paramList);

        if (!methods.containsKey(methodInfo.getName())) {
            Map<String, List<String>> methodParamMap = new HashMap<>();
            methodParamMap.put(methodInfo.getName() + "#" + paramList.size(), paramList);
            methods.put(methodInfo.getName(), methodParamMap);
        } else {
            Map<String, List<String>> methodsWithArity = methods.get(methodInfo.getName());
            Map<String, List<String>> methodParamMap = new HashMap<>();
            methodParamMap.put(methodInfo.getName() + "#" + paramList.size(), paramList);
            methodsWithArity.putAll(methodParamMap);
            methods.put(methodInfo.getName(), methodsWithArity);
        }
    }

    private void renderHandlerMethod(CodeWriter writer) {
        writer.println("(defn handler ");
        writer.println("  ([f]");
        writer.println("    (reify io.vertx.core.Handler");
        writer.println("      (handle [this arg]");
        writer.println("        (f arg)))))");
    }

    private void renderFunctionMethod(CodeWriter writer) {
        writer.println("(defn function ");
        writer.println("  ([f]");
        writer.println("    (reify java.util.function.Function");
        writer.println("      (apply [this arg]");
        writer.println("        (f arg)))))");
    }
}
