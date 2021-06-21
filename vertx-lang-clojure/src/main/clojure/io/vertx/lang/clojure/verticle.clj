(ns io.vertx.lang.clojure.verticle
   (:require
     [io.vertx.clojure.core.vertx :as vertx]))

(defn get-method-parameters [f]
  (first (->> f meta :arglists)))

(defn exists [name]
  (resolve (symbol name)))

(defmacro completion-handler [f]
  `(vertx/handler
    (fn [r#]
      (vertx/handler ~f))))
