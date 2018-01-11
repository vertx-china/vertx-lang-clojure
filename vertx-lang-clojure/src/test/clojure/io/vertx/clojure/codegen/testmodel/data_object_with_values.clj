(ns io.vertx.clojure.codegen.testmodel.data-object-with-values)

(import io.vertx.codegen.testmodel.DataObjectWithValues)
(import io.vertx.core.json.JsonObject)

(defn new-instance
   
  ([^JsonObject json] (new DataObjectWithValues json)))

(defn set-boolean-value [^DataObjectWithValues data-object-with-values boolean-value] (.setBooleanValue data-object-with-values boolean-value))
(defn set-boxed-boolean-value [^DataObjectWithValues data-object-with-values boxed-boolean-value] (.setBoxedBooleanValue data-object-with-values boxed-boolean-value))
(defn set-boxed-double-value [^DataObjectWithValues data-object-with-values boxed-double-value] (.setBoxedDoubleValue data-object-with-values boxed-double-value))
(defn set-boxed-float-value [^DataObjectWithValues data-object-with-values boxed-float-value] (.setBoxedFloatValue data-object-with-values boxed-float-value))
(defn set-boxed-int-value [^DataObjectWithValues data-object-with-values boxed-int-value] (.setBoxedIntValue data-object-with-values boxed-int-value))
(defn set-boxed-long-value [^DataObjectWithValues data-object-with-values boxed-long-value] (.setBoxedLongValue data-object-with-values boxed-long-value))
(defn set-boxed-short-value [^DataObjectWithValues data-object-with-values boxed-short-value] (.setBoxedShortValue data-object-with-values boxed-short-value))
(defn set-data-object-value [^DataObjectWithValues data-object-with-values data-object-value] (.setDataObjectValue data-object-with-values data-object-value))
(defn set-double-value [^DataObjectWithValues data-object-with-values double-value] (.setDoubleValue data-object-with-values double-value))
(defn set-enum-value [^DataObjectWithValues data-object-with-values enum-value] (.setEnumValue data-object-with-values enum-value))
(defn set-float-value [^DataObjectWithValues data-object-with-values float-value] (.setFloatValue data-object-with-values float-value))
(defn set-gen-enum-value [^DataObjectWithValues data-object-with-values gen-enum-value] (.setGenEnumValue data-object-with-values gen-enum-value))
(defn set-int-value [^DataObjectWithValues data-object-with-values int-value] (.setIntValue data-object-with-values int-value))
(defn set-json-array-value [^DataObjectWithValues data-object-with-values json-array-value] (.setJsonArrayValue data-object-with-values json-array-value))
(defn set-json-object-value [^DataObjectWithValues data-object-with-values json-object-value] (.setJsonObjectValue data-object-with-values json-object-value))
(defn set-long-value [^DataObjectWithValues data-object-with-values long-value] (.setLongValue data-object-with-values long-value))
(defn set-short-value [^DataObjectWithValues data-object-with-values short-value] (.setShortValue data-object-with-values short-value))
(defn set-string-value [^DataObjectWithValues data-object-with-values string-value] (.setStringValue data-object-with-values string-value))