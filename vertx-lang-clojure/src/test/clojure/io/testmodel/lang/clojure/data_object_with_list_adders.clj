(ns io.testmodel.lang.clojure.data-object-with-list-adders)

(import io.vertx.codegen.testmodel.DataObjectWithListAdders)

(defn from-json [^DataObjectWithListAdders json] (new DataObjectWithListAdders json))

(defn add-boolean-value [^DataObjectWithListAdders data-object-with-list-adders boolean-values] (.addBooleanValue data-object-with-list-adders boolean-values))
(defn add-data-object-value [^DataObjectWithListAdders data-object-with-list-adders data-object-values] (.addDataObjectValue data-object-with-list-adders data-object-values))
(defn add-double-value [^DataObjectWithListAdders data-object-with-list-adders double-values] (.addDoubleValue data-object-with-list-adders double-values))
(defn add-enum-value [^DataObjectWithListAdders data-object-with-list-adders enum-values] (.addEnumValue data-object-with-list-adders enum-values))
(defn add-float-value [^DataObjectWithListAdders data-object-with-list-adders float-values] (.addFloatValue data-object-with-list-adders float-values))
(defn add-gen-enum-value [^DataObjectWithListAdders data-object-with-list-adders gen-enum-values] (.addGenEnumValue data-object-with-list-adders gen-enum-values))
(defn add-integer-value [^DataObjectWithListAdders data-object-with-list-adders integer-values] (.addIntegerValue data-object-with-list-adders integer-values))
(defn add-json-array-value [^DataObjectWithListAdders data-object-with-list-adders json-array-values] (.addJsonArrayValue data-object-with-list-adders json-array-values))
(defn add-json-object-value [^DataObjectWithListAdders data-object-with-list-adders json-object-values] (.addJsonObjectValue data-object-with-list-adders json-object-values))
(defn add-long-value [^DataObjectWithListAdders data-object-with-list-adders long-values] (.addLongValue data-object-with-list-adders long-values))
(defn add-short-value [^DataObjectWithListAdders data-object-with-list-adders short-values] (.addShortValue data-object-with-list-adders short-values))
(defn add-string-value [^DataObjectWithListAdders data-object-with-list-adders string-values] (.addStringValue data-object-with-list-adders string-values))