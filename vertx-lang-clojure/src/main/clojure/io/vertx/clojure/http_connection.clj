(ns io.vertx.clojure.http-connection)

(import io.vertx.core.http.HttpConnection)
(import io.vertx.core.buffer.Buffer)
(import io.vertx.core.http.Http2Settings)
(import io.vertx.core.Handler)

(defn settings
  ([http-connection ] (.settings http-connection )))
(defn get-window-size
  ([http-connection ] (.getWindowSize http-connection )))
(defn ping
  ([http-connection data pong-handler] (.ping http-connection data pong-handler)))
(defn go-away-handler
  ([http-connection handler] (.goAwayHandler http-connection handler)))
(defn go-away
  ([http-connection error-code] (.goAway http-connection error-code))
  ([http-connection error-code last-stream-id] (.goAway http-connection error-code last-stream-id))
  ([http-connection error-code last-stream-id debug-data] (.goAway http-connection error-code last-stream-id debug-data)))
(defn ping-handler
  ([http-connection handler] (.pingHandler http-connection handler)))
(defn close-handler
  ([http-connection handler] (.closeHandler http-connection handler)))
(defn update-settings
  ([http-connection settings] (.updateSettings http-connection settings))
  ([http-connection settings completion-handler] (.updateSettings http-connection settings completion-handler)))
(defn remote-settings
  ([http-connection ] (.remoteSettings http-connection )))
(defn indicated-server-name
  ([http-connection ] (.indicatedServerName http-connection )))
(defn local-address
  ([http-connection ] (.localAddress http-connection )))
(defn shutdown-handler
  ([http-connection handler] (.shutdownHandler http-connection handler)))
(defn set-window-size
  ([http-connection window-size] (.setWindowSize http-connection window-size)))
(defn remote-settings-handler
  ([http-connection handler] (.remoteSettingsHandler http-connection handler)))
(defn close
  ([http-connection ] (.close http-connection )))
(defn exception-handler
  ([http-connection handler] (.exceptionHandler http-connection handler)))
(defn shutdown
  ([http-connection ] (.shutdown http-connection ))
  ([http-connection timeout-ms] (.shutdown http-connection timeout-ms)))
(defn remote-address
  ([http-connection ] (.remoteAddress http-connection )))
(defn is-ssl
  ([http-connection ] (.isSsl http-connection )))