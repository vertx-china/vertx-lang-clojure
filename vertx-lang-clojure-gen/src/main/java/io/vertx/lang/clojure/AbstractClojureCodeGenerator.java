package io.vertx.lang.clojure;

import io.vertx.codegen.Generator;
import io.vertx.codegen.Model;
import io.vertx.codegen.format.CamelCase;
import io.vertx.codegen.format.SnakeCase;

public class AbstractClojureCodeGenerator<T extends Model> extends Generator<T> {
    final String generated = "clojure/";

    @Override
    public String filename(T model) {
        final String moduleName = model.getModule().translateQualifiedName(model.getFqn(), "clojure");
        return generated + SnakeCase.INSTANCE.format(CamelCase.INSTANCE.parse(moduleName))
                .replace("._", ".")
                .replace(".", "/") + ".clj";
    }
}
