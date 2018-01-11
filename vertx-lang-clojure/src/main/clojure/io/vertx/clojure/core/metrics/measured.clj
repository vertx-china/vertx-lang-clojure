(ns io.vertx.clojure.core.metrics.measured)

(import io.vertx.core.metrics.Measured)

(defn is-metrics-enabled
  ([measured ] (.isMetricsEnabled measured )))