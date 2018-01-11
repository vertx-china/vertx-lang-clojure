(ns io.vertx.clojure.codegen.testmodel.data-object-with-buffer)

(import io.vertx.codegen.testmodel.DataObjectWithBuffer)
(import io.vertx.core.json.JsonObject)

(defn new-instance
  ([^JsonObject json] (new DataObjectWithBuffer json)))

(defn set-buffer [^DataObjectWithBuffer data-object-with-buffer buffer] (.setBuffer data-object-with-buffer buffer))
(defn get-buffer [^DataObjectWithBuffer data-object-with-buffer] (.getBuffer data-object-with-buffer))