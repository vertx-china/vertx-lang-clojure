(ns io.vertx.clojure.codegen.testmodel.nullable-tck)

(import io.vertx.codegen.testmodel.NullableTCK)
(import io.vertx.core.json.JsonArray)
(import java.util.List)
(import io.vertx.codegen.testmodel.TestEnum)
(import java.util.Map)
(import java.util.Set)
(import io.vertx.core.json.JsonObject)
(import io.vertx.codegen.testmodel.TestDataObject)
(import io.vertx.core.Handler)
(import io.vertx.codegen.testmodel.RefedInterface1)
(import io.vertx.codegen.testmodel.TestGenEnum)

(defn method-with-list-nullable-api-handler
  ([nullable-tck handler] (.methodWithListNullableApiHandler nullable-tck handler)))
(defn method-with-list-nullable-api-handler-async-result
  ([nullable-tck handler] (.methodWithListNullableApiHandlerAsyncResult nullable-tck handler)))
(defn method-with-list-nullable-api-param
  ([nullable-tck param] (.methodWithListNullableApiParam nullable-tck param)))
(defn method-with-list-nullable-api-return
  ([nullable-tck ] (.methodWithListNullableApiReturn nullable-tck )))
(defn method-with-list-nullable-boolean-handler
  ([nullable-tck handler] (.methodWithListNullableBooleanHandler nullable-tck handler)))
(defn method-with-list-nullable-boolean-handler-async-result
  ([nullable-tck handler] (.methodWithListNullableBooleanHandlerAsyncResult nullable-tck handler)))
(defn method-with-list-nullable-boolean-param
  ([nullable-tck param] (.methodWithListNullableBooleanParam nullable-tck param)))
(defn method-with-list-nullable-boolean-return
  ([nullable-tck ] (.methodWithListNullableBooleanReturn nullable-tck )))
(defn method-with-list-nullable-byte-handler
  ([nullable-tck handler] (.methodWithListNullableByteHandler nullable-tck handler)))
(defn method-with-list-nullable-byte-handler-async-result
  ([nullable-tck handler] (.methodWithListNullableByteHandlerAsyncResult nullable-tck handler)))
(defn method-with-list-nullable-byte-param
  ([nullable-tck param] (.methodWithListNullableByteParam nullable-tck param)))
(defn method-with-list-nullable-byte-return
  ([nullable-tck ] (.methodWithListNullableByteReturn nullable-tck )))
(defn method-with-list-nullable-char-handler
  ([nullable-tck handler] (.methodWithListNullableCharHandler nullable-tck handler)))
(defn method-with-list-nullable-char-handler-async-result
  ([nullable-tck handler] (.methodWithListNullableCharHandlerAsyncResult nullable-tck handler)))
(defn method-with-list-nullable-char-param
  ([nullable-tck param] (.methodWithListNullableCharParam nullable-tck param)))
(defn method-with-list-nullable-char-return
  ([nullable-tck ] (.methodWithListNullableCharReturn nullable-tck )))
(defn method-with-list-nullable-data-object-handler
  ([nullable-tck handler] (.methodWithListNullableDataObjectHandler nullable-tck handler)))
(defn method-with-list-nullable-data-object-handler-async-result
  ([nullable-tck handler] (.methodWithListNullableDataObjectHandlerAsyncResult nullable-tck handler)))
(defn method-with-list-nullable-data-object-param
  ([nullable-tck param] (.methodWithListNullableDataObjectParam nullable-tck param)))
(defn method-with-list-nullable-data-object-return
  ([nullable-tck ] (.methodWithListNullableDataObjectReturn nullable-tck )))
(defn method-with-list-nullable-double-handler
  ([nullable-tck handler] (.methodWithListNullableDoubleHandler nullable-tck handler)))
(defn method-with-list-nullable-double-handler-async-result
  ([nullable-tck handler] (.methodWithListNullableDoubleHandlerAsyncResult nullable-tck handler)))
(defn method-with-list-nullable-double-param
  ([nullable-tck param] (.methodWithListNullableDoubleParam nullable-tck param)))
(defn method-with-list-nullable-double-return
  ([nullable-tck ] (.methodWithListNullableDoubleReturn nullable-tck )))
(defn method-with-list-nullable-enum-handler
  ([nullable-tck handler] (.methodWithListNullableEnumHandler nullable-tck handler)))
(defn method-with-list-nullable-enum-handler-async-result
  ([nullable-tck handler] (.methodWithListNullableEnumHandlerAsyncResult nullable-tck handler)))
(defn method-with-list-nullable-enum-param
  ([nullable-tck param] (.methodWithListNullableEnumParam nullable-tck param)))
(defn method-with-list-nullable-enum-return
  ([nullable-tck ] (.methodWithListNullableEnumReturn nullable-tck )))
(defn method-with-list-nullable-float-handler
  ([nullable-tck handler] (.methodWithListNullableFloatHandler nullable-tck handler)))
(defn method-with-list-nullable-float-handler-async-result
  ([nullable-tck handler] (.methodWithListNullableFloatHandlerAsyncResult nullable-tck handler)))
(defn method-with-list-nullable-float-param
  ([nullable-tck param] (.methodWithListNullableFloatParam nullable-tck param)))
(defn method-with-list-nullable-float-return
  ([nullable-tck ] (.methodWithListNullableFloatReturn nullable-tck )))
(defn method-with-list-nullable-gen-enum-handler
  ([nullable-tck handler] (.methodWithListNullableGenEnumHandler nullable-tck handler)))
(defn method-with-list-nullable-gen-enum-handler-async-result
  ([nullable-tck handler] (.methodWithListNullableGenEnumHandlerAsyncResult nullable-tck handler)))
(defn method-with-list-nullable-gen-enum-param
  ([nullable-tck param] (.methodWithListNullableGenEnumParam nullable-tck param)))
(defn method-with-list-nullable-gen-enum-return
  ([nullable-tck ] (.methodWithListNullableGenEnumReturn nullable-tck )))
(defn method-with-list-nullable-integer-handler
  ([nullable-tck handler] (.methodWithListNullableIntegerHandler nullable-tck handler)))
(defn method-with-list-nullable-integer-handler-async-result
  ([nullable-tck handler] (.methodWithListNullableIntegerHandlerAsyncResult nullable-tck handler)))
(defn method-with-list-nullable-integer-param
  ([nullable-tck param] (.methodWithListNullableIntegerParam nullable-tck param)))
(defn method-with-list-nullable-integer-return
  ([nullable-tck ] (.methodWithListNullableIntegerReturn nullable-tck )))
(defn method-with-list-nullable-json-array-handler
  ([nullable-tck handler] (.methodWithListNullableJsonArrayHandler nullable-tck handler)))
(defn method-with-list-nullable-json-array-handler-async-result
  ([nullable-tck handler] (.methodWithListNullableJsonArrayHandlerAsyncResult nullable-tck handler)))
(defn method-with-list-nullable-json-array-param
  ([nullable-tck param] (.methodWithListNullableJsonArrayParam nullable-tck param)))
(defn method-with-list-nullable-json-array-return
  ([nullable-tck ] (.methodWithListNullableJsonArrayReturn nullable-tck )))
(defn method-with-list-nullable-json-object-handler
  ([nullable-tck handler] (.methodWithListNullableJsonObjectHandler nullable-tck handler)))
(defn method-with-list-nullable-json-object-handler-async-result
  ([nullable-tck handler] (.methodWithListNullableJsonObjectHandlerAsyncResult nullable-tck handler)))
(defn method-with-list-nullable-json-object-param
  ([nullable-tck param] (.methodWithListNullableJsonObjectParam nullable-tck param)))
(defn method-with-list-nullable-json-object-return
  ([nullable-tck ] (.methodWithListNullableJsonObjectReturn nullable-tck )))
