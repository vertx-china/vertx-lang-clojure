(ns io.vertx.lang.clojure.net-server)

(import io.vertx.core.net.NetServer)
(import io.vertx.core.Handler)
(import io.vertx.core.net.SocketAddress)

(defn actual-port
  ([net-server ] (.actualPort net-server )))
(defn close
  ([net-server ] (.close net-server ))
  ([net-server completion-handler] (.close net-server completion-handler)))
(defn connect-handler
  ([net-server handler] (.connectHandler net-server handler)))
(defn connect-stream
  ([net-server ] (.connectStream net-server )))
(defn exception-handler
  ([net-server handler] (.exceptionHandler net-server handler)))
(defn is-metrics-enabled
  ([net-server ] (.isMetricsEnabled net-server )))
(defn listen
  ([net-server ] (.listen net-server ))
  ([net-server local-address-or-port-or-listen-handler] (.listen net-server local-address-or-port-or-listen-handler))
  ([net-server local-address-or-port listen-handler-or-host] (.listen net-server local-address-or-port listen-handler-or-host))
  ([net-server port host listen-handler] (.listen net-server port host listen-handler)))