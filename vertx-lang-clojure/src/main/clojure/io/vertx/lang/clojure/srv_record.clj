(ns io.vertx.lang.clojure.srv-record)

(import io.vertx.core.dns.SrvRecord)

(defn name
  ([srv-record ] (.name srv-record )))
(defn port
  ([srv-record ] (.port srv-record )))
(defn priority
  ([srv-record ] (.priority srv-record )))
(defn protocol
  ([srv-record ] (.protocol srv-record )))
(defn service
  ([srv-record ] (.service srv-record )))
(defn target
  ([srv-record ] (.target srv-record )))
(defn weight
  ([srv-record ] (.weight srv-record )))