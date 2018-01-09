(ns io.testmodel.clojure.data-object-tck)

(import io.vertx.codegen.testmodel.DataObjectTCK)
(import io.vertx.codegen.testmodel.DataObjectWithMaps)
(import io.vertx.codegen.testmodel.DataObjectWithRecursion)
(import io.vertx.codegen.testmodel.DataObjectWithOnlyJsonObjectConstructor)
(import io.vertx.codegen.testmodel.DataObjectWithMapAdders)
(import io.vertx.codegen.testmodel.DataObjectWithListAdders)
(import io.vertx.codegen.testmodel.DataObjectWithLists)
(import io.vertx.codegen.testmodel.DataObjectWithNestedBuffer)
(import io.vertx.codegen.testmodel.DataObjectWithValues)

(defn get-data-object-with-lists
  ([data-object-tck ] (.getDataObjectWithLists data-object-tck )))
(defn get-data-object-with-maps
  ([data-object-tck ] (.getDataObjectWithMaps data-object-tck )))
(defn get-data-object-with-values
  ([data-object-tck ] (.getDataObjectWithValues data-object-tck )))
(defn method-with-only-json-object-constructor-data-object
  ([data-object-tck data-object] (.methodWithOnlyJsonObjectConstructorDataObject data-object-tck data-object)))
(defn set-data-object-with-buffer
  ([data-object-tck data-object] (.setDataObjectWithBuffer data-object-tck data-object)))
(defn set-data-object-with-list-adders
  ([data-object-tck data-object] (.setDataObjectWithListAdders data-object-tck data-object)))
(defn set-data-object-with-lists
  ([data-object-tck data-object] (.setDataObjectWithLists data-object-tck data-object)))
(defn set-data-object-with-map-adders
  ([data-object-tck data-object] (.setDataObjectWithMapAdders data-object-tck data-object)))
(defn set-data-object-with-maps
  ([data-object-tck data-object] (.setDataObjectWithMaps data-object-tck data-object)))
(defn set-data-object-with-recursion
  ([data-object-tck data-object] (.setDataObjectWithRecursion data-object-tck data-object)))
(defn set-data-object-with-values
  ([data-object-tck data-object] (.setDataObjectWithValues data-object-tck data-object)))