(defn method-with-list-nullable-long-handler
  ([nullable-tck handler] (.methodWithListNullableLongHandler nullable-tck handler)))
(defn method-with-list-nullable-long-handler-async-result
  ([nullable-tck handler] (.methodWithListNullableLongHandlerAsyncResult nullable-tck handler)))
(defn method-with-list-nullable-long-param
  ([nullable-tck param] (.methodWithListNullableLongParam nullable-tck param)))
(defn method-with-list-nullable-long-return
  ([nullable-tck ] (.methodWithListNullableLongReturn nullable-tck )))
(defn method-with-list-nullable-short-handler
  ([nullable-tck handler] (.methodWithListNullableShortHandler nullable-tck handler)))
(defn method-with-list-nullable-short-handler-async-result
  ([nullable-tck handler] (.methodWithListNullableShortHandlerAsyncResult nullable-tck handler)))
(defn method-with-list-nullable-short-param
  ([nullable-tck param] (.methodWithListNullableShortParam nullable-tck param)))
(defn method-with-list-nullable-short-return
  ([nullable-tck ] (.methodWithListNullableShortReturn nullable-tck )))
(defn method-with-list-nullable-string-handler
  ([nullable-tck handler] (.methodWithListNullableStringHandler nullable-tck handler)))
(defn method-with-list-nullable-string-handler-async-result
  ([nullable-tck handler] (.methodWithListNullableStringHandlerAsyncResult nullable-tck handler)))
(defn method-with-list-nullable-string-param
  ([nullable-tck param] (.methodWithListNullableStringParam nullable-tck param)))
(defn method-with-list-nullable-string-return
  ([nullable-tck ] (.methodWithListNullableStringReturn nullable-tck )))
(defn method-with-map-nullable-api-param
  ([nullable-tck param] (.methodWithMapNullableApiParam nullable-tck param)))
(defn method-with-map-nullable-boolean-handler
  ([nullable-tck handler] (.methodWithMapNullableBooleanHandler nullable-tck handler)))
(defn method-with-map-nullable-boolean-handler-async-result
  ([nullable-tck handler] (.methodWithMapNullableBooleanHandlerAsyncResult nullable-tck handler)))
(defn method-with-map-nullable-boolean-param
  ([nullable-tck param] (.methodWithMapNullableBooleanParam nullable-tck param)))
(defn method-with-map-nullable-boolean-return
  ([nullable-tck ] (.methodWithMapNullableBooleanReturn nullable-tck )))
(defn method-with-map-nullable-byte-handler
  ([nullable-tck handler] (.methodWithMapNullableByteHandler nullable-tck handler)))
(defn method-with-map-nullable-byte-handler-async-result
  ([nullable-tck handler] (.methodWithMapNullableByteHandlerAsyncResult nullable-tck handler)))
(defn method-with-map-nullable-byte-param
  ([nullable-tck param] (.methodWithMapNullableByteParam nullable-tck param)))
(defn method-with-map-nullable-byte-return
  ([nullable-tck ] (.methodWithMapNullableByteReturn nullable-tck )))
(defn method-with-map-nullable-char-handler
  ([nullable-tck handler] (.methodWithMapNullableCharHandler nullable-tck handler)))
(defn method-with-map-nullable-char-handler-async-result
  ([nullable-tck handler] (.methodWithMapNullableCharHandlerAsyncResult nullable-tck handler)))
(defn method-with-map-nullable-char-param
  ([nullable-tck param] (.methodWithMapNullableCharParam nullable-tck param)))
(defn method-with-map-nullable-char-return
  ([nullable-tck ] (.methodWithMapNullableCharReturn nullable-tck )))
(defn method-with-map-nullable-double-handler
  ([nullable-tck handler] (.methodWithMapNullableDoubleHandler nullable-tck handler)))
(defn method-with-map-nullable-double-handler-async-result
  ([nullable-tck handler] (.methodWithMapNullableDoubleHandlerAsyncResult nullable-tck handler)))
(defn method-with-map-nullable-double-param
  ([nullable-tck param] (.methodWithMapNullableDoubleParam nullable-tck param)))
(defn method-with-map-nullable-double-return
  ([nullable-tck ] (.methodWithMapNullableDoubleReturn nullable-tck )))
(defn method-with-map-nullable-float-handler
  ([nullable-tck handler] (.methodWithMapNullableFloatHandler nullable-tck handler)))
(defn method-with-map-nullable-float-handler-async-result
  ([nullable-tck handler] (.methodWithMapNullableFloatHandlerAsyncResult nullable-tck handler)))
(defn method-with-map-nullable-float-param
  ([nullable-tck param] (.methodWithMapNullableFloatParam nullable-tck param)))
(defn method-with-map-nullable-float-return
  ([nullable-tck ] (.methodWithMapNullableFloatReturn nullable-tck )))
(defn method-with-map-nullable-integer-handler
  ([nullable-tck handler] (.methodWithMapNullableIntegerHandler nullable-tck handler)))
(defn method-with-map-nullable-integer-handler-async-result
  ([nullable-tck handler] (.methodWithMapNullableIntegerHandlerAsyncResult nullable-tck handler)))
(defn method-with-map-nullable-integer-param
  ([nullable-tck param] (.methodWithMapNullableIntegerParam nullable-tck param)))
(defn method-with-map-nullable-integer-return
  ([nullable-tck ] (.methodWithMapNullableIntegerReturn nullable-tck )))
(defn method-with-map-nullable-json-array-handler
  ([nullable-tck handler] (.methodWithMapNullableJsonArrayHandler nullable-tck handler)))
(defn method-with-map-nullable-json-array-handler-async-result
  ([nullable-tck handler] (.methodWithMapNullableJsonArrayHandlerAsyncResult nullable-tck handler)))
(defn method-with-map-nullable-json-array-param
  ([nullable-tck param] (.methodWithMapNullableJsonArrayParam nullable-tck param)))
(defn method-with-map-nullable-json-array-return
  ([nullable-tck ] (.methodWithMapNullableJsonArrayReturn nullable-tck )))
(defn method-with-map-nullable-json-object-handler
  ([nullable-tck handler] (.methodWithMapNullableJsonObjectHandler nullable-tck handler)))
(defn method-with-map-nullable-json-object-handler-async-result
  ([nullable-tck handler] (.methodWithMapNullableJsonObjectHandlerAsyncResult nullable-tck handler)))
(defn method-with-map-nullable-json-object-param
  ([nullable-tck param] (.methodWithMapNullableJsonObjectParam nullable-tck param)))
(defn method-with-map-nullable-json-object-return
  ([nullable-tck ] (.methodWithMapNullableJsonObjectReturn nullable-tck )))
(defn method-with-map-nullable-long-handler
  ([nullable-tck handler] (.methodWithMapNullableLongHandler nullable-tck handler)))
(defn method-with-map-nullable-long-handler-async-result
  ([nullable-tck handler] (.methodWithMapNullableLongHandlerAsyncResult nullable-tck handler)))
(defn method-with-map-nullable-long-param
  ([nullable-tck param] (.methodWithMapNullableLongParam nullable-tck param)))
(defn method-with-map-nullable-long-return
  ([nullable-tck ] (.methodWithMapNullableLongReturn nullable-tck )))
(defn method-with-map-nullable-short-handler
  ([nullable-tck handler] (.methodWithMapNullableShortHandler nullable-tck handler)))
(defn method-with-map-nullable-short-handler-async-result
  ([nullable-tck handler] (.methodWithMapNullableShortHandlerAsyncResult nullable-tck handler)))
(defn method-with-map-nullable-short-param
  ([nullable-tck param] (.methodWithMapNullableShortParam nullable-tck param)))
(defn method-with-map-nullable-short-return
  ([nullable-tck ] (.methodWithMapNullableShortReturn nullable-tck )))
(defn method-with-map-nullable-string-handler
  ([nullable-tck handler] (.methodWithMapNullableStringHandler nullable-tck handler)))
