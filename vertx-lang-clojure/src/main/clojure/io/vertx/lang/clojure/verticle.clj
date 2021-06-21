(ns io.vertx.lang.clojure.verticle
   (:require
     [io.vertx.clojure.core.vertx :as vertx]))

(defn get-method-parameters [f]
  (first (->> f meta :arglists)))

(defn exists [name]
  (resolve (symbol name)))
