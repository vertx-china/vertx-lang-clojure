(ns io.vertx.lang.clojure.timeout-stream)

(import io.vertx.core.TimeoutStream)
(import io.vertx.core.Handler)

(defn cancel
  ([timeout-stream ] (.cancel timeout-stream )))
(defn end-handler
  ([timeout-stream end-handler] (.endHandler timeout-stream end-handler)))
(defn exception-handler
  ([timeout-stream handler] (.exceptionHandler timeout-stream handler)))
(defn handler
  ([timeout-stream handler] (.handler timeout-stream handler)))
(defn pause
  ([timeout-stream ] (.pause timeout-stream )))
(defn resume
  ([timeout-stream ] (.resume timeout-stream )))