(ns io.vertx.lang.clojure.metrics-options)

(import io.vertx.core.metrics.MetricsOptions)

(defn from-json [^MetricsOptions json] (new MetricsOptions json))

(defn set-enabled [^MetricsOptions metrics-options enabled] (.setEnabled metrics-options enabled))
(defn is-enabled [^MetricsOptions metrics-options] (.isEnabled metrics-options))