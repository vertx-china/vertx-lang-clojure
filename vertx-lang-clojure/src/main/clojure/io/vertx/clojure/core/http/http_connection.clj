(ns io.vertx.clojure.core.http.http-connection)

(import io.vertx.core.Handler)
(import io.vertx.core.buffer.Buffer)
(import io.vertx.core.http.Http2Settings)
(import io.vertx.core.http.HttpConnection)

(defn close
  ([http-connection ] (.close http-connection )))
(defn close-handler
  ([http-connection handler] (.closeHandler http-connection handler)))
(defn exception-handler
  ([http-connection handler] (.exceptionHandler http-connection handler)))
(defn get-window-size
  ([http-connection ] (.getWindowSize http-connection )))
(defn go-away
  ([http-connection error-code] (.goAway http-connection error-code))
  ([http-connection error-code last-stream-id] (.goAway http-connection error-code last-stream-id))
  ([http-connection error-code last-stream-id debug-data] (.goAway http-connection error-code last-stream-id debug-data)))
(defn go-away-handler
  ([http-connection handler] (.goAwayHandler http-connection handler)))
(defn indicated-server-name
  ([http-connection ] (.indicatedServerName http-connection )))
(defn is-ssl
  ([http-connection ] (.isSsl http-connection )))
(defn local-address
  ([http-connection ] (.localAddress http-connection )))
(defn ping
  ([http-connection data pong-handler] (.ping http-connection data pong-handler)))
(defn ping-handler
  ([http-connection handler] (.pingHandler http-connection handler)))
(defn remote-address
  ([http-connection ] (.remoteAddress http-connection )))
(defn remote-settings
  ([http-connection ] (.remoteSettings http-connection )))
(defn remote-settings-handler
  ([http-connection handler] (.remoteSettingsHandler http-connection handler)))
(defn set-window-size
  ([http-connection window-size] (.setWindowSize http-connection window-size)))
(defn settings
  ([http-connection ] (.settings http-connection )))
(defn shutdown
  ([http-connection ] (.shutdown http-connection ))
  ([http-connection timeout-ms] (.shutdown http-connection timeout-ms)))
(defn shutdown-handler
  ([http-connection handler] (.shutdownHandler http-connection handler)))
(defn update-settings
  ([http-connection settings] (.updateSettings http-connection settings))
  ([http-connection settings completion-handler] (.updateSettings http-connection settings completion-handler)))
(defn handler [f]
  (reify
   io.vertx.core.Handler
   (handle [this para]
           (f para))))