(defn method-with-map-nullable-string-handler-async-result
  ([nullable-tck handler] (.methodWithMapNullableStringHandlerAsyncResult nullable-tck handler)))
(defn method-with-map-nullable-string-param
  ([nullable-tck param] (.methodWithMapNullableStringParam nullable-tck param)))
(defn method-with-map-nullable-string-return
  ([nullable-tck ] (.methodWithMapNullableStringReturn nullable-tck )))
(defn method-with-non-nullable-api-param
  ([nullable-tck param] (.methodWithNonNullableApiParam nullable-tck param)))
(defn method-with-non-nullable-boolean-param
  ([nullable-tck param] (.methodWithNonNullableBooleanParam nullable-tck param)))
(defn method-with-non-nullable-byte-param
  ([nullable-tck param] (.methodWithNonNullableByteParam nullable-tck param)))
(defn method-with-non-nullable-char-param
  ([nullable-tck param] (.methodWithNonNullableCharParam nullable-tck param)))
(defn method-with-non-nullable-data-object-param
  ([nullable-tck param] (.methodWithNonNullableDataObjectParam nullable-tck param)))
(defn method-with-non-nullable-double-param
  ([nullable-tck param] (.methodWithNonNullableDoubleParam nullable-tck param)))
(defn method-with-non-nullable-enum-param
  ([nullable-tck param] (.methodWithNonNullableEnumParam nullable-tck param)))
(defn method-with-non-nullable-float-param
  ([nullable-tck param] (.methodWithNonNullableFloatParam nullable-tck param)))
(defn method-with-non-nullable-gen-enum-param
  ([nullable-tck param] (.methodWithNonNullableGenEnumParam nullable-tck param)))
(defn method-with-non-nullable-integer-param
  ([nullable-tck param] (.methodWithNonNullableIntegerParam nullable-tck param)))
(defn method-with-non-nullable-json-array-param
  ([nullable-tck param] (.methodWithNonNullableJsonArrayParam nullable-tck param)))
(defn method-with-non-nullable-json-object-param
  ([nullable-tck param] (.methodWithNonNullableJsonObjectParam nullable-tck param)))
(defn method-with-non-nullable-list-api-param
  ([nullable-tck param] (.methodWithNonNullableListApiParam nullable-tck param)))
(defn method-with-non-nullable-list-boolean-param
  ([nullable-tck param] (.methodWithNonNullableListBooleanParam nullable-tck param)))
(defn method-with-non-nullable-list-byte-param
  ([nullable-tck param] (.methodWithNonNullableListByteParam nullable-tck param)))
(defn method-with-non-nullable-list-char-param
  ([nullable-tck param] (.methodWithNonNullableListCharParam nullable-tck param)))
(defn method-with-non-nullable-list-data-object-param
  ([nullable-tck param] (.methodWithNonNullableListDataObjectParam nullable-tck param)))
(defn method-with-non-nullable-list-double-param
  ([nullable-tck param] (.methodWithNonNullableListDoubleParam nullable-tck param)))
(defn method-with-non-nullable-list-enum-param
  ([nullable-tck param] (.methodWithNonNullableListEnumParam nullable-tck param)))
(defn method-with-non-nullable-list-float-param
  ([nullable-tck param] (.methodWithNonNullableListFloatParam nullable-tck param)))
(defn method-with-non-nullable-list-gen-enum-param
  ([nullable-tck param] (.methodWithNonNullableListGenEnumParam nullable-tck param)))
(defn method-with-non-nullable-list-integer-param
  ([nullable-tck param] (.methodWithNonNullableListIntegerParam nullable-tck param)))
(defn method-with-non-nullable-list-json-array-param
  ([nullable-tck param] (.methodWithNonNullableListJsonArrayParam nullable-tck param)))
(defn method-with-non-nullable-list-json-object-param
  ([nullable-tck param] (.methodWithNonNullableListJsonObjectParam nullable-tck param)))
(defn method-with-non-nullable-list-long-param
  ([nullable-tck param] (.methodWithNonNullableListLongParam nullable-tck param)))
(defn method-with-non-nullable-list-short-param
  ([nullable-tck param] (.methodWithNonNullableListShortParam nullable-tck param)))
(defn method-with-non-nullable-list-string-param
  ([nullable-tck param] (.methodWithNonNullableListStringParam nullable-tck param)))
(defn method-with-non-nullable-long-param
  ([nullable-tck param] (.methodWithNonNullableLongParam nullable-tck param)))
(defn method-with-non-nullable-map-api-param
  ([nullable-tck param] (.methodWithNonNullableMapApiParam nullable-tck param)))
(defn method-with-non-nullable-map-boolean-param
  ([nullable-tck param] (.methodWithNonNullableMapBooleanParam nullable-tck param)))
(defn method-with-non-nullable-map-byte-param
  ([nullable-tck param] (.methodWithNonNullableMapByteParam nullable-tck param)))
(defn method-with-non-nullable-map-char-param
  ([nullable-tck param] (.methodWithNonNullableMapCharParam nullable-tck param)))
(defn method-with-non-nullable-map-double-param
  ([nullable-tck param] (.methodWithNonNullableMapDoubleParam nullable-tck param)))
(defn method-with-non-nullable-map-float-param
  ([nullable-tck param] (.methodWithNonNullableMapFloatParam nullable-tck param)))
(defn method-with-non-nullable-map-integer-param
  ([nullable-tck param] (.methodWithNonNullableMapIntegerParam nullable-tck param)))
(defn method-with-non-nullable-map-json-array-param
  ([nullable-tck param] (.methodWithNonNullableMapJsonArrayParam nullable-tck param)))
(defn method-with-non-nullable-map-json-object-param
  ([nullable-tck param] (.methodWithNonNullableMapJsonObjectParam nullable-tck param)))
(defn method-with-non-nullable-map-long-param
  ([nullable-tck param] (.methodWithNonNullableMapLongParam nullable-tck param)))
(defn method-with-non-nullable-map-short-param
  ([nullable-tck param] (.methodWithNonNullableMapShortParam nullable-tck param)))
(defn method-with-non-nullable-map-string-param
  ([nullable-tck param] (.methodWithNonNullableMapStringParam nullable-tck param)))
(defn method-with-non-nullable-set-api-param
  ([nullable-tck param] (.methodWithNonNullableSetApiParam nullable-tck param)))
(defn method-with-non-nullable-set-boolean-param
  ([nullable-tck param] (.methodWithNonNullableSetBooleanParam nullable-tck param)))
(defn method-with-non-nullable-set-byte-param
  ([nullable-tck param] (.methodWithNonNullableSetByteParam nullable-tck param)))
(defn method-with-non-nullable-set-char-param
  ([nullable-tck param] (.methodWithNonNullableSetCharParam nullable-tck param)))
(defn method-with-non-nullable-set-data-object-param
  ([nullable-tck param] (.methodWithNonNullableSetDataObjectParam nullable-tck param)))
(defn method-with-non-nullable-set-double-param
  ([nullable-tck param] (.methodWithNonNullableSetDoubleParam nullable-tck param)))
(defn method-with-non-nullable-set-enum-param
  ([nullable-tck param] (.methodWithNonNullableSetEnumParam nullable-tck param)))
(defn method-with-non-nullable-set-float-param
  ([nullable-tck param] (.methodWithNonNullableSetFloatParam nullable-tck param)))
(defn method-with-non-nullable-set-gen-enum-param
  ([nullable-tck param] (.methodWithNonNullableSetGenEnumParam nullable-tck param)))
(defn method-with-non-nullable-set-integer-param
  ([nullable-tck param] (.methodWithNonNullableSetIntegerParam nullable-tck param)))
(defn method-with-non-nullable-set-json-array-param
  ([nullable-tck param] (.methodWithNonNullableSetJsonArrayParam nullable-tck param)))
