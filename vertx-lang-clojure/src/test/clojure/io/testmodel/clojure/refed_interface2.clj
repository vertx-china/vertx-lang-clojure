(ns io.testmodel.clojure.refed-interface2)

(import io.vertx.codegen.testmodel.RefedInterface2)

(defn get-string
  ([refed-interface2 ] (.getString refed-interface2 )))
(defn set-string
  ([refed-interface2 str] (.setString refed-interface2 str)))