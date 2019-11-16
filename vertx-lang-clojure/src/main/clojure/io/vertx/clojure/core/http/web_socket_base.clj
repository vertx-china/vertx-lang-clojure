(ns io.vertx.clojure.core.http.web-socket-base)

(import io.vertx.core.Handler)
(import io.vertx.core.buffer.Buffer)
(import io.vertx.core.http.WebSocketBase)
(import io.vertx.core.http.WebSocketFrame)
(import io.vertx.core.streams.WriteStream)

(defn binary-handler-id
  ([web-socket-base] (.binaryHandlerID web-socket-base)))
(defn binary-message-handler
  ([web-socket-base handler] (.binaryMessageHandler web-socket-base handler)))
(defn close
  ([web-socket-base handler] (.close web-socket-base handler))
  ([web-socket-base status-code handler] (.close web-socket-base status-code handler))
  ([web-socket-base status-code reason handler] (.close web-socket-base status-code reason handler)))
(defn close-handler
  ([web-socket-base handler] (.closeHandler web-socket-base handler)))
(defn close-reason
  ([web-socket-base] (.closeReason web-socket-base)))
(defn close-status-code
  ([web-socket-base] (.closeStatusCode web-socket-base)))
(defn drain-handler
  ([web-socket-base handler] (.drainHandler web-socket-base handler)))
(defn end
  ([web-socket-base data handler] (.end web-socket-base data handler))
  ([web-socket-base handler] (.end web-socket-base handler)))
(defn end-handler
  ([web-socket-base end-handler] (.endHandler web-socket-base end-handler)))
(defn exception-handler
  ([web-socket-base handler] (.exceptionHandler web-socket-base handler)))
(defn fetch
  ([web-socket-base amount] (.fetch web-socket-base amount)))
(defn frame-handler
  ([web-socket-base handler] (.frameHandler web-socket-base handler)))
(defn handler
  ([f]
    (reify
     io.vertx.core.Handler
     (handle [this para]
           (f para))))
  ([web-socket-base handler] (.handler web-socket-base handler)))
(defn headers
  ([web-socket-base] (.headers web-socket-base)))
(defn is-closed
  ([web-socket-base] (.isClosed web-socket-base)))
(defn is-ssl
  ([web-socket-base] (.isSsl web-socket-base)))
(defn local-address
  ([web-socket-base] (.localAddress web-socket-base)))
(defn pause
  ([web-socket-base] (.pause web-socket-base)))
(defn pipe
  ([web-socket-base] (.pipe web-socket-base)))
(defn pipe-to
  ([web-socket-base dst handler] (.pipeTo web-socket-base dst handler)))
(defn pong-handler
  ([web-socket-base handler] (.pongHandler web-socket-base handler)))
(defn remote-address
  ([web-socket-base] (.remoteAddress web-socket-base)))
(defn resume
  ([web-socket-base] (.resume web-socket-base)))
(defn set-write-queue-max-size
  ([web-socket-base max-size] (.setWriteQueueMaxSize web-socket-base max-size)))
(defn sub-protocol
  ([web-socket-base] (.subProtocol web-socket-base)))
(defn text-handler-id
  ([web-socket-base] (.textHandlerID web-socket-base)))
(defn text-message-handler
  ([web-socket-base handler] (.textMessageHandler web-socket-base handler)))
(defn write
  ([web-socket-base data handler] (.write web-socket-base data handler)))
(defn write-binary-message
  ([web-socket-base data handler] (.writeBinaryMessage web-socket-base data handler)))
(defn write-final-binary-frame
  ([web-socket-base data handler] (.writeFinalBinaryFrame web-socket-base data handler)))
(defn write-final-text-frame
  ([web-socket-base text handler] (.writeFinalTextFrame web-socket-base text handler)))
(defn write-frame
  ([web-socket-base frame handler] (.writeFrame web-socket-base frame handler)))
(defn write-ping
  ([web-socket-base data handler] (.writePing web-socket-base data handler)))
(defn write-pong
  ([web-socket-base data handler] (.writePong web-socket-base data handler)))
(defn write-queue-full
  ([web-socket-base] (.writeQueueFull web-socket-base)))
(defn write-text-message
  ([web-socket-base text handler] (.writeTextMessage web-socket-base text handler)))