(ns io.vertx.clojure.codegen.testmodel.data-object-with-only-json-object-constructor)

(import io.vertx.codegen.testmodel.DataObjectWithOnlyJsonObjectConstructor)
(import io.vertx.core.json.JsonObject)

(defn new-instance
   
  ([^JsonObject json] (new DataObjectWithOnlyJsonObjectConstructor json)))

(defn get-foo [^DataObjectWithOnlyJsonObjectConstructor data-object-with-only-json-object-constructor] (.getFoo data-object-with-only-json-object-constructor))