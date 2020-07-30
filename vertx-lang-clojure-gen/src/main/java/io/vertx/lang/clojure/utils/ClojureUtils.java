package io.vertx.lang.clojure.utils;

import io.vertx.codegen.format.CamelCase;
import io.vertx.codegen.format.Case;
import io.vertx.codegen.format.KebabCase;

public final class ClojureUtils {

    private final static Case KEBAB_CASE = KebabCase.INSTANCE;
    private final static Case CAMEL_CASE = CamelCase.INSTANCE;

    public static String clojurifyName(String name) {
        return KEBAB_CASE.format(CAMEL_CASE.parse(name));
    }
}
