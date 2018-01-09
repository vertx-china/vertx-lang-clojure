(ns io.vertx.clojure.http-client)

(import io.vertx.core.http.HttpClient)
(import io.vertx.core.http.HttpMethod)
(import io.vertx.core.MultiMap)
(import io.vertx.core.http.RequestOptions)
(import io.vertx.core.http.WebsocketVersion)
(import io.vertx.core.Handler)
(import java.util.function.Function)

(defn request
  ([http-client method options] (.request http-client method options))
  ([http-client method port host request-uri] (.request http-client method port host request-uri))
  ([http-client method host request-uri] (.request http-client method host request-uri))
  ([http-client method port host request-uri response-handler] (.request http-client method port host request-uri response-handler)))
(defn options-
  ([http-client request-uri response-handler] (.options http-client request-uri response-handler)))
(defn websocket-stream-
  ([http-client request-uri headers version sub-protocols] (.websocketStream http-client request-uri headers version sub-protocols)))
(defn delete-
  ([http-client request-uri response-handler] (.delete http-client request-uri response-handler)))
(defn put-
  ([http-client request-uri response-handler] (.put http-client request-uri response-handler)))
(defn delete
  ([http-client options] (.delete http-client options))
  ([http-client port host request-uri] (.delete http-client port host request-uri))
  ([http-client host request-uri] (.delete http-client host request-uri))
  ([http-client port host request-uri response-handler] (.delete http-client port host request-uri response-handler)))
(defn get-now-
  ([http-client request-uri response-handler] (.getNow http-client request-uri response-handler)))
(defn put
  ([http-client options] (.put http-client options))
  ([http-client port host request-uri] (.put http-client port host request-uri))
  ([http-client host request-uri] (.put http-client host request-uri))
  ([http-client port host request-uri response-handler] (.put http-client port host request-uri response-handler)))
(defn head
  ([http-client options] (.head http-client options))
  ([http-client port host request-uri] (.head http-client port host request-uri))
  ([http-client host request-uri] (.head http-client host request-uri))
  ([http-client port host request-uri response-handler] (.head http-client port host request-uri response-handler)))
(defn post-
  ([http-client request-uri response-handler] (.post http-client request-uri response-handler)))
(defn post
  ([http-client options] (.post http-client options))
  ([http-client port host request-uri] (.post http-client port host request-uri))
  ([http-client host request-uri] (.post http-client host request-uri))
  ([http-client port host request-uri response-handler] (.post http-client port host request-uri response-handler)))
(defn head-abs
  ([http-client absolute-uri] (.headAbs http-client absolute-uri))
  ([http-client absolute-uri response-handler] (.headAbs http-client absolute-uri response-handler)))
(defn websocket-
  ([http-client request-uri headers version sub-protocols ws-connect failure-handler] (.websocket http-client request-uri headers version sub-protocols ws-connect failure-handler)))
(defn request-abs
  ([http-client method absolute-uri] (.requestAbs http-client method absolute-uri))
  ([http-client method absolute-uri response-handler] (.requestAbs http-client method absolute-uri response-handler)))
(defn websocket
  ([http-client options ws-connect] (.websocket http-client options ws-connect))
  ([http-client port host request-uri ws-connect] (.websocket http-client port host request-uri ws-connect))
  ([http-client options ws-connect failure-handler] (.websocket http-client options ws-connect failure-handler))
  ([http-client port host request-uri ws-connect failure-handler] (.websocket http-client port host request-uri ws-connect failure-handler))
  ([http-client port host request-uri headers ws-connect failure-handler] (.websocket http-client port host request-uri headers ws-connect failure-handler))
  ([http-client port host request-uri headers version ws-connect failure-handler] (.websocket http-client port host request-uri headers version ws-connect failure-handler))
  ([http-client port host request-uri headers version sub-protocols ws-connect failure-handler] (.websocket http-client port host request-uri headers version sub-protocols ws-connect failure-handler)))
