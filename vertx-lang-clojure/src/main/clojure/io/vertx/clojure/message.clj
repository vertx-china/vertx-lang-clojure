(ns io.vertx.clojure.message)

(import io.vertx.core.eventbus.Message)
(import io.vertx.core.eventbus.DeliveryOptions)
(import io.vertx.core.Handler)

(defn headers
  ([message ] (.headers message )))
(defn fail
  ([message failure-code message] (.fail message failure-code message)))
(defn address
  ([message ] (.address message )))
(defn is-send
  ([message ] (.isSend message )))
(defn body
  ([message ] (.body message )))
(defn reply
  ([message message] (.reply message message))
  ([message message reply-handler] (.reply message message reply-handler))
  ([message message options] (.reply message message options))
  ([message message options reply-handler] (.reply message message options reply-handler)))
(defn reply-address
  ([message ] (.replyAddress message )))