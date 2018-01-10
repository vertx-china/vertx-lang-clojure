(ns io.vertx.lang.clojure.lock)

(import io.vertx.core.shareddata.Lock)

(defn release
  ([lock ] (.release lock )))