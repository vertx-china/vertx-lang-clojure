(ns io.vertx.clojure.http-server)

(import io.vertx.core.http.HttpServer)
(import io.vertx.core.Handler)

(defn actual-port
  ([http-server ] (.actualPort http-server )))
(defn close
  ([http-server ] (.close http-server ))
  ([http-server completion-handler] (.close http-server completion-handler)))
(defn connection-handler
  ([http-server handler] (.connectionHandler http-server handler)))
(defn exception-handler
  ([http-server handler] (.exceptionHandler http-server handler)))
(defn is-metrics-enabled
  ([http-server ] (.isMetricsEnabled http-server )))
(defn listen
  ([http-server ] (.listen http-server ))
  ([http-server port host] (.listen http-server port host))
  ([http-server port host listen-handler] (.listen http-server port host listen-handler))
  ([http-server port] (.listen http-server port)))
(defn listen-
  ([http-server listen-handler] (.listen http-server listen-handler)))
(defn request-handler
  ([http-server handler] (.requestHandler http-server handler)))
(defn request-stream
  ([http-server ] (.requestStream http-server )))
(defn websocket-handler
  ([http-server handler] (.websocketHandler http-server handler)))
(defn websocket-stream
  ([http-server ] (.websocketStream http-server )))