(ns io.testmodel.lang.clojure.data-object-with-buffer)

(import io.vertx.codegen.testmodel.DataObjectWithBuffer)

(defn from-json [^DataObjectWithBuffer json] (new DataObjectWithBuffer json))

(defn set-buffer [^DataObjectWithBuffer data-object-with-buffer buffer] (.setBuffer data-object-with-buffer buffer))
(defn get-buffer [^DataObjectWithBuffer data-object-with-buffer] (.getBuffer data-object-with-buffer))