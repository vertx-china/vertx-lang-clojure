(ns io.vertx.clojure.core.streams.write-stream)

(import io.vertx.core.Handler)
(import io.vertx.core.streams.WriteStream)

(defn drain-handler
  ([write-stream handler] (.drainHandler write-stream handler)))
(defn end
  ([write-stream ] (.end write-stream ))
  ([write-stream t] (.end write-stream t)))
(defn exception-handler
  ([write-stream handler] (.exceptionHandler write-stream handler)))
(defn set-write-queue-max-size
  ([write-stream max-size] (.setWriteQueueMaxSize write-stream max-size)))
(defn write
  ([write-stream data] (.write write-stream data)))
(defn write-queue-full
  ([write-stream ] (.writeQueueFull write-stream )))
(defn handler [f]
  (reify
   io.vertx.core.Handler
   (handle [this para]
           (f para))))