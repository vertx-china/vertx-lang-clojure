(ns io.vertx.clojure.core.net.jdk-ssl-engine-options)

(import io.vertx.core.net.JdkSSLEngineOptions)
(import io.vertx.core.json.JsonObject)

(defn new-instance
  ([] (new JdkSSLEngineOptions))
  ([^JsonObject json] (new JdkSSLEngineOptions json)))

(defn to-json [^JdkSSLEngineOptions jdk-ssl-engine-options] (.toJson jdk-ssl-engine-options))