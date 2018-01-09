(ns io.testmodel.clojure.refed-interface1)

(import io.vertx.codegen.testmodel.RefedInterface1)

(defn get-string
  ([refed-interface1 ] (.getString refed-interface1 )))
(defn set-string
  ([refed-interface1 str] (.setString refed-interface1 str)))