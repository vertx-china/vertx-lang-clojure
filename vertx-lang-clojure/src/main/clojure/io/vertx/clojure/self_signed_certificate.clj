(ns io.vertx.clojure.self-signed-certificate)

(import io.vertx.core.net.SelfSignedCertificate)

(defn certificate-path
  ([self-signed-certificate ] (.certificatePath self-signed-certificate )))
(defn create
  ([] (SelfSignedCertificate/create ))
  ([fqdn] (SelfSignedCertificate/create fqdn)))
(defn delete
  ([self-signed-certificate ] (.delete self-signed-certificate )))
(defn key-cert-options
  ([self-signed-certificate ] (.keyCertOptions self-signed-certificate )))
(defn private-key-path
  ([self-signed-certificate ] (.privateKeyPath self-signed-certificate )))
(defn trust-options
  ([self-signed-certificate ] (.trustOptions self-signed-certificate )))