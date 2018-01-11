(ns io.vertx.lang.clojure.open-ssl-engine-options)

(import io.vertx.core.net.OpenSSLEngineOptions)

(defn from-json [^OpenSSLEngineOptions json] (new OpenSSLEngineOptions json))

(defn is-alpn-available [^OpenSSLEngineOptions open-ssl-engine-options] (.isAlpnAvailable open-ssl-engine-options))
(defn is-available [^OpenSSLEngineOptions open-ssl-engine-options] (.isAvailable open-ssl-engine-options))
(defn set-session-cache-enabled [^OpenSSLEngineOptions open-ssl-engine-options session-cache-enabled] (.setSessionCacheEnabled open-ssl-engine-options session-cache-enabled))
(defn is-session-cache-enabled [^OpenSSLEngineOptions open-ssl-engine-options] (.isSessionCacheEnabled open-ssl-engine-options))