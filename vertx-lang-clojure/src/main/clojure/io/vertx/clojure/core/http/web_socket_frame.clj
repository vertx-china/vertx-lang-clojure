(ns io.vertx.clojure.core.http.web-socket-frame)

(import io.vertx.core.http.WebSocketFrame)
(import io.vertx.core.buffer.Buffer)

(defn binary-data
  ([web-socket-frame ] (.binaryData web-socket-frame )))
(defn binary-frame
  ([data is-final] (WebSocketFrame/binaryFrame data is-final)))
(defn continuation-frame
  ([data is-final] (WebSocketFrame/continuationFrame data is-final)))
(defn is-binary
  ([web-socket-frame ] (.isBinary web-socket-frame )))
(defn is-continuation
  ([web-socket-frame ] (.isContinuation web-socket-frame )))
(defn is-final
  ([web-socket-frame ] (.isFinal web-socket-frame )))
(defn is-text
  ([web-socket-frame ] (.isText web-socket-frame )))
(defn ping-frame
  ([data] (WebSocketFrame/pingFrame data)))
(defn pong-frame
  ([data] (WebSocketFrame/pongFrame data)))
(defn text-data
  ([web-socket-frame ] (.textData web-socket-frame )))
(defn text-frame
  ([str is-final] (WebSocketFrame/textFrame str is-final)))