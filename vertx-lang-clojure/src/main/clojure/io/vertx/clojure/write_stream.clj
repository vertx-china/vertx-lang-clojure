(ns io.vertx.clojure.write-stream)

(import io.vertx.core.streams.WriteStream)
(import io.vertx.core.Handler)

(defn drain-handler
  ([write-stream handler] (.drainHandler write-stream handler)))
(defn write-queue-full
  ([write-stream ] (.writeQueueFull write-stream )))
(defn end
  ([write-stream ] (.end write-stream ))
  ([write-stream t] (.end write-stream t)))
(defn exception-handler
  ([write-stream handler] (.exceptionHandler write-stream handler)))
(defn write
  ([write-stream data] (.write write-stream data)))
(defn set-write-queue-max-size
  ([write-stream max-size] (.setWriteQueueMaxSize write-stream max-size)))