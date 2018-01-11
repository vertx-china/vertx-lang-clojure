(ns io.vertx.lang.clojure.network-options)

(import io.vertx.core.net.NetworkOptions)

(defn from-json [^NetworkOptions json] (new NetworkOptions json))

(defn set-log-activity [^NetworkOptions network-options log-activity] (.setLogActivity network-options log-activity))
(defn get-log-activity [^NetworkOptions network-options] (.getLogActivity network-options))
(defn set-receive-buffer-size [^NetworkOptions network-options receive-buffer-size] (.setReceiveBufferSize network-options receive-buffer-size))
(defn get-receive-buffer-size [^NetworkOptions network-options] (.getReceiveBufferSize network-options))
(defn set-reuse-address [^NetworkOptions network-options reuse-address] (.setReuseAddress network-options reuse-address))
(defn is-reuse-address [^NetworkOptions network-options] (.isReuseAddress network-options))
(defn set-reuse-port [^NetworkOptions network-options reuse-port] (.setReusePort network-options reuse-port))
(defn is-reuse-port [^NetworkOptions network-options] (.isReusePort network-options))
(defn set-send-buffer-size [^NetworkOptions network-options send-buffer-size] (.setSendBufferSize network-options send-buffer-size))
(defn get-send-buffer-size [^NetworkOptions network-options] (.getSendBufferSize network-options))
(defn set-traffic-class [^NetworkOptions network-options traffic-class] (.setTrafficClass network-options traffic-class))
(defn get-traffic-class [^NetworkOptions network-options] (.getTrafficClass network-options))