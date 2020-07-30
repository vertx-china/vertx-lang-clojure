package io.vertx.lang.clojure;

import io.vertx.codegen.*;
import io.vertx.codegen.format.CamelCase;
import io.vertx.codegen.format.KebabCase;
import io.vertx.codegen.format.SnakeCase;
import io.vertx.codegen.writer.CodeWriter;
import io.vertx.lang.clojure.utils.ClojureUtils;

import java.io.StringWriter;
import java.util.*;
import java.util.stream.Collectors;

import static io.vertx.lang.clojure.utils.ClojureUtils.*;

public class ClojureClassGenerator extends AbstractClojureCodeGenerator<ClassModel> {
    public ClojureClassGenerator() {
        super();
        this.name = "Clojure";
        this.kinds = Collections.singleton("class");
    }

    @Override
    public String render(ClassModel model, int index, int size, Map<String, Object> session) {

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

            for (ParamInfo paramInfo: methodInfo.getParams()) {
                if (paramInfo.getType().getRaw() != null) {
                    imports.add(paramInfo.getType().getRaw().getName());
                }
            }

            String key = methodInfo.getName() + "#" + methodInfo.getParams().size();
            List<String> params = paramMap.get(key);
            List<String> paramList = Collections.EMPTY_LIST;
            if (params == null) {
                paramList = methodInfo.getParams()
                    .stream()
                    .map(ParamInfo::getName)
                    .collect(Collectors.toList());
                paramMap.put(key, paramList);
            } else {
                paramList = new ArrayList<>();
                for (int i = 0; i < methodInfo.getParams().size(); i++) {
                    if (methodInfo.getParam(i).getName().contains(params.get(i))) {
                        paramList.add(params.get(i));
                    } else {
                        paramList.add(methodInfo.getParam(i).getName() + "-or-" + params.get(i));
                    }
                }
                paramMap.put(key, paramList);
            }

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
        });

        imports.stream().filter(s -> s.startsWith("io.vertx") || s.startsWith("java.util")).forEach(s -> {
            writer.println("(import " + s + ")");
        });
        writer.println();

        String className = model.getType().getRaw().getSimpleName();
        String objName = className.substring(0, 1).toLowerCase() + className.substring(1);
        String kebabCaseObjName = clojurifyName(objName);

        methods.forEach((methodName, value) -> {
            if ("handler".equals(methodName)) {
                renderHandlerMethod(writer);
            } else if ("function".equals(methodName)) {
                renderFunctionMethod(writer);
            } else {
                writer.println("(defn " + clojurifyName(methodName));
                value.forEach((key, value1) -> {
                    String args = String.join(" ", value1);
                    writer.println("  ([" + kebabCaseObjName + " " + args + "]");
                    writer.println("    (." + methodName + " " + kebabCaseObjName + " " + args + "))");
                });
                writer.println(")");

                // TODO make method returning boolean lose `is` and end with `?`
            }
            writer.println();
        });

        return buffer.toString();
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