(defn method-with-non-nullable-set-json-object-param
  ([nullable-tck param] (.methodWithNonNullableSetJsonObjectParam nullable-tck param)))
(defn method-with-non-nullable-set-long-param
  ([nullable-tck param] (.methodWithNonNullableSetLongParam nullable-tck param)))
(defn method-with-non-nullable-set-short-param
  ([nullable-tck param] (.methodWithNonNullableSetShortParam nullable-tck param)))
(defn method-with-non-nullable-set-string-param
  ([nullable-tck param] (.methodWithNonNullableSetStringParam nullable-tck param)))
(defn method-with-non-nullable-short-param
  ([nullable-tck param] (.methodWithNonNullableShortParam nullable-tck param)))
(defn method-with-non-nullable-string-param
  ([nullable-tck param] (.methodWithNonNullableStringParam nullable-tck param)))
(defn method-with-nullable-api-handler
  ([nullable-tck not-null handler] (.methodWithNullableApiHandler nullable-tck not-null handler)))
(defn method-with-nullable-api-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableApiHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-api-param
  ([nullable-tck expect-null param] (.methodWithNullableApiParam nullable-tck expect-null param)))
(defn method-with-nullable-api-return
  ([nullable-tck not-null] (.methodWithNullableApiReturn nullable-tck not-null)))
(defn method-with-nullable-boolean-handler
  ([nullable-tck not-null handler] (.methodWithNullableBooleanHandler nullable-tck not-null handler)))
(defn method-with-nullable-boolean-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableBooleanHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-boolean-param
  ([nullable-tck expect-null param] (.methodWithNullableBooleanParam nullable-tck expect-null param)))
(defn method-with-nullable-boolean-return
  ([nullable-tck not-null] (.methodWithNullableBooleanReturn nullable-tck not-null)))
(defn method-with-nullable-byte-handler
  ([nullable-tck not-null handler] (.methodWithNullableByteHandler nullable-tck not-null handler)))
(defn method-with-nullable-byte-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableByteHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-byte-param
  ([nullable-tck expect-null param] (.methodWithNullableByteParam nullable-tck expect-null param)))
(defn method-with-nullable-byte-return
  ([nullable-tck not-null] (.methodWithNullableByteReturn nullable-tck not-null)))
(defn method-with-nullable-char-handler
  ([nullable-tck not-null handler] (.methodWithNullableCharHandler nullable-tck not-null handler)))
(defn method-with-nullable-char-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableCharHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-char-param
  ([nullable-tck expect-null param] (.methodWithNullableCharParam nullable-tck expect-null param)))
(defn method-with-nullable-char-return
  ([nullable-tck not-null] (.methodWithNullableCharReturn nullable-tck not-null)))
(defn method-with-nullable-data-object-handler
  ([nullable-tck not-null handler] (.methodWithNullableDataObjectHandler nullable-tck not-null handler)))
(defn method-with-nullable-data-object-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableDataObjectHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-data-object-param
  ([nullable-tck expect-null param] (.methodWithNullableDataObjectParam nullable-tck expect-null param)))
(defn method-with-nullable-data-object-return
  ([nullable-tck not-null] (.methodWithNullableDataObjectReturn nullable-tck not-null)))
(defn method-with-nullable-double-handler
  ([nullable-tck not-null handler] (.methodWithNullableDoubleHandler nullable-tck not-null handler)))
(defn method-with-nullable-double-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableDoubleHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-double-param
  ([nullable-tck expect-null param] (.methodWithNullableDoubleParam nullable-tck expect-null param)))
(defn method-with-nullable-double-return
  ([nullable-tck not-null] (.methodWithNullableDoubleReturn nullable-tck not-null)))
(defn method-with-nullable-enum-handler
  ([nullable-tck not-null handler] (.methodWithNullableEnumHandler nullable-tck not-null handler)))
(defn method-with-nullable-enum-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableEnumHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-enum-param
  ([nullable-tck expect-null param] (.methodWithNullableEnumParam nullable-tck expect-null param)))
(defn method-with-nullable-enum-return
  ([nullable-tck not-null] (.methodWithNullableEnumReturn nullable-tck not-null)))
(defn method-with-nullable-float-handler
  ([nullable-tck not-null handler] (.methodWithNullableFloatHandler nullable-tck not-null handler)))
(defn method-with-nullable-float-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableFloatHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-float-param
  ([nullable-tck expect-null param] (.methodWithNullableFloatParam nullable-tck expect-null param)))
(defn method-with-nullable-float-return
  ([nullable-tck not-null] (.methodWithNullableFloatReturn nullable-tck not-null)))
(defn method-with-nullable-gen-enum-handler
  ([nullable-tck not-null handler] (.methodWithNullableGenEnumHandler nullable-tck not-null handler)))
(defn method-with-nullable-gen-enum-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableGenEnumHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-gen-enum-param
  ([nullable-tck expect-null param] (.methodWithNullableGenEnumParam nullable-tck expect-null param)))
(defn method-with-nullable-gen-enum-return
  ([nullable-tck not-null] (.methodWithNullableGenEnumReturn nullable-tck not-null)))
(defn method-with-nullable-handler
  ([nullable-tck expect-null handler] (.methodWithNullableHandler nullable-tck expect-null handler)))
(defn method-with-nullable-handler-async-result
  ([nullable-tck expect-null handler] (.methodWithNullableHandlerAsyncResult nullable-tck expect-null handler)))
(defn method-with-nullable-integer-handler
  ([nullable-tck not-null handler] (.methodWithNullableIntegerHandler nullable-tck not-null handler)))
(defn method-with-nullable-integer-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableIntegerHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-integer-param
  ([nullable-tck expect-null param] (.methodWithNullableIntegerParam nullable-tck expect-null param)))
(defn method-with-nullable-integer-return
  ([nullable-tck not-null] (.methodWithNullableIntegerReturn nullable-tck not-null)))
(defn method-with-nullable-json-array-handler
  ([nullable-tck not-null handler] (.methodWithNullableJsonArrayHandler nullable-tck not-null handler)))
(defn method-with-nullable-json-array-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableJsonArrayHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-json-array-param
  ([nullable-tck expect-null param] (.methodWithNullableJsonArrayParam nullable-tck expect-null param)))
(defn method-with-nullable-json-array-return
  ([nullable-tck not-null] (.methodWithNullableJsonArrayReturn nullable-tck not-null)))
(defn method-with-nullable-json-object-handler
  ([nullable-tck not-null handler] (.methodWithNullableJsonObjectHandler nullable-tck not-null handler)))
(defn method-with-nullable-json-object-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableJsonObjectHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-json-object-param
  ([nullable-tck expect-null param] (.methodWithNullableJsonObjectParam nullable-tck expect-null param)))
(defn method-with-nullable-json-object-return
  ([nullable-tck not-null] (.methodWithNullableJsonObjectReturn nullable-tck not-null)))
(defn method-with-nullable-list-api-handler
  ([nullable-tck not-null handler] (.methodWithNullableListApiHandler nullable-tck not-null handler)))
(defn method-with-nullable-list-api-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableListApiHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-list-api-param
  ([nullable-tck expect-null param] (.methodWithNullableListApiParam nullable-tck expect-null param)))
(defn method-with-nullable-list-api-return
  ([nullable-tck not-null] (.methodWithNullableListApiReturn nullable-tck not-null)))
(defn method-with-nullable-list-boolean-handler
  ([nullable-tck not-null handler] (.methodWithNullableListBooleanHandler nullable-tck not-null handler)))
(defn method-with-nullable-list-boolean-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableListBooleanHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-list-boolean-param
  ([nullable-tck expect-null param] (.methodWithNullableListBooleanParam nullable-tck expect-null param)))
