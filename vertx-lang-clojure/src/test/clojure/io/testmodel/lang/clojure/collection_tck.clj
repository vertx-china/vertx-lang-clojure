(ns io.testmodel.lang.clojure.collection-tck)

(import io.vertx.codegen.testmodel.CollectionTCK)
(import java.util.List)
(import java.util.Map)
(import java.util.Set)
(import io.vertx.core.Handler)

(defn method-with-handler-async-result-list-abstract-vertx-gen
  ([collection-tck list-handler] (.methodWithHandlerAsyncResultListAbstractVertxGen collection-tck list-handler)))
(defn method-with-handler-async-result-list-complex-json-array
  ([collection-tck list-handler] (.methodWithHandlerAsyncResultListComplexJsonArray collection-tck list-handler)))
(defn method-with-handler-async-result-list-complex-json-object
  ([collection-tck list-handler] (.methodWithHandlerAsyncResultListComplexJsonObject collection-tck list-handler)))
(defn method-with-handler-async-result-list-data-object
  ([collection-tck list-handler] (.methodWithHandlerAsyncResultListDataObject collection-tck list-handler)))
(defn method-with-handler-async-result-list-enum
  ([collection-tck list-handler] (.methodWithHandlerAsyncResultListEnum collection-tck list-handler)))
(defn method-with-handler-async-result-list-integer
  ([collection-tck handler] (.methodWithHandlerAsyncResultListInteger collection-tck handler)))
(defn method-with-handler-async-result-list-json-array
  ([collection-tck list-handler] (.methodWithHandlerAsyncResultListJsonArray collection-tck list-handler)))
(defn method-with-handler-async-result-list-json-object
  ([collection-tck list-handler] (.methodWithHandlerAsyncResultListJsonObject collection-tck list-handler)))
(defn method-with-handler-async-result-list-string
  ([collection-tck handler] (.methodWithHandlerAsyncResultListString collection-tck handler)))
(defn method-with-handler-async-result-list-vertx-gen
  ([collection-tck list-handler] (.methodWithHandlerAsyncResultListVertxGen collection-tck list-handler)))
(defn method-with-handler-async-result-set-abstract-vertx-gen
  ([collection-tck list-handler] (.methodWithHandlerAsyncResultSetAbstractVertxGen collection-tck list-handler)))
(defn method-with-handler-async-result-set-complex-json-array
  ([collection-tck list-handler] (.methodWithHandlerAsyncResultSetComplexJsonArray collection-tck list-handler)))
(defn method-with-handler-async-result-set-complex-json-object
  ([collection-tck list-handler] (.methodWithHandlerAsyncResultSetComplexJsonObject collection-tck list-handler)))
(defn method-with-handler-async-result-set-data-object
  ([collection-tck set-handler] (.methodWithHandlerAsyncResultSetDataObject collection-tck set-handler)))
(defn method-with-handler-async-result-set-enum
  ([collection-tck set-handler] (.methodWithHandlerAsyncResultSetEnum collection-tck set-handler)))
(defn method-with-handler-async-result-set-integer
  ([collection-tck handler] (.methodWithHandlerAsyncResultSetInteger collection-tck handler)))
(defn method-with-handler-async-result-set-json-array
  ([collection-tck list-handler] (.methodWithHandlerAsyncResultSetJsonArray collection-tck list-handler)))
(defn method-with-handler-async-result-set-json-object
  ([collection-tck list-handler] (.methodWithHandlerAsyncResultSetJsonObject collection-tck list-handler)))
(defn method-with-handler-async-result-set-string
  ([collection-tck handler] (.methodWithHandlerAsyncResultSetString collection-tck handler)))
(defn method-with-handler-async-result-set-vertx-gen
  ([collection-tck list-handler] (.methodWithHandlerAsyncResultSetVertxGen collection-tck list-handler)))
(defn method-with-handler-list-abstract-vertx-gen
  ([collection-tck list-handler] (.methodWithHandlerListAbstractVertxGen collection-tck list-handler)))
(defn method-with-handler-list-and-set
  ([collection-tck list-string-handler list-int-handler set-string-handler set-int-handler] (.methodWithHandlerListAndSet collection-tck list-string-handler list-int-handler set-string-handler set-int-handler)))
(defn method-with-handler-list-complex-json-array
  ([collection-tck list-handler] (.methodWithHandlerListComplexJsonArray collection-tck list-handler)))
(defn method-with-handler-list-complex-json-object
  ([collection-tck list-handler] (.methodWithHandlerListComplexJsonObject collection-tck list-handler)))
(defn method-with-handler-list-data-object
  ([collection-tck list-handler] (.methodWithHandlerListDataObject collection-tck list-handler)))
(defn method-with-handler-list-enum
  ([collection-tck list-handler] (.methodWithHandlerListEnum collection-tck list-handler)))
(defn method-with-handler-list-json-array
  ([collection-tck list-handler] (.methodWithHandlerListJsonArray collection-tck list-handler)))
(defn method-with-handler-list-json-object
  ([collection-tck list-handler] (.methodWithHandlerListJsonObject collection-tck list-handler)))
(defn method-with-handler-list-vertx-gen
  ([collection-tck list-handler] (.methodWithHandlerListVertxGen collection-tck list-handler)))
(defn method-with-handler-set-abstract-vertx-gen
  ([collection-tck list-handler] (.methodWithHandlerSetAbstractVertxGen collection-tck list-handler)))
(defn method-with-handler-set-complex-json-array
  ([collection-tck set-handler] (.methodWithHandlerSetComplexJsonArray collection-tck set-handler)))
(defn method-with-handler-set-complex-json-object
  ([collection-tck list-handler] (.methodWithHandlerSetComplexJsonObject collection-tck list-handler)))
