(ns io.vertx.clojure.net-socket)

(import io.vertx.core.net.NetSocket)
(import io.vertx.core.buffer.Buffer)
(import io.vertx.core.Handler)

(defn resume
  ([net-socket ] (.resume net-socket )))
(defn handler
  ([net-socket handler] (.handler net-socket handler)))
(defn write-queue-full
  ([net-socket ] (.writeQueueFull net-socket )))
(defn upgrade-to-ssl
  ([net-socket handler] (.upgradeToSsl net-socket handler))
  ([net-socket server-name handler] (.upgradeToSsl net-socket server-name handler)))
(defn write-handler-id
  ([net-socket ] (.writeHandlerID net-socket )))
(defn close-handler
  ([net-socket handler] (.closeHandler net-socket handler)))
(defn pause
  ([net-socket ] (.pause net-socket )))
(defn set-write-queue-max-size
  ([net-socket max-size] (.setWriteQueueMaxSize net-socket max-size)))
(defn send-file
  ([net-socket filename] (.sendFile net-socket filename))
  ([net-socket filename offset] (.sendFile net-socket filename offset))
  ([net-socket filename offset length] (.sendFile net-socket filename offset length))
  ([net-socket filename result-handler] (.sendFile net-socket filename result-handler))
  ([net-socket filename offset result-handler] (.sendFile net-socket filename offset result-handler))
  ([net-socket filename offset length result-handler] (.sendFile net-socket filename offset length result-handler)))
(defn indicated-server-name
  ([net-socket ] (.indicatedServerName net-socket )))
(defn drain-handler
  ([net-socket handler] (.drainHandler net-socket handler)))
(defn end-handler
  ([net-socket end-handler] (.endHandler net-socket end-handler)))
(defn local-address
  ([net-socket ] (.localAddress net-socket )))
(defn end
  ([net-socket t] (.end net-socket t))
  ([net-socket ] (.end net-socket )))
(defn exception-handler
  ([net-socket handler] (.exceptionHandler net-socket handler)))
(defn write
  ([net-socket data] (.write net-socket data))
  ([net-socket str] (.write net-socket str))
  ([net-socket str enc] (.write net-socket str enc)))
(defn close
  ([net-socket ] (.close net-socket )))
(defn remote-address
  ([net-socket ] (.remoteAddress net-socket )))
(defn is-ssl
  ([net-socket ] (.isSsl net-socket )))