(ns io.vertx.clojure.net-server)

(import io.vertx.core.net.NetServer)
(import io.vertx.core.Handler)
(import io.vertx.core.net.SocketAddress)

(defn is-metrics-enabled
  ([net-server ] (.isMetricsEnabled net-server )))
(defn actual-port
  ([net-server ] (.actualPort net-server )))
(defn connect-handler
  ([net-server handler] (.connectHandler net-server handler)))
(defn connect-stream
  ([net-server ] (.connectStream net-server )))
(defn exception-handler
  ([net-server handler] (.exceptionHandler net-server handler)))
(defn close
  ([net-server ] (.close net-server ))
  ([net-server completion-handler] (.close net-server completion-handler)))
(defn listen
  ([net-server ] (.listen net-server ))
  ([net-server listen-handler] (.listen net-server listen-handler))
  ([net-server port host] (.listen net-server port host))
  ([net-server port host listen-handler] (.listen net-server port host listen-handler))
  ([net-server port] (.listen net-server port))
  ([net-server port listen-handler] (.listen net-server port listen-handler))
  ([net-server local-address] (.listen net-server local-address))
  ([net-server local-address listen-handler] (.listen net-server local-address listen-handler)))