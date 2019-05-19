(ns io.vertx.lang.clojure.verticle)

(defn get-method-parameters [f]
  (first (->> f meta :arglists)))

(defn exists [name]
  (resolve (symbol name)))
