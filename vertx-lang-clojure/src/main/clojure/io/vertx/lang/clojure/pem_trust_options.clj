(ns io.vertx.lang.clojure.pem-trust-options)

(import io.vertx.core.net.PemTrustOptions)

(defn from-json [^PemTrustOptions json] (new PemTrustOptions json))

(defn add-cert-path [^PemTrustOptions pem-trust-options cert-paths] (.addCertPath pem-trust-options cert-paths))
(defn get-cert-paths [^PemTrustOptions pem-trust-options] (.getCertPaths pem-trust-options))
(defn add-cert-value [^PemTrustOptions pem-trust-options cert-values] (.addCertValue pem-trust-options cert-values))
(defn get-cert-values [^PemTrustOptions pem-trust-options] (.getCertValues pem-trust-options))