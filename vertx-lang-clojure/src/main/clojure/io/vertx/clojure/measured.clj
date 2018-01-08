(ns io.vertx.clojure.measured)

(import io.vertx.core.metrics.Measured)

(defn is-metrics-enabled
  ([measured ] (.isMetricsEnabled measured )))