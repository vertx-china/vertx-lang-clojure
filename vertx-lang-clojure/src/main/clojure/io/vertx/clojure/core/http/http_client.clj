(ns io.vertx.clojure.core.http.http-client)

(import io.vertx.core.Handler)
(import io.vertx.core.MultiMap)
(import io.vertx.core.http.HttpClient)
(import io.vertx.core.http.HttpMethod)
(import io.vertx.core.http.RequestOptions)
(import io.vertx.core.http.WebsocketVersion)
(import java.util.function.Function)

(defn close
  ([http-client] (.close http-client)))
(defn connection-handler
  ([http-client handler] (.connectionHandler http-client handler)))
(defn delete
  ([http-client request-uri-or-options] (.delete http-client request-uri-or-options))
  ([http-client host-or-port request-uri-or-host response-handler-or-request-uri] (.delete http-client host-or-port request-uri-or-host response-handler-or-request-uri))
  ([http-client request-uri-or-options-or-host response-handler-or-request-uri] (.delete http-client request-uri-or-options-or-host response-handler-or-request-uri))
  ([http-client port host request-uri response-handler] (.delete http-client port host request-uri response-handler)))
(defn delete-abs
  ([http-client absolute-uri] (.deleteAbs http-client absolute-uri))
  ([http-client absolute-uri response-handler] (.deleteAbs http-client absolute-uri response-handler)))
(defn get
  ([http-client request-uri-or-options] (.get http-client request-uri-or-options))
  ([http-client host-or-port request-uri-or-host response-handler-or-request-uri] (.get http-client host-or-port request-uri-or-host response-handler-or-request-uri))
  ([http-client request-uri-or-options-or-host response-handler-or-request-uri] (.get http-client request-uri-or-options-or-host response-handler-or-request-uri))
  ([http-client port host request-uri response-handler] (.get http-client port host request-uri response-handler)))
(defn get-abs
  ([http-client absolute-uri] (.getAbs http-client absolute-uri))
  ([http-client absolute-uri response-handler] (.getAbs http-client absolute-uri response-handler)))
(defn get-now
  ([http-client request-uri-or-options response-handler] (.getNow http-client request-uri-or-options response-handler))
  ([http-client port host request-uri response-handler] (.getNow http-client port host request-uri response-handler))
  ([http-client host request-uri response-handler] (.getNow http-client host request-uri response-handler)))
(defn head
  ([http-client request-uri-or-options] (.head http-client request-uri-or-options))
  ([http-client host-or-port request-uri-or-host response-handler-or-request-uri] (.head http-client host-or-port request-uri-or-host response-handler-or-request-uri))
  ([http-client request-uri-or-options-or-host response-handler-or-request-uri] (.head http-client request-uri-or-options-or-host response-handler-or-request-uri))
  ([http-client port host request-uri response-handler] (.head http-client port host request-uri response-handler)))
(defn head-abs
  ([http-client absolute-uri] (.headAbs http-client absolute-uri))
  ([http-client absolute-uri response-handler] (.headAbs http-client absolute-uri response-handler)))
(defn head-now
  ([http-client request-uri-or-options response-handler] (.headNow http-client request-uri-or-options response-handler))
  ([http-client port host request-uri response-handler] (.headNow http-client port host request-uri response-handler))
  ([http-client host request-uri response-handler] (.headNow http-client host request-uri response-handler)))
(defn is-metrics-enabled
  ([http-client] (.isMetricsEnabled http-client)))
(defn options
  ([http-client request-uri-or-options] (.options http-client request-uri-or-options))
  ([http-client host-or-port request-uri-or-host response-handler-or-request-uri] (.options http-client host-or-port request-uri-or-host response-handler-or-request-uri))
  ([http-client request-uri-or-options-or-host response-handler-or-request-uri] (.options http-client request-uri-or-options-or-host response-handler-or-request-uri))
  ([http-client port host request-uri response-handler] (.options http-client port host request-uri response-handler)))
(defn options-abs
  ([http-client absolute-uri] (.optionsAbs http-client absolute-uri))
  ([http-client absolute-uri response-handler] (.optionsAbs http-client absolute-uri response-handler)))
(defn options-now
  ([http-client request-uri-or-options response-handler] (.optionsNow http-client request-uri-or-options response-handler))
  ([http-client port host request-uri response-handler] (.optionsNow http-client port host request-uri response-handler))
  ([http-client host request-uri response-handler] (.optionsNow http-client host request-uri response-handler)))
(defn post
  ([http-client request-uri-or-options] (.post http-client request-uri-or-options))
  ([http-client host-or-port request-uri-or-host response-handler-or-request-uri] (.post http-client host-or-port request-uri-or-host response-handler-or-request-uri))
  ([http-client request-uri-or-options-or-host response-handler-or-request-uri] (.post http-client request-uri-or-options-or-host response-handler-or-request-uri))
  ([http-client port host request-uri response-handler] (.post http-client port host request-uri response-handler)))
(defn post-abs
  ([http-client absolute-uri] (.postAbs http-client absolute-uri))
  ([http-client absolute-uri response-handler] (.postAbs http-client absolute-uri response-handler)))
