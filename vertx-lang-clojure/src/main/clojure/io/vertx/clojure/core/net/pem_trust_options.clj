(ns io.vertx.clojure.core.net.pem-trust-options)

(import io.vertx.core.net.PemTrustOptions)
(import io.vertx.core.json.JsonObject)

(defn new-instance
  ([] (new PemTrustOptions))
  ([^JsonObject json] (new PemTrustOptions json)))

(defn add-cert-path [^PemTrustOptions pem-trust-options cert-paths] (.addCertPath pem-trust-options cert-paths))
(defn get-cert-paths [^PemTrustOptions pem-trust-options] (.getCertPaths pem-trust-options))
(defn add-cert-value [^PemTrustOptions pem-trust-options cert-values] (.addCertValue pem-trust-options cert-values))
(defn get-cert-values [^PemTrustOptions pem-trust-options] (.getCertValues pem-trust-options))
(defn to-json [^PemTrustOptions pem-trust-options] (.toJson pem-trust-options))