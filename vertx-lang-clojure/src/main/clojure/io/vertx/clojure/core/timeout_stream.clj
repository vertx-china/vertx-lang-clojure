(ns io.vertx.clojure.core.timeout-stream)

(import io.vertx.core.Handler)
(import io.vertx.core.TimeoutStream)
(import io.vertx.core.streams.WriteStream)

(defn cancel
  ([timeout-stream] (.cancel timeout-stream)))
(defn end-handler
  ([timeout-stream end-handler] (.endHandler timeout-stream end-handler)))
(defn exception-handler
  ([timeout-stream handler] (.exceptionHandler timeout-stream handler)))
(defn fetch
  ([timeout-stream amount] (.fetch timeout-stream amount)))
(defn handler
  ([f]
    (reify
     io.vertx.core.Handler
     (handle [this para]
           (f para))))
  ([timeout-stream handler] (.handler timeout-stream handler)))
(defn pause
  ([timeout-stream] (.pause timeout-stream)))
(defn pipe
  ([timeout-stream] (.pipe timeout-stream)))
(defn pipe-to
  ([timeout-stream dst handler] (.pipeTo timeout-stream dst handler)))
(defn resume
  ([timeout-stream] (.resume timeout-stream)))