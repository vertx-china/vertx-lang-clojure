(ns io.testmodel.lang.clojure.generic-refed-interface)

(import io.vertx.codegen.testmodel.GenericRefedInterface)

(defn get-value
  ([generic-refed-interface ] (.getValue generic-refed-interface )))
(defn set-value
  ([generic-refed-interface value] (.setValue generic-refed-interface value)))