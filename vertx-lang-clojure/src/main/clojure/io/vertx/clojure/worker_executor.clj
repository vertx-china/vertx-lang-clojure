(ns io.vertx.clojure.worker-executor)

(import io.vertx.core.WorkerExecutor)
(import io.vertx.core.Handler)

(defn close
  ([worker-executor ] (.close worker-executor )))
(defn execute-blocking
  ([worker-executor blocking-code-handler ordered result-handler] (.executeBlocking worker-executor blocking-code-handler ordered result-handler))
  ([worker-executor blocking-code-handler result-handler] (.executeBlocking worker-executor blocking-code-handler result-handler)))
(defn is-metrics-enabled
  ([worker-executor ] (.isMetricsEnabled worker-executor )))