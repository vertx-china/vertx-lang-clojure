(ns io.vertx.clojure.core.http.web-socket)

(import io.vertx.core.Handler)
(import io.vertx.core.buffer.Buffer)
(import io.vertx.core.http.WebSocket)
(import io.vertx.core.http.WebSocketFrame)
(import io.vertx.core.streams.WriteStream)

(defn binary-handler-id
  ([web-socket] (.binaryHandlerID web-socket)))
(defn binary-message-handler
  ([web-socket handler] (.binaryMessageHandler web-socket handler)))
(defn close
  ([web-socket] (.close web-socket))
  ([web-socket status-code] (.close web-socket status-code))
  ([web-socket status-code reason] (.close web-socket status-code reason)))
(defn close-handler
  ([web-socket handler] (.closeHandler web-socket handler)))
(defn drain-handler
  ([web-socket handler] (.drainHandler web-socket handler)))
(defn end
  ([web-socket t] (.end web-socket t))
  ([web-socket] (.end web-socket)))
(defn end-handler
  ([web-socket end-handler] (.endHandler web-socket end-handler)))
(defn exception-handler
  ([web-socket handler] (.exceptionHandler web-socket handler)))
(defn fetch
  ([web-socket amount] (.fetch web-socket amount)))
(defn frame-handler
  ([web-socket handler] (.frameHandler web-socket handler)))
(defn handler
  ([f]
    (reify
     io.vertx.core.Handler
     (handle [this para]
           (f para))))
  ([web-socket handler] (.handler web-socket handler)))
(defn is-ssl
  ([web-socket] (.isSsl web-socket)))
(defn local-address
  ([web-socket] (.localAddress web-socket)))
(defn pause
  ([web-socket] (.pause web-socket)))
(defn pipe
  ([web-socket] (.pipe web-socket)))
(defn pipe-to
  ([web-socket dst] (.pipeTo web-socket dst))
  ([web-socket dst handler] (.pipeTo web-socket dst handler)))
(defn pong-handler
  ([web-socket handler] (.pongHandler web-socket handler)))
(defn remote-address
  ([web-socket] (.remoteAddress web-socket)))
(defn resume
  ([web-socket] (.resume web-socket)))
(defn set-write-queue-max-size
  ([web-socket max-size] (.setWriteQueueMaxSize web-socket max-size)))
(defn sub-protocol
  ([web-socket] (.subProtocol web-socket)))
(defn text-handler-id
  ([web-socket] (.textHandlerID web-socket)))
(defn text-message-handler
  ([web-socket handler] (.textMessageHandler web-socket handler)))
(defn write
  ([web-socket data] (.write web-socket data)))
(defn write-binary-message
  ([web-socket data] (.writeBinaryMessage web-socket data)))
(defn write-final-binary-frame
  ([web-socket data] (.writeFinalBinaryFrame web-socket data)))
(defn write-final-text-frame
  ([web-socket text] (.writeFinalTextFrame web-socket text)))
(defn write-frame
  ([web-socket frame] (.writeFrame web-socket frame)))
(defn write-ping
  ([web-socket data] (.writePing web-socket data)))
(defn write-pong
  ([web-socket data] (.writePong web-socket data)))
(defn write-queue-full
  ([web-socket] (.writeQueueFull web-socket)))
(defn write-text-message
  ([web-socket text] (.writeTextMessage web-socket text)))