(defn method-with-nullable-list-boolean-return
  ([nullable-tck not-null] (.methodWithNullableListBooleanReturn nullable-tck not-null)))
(defn method-with-nullable-list-byte-handler
  ([nullable-tck not-null handler] (.methodWithNullableListByteHandler nullable-tck not-null handler)))
(defn method-with-nullable-list-byte-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableListByteHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-list-byte-param
  ([nullable-tck expect-null param] (.methodWithNullableListByteParam nullable-tck expect-null param)))
(defn method-with-nullable-list-byte-return
  ([nullable-tck not-null] (.methodWithNullableListByteReturn nullable-tck not-null)))
(defn method-with-nullable-list-char-handler
  ([nullable-tck not-null handler] (.methodWithNullableListCharHandler nullable-tck not-null handler)))
(defn method-with-nullable-list-char-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableListCharHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-list-char-param
  ([nullable-tck expect-null param] (.methodWithNullableListCharParam nullable-tck expect-null param)))
(defn method-with-nullable-list-char-return
  ([nullable-tck not-null] (.methodWithNullableListCharReturn nullable-tck not-null)))
(defn method-with-nullable-list-data-object-handler
  ([nullable-tck not-null handler] (.methodWithNullableListDataObjectHandler nullable-tck not-null handler)))
(defn method-with-nullable-list-data-object-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableListDataObjectHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-list-data-object-param
  ([nullable-tck expect-null param] (.methodWithNullableListDataObjectParam nullable-tck expect-null param)))
(defn method-with-nullable-list-data-object-return
  ([nullable-tck not-null] (.methodWithNullableListDataObjectReturn nullable-tck not-null)))
(defn method-with-nullable-list-double-handler
  ([nullable-tck not-null handler] (.methodWithNullableListDoubleHandler nullable-tck not-null handler)))
(defn method-with-nullable-list-double-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableListDoubleHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-list-double-param
  ([nullable-tck expect-null param] (.methodWithNullableListDoubleParam nullable-tck expect-null param)))
(defn method-with-nullable-list-double-return
  ([nullable-tck not-null] (.methodWithNullableListDoubleReturn nullable-tck not-null)))
(defn method-with-nullable-list-enum-handler
  ([nullable-tck not-null handler] (.methodWithNullableListEnumHandler nullable-tck not-null handler)))
(defn method-with-nullable-list-enum-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableListEnumHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-list-enum-param
  ([nullable-tck expect-null param] (.methodWithNullableListEnumParam nullable-tck expect-null param)))
(defn method-with-nullable-list-enum-return
  ([nullable-tck not-null] (.methodWithNullableListEnumReturn nullable-tck not-null)))
(defn method-with-nullable-list-float-handler
  ([nullable-tck not-null handler] (.methodWithNullableListFloatHandler nullable-tck not-null handler)))
(defn method-with-nullable-list-float-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableListFloatHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-list-float-param
  ([nullable-tck expect-null param] (.methodWithNullableListFloatParam nullable-tck expect-null param)))
(defn method-with-nullable-list-float-return
  ([nullable-tck not-null] (.methodWithNullableListFloatReturn nullable-tck not-null)))
(defn method-with-nullable-list-gen-enum-handler
  ([nullable-tck not-null handler] (.methodWithNullableListGenEnumHandler nullable-tck not-null handler)))
(defn method-with-nullable-list-gen-enum-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableListGenEnumHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-list-gen-enum-param
  ([nullable-tck expect-null param] (.methodWithNullableListGenEnumParam nullable-tck expect-null param)))
(defn method-with-nullable-list-gen-enum-return
  ([nullable-tck not-null] (.methodWithNullableListGenEnumReturn nullable-tck not-null)))
(defn method-with-nullable-list-integer-handler
  ([nullable-tck not-null handler] (.methodWithNullableListIntegerHandler nullable-tck not-null handler)))
(defn method-with-nullable-list-integer-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableListIntegerHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-list-integer-param
  ([nullable-tck expect-null param] (.methodWithNullableListIntegerParam nullable-tck expect-null param)))
(defn method-with-nullable-list-integer-return
  ([nullable-tck not-null] (.methodWithNullableListIntegerReturn nullable-tck not-null)))
(defn method-with-nullable-list-json-array-handler
  ([nullable-tck not-null handler] (.methodWithNullableListJsonArrayHandler nullable-tck not-null handler)))
(defn method-with-nullable-list-json-array-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableListJsonArrayHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-list-json-array-param
  ([nullable-tck expect-null param] (.methodWithNullableListJsonArrayParam nullable-tck expect-null param)))
(defn method-with-nullable-list-json-array-return
  ([nullable-tck not-null] (.methodWithNullableListJsonArrayReturn nullable-tck not-null)))
(defn method-with-nullable-list-json-object-handler
  ([nullable-tck not-null handler] (.methodWithNullableListJsonObjectHandler nullable-tck not-null handler)))
(defn method-with-nullable-list-json-object-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableListJsonObjectHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-list-json-object-param
  ([nullable-tck expect-null param] (.methodWithNullableListJsonObjectParam nullable-tck expect-null param)))
(defn method-with-nullable-list-json-object-return
  ([nullable-tck not-null] (.methodWithNullableListJsonObjectReturn nullable-tck not-null)))
(defn method-with-nullable-list-long-handler
  ([nullable-tck not-null handler] (.methodWithNullableListLongHandler nullable-tck not-null handler)))
(defn method-with-nullable-list-long-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableListLongHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-list-long-param
  ([nullable-tck expect-null param] (.methodWithNullableListLongParam nullable-tck expect-null param)))
(defn method-with-nullable-list-long-return
  ([nullable-tck not-null] (.methodWithNullableListLongReturn nullable-tck not-null)))
(defn method-with-nullable-list-short-handler
  ([nullable-tck not-null handler] (.methodWithNullableListShortHandler nullable-tck not-null handler)))
(defn method-with-nullable-list-short-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableListShortHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-list-short-param
  ([nullable-tck expect-null param] (.methodWithNullableListShortParam nullable-tck expect-null param)))
(defn method-with-nullable-list-short-return
  ([nullable-tck not-null] (.methodWithNullableListShortReturn nullable-tck not-null)))
(defn method-with-nullable-list-string-handler
  ([nullable-tck not-null handler] (.methodWithNullableListStringHandler nullable-tck not-null handler)))
(defn method-with-nullable-list-string-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableListStringHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-list-string-param
  ([nullable-tck expect-null param] (.methodWithNullableListStringParam nullable-tck expect-null param)))
(defn method-with-nullable-list-string-return
  ([nullable-tck not-null] (.methodWithNullableListStringReturn nullable-tck not-null)))
(defn method-with-nullable-long-handler
  ([nullable-tck not-null handler] (.methodWithNullableLongHandler nullable-tck not-null handler)))
(defn method-with-nullable-long-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableLongHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-long-param
  ([nullable-tck expect-null param] (.methodWithNullableLongParam nullable-tck expect-null param)))
(defn method-with-nullable-long-return
  ([nullable-tck not-null] (.methodWithNullableLongReturn nullable-tck not-null)))
(defn method-with-nullable-map-api-param
  ([nullable-tck expect-null param] (.methodWithNullableMapApiParam nullable-tck expect-null param)))
(defn method-with-nullable-map-boolean-handler
  ([nullable-tck not-null handler] (.methodWithNullableMapBooleanHandler nullable-tck not-null handler)))
(defn method-with-nullable-map-boolean-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableMapBooleanHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-map-boolean-param
  ([nullable-tck expect-null param] (.methodWithNullableMapBooleanParam nullable-tck expect-null param)))
(defn method-with-nullable-map-boolean-return
  ([nullable-tck not-null] (.methodWithNullableMapBooleanReturn nullable-tck not-null)))
(defn method-with-nullable-map-byte-handler
  ([nullable-tck not-null handler] (.methodWithNullableMapByteHandler nullable-tck not-null handler)))