(defn method-with-handler-set-data-object
  ([collection-tck set-handler] (.methodWithHandlerSetDataObject collection-tck set-handler)))
(defn method-with-handler-set-enum
  ([collection-tck set-handler] (.methodWithHandlerSetEnum collection-tck set-handler)))
(defn method-with-handler-set-json-array
  ([collection-tck list-handler] (.methodWithHandlerSetJsonArray collection-tck list-handler)))
(defn method-with-handler-set-json-object
  ([collection-tck list-handler] (.methodWithHandlerSetJsonObject collection-tck list-handler)))
(defn method-with-handler-set-vertx-gen
  ([collection-tck list-handler] (.methodWithHandlerSetVertxGen collection-tck list-handler)))
(defn method-with-list-complex-json-array-return
  ([collection-tck ] (.methodWithListComplexJsonArrayReturn collection-tck )))
(defn method-with-list-complex-json-object-return
  ([collection-tck ] (.methodWithListComplexJsonObjectReturn collection-tck )))
(defn method-with-list-data-object-return
  ([collection-tck ] (.methodWithListDataObjectReturn collection-tck )))
(defn method-with-list-enum-return
  ([collection-tck ] (.methodWithListEnumReturn collection-tck )))
(defn method-with-list-json-array-return
  ([collection-tck ] (.methodWithListJsonArrayReturn collection-tck )))
(defn method-with-list-json-object-return
  ([collection-tck ] (.methodWithListJsonObjectReturn collection-tck )))
(defn method-with-list-long-return
  ([collection-tck ] (.methodWithListLongReturn collection-tck )))
(defn method-with-list-params
  ([collection-tck list-string list-byte list-short list-int list-long list-json-object list-json-array list-vertx-gen list-data-object list-enum] (.methodWithListParams collection-tck list-string list-byte list-short list-int list-long list-json-object list-json-array list-vertx-gen list-data-object list-enum)))
(defn method-with-list-string-return
  ([collection-tck ] (.methodWithListStringReturn collection-tck )))
(defn method-with-list-vertx-gen-return
  ([collection-tck ] (.methodWithListVertxGenReturn collection-tck )))
(defn method-with-map-boolean-return
  ([collection-tck handler] (.methodWithMapBooleanReturn collection-tck handler)))
(defn method-with-map-byte-return
  ([collection-tck handler] (.methodWithMapByteReturn collection-tck handler)))
(defn method-with-map-character-return
  ([collection-tck handler] (.methodWithMapCharacterReturn collection-tck handler)))
(defn method-with-map-complex-json-array-return
  ([collection-tck handler] (.methodWithMapComplexJsonArrayReturn collection-tck handler)))
(defn method-with-map-complex-json-object-return
  ([collection-tck handler] (.methodWithMapComplexJsonObjectReturn collection-tck handler)))
(defn method-with-map-double-return
  ([collection-tck handler] (.methodWithMapDoubleReturn collection-tck handler)))
(defn method-with-map-float-return
  ([collection-tck handler] (.methodWithMapFloatReturn collection-tck handler)))
(defn method-with-map-integer-return
  ([collection-tck handler] (.methodWithMapIntegerReturn collection-tck handler)))
(defn method-with-map-json-array-return
  ([collection-tck handler] (.methodWithMapJsonArrayReturn collection-tck handler)))
(defn method-with-map-json-object-return
  ([collection-tck handler] (.methodWithMapJsonObjectReturn collection-tck handler)))
(defn method-with-map-long-return
  ([collection-tck handler] (.methodWithMapLongReturn collection-tck handler)))
(defn method-with-map-params
  ([collection-tck map-string map-byte map-short map-int map-long map-json-object map-json-array map-vertx-gen] (.methodWithMapParams collection-tck map-string map-byte map-short map-int map-long map-json-object map-json-array map-vertx-gen)))
(defn method-with-map-return
  ([collection-tck handler] (.methodWithMapReturn collection-tck handler)))
(defn method-with-map-short-return
  ([collection-tck handler] (.methodWithMapShortReturn collection-tck handler)))
(defn method-with-map-string-return
  ([collection-tck handler] (.methodWithMapStringReturn collection-tck handler)))
(defn method-with-set-complex-json-array-return
  ([collection-tck ] (.methodWithSetComplexJsonArrayReturn collection-tck )))
(defn method-with-set-complex-json-object-return
  ([collection-tck ] (.methodWithSetComplexJsonObjectReturn collection-tck )))
(defn method-with-set-data-object-return
  ([collection-tck ] (.methodWithSetDataObjectReturn collection-tck )))
(defn method-with-set-enum-return
  ([collection-tck ] (.methodWithSetEnumReturn collection-tck )))
(defn method-with-set-json-array-return
  ([collection-tck ] (.methodWithSetJsonArrayReturn collection-tck )))
(defn method-with-set-json-object-return
  ([collection-tck ] (.methodWithSetJsonObjectReturn collection-tck )))
(defn method-with-set-long-return
  ([collection-tck ] (.methodWithSetLongReturn collection-tck )))
(defn method-with-set-params
  ([collection-tck set-string set-byte set-short set-int set-long set-json-object set-json-array set-vertx-gen set-data-object set-enum] (.methodWithSetParams collection-tck set-string set-byte set-short set-int set-long set-json-object set-json-array set-vertx-gen set-data-object set-enum)))
(defn method-with-set-string-return
  ([collection-tck ] (.methodWithSetStringReturn collection-tck )))
(defn method-with-set-vertx-gen-return
  ([collection-tck ] (.methodWithSetVertxGenReturn collection-tck )))