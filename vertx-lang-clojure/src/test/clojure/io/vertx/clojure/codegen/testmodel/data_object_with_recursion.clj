(ns io.vertx.clojure.codegen.testmodel.data-object-with-recursion)

(import io.vertx.codegen.testmodel.DataObjectWithRecursion)
(import io.vertx.core.json.JsonObject)

(defn new-instance
  ([^JsonObject json] (new DataObjectWithRecursion json)))

(defn set-data [^DataObjectWithRecursion data-object-with-recursion data] (.setData data-object-with-recursion data))
(defn get-data [^DataObjectWithRecursion data-object-with-recursion] (.getData data-object-with-recursion))
(defn set-next [^DataObjectWithRecursion data-object-with-recursion next] (.setNext data-object-with-recursion next))
(defn get-next [^DataObjectWithRecursion data-object-with-recursion] (.getNext data-object-with-recursion))
(defn to-json [^DataObjectWithRecursion data-object-with-recursion] (.toJson data-object-with-recursion))