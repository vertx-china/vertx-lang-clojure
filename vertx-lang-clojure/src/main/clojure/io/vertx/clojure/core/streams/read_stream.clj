(ns io.vertx.clojure.core.streams.read-stream)

(import io.vertx.core.Handler)
(import io.vertx.core.streams.ReadStream)
(import io.vertx.core.streams.WriteStream)

(defn end-handler
  ([read-stream end-handler] (.endHandler read-stream end-handler)))
(defn exception-handler
  ([read-stream handler] (.exceptionHandler read-stream handler)))
(defn fetch
  ([read-stream amount] (.fetch read-stream amount)))
(defn handler
  ([f]
    (reify
     io.vertx.core.Handler
     (handle [this para]
           (f para))))
  ([read-stream handler] (.handler read-stream handler)))
(defn pause
  ([read-stream] (.pause read-stream)))
(defn pipe
  ([read-stream] (.pipe read-stream)))
(defn pipe-to
  ([read-stream dst handler] (.pipeTo read-stream dst handler)))
(defn resume
  ([read-stream] (.resume read-stream)))