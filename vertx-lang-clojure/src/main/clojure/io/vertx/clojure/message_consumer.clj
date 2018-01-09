(ns io.vertx.clojure.message-consumer)

(import io.vertx.core.eventbus.MessageConsumer)
(import io.vertx.core.Handler)

(defn address
  ([message-consumer ] (.address message-consumer )))
(defn body-stream
  ([message-consumer ] (.bodyStream message-consumer )))
(defn completion-handler
  ([message-consumer completion-handler] (.completionHandler message-consumer completion-handler)))
(defn end-handler
  ([message-consumer end-handler] (.endHandler message-consumer end-handler)))
(defn exception-handler
  ([message-consumer handler] (.exceptionHandler message-consumer handler)))
(defn get-max-buffered-messages
  ([message-consumer ] (.getMaxBufferedMessages message-consumer )))
(defn handler
  ([message-consumer handler] (.handler message-consumer handler)))
(defn is-registered
  ([message-consumer ] (.isRegistered message-consumer )))
(defn pause
  ([message-consumer ] (.pause message-consumer )))
(defn resume
  ([message-consumer ] (.resume message-consumer )))
(defn set-max-buffered-messages
  ([message-consumer max-buffered-messages] (.setMaxBufferedMessages message-consumer max-buffered-messages)))
(defn unregister
  ([message-consumer ] (.unregister message-consumer ))
  ([message-consumer completion-handler] (.unregister message-consumer completion-handler)))