(defn method-with-nullable-map-byte-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableMapByteHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-map-byte-param
  ([nullable-tck expect-null param] (.methodWithNullableMapByteParam nullable-tck expect-null param)))
(defn method-with-nullable-map-byte-return
  ([nullable-tck not-null] (.methodWithNullableMapByteReturn nullable-tck not-null)))
(defn method-with-nullable-map-char-handler
  ([nullable-tck not-null handler] (.methodWithNullableMapCharHandler nullable-tck not-null handler)))
(defn method-with-nullable-map-char-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableMapCharHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-map-char-param
  ([nullable-tck expect-null param] (.methodWithNullableMapCharParam nullable-tck expect-null param)))
(defn method-with-nullable-map-char-return
  ([nullable-tck not-null] (.methodWithNullableMapCharReturn nullable-tck not-null)))
(defn method-with-nullable-map-double-handler
  ([nullable-tck not-null handler] (.methodWithNullableMapDoubleHandler nullable-tck not-null handler)))
(defn method-with-nullable-map-double-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableMapDoubleHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-map-double-param
  ([nullable-tck expect-null param] (.methodWithNullableMapDoubleParam nullable-tck expect-null param)))
(defn method-with-nullable-map-double-return
  ([nullable-tck not-null] (.methodWithNullableMapDoubleReturn nullable-tck not-null)))
(defn method-with-nullable-map-float-handler
  ([nullable-tck not-null handler] (.methodWithNullableMapFloatHandler nullable-tck not-null handler)))
(defn method-with-nullable-map-float-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableMapFloatHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-map-float-param
  ([nullable-tck expect-null param] (.methodWithNullableMapFloatParam nullable-tck expect-null param)))
(defn method-with-nullable-map-float-return
  ([nullable-tck not-null] (.methodWithNullableMapFloatReturn nullable-tck not-null)))
(defn method-with-nullable-map-integer-handler
  ([nullable-tck not-null handler] (.methodWithNullableMapIntegerHandler nullable-tck not-null handler)))
(defn method-with-nullable-map-integer-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableMapIntegerHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-map-integer-param
  ([nullable-tck expect-null param] (.methodWithNullableMapIntegerParam nullable-tck expect-null param)))
(defn method-with-nullable-map-integer-return
  ([nullable-tck not-null] (.methodWithNullableMapIntegerReturn nullable-tck not-null)))
(defn method-with-nullable-map-json-array-handler
  ([nullable-tck not-null handler] (.methodWithNullableMapJsonArrayHandler nullable-tck not-null handler)))
(defn method-with-nullable-map-json-array-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableMapJsonArrayHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-map-json-array-param
  ([nullable-tck expect-null param] (.methodWithNullableMapJsonArrayParam nullable-tck expect-null param)))
(defn method-with-nullable-map-json-array-return
  ([nullable-tck not-null] (.methodWithNullableMapJsonArrayReturn nullable-tck not-null)))
(defn method-with-nullable-map-json-object-handler
  ([nullable-tck not-null handler] (.methodWithNullableMapJsonObjectHandler nullable-tck not-null handler)))
(defn method-with-nullable-map-json-object-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableMapJsonObjectHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-map-json-object-param
  ([nullable-tck expect-null param] (.methodWithNullableMapJsonObjectParam nullable-tck expect-null param)))
(defn method-with-nullable-map-json-object-return
  ([nullable-tck not-null] (.methodWithNullableMapJsonObjectReturn nullable-tck not-null)))
(defn method-with-nullable-map-long-handler
  ([nullable-tck not-null handler] (.methodWithNullableMapLongHandler nullable-tck not-null handler)))
(defn method-with-nullable-map-long-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableMapLongHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-map-long-param
  ([nullable-tck expect-null param] (.methodWithNullableMapLongParam nullable-tck expect-null param)))
(defn method-with-nullable-map-long-return
  ([nullable-tck not-null] (.methodWithNullableMapLongReturn nullable-tck not-null)))
(defn method-with-nullable-map-short-handler
  ([nullable-tck not-null handler] (.methodWithNullableMapShortHandler nullable-tck not-null handler)))
(defn method-with-nullable-map-short-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableMapShortHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-map-short-param
  ([nullable-tck expect-null param] (.methodWithNullableMapShortParam nullable-tck expect-null param)))
(defn method-with-nullable-map-short-return
  ([nullable-tck not-null] (.methodWithNullableMapShortReturn nullable-tck not-null)))
(defn method-with-nullable-map-string-handler
  ([nullable-tck not-null handler] (.methodWithNullableMapStringHandler nullable-tck not-null handler)))
(defn method-with-nullable-map-string-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableMapStringHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-map-string-param
  ([nullable-tck expect-null param] (.methodWithNullableMapStringParam nullable-tck expect-null param)))
(defn method-with-nullable-map-string-return
  ([nullable-tck not-null] (.methodWithNullableMapStringReturn nullable-tck not-null)))
(defn method-with-nullable-object-param
  ([nullable-tck expect-null param] (.methodWithNullableObjectParam nullable-tck expect-null param)))
(defn method-with-nullable-set-api-handler
  ([nullable-tck not-null handler] (.methodWithNullableSetApiHandler nullable-tck not-null handler)))
(defn method-with-nullable-set-api-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableSetApiHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-set-api-param
  ([nullable-tck expect-null param] (.methodWithNullableSetApiParam nullable-tck expect-null param)))
(defn method-with-nullable-set-api-return
  ([nullable-tck not-null] (.methodWithNullableSetApiReturn nullable-tck not-null)))
(defn method-with-nullable-set-boolean-handler
  ([nullable-tck not-null handler] (.methodWithNullableSetBooleanHandler nullable-tck not-null handler)))
(defn method-with-nullable-set-boolean-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableSetBooleanHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-set-boolean-param
  ([nullable-tck expect-null param] (.methodWithNullableSetBooleanParam nullable-tck expect-null param)))
(defn method-with-nullable-set-boolean-return
  ([nullable-tck not-null] (.methodWithNullableSetBooleanReturn nullable-tck not-null)))
(defn method-with-nullable-set-byte-handler
  ([nullable-tck not-null handler] (.methodWithNullableSetByteHandler nullable-tck not-null handler)))
(defn method-with-nullable-set-byte-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableSetByteHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-set-byte-param
  ([nullable-tck expect-null param] (.methodWithNullableSetByteParam nullable-tck expect-null param)))
(defn method-with-nullable-set-byte-return
  ([nullable-tck not-null] (.methodWithNullableSetByteReturn nullable-tck not-null)))
(defn method-with-nullable-set-char-handler
  ([nullable-tck not-null handler] (.methodWithNullableSetCharHandler nullable-tck not-null handler)))
(defn method-with-nullable-set-char-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableSetCharHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-set-char-param
  ([nullable-tck expect-null param] (.methodWithNullableSetCharParam nullable-tck expect-null param)))
(defn method-with-nullable-set-char-return
  ([nullable-tck not-null] (.methodWithNullableSetCharReturn nullable-tck not-null)))
(defn method-with-nullable-set-data-object-handler
  ([nullable-tck not-null handler] (.methodWithNullableSetDataObjectHandler nullable-tck not-null handler)))
(defn method-with-nullable-set-data-object-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableSetDataObjectHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-set-data-object-param
  ([nullable-tck expect-null param] (.methodWithNullableSetDataObjectParam nullable-tck expect-null param)))
(defn method-with-nullable-set-data-object-return
  ([nullable-tck not-null] (.methodWithNullableSetDataObjectReturn nullable-tck not-null)))
(defn method-with-nullable-set-double-handler
  ([nullable-tck not-null handler] (.methodWithNullableSetDoubleHandler nullable-tck not-null handler)))
