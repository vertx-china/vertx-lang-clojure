(ns io.vertx.clojure.core.net.jks-options)

(import io.vertx.core.net.JksOptions)
(import io.vertx.core.json.JsonObject)

(defn new-instance
  ([] (new JksOptions))
  ([^JsonObject json] (new JksOptions json)))

(defn set-password [^JksOptions jks-options password] (.setPassword jks-options password))
(defn get-password [^JksOptions jks-options] (.getPassword jks-options))
(defn set-path [^JksOptions jks-options path] (.setPath jks-options path))
(defn get-path [^JksOptions jks-options] (.getPath jks-options))
(defn set-value [^JksOptions jks-options value] (.setValue jks-options value))
(defn get-value [^JksOptions jks-options] (.getValue jks-options))
(defn to-json [^JksOptions jks-options] (.toJson jks-options))