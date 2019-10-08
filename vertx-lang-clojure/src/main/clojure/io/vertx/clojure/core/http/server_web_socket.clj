(ns io.vertx.clojure.core.http.server-web-socket)

(import io.vertx.core.Handler)
(import io.vertx.core.Promise)
(import io.vertx.core.buffer.Buffer)
(import io.vertx.core.http.ServerWebSocket)
(import io.vertx.core.http.WebSocketFrame)
(import io.vertx.core.streams.WriteStream)

(defn accept
  ([server-web-socket] (.accept server-web-socket)))
(defn binary-handler-id
  ([server-web-socket] (.binaryHandlerID server-web-socket)))
(defn binary-message-handler
  ([server-web-socket handler] (.binaryMessageHandler server-web-socket handler)))
(defn close
  ([server-web-socket status-code-or-handler] (.close server-web-socket status-code-or-handler))
  ([server-web-socket status-code reason-or-handler] (.close server-web-socket status-code reason-or-handler))
  ([server-web-socket status-code reason handler] (.close server-web-socket status-code reason handler))
  ([server-web-socket] (.close server-web-socket)))
(defn close-handler
  ([server-web-socket handler] (.closeHandler server-web-socket handler)))
(defn close-reason
  ([server-web-socket] (.closeReason server-web-socket)))
(defn close-status-code
  ([server-web-socket] (.closeStatusCode server-web-socket)))
(defn drain-handler
  ([server-web-socket handler] (.drainHandler server-web-socket handler)))
(defn end
  ([server-web-socket handler-or-data] (.end server-web-socket handler-or-data))
  ([server-web-socket data handler] (.end server-web-socket data handler))
  ([server-web-socket] (.end server-web-socket)))
(defn end-handler
  ([server-web-socket end-handler] (.endHandler server-web-socket end-handler)))
(defn exception-handler
  ([server-web-socket handler] (.exceptionHandler server-web-socket handler)))
(defn fetch
  ([server-web-socket amount] (.fetch server-web-socket amount)))
(defn frame-handler
  ([server-web-socket handler] (.frameHandler server-web-socket handler)))
(defn handler
  ([f]
    (reify
     io.vertx.core.Handler
     (handle [this para]
           (f para))))
  ([server-web-socket handler] (.handler server-web-socket handler)))
(defn headers
  ([server-web-socket] (.headers server-web-socket)))
(defn is-closed
  ([server-web-socket] (.isClosed server-web-socket)))
(defn is-ssl
  ([server-web-socket] (.isSsl server-web-socket)))
(defn local-address
  ([server-web-socket] (.localAddress server-web-socket)))
(defn path
  ([server-web-socket] (.path server-web-socket)))
(defn pause
  ([server-web-socket] (.pause server-web-socket)))
(defn pipe
  ([server-web-socket] (.pipe server-web-socket)))
(defn pipe-to
  ([server-web-socket dst] (.pipeTo server-web-socket dst))
  ([server-web-socket dst handler] (.pipeTo server-web-socket dst handler)))
(defn pong-handler
  ([server-web-socket handler] (.pongHandler server-web-socket handler)))
(defn query
  ([server-web-socket] (.query server-web-socket)))
(defn reject
  ([server-web-socket] (.reject server-web-socket))
  ([server-web-socket status] (.reject server-web-socket status)))
(defn remote-address
  ([server-web-socket] (.remoteAddress server-web-socket)))
(defn resume
  ([server-web-socket] (.resume server-web-socket)))
(defn set-handshake
  ([server-web-socket future] (.setHandshake server-web-socket future)))
(defn set-write-queue-max-size
  ([server-web-socket max-size] (.setWriteQueueMaxSize server-web-socket max-size)))
(defn sub-protocol
  ([server-web-socket] (.subProtocol server-web-socket)))
(defn text-handler-id
  ([server-web-socket] (.textHandlerID server-web-socket)))
(defn text-message-handler
  ([server-web-socket handler] (.textMessageHandler server-web-socket handler)))
(defn uri
  ([server-web-socket] (.uri server-web-socket)))
(defn write
  ([server-web-socket data] (.write server-web-socket data))
  ([server-web-socket data handler] (.write server-web-socket data handler)))
(defn write-binary-message
  ([server-web-socket data] (.writeBinaryMessage server-web-socket data))
  ([server-web-socket data handler] (.writeBinaryMessage server-web-socket data handler)))
(defn write-final-binary-frame
  ([server-web-socket data] (.writeFinalBinaryFrame server-web-socket data))
  ([server-web-socket data handler] (.writeFinalBinaryFrame server-web-socket data handler)))
(defn write-final-text-frame
  ([server-web-socket text] (.writeFinalTextFrame server-web-socket text))
  ([server-web-socket text handler] (.writeFinalTextFrame server-web-socket text handler)))
(defn write-frame
  ([server-web-socket frame] (.writeFrame server-web-socket frame))
  ([server-web-socket frame handler] (.writeFrame server-web-socket frame handler)))
(defn write-ping
  ([server-web-socket data] (.writePing server-web-socket data)))
(defn write-pong
  ([server-web-socket data] (.writePong server-web-socket data)))
(defn write-queue-full
  ([server-web-socket] (.writeQueueFull server-web-socket)))
(defn write-text-message
  ([server-web-socket text] (.writeTextMessage server-web-socket text))
  ([server-web-socket text handler] (.writeTextMessage server-web-socket text handler)))