(defn method-with-nullable-set-double-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableSetDoubleHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-set-double-param
  ([nullable-tck expect-null param] (.methodWithNullableSetDoubleParam nullable-tck expect-null param)))
(defn method-with-nullable-set-double-return
  ([nullable-tck not-null] (.methodWithNullableSetDoubleReturn nullable-tck not-null)))
(defn method-with-nullable-set-enum-handler
  ([nullable-tck not-null handler] (.methodWithNullableSetEnumHandler nullable-tck not-null handler)))
(defn method-with-nullable-set-enum-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableSetEnumHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-set-enum-param
  ([nullable-tck expect-null param] (.methodWithNullableSetEnumParam nullable-tck expect-null param)))
(defn method-with-nullable-set-enum-return
  ([nullable-tck not-null] (.methodWithNullableSetEnumReturn nullable-tck not-null)))
(defn method-with-nullable-set-float-handler
  ([nullable-tck not-null handler] (.methodWithNullableSetFloatHandler nullable-tck not-null handler)))
(defn method-with-nullable-set-float-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableSetFloatHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-set-float-param
  ([nullable-tck expect-null param] (.methodWithNullableSetFloatParam nullable-tck expect-null param)))
(defn method-with-nullable-set-float-return
  ([nullable-tck not-null] (.methodWithNullableSetFloatReturn nullable-tck not-null)))
(defn method-with-nullable-set-gen-enum-handler
  ([nullable-tck not-null handler] (.methodWithNullableSetGenEnumHandler nullable-tck not-null handler)))
(defn method-with-nullable-set-gen-enum-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableSetGenEnumHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-set-gen-enum-param
  ([nullable-tck expect-null param] (.methodWithNullableSetGenEnumParam nullable-tck expect-null param)))
(defn method-with-nullable-set-gen-enum-return
  ([nullable-tck not-null] (.methodWithNullableSetGenEnumReturn nullable-tck not-null)))
(defn method-with-nullable-set-integer-handler
  ([nullable-tck not-null handler] (.methodWithNullableSetIntegerHandler nullable-tck not-null handler)))
(defn method-with-nullable-set-integer-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableSetIntegerHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-set-integer-param
  ([nullable-tck expect-null param] (.methodWithNullableSetIntegerParam nullable-tck expect-null param)))
(defn method-with-nullable-set-integer-return
  ([nullable-tck not-null] (.methodWithNullableSetIntegerReturn nullable-tck not-null)))
(defn method-with-nullable-set-json-array-handler
  ([nullable-tck not-null handler] (.methodWithNullableSetJsonArrayHandler nullable-tck not-null handler)))
(defn method-with-nullable-set-json-array-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableSetJsonArrayHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-set-json-array-param
  ([nullable-tck expect-null param] (.methodWithNullableSetJsonArrayParam nullable-tck expect-null param)))
(defn method-with-nullable-set-json-array-return
  ([nullable-tck not-null] (.methodWithNullableSetJsonArrayReturn nullable-tck not-null)))
(defn method-with-nullable-set-json-object-handler
  ([nullable-tck not-null handler] (.methodWithNullableSetJsonObjectHandler nullable-tck not-null handler)))
(defn method-with-nullable-set-json-object-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableSetJsonObjectHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-set-json-object-param
  ([nullable-tck expect-null param] (.methodWithNullableSetJsonObjectParam nullable-tck expect-null param)))
(defn method-with-nullable-set-json-object-return
  ([nullable-tck not-null] (.methodWithNullableSetJsonObjectReturn nullable-tck not-null)))
(defn method-with-nullable-set-long-handler
  ([nullable-tck not-null handler] (.methodWithNullableSetLongHandler nullable-tck not-null handler)))
(defn method-with-nullable-set-long-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableSetLongHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-set-long-param
  ([nullable-tck expect-null param] (.methodWithNullableSetLongParam nullable-tck expect-null param)))
(defn method-with-nullable-set-long-return
  ([nullable-tck not-null] (.methodWithNullableSetLongReturn nullable-tck not-null)))
(defn method-with-nullable-set-short-handler
  ([nullable-tck not-null handler] (.methodWithNullableSetShortHandler nullable-tck not-null handler)))
(defn method-with-nullable-set-short-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableSetShortHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-set-short-param
  ([nullable-tck expect-null param] (.methodWithNullableSetShortParam nullable-tck expect-null param)))
(defn method-with-nullable-set-short-return
  ([nullable-tck not-null] (.methodWithNullableSetShortReturn nullable-tck not-null)))
(defn method-with-nullable-set-string-handler
  ([nullable-tck not-null handler] (.methodWithNullableSetStringHandler nullable-tck not-null handler)))
(defn method-with-nullable-set-string-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableSetStringHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-set-string-param
  ([nullable-tck expect-null param] (.methodWithNullableSetStringParam nullable-tck expect-null param)))
(defn method-with-nullable-set-string-return
  ([nullable-tck not-null] (.methodWithNullableSetStringReturn nullable-tck not-null)))
(defn method-with-nullable-short-handler
  ([nullable-tck not-null handler] (.methodWithNullableShortHandler nullable-tck not-null handler)))
(defn method-with-nullable-short-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableShortHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-short-param
  ([nullable-tck expect-null param] (.methodWithNullableShortParam nullable-tck expect-null param)))
(defn method-with-nullable-short-return
  ([nullable-tck not-null] (.methodWithNullableShortReturn nullable-tck not-null)))
(defn method-with-nullable-string-handler
  ([nullable-tck not-null handler] (.methodWithNullableStringHandler nullable-tck not-null handler)))
(defn method-with-nullable-string-handler-async-result
  ([nullable-tck not-null handler] (.methodWithNullableStringHandlerAsyncResult nullable-tck not-null handler)))
(defn method-with-nullable-string-param
  ([nullable-tck expect-null param] (.methodWithNullableStringParam nullable-tck expect-null param)))
(defn method-with-nullable-string-return
  ([nullable-tck not-null] (.methodWithNullableStringReturn nullable-tck not-null)))
(defn method-with-nullable-type-variable-handler
  ([nullable-tck not-null value handler] (.methodWithNullableTypeVariableHandler nullable-tck not-null value handler)))
(defn method-with-nullable-type-variable-handler-async-result
  ([nullable-tck not-null value handler] (.methodWithNullableTypeVariableHandlerAsyncResult nullable-tck not-null value handler)))
(defn method-with-nullable-type-variable-param
  ([nullable-tck expect-null param] (.methodWithNullableTypeVariableParam nullable-tck expect-null param)))
(defn method-with-nullable-type-variable-return
  ([nullable-tck not-null value] (.methodWithNullableTypeVariableReturn nullable-tck not-null value)))
(defn method-with-set-nullable-api-handler
  ([nullable-tck handler] (.methodWithSetNullableApiHandler nullable-tck handler)))
(defn method-with-set-nullable-api-handler-async-result
  ([nullable-tck handler] (.methodWithSetNullableApiHandlerAsyncResult nullable-tck handler)))
(defn method-with-set-nullable-api-param
  ([nullable-tck param] (.methodWithSetNullableApiParam nullable-tck param)))
(defn method-with-set-nullable-api-return
  ([nullable-tck ] (.methodWithSetNullableApiReturn nullable-tck )))
(defn method-with-set-nullable-boolean-handler
  ([nullable-tck handler] (.methodWithSetNullableBooleanHandler nullable-tck handler)))
(defn method-with-set-nullable-boolean-handler-async-result
  ([nullable-tck handler] (.methodWithSetNullableBooleanHandlerAsyncResult nullable-tck handler)))
(defn method-with-set-nullable-boolean-param
  ([nullable-tck param] (.methodWithSetNullableBooleanParam nullable-tck param)))
(defn method-with-set-nullable-boolean-return
  ([nullable-tck ] (.methodWithSetNullableBooleanReturn nullable-tck )))
