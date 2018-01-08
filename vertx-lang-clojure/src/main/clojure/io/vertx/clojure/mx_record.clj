(ns io.vertx.clojure.mx-record)

(import io.vertx.core.dns.MxRecord)

(defn name
  ([mx-record ] (.name mx-record )))
(defn priority
  ([mx-record ] (.priority mx-record )))