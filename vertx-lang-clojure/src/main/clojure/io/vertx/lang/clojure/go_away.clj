(ns io.vertx.lang.clojure.go-away)

(import io.vertx.core.http.GoAway)

(defn from-json [^GoAway json] (new GoAway json))

(defn set-debug-data [^GoAway go-away debug-data] (.setDebugData go-away debug-data))
(defn get-debug-data [^GoAway go-away] (.getDebugData go-away))
(defn set-error-code [^GoAway go-away error-code] (.setErrorCode go-away error-code))
(defn get-error-code [^GoAway go-away] (.getErrorCode go-away))
(defn set-last-stream-id [^GoAway go-away last-stream-id] (.setLastStreamId go-away last-stream-id))
(defn get-last-stream-id [^GoAway go-away] (.getLastStreamId go-away))