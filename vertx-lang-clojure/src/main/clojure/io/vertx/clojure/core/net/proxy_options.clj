(ns io.vertx.clojure.core.net.proxy-options)

(import io.vertx.core.net.ProxyOptions)
(import io.vertx.core.json.JsonObject)

(defn new-instance
  ([] (new ProxyOptions))
  ([^JsonObject json] (new ProxyOptions json)))

(defn set-host [^ProxyOptions proxy-options host] (.setHost proxy-options host))
(defn get-host [^ProxyOptions proxy-options] (.getHost proxy-options))
(defn set-password [^ProxyOptions proxy-options password] (.setPassword proxy-options password))
(defn get-password [^ProxyOptions proxy-options] (.getPassword proxy-options))
(defn set-port [^ProxyOptions proxy-options port] (.setPort proxy-options port))
(defn get-port [^ProxyOptions proxy-options] (.getPort proxy-options))
(defn set-type [^ProxyOptions proxy-options type] (.setType proxy-options type))
(defn get-type [^ProxyOptions proxy-options] (.getType proxy-options))
(defn set-username [^ProxyOptions proxy-options username] (.setUsername proxy-options username))
(defn get-username [^ProxyOptions proxy-options] (.getUsername proxy-options))