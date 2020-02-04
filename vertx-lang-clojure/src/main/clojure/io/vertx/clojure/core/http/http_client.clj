(ns io.vertx.clojure.core.http.http-client)

(import io.vertx.core.Handler)
(import io.vertx.core.MultiMap)
(import io.vertx.core.buffer.Buffer)
(import io.vertx.core.http.HttpClient)
(import io.vertx.core.http.HttpMethod)
(import io.vertx.core.http.RequestOptions)
(import io.vertx.core.http.WebSocketConnectOptions)
(import io.vertx.core.http.WebsocketVersion)
(import io.vertx.core.net.SocketAddress)
(import io.vertx.core.streams.ReadStream)
(import java.util.List)
(import java.util.function.Function)

(defn close
  ([http-client] (.close http-client)))
(defn connection-handler
  ([http-client handler] (.connectionHandler http-client handler)))
(defn delete
  ([http-client port host request-uri headers response-handler] (.delete http-client port host request-uri headers response-handler))
  ([http-client port-or-host host-or-request-uri request-uri-or-headers response-handler] (.delete http-client port-or-host host-or-request-uri request-uri-or-headers response-handler))
  ([http-client host-or-request-uri request-uri-or-headers response-handler] (.delete http-client host-or-request-uri request-uri-or-headers response-handler))
  ([http-client request-uri-or-options response-handler] (.delete http-client request-uri-or-options response-handler)))
(defn get
  ([http-client port host request-uri headers response-handler] (.get http-client port host request-uri headers response-handler))
  ([http-client port-or-host host-or-request-uri request-uri-or-headers response-handler] (.get http-client port-or-host host-or-request-uri request-uri-or-headers response-handler))
  ([http-client host-or-request-uri request-uri-or-headers response-handler] (.get http-client host-or-request-uri request-uri-or-headers response-handler))
  ([http-client request-uri-or-options response-handler] (.get http-client request-uri-or-options response-handler)))
(defn head
  ([http-client port host request-uri headers response-handler] (.head http-client port host request-uri headers response-handler))
  ([http-client port-or-host host-or-request-uri request-uri-or-headers response-handler] (.head http-client port-or-host host-or-request-uri request-uri-or-headers response-handler))
  ([http-client host-or-request-uri request-uri-or-headers response-handler] (.head http-client host-or-request-uri request-uri-or-headers response-handler))
  ([http-client request-uri-or-options response-handler] (.head http-client request-uri-or-options response-handler)))
(defn is-metrics-enabled
  ([http-client] (.isMetricsEnabled http-client)))
(defn options
  ([http-client port host request-uri headers response-handler] (.options http-client port host request-uri headers response-handler))
  ([http-client port-or-host host-or-request-uri request-uri-or-headers response-handler] (.options http-client port-or-host host-or-request-uri request-uri-or-headers response-handler))
  ([http-client host-or-request-uri request-uri-or-headers response-handler] (.options http-client host-or-request-uri request-uri-or-headers response-handler))
  ([http-client request-uri-or-options response-handler] (.options http-client request-uri-or-options response-handler)))
(defn post
  ([http-client port host request-uri headers body response-handler] (.post http-client port host request-uri headers body response-handler))
  ([http-client port-or-host host-or-request-uri request-uri-or-headers body response-handler] (.post http-client port-or-host host-or-request-uri request-uri-or-headers body response-handler))
  ([http-client host-or-request-uri request-uri-or-headers body response-handler] (.post http-client host-or-request-uri request-uri-or-headers body response-handler))
  ([http-client request-uri-or-options body response-handler] (.post http-client request-uri-or-options body response-handler)))
(defn put
  ([http-client port host request-uri headers body response-handler] (.put http-client port host request-uri headers body response-handler))
  ([http-client port-or-host host-or-request-uri request-uri-or-headers body response-handler] (.put http-client port-or-host host-or-request-uri request-uri-or-headers body response-handler))
  ([http-client host-or-request-uri request-uri-or-headers body response-handler] (.put http-client host-or-request-uri request-uri-or-headers body response-handler))
  ([http-client request-uri-or-options body response-handler] (.put http-client request-uri-or-options body response-handler)))
(defn redirect-handler
  ([http-client handler] (.redirectHandler http-client handler)))
(defn request
  ([http-client method-or-server-address request-uri-or-options] (.request http-client method-or-server-address request-uri-or-options))
  ([http-client options] (.request http-client options))
  ([http-client method port host request-uri] (.request http-client method port host request-uri))
  ([http-client method server-address port host request-uri] (.request http-client method server-address port host request-uri))
  ([http-client method host request-uri] (.request http-client method host request-uri)))
(defn send
  ([http-client options response-handler] (.send http-client options response-handler))
  ([http-client method-or-options request-uri-or-body response-handler] (.send http-client method-or-options request-uri-or-body response-handler))
  ([http-client method host-or-port request-uri-or-host headers-or-request-uri body-or-headers response-handler] (.send http-client method host-or-port request-uri-or-host headers-or-request-uri body-or-headers response-handler))
  ([http-client method port host request-uri headers body response-handler] (.send http-client method port host request-uri headers body response-handler))
  ([http-client method request-uri-or-host-or-port headers-or-request-uri-or-host body-or-headers-or-request-uri response-handler] (.send http-client method request-uri-or-host-or-port headers-or-request-uri-or-host body-or-headers-or-request-uri response-handler))
  ([http-client method request-uri-or-host body-or-headers-or-request-uri response-handler] (.send http-client method request-uri-or-host body-or-headers-or-request-uri response-handler)))
(defn web-socket
  ([http-client port host request-uri handler] (.webSocket http-client port host request-uri handler))
  ([http-client host request-uri handler] (.webSocket http-client host request-uri handler))
  ([http-client options-or-request-uri handler] (.webSocket http-client options-or-request-uri handler)))
(defn web-socket-abs
  ([http-client url headers version sub-protocols handler] (.webSocketAbs http-client url headers version sub-protocols handler)))
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