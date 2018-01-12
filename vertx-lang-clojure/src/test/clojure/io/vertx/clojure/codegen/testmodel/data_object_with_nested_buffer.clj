(ns io.vertx.clojure.codegen.testmodel.data-object-with-nested-buffer)

(import io.vertx.codegen.testmodel.DataObjectWithNestedBuffer)
(import io.vertx.core.json.JsonObject)

(defn new-instance
  ([^JsonObject json] (new DataObjectWithNestedBuffer json)))

(defn set-buffer [^DataObjectWithNestedBuffer data-object-with-nested-buffer buffer] (.setBuffer data-object-with-nested-buffer buffer))
(defn get-buffer [^DataObjectWithNestedBuffer data-object-with-nested-buffer] (.getBuffer data-object-with-nested-buffer))
(defn set-buffers [^DataObjectWithNestedBuffer data-object-with-nested-buffer buffers] (.setBuffers data-object-with-nested-buffer buffers))
(defn get-buffers [^DataObjectWithNestedBuffer data-object-with-nested-buffer] (.getBuffers data-object-with-nested-buffer))
(defn set-nested [^DataObjectWithNestedBuffer data-object-with-nested-buffer nested] (.setNested data-object-with-nested-buffer nested))
(defn get-nested [^DataObjectWithNestedBuffer data-object-with-nested-buffer] (.getNested data-object-with-nested-buffer))
(defn to-json [^DataObjectWithNestedBuffer data-object-with-nested-buffer] (.toJson data-object-with-nested-buffer))