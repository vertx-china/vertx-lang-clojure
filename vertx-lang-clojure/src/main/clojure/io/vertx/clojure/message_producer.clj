(ns io.vertx.clojure.message-producer)

(import io.vertx.core.eventbus.MessageProducer)
(import io.vertx.core.eventbus.DeliveryOptions)
(import io.vertx.core.Handler)

(defn address
  ([message-producer ] (.address message-producer )))
(defn drain-handler
  ([message-producer handler] (.drainHandler message-producer handler)))
(defn write-queue-full
  ([message-producer ] (.writeQueueFull message-producer )))
(defn end
  ([message-producer t] (.end message-producer t))
  ([message-producer ] (.end message-producer )))
(defn send
  ([message-producer message] (.send message-producer message))
  ([message-producer message reply-handler] (.send message-producer message reply-handler)))
(defn exception-handler
  ([message-producer handler] (.exceptionHandler message-producer handler)))
(defn write
  ([message-producer data] (.write message-producer data)))
(defn close
  ([message-producer ] (.close message-producer )))
(defn set-write-queue-max-size
  ([message-producer max-size] (.setWriteQueueMaxSize message-producer max-size)))
(defn delivery-options
  ([message-producer options] (.deliveryOptions message-producer options)))