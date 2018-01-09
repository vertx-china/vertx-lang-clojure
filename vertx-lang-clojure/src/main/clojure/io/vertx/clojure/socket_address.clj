(ns io.vertx.clojure.socket-address)

(import io.vertx.core.net.SocketAddress)

(defn domain-socket-address
  ([path] (SocketAddress/domainSocketAddress path)))
(defn host
  ([socket-address ] (.host socket-address )))
(defn inet-socket-address
  ([port host] (SocketAddress/inetSocketAddress port host)))
(defn path
  ([socket-address ] (.path socket-address )))
(defn port
  ([socket-address ] (.port socket-address )))