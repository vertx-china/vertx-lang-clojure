(ns io.vertx.clojure.async-map)

(import io.vertx.core.shareddata.AsyncMap)
(import io.vertx.core.Handler)

(defn replace-if-present
  ([async-map k old-value new-value result-handler] (.replaceIfPresent async-map k old-value new-value result-handler)))
(defn size
  ([async-map result-handler] (.size async-map result-handler)))
(defn get
  ([async-map k result-handler] (.get async-map k result-handler)))
(defn replace
  ([async-map k v result-handler] (.replace async-map k v result-handler)))
(defn clear
  ([async-map result-handler] (.clear async-map result-handler)))
(defn put-if-absent
  ([async-map k v completion-handler] (.putIfAbsent async-map k v completion-handler))
  ([async-map k v ttl completion-handler] (.putIfAbsent async-map k v ttl completion-handler)))
(defn put
  ([async-map k v completion-handler] (.put async-map k v completion-handler))
  ([async-map k v ttl completion-handler] (.put async-map k v ttl completion-handler)))
(defn remove
  ([async-map k result-handler] (.remove async-map k result-handler)))
(defn remove-if-present
  ([async-map k v result-handler] (.removeIfPresent async-map k v result-handler)))