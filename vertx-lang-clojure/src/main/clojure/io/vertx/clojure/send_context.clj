(ns io.vertx.clojure.send-context)

(import io.vertx.core.eventbus.SendContext)

(defn message
  ([send-context ] (.message send-context )))
(defn next
  ([send-context ] (.next send-context )))
(defn send
  ([send-context ] (.send send-context )))
(defn sent-body
  ([send-context ] (.sentBody send-context )))