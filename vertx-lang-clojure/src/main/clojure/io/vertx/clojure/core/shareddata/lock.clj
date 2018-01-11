(ns io.vertx.clojure.core.shareddata.lock)

(import io.vertx.core.shareddata.Lock)

(defn release
  ([lock ] (.release lock )))