(ns io.vertx.clojure.web-socket)

(import io.vertx.core.http.WebSocket)
(import io.vertx.core.buffer.Buffer)
(import io.vertx.core.Handler)
(import io.vertx.core.http.WebSocketFrame)

(defn binary-handler-id
  ([web-socket ] (.binaryHandlerID web-socket )))
(defn handler
  ([web-socket handler] (.handler web-socket handler)))
(defn text-message-handler
  ([web-socket handler] (.textMessageHandler web-socket handler)))
(defn write-final-binary-frame
  ([web-socket data] (.writeFinalBinaryFrame web-socket data)))
(defn write-queue-full
  ([web-socket ] (.writeQueueFull web-socket )))
(defn text-handler-id
  ([web-socket ] (.textHandlerID web-socket )))
(defn set-write-queue-max-size
  ([web-socket max-size] (.setWriteQueueMaxSize web-socket max-size)))
(defn write-text-message
  ([web-socket text] (.writeTextMessage web-socket text)))
(defn binary-message-handler
  ([web-socket handler] (.binaryMessageHandler web-socket handler)))
(defn drain-handler
  ([web-socket handler] (.drainHandler web-socket handler)))
(defn pong-handler
  ([web-socket handler] (.pongHandler web-socket handler)))
(defn write-binary-message
  ([web-socket data] (.writeBinaryMessage web-socket data)))
(defn end
  ([web-socket t] (.end web-socket t))
  ([web-socket ] (.end web-socket )))
(defn write-ping
  ([web-socket data] (.writePing web-socket data)))
(defn sub-protocol
  ([web-socket ] (.subProtocol web-socket )))
(defn write-pong
  ([web-socket data] (.writePong web-socket data)))
(defn close
  ([web-socket ] (.close web-socket )))
(defn write
  ([web-socket data] (.write web-socket data)))
(defn remote-address
  ([web-socket ] (.remoteAddress web-socket )))
(defn resume
  ([web-socket ] (.resume web-socket )))
(defn close-handler
  ([web-socket handler] (.closeHandler web-socket handler)))
(defn frame-handler
  ([web-socket handler] (.frameHandler web-socket handler)))
(defn pause
  ([web-socket ] (.pause web-socket )))
(defn end-handler
  ([web-socket end-handler] (.endHandler web-socket end-handler)))
(defn local-address
  ([web-socket ] (.localAddress web-socket )))
(defn write-frame
  ([web-socket frame] (.writeFrame web-socket frame)))
(defn write-final-text-frame
  ([web-socket text] (.writeFinalTextFrame web-socket text)))
(defn exception-handler
  ([web-socket handler] (.exceptionHandler web-socket handler)))
(defn is-ssl
  ([web-socket ] (.isSsl web-socket )))