(ns io.vertx.clojure.pump)

(import io.vertx.core.streams.Pump)
(import io.vertx.core.streams.WriteStream)
(import io.vertx.core.streams.ReadStream)

(defn number-pumped
  ([pump ] (.numberPumped pump )))
(defn pump
  ([rs ws] (Pump/pump rs ws))
  ([rs ws write-queue-max-size] (Pump/pump rs ws write-queue-max-size)))
(defn set-write-queue-max-size
  ([pump max-size] (.setWriteQueueMaxSize pump max-size)))
(defn start
  ([pump ] (.start pump )))
(defn stop
  ([pump ] (.stop pump )))