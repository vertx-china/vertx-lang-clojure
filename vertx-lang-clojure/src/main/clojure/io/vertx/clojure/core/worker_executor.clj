(ns io.vertx.clojure.core.worker-executor)

(import io.vertx.core.Handler)
(import io.vertx.core.WorkerExecutor)

(defn close
  ([worker-executor ] (.close worker-executor )))
(defn execute-blocking
  ([worker-executor blocking-code-handler ordered result-handler] (.executeBlocking worker-executor blocking-code-handler ordered result-handler))
  ([worker-executor blocking-code-handler result-handler] (.executeBlocking worker-executor blocking-code-handler result-handler)))
(defn is-metrics-enabled
  ([worker-executor ] (.isMetricsEnabled worker-executor )))
(defn handler [f]
  (reify
   io.vertx.core.Handler
   (handle [this para]
           (f para))))