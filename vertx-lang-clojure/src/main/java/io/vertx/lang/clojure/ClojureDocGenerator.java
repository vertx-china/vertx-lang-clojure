package io.vertx.lang.clojure;

//import io.vertx.docgen.Coordinate;
import io.vertx.docgen.DocGenerator;
import io.vertx.docgen.JavaDocGenerator;

import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;

/**
 * Clojure document generator
 *
 * @author <a href="mailto:chengen.zhao@whitewoodcity.com">Chengen Zhao</a>
 */
public class ClojureDocGenerator implements DocGenerator {

    private JavaDocGenerator javaGen = new JavaDocGenerator();

    @Override
    public void init(ProcessingEnvironment processingEnv) {
        javaGen.init(processingEnv);
    }

    @Override
    public String getName() {
        return "clojure";
    }

    @Override
    public String renderSource(ExecutableElement elt, String source) {
//    ClojureLang lang = new ClojureLang();
        try {
            return source;//translator.translate(elt, lang);
        } catch (Exception e) {
            System.out.println("Cannot generate " + elt.getEnclosingElement().getSimpleName() + "#" + elt.getSimpleName() + " : " + e.getMessage());
            return "Code not translatable";
        }
    }

    @Override
    public String resolveTypeLink(TypeElement elt) {
        return javaGen.resolveTypeLink(elt);
    }

    @Override
    public String resolveConstructorLink(ExecutableElement elt) {
        return javaGen.resolveConstructorLink(elt);
    }

    @Override
    public String resolveMethodLink(ExecutableElement elt) {
        return javaGen.resolveMethodLink(elt);
    }

    @Override
    public String resolveLabel(Element elt, String defaultLabel) {
        return javaGen.resolveLabel(elt, defaultLabel);
    }

    @Override
    public String resolveFieldLink(VariableElement elt) {
        return javaGen.resolveFieldLink(elt);
    }
}
