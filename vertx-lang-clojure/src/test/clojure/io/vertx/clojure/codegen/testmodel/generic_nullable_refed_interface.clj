(ns io.vertx.clojure.codegen.testmodel.generic-nullable-refed-interface)

(import io.vertx.codegen.testmodel.GenericNullableRefedInterface)

(defn get-value
  ([generic-nullable-refed-interface ] (.getValue generic-nullable-refed-interface )))