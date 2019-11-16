(ns io.vertx.clojure.core.eventbus.message-consumer)

(import io.vertx.core.Handler)
(import io.vertx.core.eventbus.MessageConsumer)
(import io.vertx.core.streams.WriteStream)

(defn address
  ([message-consumer] (.address message-consumer)))
(defn body-stream
  ([message-consumer] (.bodyStream message-consumer)))
(defn completion-handler
  ([message-consumer completion-handler] (.completionHandler message-consumer completion-handler)))
(defn end-handler
  ([message-consumer end-handler] (.endHandler message-consumer end-handler)))
(defn exception-handler
  ([message-consumer handler] (.exceptionHandler message-consumer handler)))
(defn fetch
  ([message-consumer amount] (.fetch message-consumer amount)))
(defn get-max-buffered-messages
  ([message-consumer] (.getMaxBufferedMessages message-consumer)))
(defn handler
  ([f]
    (reify
     io.vertx.core.Handler
     (handle [this para]
           (f para))))
  ([message-consumer handler] (.handler message-consumer handler)))
(defn is-registered
  ([message-consumer] (.isRegistered message-consumer)))
(defn pause
  ([message-consumer] (.pause message-consumer)))
(defn pipe
  ([message-consumer] (.pipe message-consumer)))
(defn pipe-to
  ([message-consumer dst handler] (.pipeTo message-consumer dst handler)))
(defn resume
  ([message-consumer] (.resume message-consumer)))
(defn set-max-buffered-messages
  ([message-consumer max-buffered-messages] (.setMaxBufferedMessages message-consumer max-buffered-messages)))
(defn unregister
  ([message-consumer completion-handler] (.unregister message-consumer completion-handler)))