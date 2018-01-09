(ns io.vertx.clojure.shared-data)

(import io.vertx.core.shareddata.SharedData)
(import io.vertx.core.Handler)

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