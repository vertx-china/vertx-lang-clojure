(ns io.vertx.clojure.core.shareddata.shared-data)

(import io.vertx.core.Handler)
(import io.vertx.core.shareddata.SharedData)

(defn get-async-map
  ([shared-data name result-handler] (.getAsyncMap shared-data name result-handler)))
(defn get-cluster-wide-map
  ([shared-data name result-handler] (.getClusterWideMap shared-data name result-handler)))
(defn get-counter
  ([shared-data name result-handler] (.getCounter shared-data name result-handler)))
(defn get-local-map
  ([shared-data name] (.getLocalMap shared-data name)))
(defn get-lock
  ([shared-data name result-handler] (.getLock shared-data name result-handler)))
(defn get-lock-with-timeout
  ([shared-data name timeout result-handler] (.getLockWithTimeout shared-data name timeout result-handler)))
(defn handler [f]
  (reify
   io.vertx.core.Handler
   (handle [this para]
           (f para))))