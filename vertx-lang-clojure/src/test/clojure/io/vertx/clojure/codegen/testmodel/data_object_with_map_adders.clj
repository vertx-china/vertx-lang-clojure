(ns io.vertx.clojure.codegen.testmodel.data-object-with-map-adders)

(import io.vertx.codegen.testmodel.DataObjectWithMapAdders)
(import io.vertx.core.json.JsonObject)

(defn new-instance
   
  ([^JsonObject json] (new DataObjectWithMapAdders json)))

(defn add-boolean-value [^DataObjectWithMapAdders data-object-with-map-adders boolean-values] (.addBooleanValue data-object-with-map-adders boolean-values))
(defn add-data-object-value [^DataObjectWithMapAdders data-object-with-map-adders data-object-values] (.addDataObjectValue data-object-with-map-adders data-object-values))
(defn add-double-value [^DataObjectWithMapAdders data-object-with-map-adders double-values] (.addDoubleValue data-object-with-map-adders double-values))
(defn add-enum-value [^DataObjectWithMapAdders data-object-with-map-adders enum-values] (.addEnumValue data-object-with-map-adders enum-values))
(defn add-float-value [^DataObjectWithMapAdders data-object-with-map-adders float-values] (.addFloatValue data-object-with-map-adders float-values))
(defn add-gen-enum-value [^DataObjectWithMapAdders data-object-with-map-adders gen-enum-values] (.addGenEnumValue data-object-with-map-adders gen-enum-values))
(defn add-integer-value [^DataObjectWithMapAdders data-object-with-map-adders integer-values] (.addIntegerValue data-object-with-map-adders integer-values))
(defn add-json-array-value [^DataObjectWithMapAdders data-object-with-map-adders json-array-values] (.addJsonArrayValue data-object-with-map-adders json-array-values))
(defn add-json-object-value [^DataObjectWithMapAdders data-object-with-map-adders json-object-values] (.addJsonObjectValue data-object-with-map-adders json-object-values))
(defn add-long-value [^DataObjectWithMapAdders data-object-with-map-adders long-values] (.addLongValue data-object-with-map-adders long-values))
(defn add-short-value [^DataObjectWithMapAdders data-object-with-map-adders short-values] (.addShortValue data-object-with-map-adders short-values))
(defn add-string-value [^DataObjectWithMapAdders data-object-with-map-adders string-values] (.addStringValue data-object-with-map-adders string-values))