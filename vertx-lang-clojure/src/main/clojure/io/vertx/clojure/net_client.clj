(ns io.vertx.clojure.net-client)

(import io.vertx.core.net.NetClient)
(import io.vertx.core.Handler)
(import io.vertx.core.net.SocketAddress)

(defn close
  ([net-client ] (.close net-client )))
(defn connect
  ([net-client port host connect-handler] (.connect net-client port host connect-handler))
  ([net-client port host server-name connect-handler] (.connect net-client port host server-name connect-handler))
  ([net-client remote-address connect-handler] (.connect net-client remote-address connect-handler)))
(defn connect-
  ([net-client remote-address server-name connect-handler] (.connect net-client remote-address server-name connect-handler)))
(defn is-metrics-enabled
  ([net-client ] (.isMetricsEnabled net-client )))