(ns io.vertx.lang.clojure.jdk-ssl-engine-options)

(import io.vertx.core.net.JdkSSLEngineOptions)

(defn from-json [^JdkSSLEngineOptions json] (new JdkSSLEngineOptions json))

(defn is-alpn-available [^JdkSSLEngineOptions jdk-ssl-engine-options] (.isAlpnAvailable jdk-ssl-engine-options))