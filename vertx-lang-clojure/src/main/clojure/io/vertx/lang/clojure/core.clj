(ns io.vertx.lang.clojure.core)

(defn get-method-parameters [f]
  (first (-> f meta :arglists)))

(defn exists [name] (resolve (symbol name)))

(defn handler [f]
  (reify
   io.vertx.core.Handler
   (handle [this para]
           (f para))))