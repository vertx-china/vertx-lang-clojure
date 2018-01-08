(ns io.vertx.clojure.context)

(import io.vertx.core.Context)
(import io.vertx.core.Handler)

(defn owner
  ([context ] (.owner context )))
(defn process-args
  ([context ] (.processArgs context )))
(defn get-instance-count
  ([context ] (.getInstanceCount context )))
(defn is-worker-context
  ([context ] (.isWorkerContext context )))
(defn is-on-worker-thread
  ([] (Context/isOnWorkerThread )))
(defn is-on-vertx-thread
  ([] (Context/isOnVertxThread )))
(defn put
  ([context key value] (.put context key value)))
(defn remove
  ([context key] (.remove context key)))
(defn is-multi-threaded-worker-context
  ([context ] (.isMultiThreadedWorkerContext context )))
(defn deployment-id
  ([context ] (.deploymentID context )))
(defn get
  ([context key] (.get context key)))
(defn is-on-event-loop-thread
  ([] (Context/isOnEventLoopThread )))
(defn run-on-context
  ([context action] (.runOnContext context action)))
(defn is-event-loop-context
  ([context ] (.isEventLoopContext context )))
(defn execute-blocking
  ([context blocking-code-handler ordered result-handler] (.executeBlocking context blocking-code-handler ordered result-handler))
  ([context blocking-code-handler result-handler] (.executeBlocking context blocking-code-handler result-handler)))
(defn config
  ([context ] (.config context )))
(defn exception-handler
  ([context handler] (.exceptionHandler context handler)))