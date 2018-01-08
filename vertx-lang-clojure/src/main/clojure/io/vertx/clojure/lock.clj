(ns io.vertx.clojure.lock)

(import io.vertx.core.shareddata.Lock)

(defn release
  ([lock ] (.release lock )))