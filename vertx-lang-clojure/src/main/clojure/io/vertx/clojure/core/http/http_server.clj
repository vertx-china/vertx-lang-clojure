(ns io.vertx.clojure.core.http.http-server)

(import io.vertx.core.Handler)
(import io.vertx.core.http.HttpServer)
(import io.vertx.core.net.SocketAddress)

(defn actual-port
  ([http-server] (.actualPort http-server)))
(defn close
  ([http-server completion-handler] (.close http-server completion-handler)))
(defn connection-handler
  ([http-server handler] (.connectionHandler http-server handler)))
(defn exception-handler
  ([http-server handler] (.exceptionHandler http-server handler)))
(defn is-metrics-enabled
  ([http-server] (.isMetricsEnabled http-server)))
(defn listen
  ([http-server port host listen-handler] (.listen http-server port host listen-handler))
  ([http-server port-or-address listen-handler] (.listen http-server port-or-address listen-handler))
  ([http-server listen-handler] (.listen http-server listen-handler)))
(defn request-handler
  ([http-server handler] (.requestHandler http-server handler)))
(defn request-stream
  ([http-server] (.requestStream http-server)))
(defn web-socket-handler
  ([http-server handler] (.webSocketHandler http-server handler)))
(defn web-socket-stream
  ([http-server] (.webSocketStream http-server)))
(defn handler [f]
  (reify
   io.vertx.core.Handler
   (handle [this para]
           (f para))))