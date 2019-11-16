(ns io.vertx.clojure.core.net.net-socket)

(import io.vertx.core.Handler)
(import io.vertx.core.buffer.Buffer)
(import io.vertx.core.net.NetSocket)
(import io.vertx.core.streams.WriteStream)

(defn close
  ([net-socket handler] (.close net-socket handler)))
(defn close-handler
  ([net-socket handler] (.closeHandler net-socket handler)))
(defn drain-handler
  ([net-socket handler] (.drainHandler net-socket handler)))
(defn end
  ([net-socket data handler] (.end net-socket data handler))
  ([net-socket handler] (.end net-socket handler)))
(defn end-handler
  ([net-socket end-handler] (.endHandler net-socket end-handler)))
(defn exception-handler
  ([net-socket handler] (.exceptionHandler net-socket handler)))
(defn fetch
  ([net-socket amount] (.fetch net-socket amount)))
(defn handler
  ([f]
    (reify
     io.vertx.core.Handler
     (handle [this para]
           (f para))))
  ([net-socket handler] (.handler net-socket handler)))
(defn indicated-server-name
  ([net-socket] (.indicatedServerName net-socket)))
(defn is-ssl
  ([net-socket] (.isSsl net-socket)))
(defn local-address
  ([net-socket] (.localAddress net-socket)))
(defn pause
  ([net-socket] (.pause net-socket)))
(defn pipe
  ([net-socket] (.pipe net-socket)))
(defn pipe-to
  ([net-socket dst handler] (.pipeTo net-socket dst handler)))
(defn remote-address
  ([net-socket] (.remoteAddress net-socket)))
(defn resume
  ([net-socket] (.resume net-socket)))
(defn send-file
  ([net-socket filename result-handler] (.sendFile net-socket filename result-handler))
  ([net-socket filename offset result-handler] (.sendFile net-socket filename offset result-handler))
  ([net-socket filename offset length result-handler] (.sendFile net-socket filename offset length result-handler)))
(defn set-write-queue-max-size
  ([net-socket max-size] (.setWriteQueueMaxSize net-socket max-size)))
(defn upgrade-to-ssl
  ([net-socket handler] (.upgradeToSsl net-socket handler))
  ([net-socket server-name handler] (.upgradeToSsl net-socket server-name handler)))
(defn write
  ([net-socket message-or-str handler] (.write net-socket message-or-str handler))
  ([net-socket str enc handler] (.write net-socket str enc handler)))
(defn write-handler-id
  ([net-socket] (.writeHandlerID net-socket)))
(defn write-queue-full
  ([net-socket] (.writeQueueFull net-socket)))