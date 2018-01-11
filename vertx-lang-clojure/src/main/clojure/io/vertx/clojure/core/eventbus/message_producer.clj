(ns io.vertx.clojure.core.eventbus.message-producer)

(import io.vertx.core.eventbus.MessageProducer)
(import io.vertx.core.eventbus.DeliveryOptions)
(import io.vertx.core.Handler)

(defn address
  ([message-producer ] (.address message-producer )))
(defn close
  ([message-producer ] (.close message-producer )))
(defn delivery-options
  ([message-producer options] (.deliveryOptions message-producer options)))
(defn drain-handler
  ([message-producer handler] (.drainHandler message-producer handler)))
(defn end
  ([message-producer t] (.end message-producer t))
  ([message-producer ] (.end message-producer )))
(defn exception-handler
  ([message-producer handler] (.exceptionHandler message-producer handler)))
(defn send
  ([message-producer message] (.send message-producer message))
  ([message-producer message reply-handler] (.send message-producer message reply-handler)))
(defn set-write-queue-max-size
  ([message-producer max-size] (.setWriteQueueMaxSize message-producer max-size)))
(defn write
  ([message-producer data] (.write message-producer data)))
(defn write-queue-full
  ([message-producer ] (.writeQueueFull message-producer )))