(defn method-with-set-nullable-byte-handler
  ([nullable-tck handler] (.methodWithSetNullableByteHandler nullable-tck handler)))
(defn method-with-set-nullable-byte-handler-async-result
  ([nullable-tck handler] (.methodWithSetNullableByteHandlerAsyncResult nullable-tck handler)))
(defn method-with-set-nullable-byte-param
  ([nullable-tck param] (.methodWithSetNullableByteParam nullable-tck param)))
(defn method-with-set-nullable-byte-return
  ([nullable-tck ] (.methodWithSetNullableByteReturn nullable-tck )))
(defn method-with-set-nullable-char-handler
  ([nullable-tck handler] (.methodWithSetNullableCharHandler nullable-tck handler)))
(defn method-with-set-nullable-char-handler-async-result
  ([nullable-tck handler] (.methodWithSetNullableCharHandlerAsyncResult nullable-tck handler)))
(defn method-with-set-nullable-char-param
  ([nullable-tck param] (.methodWithSetNullableCharParam nullable-tck param)))
(defn method-with-set-nullable-char-return
  ([nullable-tck ] (.methodWithSetNullableCharReturn nullable-tck )))
(defn method-with-set-nullable-data-object-handler
  ([nullable-tck handler] (.methodWithSetNullableDataObjectHandler nullable-tck handler)))
(defn method-with-set-nullable-data-object-handler-async-result
  ([nullable-tck handler] (.methodWithSetNullableDataObjectHandlerAsyncResult nullable-tck handler)))
(defn method-with-set-nullable-data-object-param
  ([nullable-tck param] (.methodWithSetNullableDataObjectParam nullable-tck param)))
(defn method-with-set-nullable-data-object-return
  ([nullable-tck ] (.methodWithSetNullableDataObjectReturn nullable-tck )))
(defn method-with-set-nullable-double-handler
  ([nullable-tck handler] (.methodWithSetNullableDoubleHandler nullable-tck handler)))
(defn method-with-set-nullable-double-handler-async-result
  ([nullable-tck handler] (.methodWithSetNullableDoubleHandlerAsyncResult nullable-tck handler)))
(defn method-with-set-nullable-double-param
  ([nullable-tck param] (.methodWithSetNullableDoubleParam nullable-tck param)))
(defn method-with-set-nullable-double-return
  ([nullable-tck ] (.methodWithSetNullableDoubleReturn nullable-tck )))
(defn method-with-set-nullable-enum-handler
  ([nullable-tck handler] (.methodWithSetNullableEnumHandler nullable-tck handler)))
(defn method-with-set-nullable-enum-handler-async-result
  ([nullable-tck handler] (.methodWithSetNullableEnumHandlerAsyncResult nullable-tck handler)))
(defn method-with-set-nullable-enum-param
  ([nullable-tck param] (.methodWithSetNullableEnumParam nullable-tck param)))
(defn method-with-set-nullable-enum-return
  ([nullable-tck ] (.methodWithSetNullableEnumReturn nullable-tck )))
(defn method-with-set-nullable-float-handler
  ([nullable-tck handler] (.methodWithSetNullableFloatHandler nullable-tck handler)))
(defn method-with-set-nullable-float-handler-async-result
  ([nullable-tck handler] (.methodWithSetNullableFloatHandlerAsyncResult nullable-tck handler)))
(defn method-with-set-nullable-float-param
  ([nullable-tck param] (.methodWithSetNullableFloatParam nullable-tck param)))
(defn method-with-set-nullable-float-return
  ([nullable-tck ] (.methodWithSetNullableFloatReturn nullable-tck )))
(defn method-with-set-nullable-gen-enum-handler
  ([nullable-tck handler] (.methodWithSetNullableGenEnumHandler nullable-tck handler)))
(defn method-with-set-nullable-gen-enum-handler-async-result
  ([nullable-tck handler] (.methodWithSetNullableGenEnumHandlerAsyncResult nullable-tck handler)))
(defn method-with-set-nullable-gen-enum-param
  ([nullable-tck param] (.methodWithSetNullableGenEnumParam nullable-tck param)))
(defn method-with-set-nullable-gen-enum-return
  ([nullable-tck ] (.methodWithSetNullableGenEnumReturn nullable-tck )))
(defn method-with-set-nullable-integer-handler
  ([nullable-tck handler] (.methodWithSetNullableIntegerHandler nullable-tck handler)))
(defn method-with-set-nullable-integer-handler-async-result
  ([nullable-tck handler] (.methodWithSetNullableIntegerHandlerAsyncResult nullable-tck handler)))
(defn method-with-set-nullable-integer-param
  ([nullable-tck param] (.methodWithSetNullableIntegerParam nullable-tck param)))
(defn method-with-set-nullable-integer-return
  ([nullable-tck ] (.methodWithSetNullableIntegerReturn nullable-tck )))
(defn method-with-set-nullable-json-array-handler
  ([nullable-tck handler] (.methodWithSetNullableJsonArrayHandler nullable-tck handler)))
(defn method-with-set-nullable-json-array-handler-async-result
  ([nullable-tck handler] (.methodWithSetNullableJsonArrayHandlerAsyncResult nullable-tck handler)))
(defn method-with-set-nullable-json-array-param
  ([nullable-tck param] (.methodWithSetNullableJsonArrayParam nullable-tck param)))
(defn method-with-set-nullable-json-array-return
  ([nullable-tck ] (.methodWithSetNullableJsonArrayReturn nullable-tck )))
(defn method-with-set-nullable-json-object-handler
  ([nullable-tck handler] (.methodWithSetNullableJsonObjectHandler nullable-tck handler)))
(defn method-with-set-nullable-json-object-handler-async-result
  ([nullable-tck handler] (.methodWithSetNullableJsonObjectHandlerAsyncResult nullable-tck handler)))
(defn method-with-set-nullable-json-object-param
  ([nullable-tck param] (.methodWithSetNullableJsonObjectParam nullable-tck param)))
(defn method-with-set-nullable-json-object-return
  ([nullable-tck ] (.methodWithSetNullableJsonObjectReturn nullable-tck )))
(defn method-with-set-nullable-long-handler
  ([nullable-tck handler] (.methodWithSetNullableLongHandler nullable-tck handler)))
(defn method-with-set-nullable-long-handler-async-result
  ([nullable-tck handler] (.methodWithSetNullableLongHandlerAsyncResult nullable-tck handler)))
(defn method-with-set-nullable-long-param
  ([nullable-tck param] (.methodWithSetNullableLongParam nullable-tck param)))
(defn method-with-set-nullable-long-return
  ([nullable-tck ] (.methodWithSetNullableLongReturn nullable-tck )))
(defn method-with-set-nullable-short-handler
  ([nullable-tck handler] (.methodWithSetNullableShortHandler nullable-tck handler)))
(defn method-with-set-nullable-short-handler-async-result
  ([nullable-tck handler] (.methodWithSetNullableShortHandlerAsyncResult nullable-tck handler)))
(defn method-with-set-nullable-short-param
  ([nullable-tck param] (.methodWithSetNullableShortParam nullable-tck param)))
(defn method-with-set-nullable-short-return
  ([nullable-tck ] (.methodWithSetNullableShortReturn nullable-tck )))
(defn method-with-set-nullable-string-handler
  ([nullable-tck handler] (.methodWithSetNullableStringHandler nullable-tck handler)))
(defn method-with-set-nullable-string-handler-async-result
  ([nullable-tck handler] (.methodWithSetNullableStringHandlerAsyncResult nullable-tck handler)))
(defn method-with-set-nullable-string-param
  ([nullable-tck param] (.methodWithSetNullableStringParam nullable-tck param)))
(defn method-with-set-nullable-string-return
  ([nullable-tck ] (.methodWithSetNullableStringReturn nullable-tck )))