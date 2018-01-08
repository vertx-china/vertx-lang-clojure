(ns io.vertx.clojure.counter)

(import io.vertx.core.shareddata.Counter)
(import io.vertx.core.Handler)

(defn get-and-increment
  ([counter result-handler] (.getAndIncrement counter result-handler)))
(defn increment-and-get
  ([counter result-handler] (.incrementAndGet counter result-handler)))
(defn compare-and-set
  ([counter expected value result-handler] (.compareAndSet counter expected value result-handler)))
(defn get
  ([counter result-handler] (.get counter result-handler)))
(defn get-and-add
  ([counter value result-handler] (.getAndAdd counter value result-handler)))
(defn decrement-and-get
  ([counter result-handler] (.decrementAndGet counter result-handler)))
(defn add-and-get
  ([counter value result-handler] (.addAndGet counter value result-handler)))