(ns io.vertx.clojure.codegen.testmodel.data-object-with-maps)

(import io.vertx.codegen.testmodel.DataObjectWithMaps)
(import io.vertx.core.json.JsonObject)

(defn new-instance
   
  ([^JsonObject json] (new DataObjectWithMaps json)))

(defn set-boolean-values [^DataObjectWithMaps data-object-with-maps boolean-values] (.setBooleanValues data-object-with-maps boolean-values))
(defn set-data-object-values [^DataObjectWithMaps data-object-with-maps data-object-values] (.setDataObjectValues data-object-with-maps data-object-values))
(defn set-double-values [^DataObjectWithMaps data-object-with-maps double-values] (.setDoubleValues data-object-with-maps double-values))
(defn set-enum-values [^DataObjectWithMaps data-object-with-maps enum-values] (.setEnumValues data-object-with-maps enum-values))
(defn set-float-values [^DataObjectWithMaps data-object-with-maps float-values] (.setFloatValues data-object-with-maps float-values))
(defn set-gen-enum-values [^DataObjectWithMaps data-object-with-maps gen-enum-values] (.setGenEnumValues data-object-with-maps gen-enum-values))
(defn set-integer-values [^DataObjectWithMaps data-object-with-maps integer-values] (.setIntegerValues data-object-with-maps integer-values))
(defn set-json-array-values [^DataObjectWithMaps data-object-with-maps json-array-values] (.setJsonArrayValues data-object-with-maps json-array-values))
(defn set-json-object-values [^DataObjectWithMaps data-object-with-maps json-object-values] (.setJsonObjectValues data-object-with-maps json-object-values))
(defn set-long-values [^DataObjectWithMaps data-object-with-maps long-values] (.setLongValues data-object-with-maps long-values))
(defn set-short-values [^DataObjectWithMaps data-object-with-maps short-values] (.setShortValues data-object-with-maps short-values))
(defn set-string-values [^DataObjectWithMaps data-object-with-maps string-values] (.setStringValues data-object-with-maps string-values))