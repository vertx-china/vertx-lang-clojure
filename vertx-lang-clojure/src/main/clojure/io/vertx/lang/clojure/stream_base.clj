(ns io.vertx.lang.clojure.stream-base)

(import io.vertx.core.streams.StreamBase)
(import io.vertx.core.Handler)

(defn exception-handler
  ([stream-base handler] (.exceptionHandler stream-base handler)))