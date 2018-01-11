(ns io.testmodel.lang.clojure.data-object-with-only-json-object-constructor)

(import io.vertx.codegen.testmodel.DataObjectWithOnlyJsonObjectConstructor)

(defn from-json [^DataObjectWithOnlyJsonObjectConstructor json] (new DataObjectWithOnlyJsonObjectConstructor json))

(defn get-foo [^DataObjectWithOnlyJsonObjectConstructor data-object-with-only-json-object-constructor] (.getFoo data-object-with-only-json-object-constructor))