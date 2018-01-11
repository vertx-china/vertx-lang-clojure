(ns io.vertx.clojure.core.net.pem-key-cert-options)

(import io.vertx.core.net.PemKeyCertOptions)
(import io.vertx.core.json.JsonObject)

(defn new-instance
  ([] (new PemKeyCertOptions))
  ([^JsonObject json] (new PemKeyCertOptions json)))

(defn set-cert-path [^PemKeyCertOptions pem-key-cert-options cert-path] (.setCertPath pem-key-cert-options cert-path))
(defn set-cert-paths [^PemKeyCertOptions pem-key-cert-options cert-paths] (.setCertPaths pem-key-cert-options cert-paths))
(defn get-cert-paths [^PemKeyCertOptions pem-key-cert-options] (.getCertPaths pem-key-cert-options))
(defn set-cert-value [^PemKeyCertOptions pem-key-cert-options cert-value] (.setCertValue pem-key-cert-options cert-value))
(defn set-cert-values [^PemKeyCertOptions pem-key-cert-options cert-values] (.setCertValues pem-key-cert-options cert-values))
(defn get-cert-values [^PemKeyCertOptions pem-key-cert-options] (.getCertValues pem-key-cert-options))
(defn set-key-path [^PemKeyCertOptions pem-key-cert-options key-path] (.setKeyPath pem-key-cert-options key-path))
(defn set-key-paths [^PemKeyCertOptions pem-key-cert-options key-paths] (.setKeyPaths pem-key-cert-options key-paths))
(defn get-key-paths [^PemKeyCertOptions pem-key-cert-options] (.getKeyPaths pem-key-cert-options))
(defn set-key-value [^PemKeyCertOptions pem-key-cert-options key-value] (.setKeyValue pem-key-cert-options key-value))
(defn set-key-values [^PemKeyCertOptions pem-key-cert-options key-values] (.setKeyValues pem-key-cert-options key-values))
(defn get-key-values [^PemKeyCertOptions pem-key-cert-options] (.getKeyValues pem-key-cert-options))