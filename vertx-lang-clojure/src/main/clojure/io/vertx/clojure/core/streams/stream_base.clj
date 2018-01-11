(ns io.vertx.clojure.core.streams.stream-base)

(import io.vertx.core.streams.StreamBase)
(import io.vertx.core.Handler)

(defn exception-handler
  ([stream-base handler] (.exceptionHandler stream-base handler)))