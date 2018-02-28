(ns io.vertx.clojure.codegen.testmodel.data-object-with-map-adders)

(import io.vertx.codegen.testmodel.DataObjectWithMapAdders)
(import io.vertx.core.json.JsonObject)

(defn new-instance
  ([] (new DataObjectWithMapAdders))
  ([^JsonObject json] (new DataObjectWithMapAdders json)))

(defn add-boolean-value [^DataObjectWithMapAdders data-object-with-map-adders key boolean-values] (.addBooleanValue data-object-with-map-adders key boolean-values))
(defn add-data-object-value [^DataObjectWithMapAdders data-object-with-map-adders key data-object-values] (.addDataObjectValue data-object-with-map-adders key data-object-values))
(defn add-double-value [^DataObjectWithMapAdders data-object-with-map-adders key double-values] (.addDoubleValue data-object-with-map-adders key double-values))
(defn add-enum-value [^DataObjectWithMapAdders data-object-with-map-adders key enum-values] (.addEnumValue data-object-with-map-adders key enum-values))
(defn add-float-value [^DataObjectWithMapAdders data-object-with-map-adders key float-values] (.addFloatValue data-object-with-map-adders key float-values))
(defn add-gen-enum-value [^DataObjectWithMapAdders data-object-with-map-adders key gen-enum-values] (.addGenEnumValue data-object-with-map-adders key gen-enum-values))
(defn add-integer-value [^DataObjectWithMapAdders data-object-with-map-adders key integer-values] (.addIntegerValue data-object-with-map-adders key integer-values))
(defn add-json-array-value [^DataObjectWithMapAdders data-object-with-map-adders key json-array-values] (.addJsonArrayValue data-object-with-map-adders key json-array-values))
(defn add-json-object-value [^DataObjectWithMapAdders data-object-with-map-adders key json-object-values] (.addJsonObjectValue data-object-with-map-adders key json-object-values))
(defn add-long-value [^DataObjectWithMapAdders data-object-with-map-adders key long-values] (.addLongValue data-object-with-map-adders key long-values))
(defn add-short-value [^DataObjectWithMapAdders data-object-with-map-adders key short-values] (.addShortValue data-object-with-map-adders key short-values))
(defn add-string-value [^DataObjectWithMapAdders data-object-with-map-adders key string-values] (.addStringValue data-object-with-map-adders key string-values))
(defn to-json [^DataObjectWithMapAdders data-object-with-map-adders] (.toJson data-object-with-map-adders))