(ns io.vertx.clojure.core.metrics.metrics-options)

(import io.vertx.core.metrics.MetricsOptions)
(import io.vertx.core.json.JsonObject)

(defn new-instance
  ([] (new MetricsOptions))
  ([^JsonObject json] (new MetricsOptions json)))

(defn set-enabled [^MetricsOptions metrics-options enabled] (.setEnabled metrics-options enabled))
(defn is-enabled [^MetricsOptions metrics-options] (.isEnabled metrics-options))