(ns io.vertx.clojure.core.http.go-away)

(import io.vertx.core.http.GoAway)
(import io.vertx.core.json.JsonObject)

(defn new-instance
  ([^JsonObject json] (new GoAway json)))

(defn set-debug-data [^GoAway go-away debug-data] (.setDebugData go-away debug-data))
(defn get-debug-data [^GoAway go-away] (.getDebugData go-away))
(defn set-error-code [^GoAway go-away error-code] (.setErrorCode go-away error-code))
(defn get-error-code [^GoAway go-away] (.getErrorCode go-away))
(defn set-last-stream-id [^GoAway go-away last-stream-id] (.setLastStreamId go-away last-stream-id))
(defn get-last-stream-id [^GoAway go-away] (.getLastStreamId go-away))