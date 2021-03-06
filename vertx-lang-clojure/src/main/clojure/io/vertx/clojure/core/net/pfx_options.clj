(ns io.vertx.clojure.core.net.pfx-options)

(import io.vertx.core.net.PfxOptions)
(import io.vertx.core.json.JsonObject)

(defn new-instance
  ([] (new PfxOptions))
  ([^JsonObject json] (new PfxOptions json)))

(defn set-password [^PfxOptions pfx-options password] (.setPassword pfx-options password))
(defn get-password [^PfxOptions pfx-options] (.getPassword pfx-options))
(defn set-path [^PfxOptions pfx-options path] (.setPath pfx-options path))
(defn get-path [^PfxOptions pfx-options] (.getPath pfx-options))
(defn set-value [^PfxOptions pfx-options value] (.setValue pfx-options value))
(defn get-value [^PfxOptions pfx-options] (.getValue pfx-options))
(defn to-json [^PfxOptions pfx-options] (.toJson pfx-options))