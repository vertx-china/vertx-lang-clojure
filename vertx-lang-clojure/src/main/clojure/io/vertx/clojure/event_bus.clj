(ns io.vertx.clojure.event-bus)

(import io.vertx.core.eventbus.EventBus)
(import io.vertx.core.eventbus.DeliveryOptions)
(import io.vertx.core.Handler)

(defn is-metrics-enabled
  ([event-bus ] (.isMetricsEnabled event-bus )))
(defn send-
  ([event-bus address message options] (.send event-bus address message options)))
(defn add-interceptor
  ([event-bus interceptor] (.addInterceptor event-bus interceptor)))
(defn local-consumer
  ([event-bus address] (.localConsumer event-bus address))
  ([event-bus address handler] (.localConsumer event-bus address handler)))
(defn sender
  ([event-bus address] (.sender event-bus address))
  ([event-bus address options] (.sender event-bus address options)))
(defn publish
  ([event-bus address message] (.publish event-bus address message))
  ([event-bus address message options] (.publish event-bus address message options)))
(defn publisher
  ([event-bus address] (.publisher event-bus address))
  ([event-bus address options] (.publisher event-bus address options)))
(defn remove-interceptor
  ([event-bus interceptor] (.removeInterceptor event-bus interceptor)))
(defn send
  ([event-bus address message] (.send event-bus address message))
  ([event-bus address message reply-handler] (.send event-bus address message reply-handler))
  ([event-bus address message options reply-handler] (.send event-bus address message options reply-handler)))
(defn consumer
  ([event-bus address] (.consumer event-bus address))
  ([event-bus address handler] (.consumer event-bus address handler)))