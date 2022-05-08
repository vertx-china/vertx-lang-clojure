package io.vertx.lang.clojure;

import io.vertx.codegen.DataObjectModel;
import io.vertx.codegen.PropertyInfo;
import io.vertx.codegen.format.KebabCase;
import io.vertx.codegen.writer.CodeWriter;

import java.io.StringWriter;
import java.util.Collections;
import java.util.Map;

import static io.vertx.lang.clojure.utils.ClojureUtils.*;

/**
 * Generates the Clojure code for data objects.
 */
public class ClojureDataObjectGenerator extends AbstractClojureCodeGenerator<DataObjectModel> {


    public ClojureDataObjectGenerator() {
        super();
        this.name = "Clojure";
        this.kinds = Collections.singleton("dataObject");
    }

    @Override
    public String render(DataObjectModel model, int index, int size, Map<String, Object> session) {

        final StringWriter buffer = new StringWriter();
        final CodeWriter writer = new CodeWriter(buffer);
        writer.println("(ns " + model.getType().translatePackageName("clojure") + "."
            + model.getType().getRaw().getSimpleName(KebabCase.INSTANCE) + ")");
        writer.println();
        renderImport(model, writer);
        writer.println();
        renderCtor(model, writer);

        String className = model.getType().getRaw().getSimpleName();
        String objName = className.substring(0, 1).toLowerCase() + className.substring(1);
        String kebabCaseObjName = clojurifyName(objName);

        model.getPropertyMap().forEach((propName, propertyInfo) -> {
            renderProperty(writer, className, kebabCaseObjName, propName, propertyInfo);
        });

        renderToJson(model, writer, className, kebabCaseObjName);

        return buffer.toString();
    }

    private void renderCtor(DataObjectModel model, CodeWriter writer) {
        writer.println("(defn new-instance");
        if (model.hasEmptyConstructor()) {
            writer.println("  ([] (new " + model.getType().getRaw().getSimpleName() + "))");
        }
        writer.println("  ([^JsonObject json] (new " + model.getType().getRaw().getSimpleName() + " json)))");
        writer.println();
    }

    private void renderToJson(DataObjectModel model, CodeWriter writer, String className, String kebabCaseObjName) {
        if (model.hasToJsonMethod()) {
            writer.println("(defn to-json [^" + className + " " + kebabCaseObjName + "]");
            writer.println("  (.toJson " + kebabCaseObjName + "))");
        }
    }

    private void renderProperty(CodeWriter writer, String className, String kebabCaseObjName, String propName, PropertyInfo propertyInfo) {
        String prop = clojurifyName(propName);
        if (propertyInfo.isAdder()) {
            String adderMethod = propertyInfo.getAdderMethod();
            if (propertyInfo.isMap()) {
                writer.println("(defn " + clojurifyName(adderMethod)
                    + " [^" + className + " " + kebabCaseObjName + " key val]");
                writer.println("  (." + adderMethod + " " + kebabCaseObjName + " key val))");
            } else {
                writer.println("(defn " + clojurifyName(adderMethod)
                    + " [^" + className + " " + kebabCaseObjName + " " + prop + "]");
                writer.println("  (." + adderMethod + " " + kebabCaseObjName + " " + prop + "))");
            }
        }

        if (propertyInfo.isSetter()) {
            String setterMethod = propertyInfo.getSetterMethod();
            writer.println("(defn " + clojurifyName(setterMethod)
                + "[^" + className + " " + kebabCaseObjName + " " + prop + "]");
            writer.println("  (." + setterMethod + " " + kebabCaseObjName + " " + prop + "))");
        }

        if (propertyInfo.getGetterMethod() != null) {
            String getterMethod = propertyInfo.getGetterMethod();
            writer.println("(defn " + clojurifyName(getterMethod)
                + "[^" + className + " " + kebabCaseObjName + "]");
            writer.println("  (." + getterMethod + " " + kebabCaseObjName + "))");
        }
        writer.println();
    }

    private void renderImport(DataObjectModel model, CodeWriter writer) {
        writer.println("(import io.vertx.core.json.JsonObject)");
        writer.println("(import " + model.getType().getRaw() + ")");
    }
}