(defn put
  ([http-client request-uri-or-options] (.put http-client request-uri-or-options))
  ([http-client host-or-port request-uri-or-host response-handler-or-request-uri] (.put http-client host-or-port request-uri-or-host response-handler-or-request-uri))
  ([http-client request-uri-or-options-or-host response-handler-or-request-uri] (.put http-client request-uri-or-options-or-host response-handler-or-request-uri))
  ([http-client port host request-uri response-handler] (.put http-client port host request-uri response-handler)))
(defn put-abs
  ([http-client absolute-uri] (.putAbs http-client absolute-uri))
  ([http-client absolute-uri response-handler] (.putAbs http-client absolute-uri response-handler)))
(defn redirect-handler
  ([http-client handler] (.redirectHandler http-client handler)))
(defn request
  ([http-client method request-uri-or-options] (.request http-client method request-uri-or-options))
  ([http-client method host-or-port request-uri-or-host response-handler-or-request-uri] (.request http-client method host-or-port request-uri-or-host response-handler-or-request-uri))
  ([http-client method request-uri-or-options-or-host response-handler-or-request-uri] (.request http-client method request-uri-or-options-or-host response-handler-or-request-uri))
  ([http-client method port host request-uri response-handler] (.request http-client method port host request-uri response-handler)))
(defn request-abs
  ([http-client method absolute-uri] (.requestAbs http-client method absolute-uri))
  ([http-client method absolute-uri response-handler] (.requestAbs http-client method absolute-uri response-handler)))
(defn websocket
  ([http-client request-uri-or-options ws-connect] (.websocket http-client request-uri-or-options ws-connect))
  ([http-client request-uri-or-options-or-host-or-port headers-or-request-uri-or-host version-or-headers-or-ws-connect-or-request-uri failure-handler-or-ws-connect] (.websocket http-client request-uri-or-options-or-host-or-port headers-or-request-uri-or-host version-or-headers-or-ws-connect-or-request-uri failure-handler-or-ws-connect))
  ([http-client request-uri-or-host-or-options headers-or-request-uri-or-ws-connect ws-connect-or-failure-handler] (.websocket http-client request-uri-or-host-or-options headers-or-request-uri-or-ws-connect ws-connect-or-failure-handler))
  ([http-client request-uri-or-options-or-host-or-port headers-or-request-uri-or-host version-or-headers-or-request-uri sub-protocols-or-version-or-headers-or-ws-connect ws-connect-or-failure-handler] (.websocket http-client request-uri-or-options-or-host-or-port headers-or-request-uri-or-host version-or-headers-or-request-uri sub-protocols-or-version-or-headers-or-ws-connect ws-connect-or-failure-handler))
  ([http-client request-uri-or-options-or-host-or-port headers-or-request-uri-or-host version-or-headers-or-request-uri sub-protocols-or-version-or-headers sub-protocols-or-version-or-ws-connect ws-connect-or-failure-handler] (.websocket http-client request-uri-or-options-or-host-or-port headers-or-request-uri-or-host version-or-headers-or-request-uri sub-protocols-or-version-or-headers sub-protocols-or-version-or-ws-connect ws-connect-or-failure-handler))
  ([http-client host-or-port request-uri-or-host headers-or-request-uri version-or-headers sub-protocols-or-version sub-protocols-or-ws-connect ws-connect-or-failure-handler] (.websocket http-client host-or-port request-uri-or-host headers-or-request-uri version-or-headers sub-protocols-or-version sub-protocols-or-ws-connect ws-connect-or-failure-handler))
  ([http-client port host request-uri headers version sub-protocols ws-connect failure-handler] (.websocket http-client port host request-uri headers version sub-protocols ws-connect failure-handler)))
(defn websocket-abs
  ([http-client url headers version sub-protocols ws-connect failure-handler] (.websocketAbs http-client url headers version sub-protocols ws-connect failure-handler)))
(defn websocket-stream
  ([http-client request-uri-or-options] (.websocketStream http-client request-uri-or-options))
  ([http-client request-uri-or-options-or-host-or-port headers-or-request-uri-or-host version-or-headers-or-request-uri] (.websocketStream http-client request-uri-or-options-or-host-or-port headers-or-request-uri-or-host version-or-headers-or-request-uri))
  ([http-client request-uri-or-options-or-host headers-or-request-uri] (.websocketStream http-client request-uri-or-options-or-host headers-or-request-uri))
  ([http-client request-uri-or-options-or-host-or-port headers-or-request-uri-or-host version-or-headers-or-request-uri sub-protocols-or-version-or-headers] (.websocketStream http-client request-uri-or-options-or-host-or-port headers-or-request-uri-or-host version-or-headers-or-request-uri sub-protocols-or-version-or-headers))
  ([http-client host-or-port request-uri-or-host headers-or-request-uri version-or-headers sub-protocols-or-version] (.websocketStream http-client host-or-port request-uri-or-host headers-or-request-uri version-or-headers sub-protocols-or-version))
  ([http-client port host request-uri headers version sub-protocols] (.websocketStream http-client port host request-uri headers version sub-protocols)))
(defn websocket-stream-abs
  ([http-client url headers version sub-protocols] (.websocketStreamAbs http-client url headers version sub-protocols)))
(defn handler [f]
  (reify
   io.vertx.core.Handler
   (handle [this para]
           (f para))))
(defn function [f]
  (reify
   java.util.function.Function
   (apply [this para]
           (f para))))