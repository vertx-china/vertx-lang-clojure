(ns io.vertx.clojure.web-socket-base)

(import io.vertx.core.http.WebSocketBase)
(import io.vertx.core.buffer.Buffer)
(import io.vertx.core.Handler)
(import io.vertx.core.http.WebSocketFrame)

(defn handler
  ([web-socket-base handler] (.handler web-socket-base handler)))
(defn binary-handler-id
  ([web-socket-base ] (.binaryHandlerID web-socket-base )))
(defn text-message-handler
  ([web-socket-base handler] (.textMessageHandler web-socket-base handler)))
(defn write-final-binary-frame
  ([web-socket-base data] (.writeFinalBinaryFrame web-socket-base data)))
(defn write-queue-full
  ([web-socket-base ] (.writeQueueFull web-socket-base )))
(defn text-handler-id
  ([web-socket-base ] (.textHandlerID web-socket-base )))
(defn set-write-queue-max-size
  ([web-socket-base max-size] (.setWriteQueueMaxSize web-socket-base max-size)))
(defn write-text-message
  ([web-socket-base text] (.writeTextMessage web-socket-base text)))
(defn binary-message-handler
  ([web-socket-base handler] (.binaryMessageHandler web-socket-base handler)))
(defn drain-handler
  ([web-socket-base handler] (.drainHandler web-socket-base handler)))
(defn pong-handler
  ([web-socket-base handler] (.pongHandler web-socket-base handler)))
(defn write-binary-message
  ([web-socket-base data] (.writeBinaryMessage web-socket-base data)))
(defn end
  ([web-socket-base t] (.end web-socket-base t))
  ([web-socket-base ] (.end web-socket-base )))
(defn write-ping
  ([web-socket-base data] (.writePing web-socket-base data)))
(defn sub-protocol
  ([web-socket-base ] (.subProtocol web-socket-base )))
(defn write-pong
  ([web-socket-base data] (.writePong web-socket-base data)))
(defn write
  ([web-socket-base data] (.write web-socket-base data)))
(defn close
  ([web-socket-base ] (.close web-socket-base )))
(defn remote-address
  ([web-socket-base ] (.remoteAddress web-socket-base )))
(defn resume
  ([web-socket-base ] (.resume web-socket-base )))
(defn close-handler
  ([web-socket-base handler] (.closeHandler web-socket-base handler)))
(defn frame-handler
  ([web-socket-base handler] (.frameHandler web-socket-base handler)))
(defn pause
  ([web-socket-base ] (.pause web-socket-base )))
(defn end-handler
  ([web-socket-base end-handler] (.endHandler web-socket-base end-handler)))
(defn local-address
  ([web-socket-base ] (.localAddress web-socket-base )))
(defn write-frame
  ([web-socket-base frame] (.writeFrame web-socket-base frame)))
(defn write-final-text-frame
  ([web-socket-base text] (.writeFinalTextFrame web-socket-base text)))
(defn exception-handler
  ([web-socket-base handler] (.exceptionHandler web-socket-base handler)))
(defn is-ssl
  ([web-socket-base ] (.isSsl web-socket-base )))