(defn get
  ([http-client options] (.get http-client options))
  ([http-client port host request-uri] (.get http-client port host request-uri))
  ([http-client host request-uri] (.get http-client host request-uri))
  ([http-client port host request-uri response-handler] (.get http-client port host request-uri response-handler)))
(defn options
  ([http-client options] (.options http-client options))
  ([http-client port host request-uri] (.options http-client port host request-uri))
  ([http-client host request-uri] (.options http-client host request-uri))
  ([http-client port host request-uri response-handler] (.options http-client port host request-uri response-handler)))
(defn options-abs
  ([http-client absolute-uri] (.optionsAbs http-client absolute-uri))
  ([http-client absolute-uri response-handler] (.optionsAbs http-client absolute-uri response-handler)))
(defn delete-abs
  ([http-client absolute-uri] (.deleteAbs http-client absolute-uri))
  ([http-client absolute-uri response-handler] (.deleteAbs http-client absolute-uri response-handler)))
(defn websocket-abs
  ([http-client url headers version sub-protocols ws-connect failure-handler] (.websocketAbs http-client url headers version sub-protocols ws-connect failure-handler)))
(defn redirect-handler
  ([http-client handler] (.redirectHandler http-client handler)))
(defn post-abs
  ([http-client absolute-uri] (.postAbs http-client absolute-uri))
  ([http-client absolute-uri response-handler] (.postAbs http-client absolute-uri response-handler)))
(defn close
  ([http-client ] (.close http-client )))
(defn is-metrics-enabled
  ([http-client ] (.isMetricsEnabled http-client )))
(defn websocket-stream
  ([http-client options] (.websocketStream http-client options))
  ([http-client port host request-uri] (.websocketStream http-client port host request-uri))
  ([http-client host request-uri] (.websocketStream http-client host request-uri))
  ([http-client port host request-uri headers] (.websocketStream http-client port host request-uri headers))
  ([http-client port host request-uri headers version] (.websocketStream http-client port host request-uri headers version))
  ([http-client port host request-uri headers version sub-protocols] (.websocketStream http-client port host request-uri headers version sub-protocols)))
(defn head-
  ([http-client request-uri response-handler] (.head http-client request-uri response-handler)))
(defn put-abs
  ([http-client absolute-uri] (.putAbs http-client absolute-uri))
  ([http-client absolute-uri response-handler] (.putAbs http-client absolute-uri response-handler)))
(defn get-
  ([http-client request-uri response-handler] (.get http-client request-uri response-handler)))
(defn get-now
  ([http-client options response-handler] (.getNow http-client options response-handler))
  ([http-client port host request-uri response-handler] (.getNow http-client port host request-uri response-handler))
  ([http-client host request-uri response-handler] (.getNow http-client host request-uri response-handler)))
(defn head-now-
  ([http-client request-uri response-handler] (.headNow http-client request-uri response-handler)))
(defn request-
  ([http-client method request-uri response-handler] (.request http-client method request-uri response-handler)))
(defn head-now
  ([http-client options response-handler] (.headNow http-client options response-handler))
  ([http-client port host request-uri response-handler] (.headNow http-client port host request-uri response-handler))
  ([http-client host request-uri response-handler] (.headNow http-client host request-uri response-handler)))
(defn get-abs
  ([http-client absolute-uri] (.getAbs http-client absolute-uri))
  ([http-client absolute-uri response-handler] (.getAbs http-client absolute-uri response-handler)))
(defn options-now
  ([http-client options response-handler] (.optionsNow http-client options response-handler))
  ([http-client port host request-uri response-handler] (.optionsNow http-client port host request-uri response-handler))
  ([http-client host request-uri response-handler] (.optionsNow http-client host request-uri response-handler)))
(defn options-now-
  ([http-client request-uri response-handler] (.optionsNow http-client request-uri response-handler)))
(defn websocket-stream-abs
  ([http-client url headers version sub-protocols] (.websocketStreamAbs http-client url headers version sub-protocols)))