(ns io.vertx.clojure.core.eventbus.event-bus)

(import io.vertx.core.Handler)
(import io.vertx.core.eventbus.DeliveryOptions)
(import io.vertx.core.eventbus.EventBus)

(defn add-inbound-interceptor
  ([event-bus interceptor] (.addInboundInterceptor event-bus interceptor)))
(defn add-outbound-interceptor
  ([event-bus interceptor] (.addOutboundInterceptor event-bus interceptor)))
(defn consumer
  ([event-bus address] (.consumer event-bus address))
  ([event-bus address handler] (.consumer event-bus address handler)))
(defn is-metrics-enabled
  ([event-bus] (.isMetricsEnabled event-bus)))
(defn local-consumer
  ([event-bus address] (.localConsumer event-bus address))
  ([event-bus address handler] (.localConsumer event-bus address handler)))
(defn publish
  ([event-bus address message] (.publish event-bus address message))
  ([event-bus address message options] (.publish event-bus address message options)))
(defn publisher
  ([event-bus address] (.publisher event-bus address))
  ([event-bus address options] (.publisher event-bus address options)))
(defn remove-inbound-interceptor
  ([event-bus interceptor] (.removeInboundInterceptor event-bus interceptor)))
(defn remove-outbound-interceptor
  ([event-bus interceptor] (.removeOutboundInterceptor event-bus interceptor)))
(defn send
  ([event-bus address message] (.send event-bus address message))
  ([event-bus address message options-or-reply-handler] (.send event-bus address message options-or-reply-handler))
  ([event-bus address message options reply-handler] (.send event-bus address message options reply-handler)))
(defn sender
  ([event-bus address] (.sender event-bus address))
  ([event-bus address options] (.sender event-bus address options)))
(defn handler [f]
  (reify
   io.vertx.core.Handler
   (handle [this para]
           (f para))))