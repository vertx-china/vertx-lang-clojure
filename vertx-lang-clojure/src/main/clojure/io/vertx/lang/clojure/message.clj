(ns io.vertx.lang.clojure.message)

(import io.vertx.core.eventbus.Message)
(import io.vertx.core.eventbus.DeliveryOptions)
(import io.vertx.core.Handler)

(defn address
  ([message ] (.address message )))
(defn body
  ([message ] (.body message )))
(defn fail
  ([message failure-code message] (.fail message failure-code message)))
(defn headers
  ([message ] (.headers message )))
(defn is-send
  ([message ] (.isSend message )))
(defn reply
  ([message message] (.reply message message))
  ([message message options-or-reply-handler] (.reply message message options-or-reply-handler))
  ([message message options reply-handler] (.reply message message options reply-handler)))
(defn reply-address
  ([message ] (.replyAddress message )))