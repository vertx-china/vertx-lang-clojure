(ns io.vertx.clojure.server-web-socket)

(import io.vertx.core.http.ServerWebSocket)
(import io.vertx.core.buffer.Buffer)
(import io.vertx.core.Handler)
(import io.vertx.core.http.WebSocketFrame)

(defn accept
  ([server-web-socket ] (.accept server-web-socket )))
(defn binary-handler-id
  ([server-web-socket ] (.binaryHandlerID server-web-socket )))
(defn binary-message-handler
  ([server-web-socket handler] (.binaryMessageHandler server-web-socket handler)))
(defn close
  ([server-web-socket ] (.close server-web-socket )))
(defn close-handler
  ([server-web-socket handler] (.closeHandler server-web-socket handler)))
(defn drain-handler
  ([server-web-socket handler] (.drainHandler server-web-socket handler)))
(defn end
  ([server-web-socket t] (.end server-web-socket t))
  ([server-web-socket ] (.end server-web-socket )))
(defn end-handler
  ([server-web-socket end-handler] (.endHandler server-web-socket end-handler)))
(defn exception-handler
  ([server-web-socket handler] (.exceptionHandler server-web-socket handler)))
(defn frame-handler
  ([server-web-socket handler] (.frameHandler server-web-socket handler)))
(defn handler
  ([server-web-socket handler] (.handler server-web-socket handler)))
(defn headers
  ([server-web-socket ] (.headers server-web-socket )))
(defn is-ssl
  ([server-web-socket ] (.isSsl server-web-socket )))
(defn local-address
  ([server-web-socket ] (.localAddress server-web-socket )))
(defn path
  ([server-web-socket ] (.path server-web-socket )))
(defn pause
  ([server-web-socket ] (.pause server-web-socket )))
(defn pong-handler
  ([server-web-socket handler] (.pongHandler server-web-socket handler)))
(defn query
  ([server-web-socket ] (.query server-web-socket )))
(defn reject
  ([server-web-socket ] (.reject server-web-socket ))
  ([server-web-socket status] (.reject server-web-socket status)))
(defn remote-address
  ([server-web-socket ] (.remoteAddress server-web-socket )))
(defn resume
  ([server-web-socket ] (.resume server-web-socket )))
(defn set-write-queue-max-size
  ([server-web-socket max-size] (.setWriteQueueMaxSize server-web-socket max-size)))
(defn sub-protocol
  ([server-web-socket ] (.subProtocol server-web-socket )))
(defn text-handler-id
  ([server-web-socket ] (.textHandlerID server-web-socket )))
(defn text-message-handler
  ([server-web-socket handler] (.textMessageHandler server-web-socket handler)))
(defn uri
  ([server-web-socket ] (.uri server-web-socket )))
(defn write
  ([server-web-socket data] (.write server-web-socket data)))
(defn write-binary-message
  ([server-web-socket data] (.writeBinaryMessage server-web-socket data)))
(defn write-final-binary-frame
  ([server-web-socket data] (.writeFinalBinaryFrame server-web-socket data)))
(defn write-final-text-frame
  ([server-web-socket text] (.writeFinalTextFrame server-web-socket text)))
(defn write-frame
  ([server-web-socket frame] (.writeFrame server-web-socket frame)))
(defn write-ping
  ([server-web-socket data] (.writePing server-web-socket data)))
(defn write-pong
  ([server-web-socket data] (.writePong server-web-socket data)))
(defn write-queue-full
  ([server-web-socket ] (.writeQueueFull server-web-socket )))
(defn write-text-message
  ([server-web-socket text] (.writeTextMessage server-web-socket text)))