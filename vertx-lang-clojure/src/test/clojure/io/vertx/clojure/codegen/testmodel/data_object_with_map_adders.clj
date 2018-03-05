(ns io.vertx.clojure.codegen.testmodel.data-object-with-map-adders)

(import io.vertx.codegen.testmodel.DataObjectWithMapAdders)
(import io.vertx.core.json.JsonObject)

(defn new-instance
  ([] (new DataObjectWithMapAdders))
  ([^JsonObject json] (new DataObjectWithMapAdders json)))

(defn add-boolean-value [^DataObjectWithMapAdders data-object-with-map-adders key value] (.addBooleanValue data-object-with-map-adders key value))
(defn add-data-object-value [^DataObjectWithMapAdders data-object-with-map-adders key value] (.addDataObjectValue data-object-with-map-adders key value))
(defn add-double-value [^DataObjectWithMapAdders data-object-with-map-adders key value] (.addDoubleValue data-object-with-map-adders key value))
(defn add-enum-value [^DataObjectWithMapAdders data-object-with-map-adders key value] (.addEnumValue data-object-with-map-adders key value))
(defn add-float-value [^DataObjectWithMapAdders data-object-with-map-adders key value] (.addFloatValue data-object-with-map-adders key value))
(defn add-gen-enum-value [^DataObjectWithMapAdders data-object-with-map-adders key value] (.addGenEnumValue data-object-with-map-adders key value))
(defn add-integer-value [^DataObjectWithMapAdders data-object-with-map-adders key value] (.addIntegerValue data-object-with-map-adders key value))
(defn add-json-array-value [^DataObjectWithMapAdders data-object-with-map-adders key value] (.addJsonArrayValue data-object-with-map-adders key value))
(defn add-json-object-value [^DataObjectWithMapAdders data-object-with-map-adders key value] (.addJsonObjectValue data-object-with-map-adders key value))
(defn add-long-value [^DataObjectWithMapAdders data-object-with-map-adders key value] (.addLongValue data-object-with-map-adders key value))
(defn add-short-value [^DataObjectWithMapAdders data-object-with-map-adders key value] (.addShortValue data-object-with-map-adders key value))
(defn add-string-value [^DataObjectWithMapAdders data-object-with-map-adders key value] (.addStringValue data-object-with-map-adders key value))
(defn to-json [^DataObjectWithMapAdders data-object-with-map-adders] (.toJson data-object-with-map-adders))