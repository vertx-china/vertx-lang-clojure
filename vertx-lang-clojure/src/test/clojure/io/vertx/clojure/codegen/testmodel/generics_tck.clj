(ns io.vertx.clojure.codegen.testmodel.generics-tck)

(import io.vertx.codegen.testmodel.GenericsTCK)
(import io.vertx.codegen.testmodel.GenericRefedInterface)
(import io.vertx.core.Handler)
(import java.util.function.Function)
(import io.vertx.codegen.testmodel.RefedInterface1)

(defn interface-with-api-arg
  ([generics-tck value] (.interfaceWithApiArg generics-tck value)))
(defn interface-with-string-arg
  ([generics-tck value] (.interfaceWithStringArg generics-tck value)))
(defn interface-with-variable-arg
  ([generics-tck value1 type value2] (.interfaceWithVariableArg generics-tck value1 type value2)))
(defn method-with-boolean-parameterized-return
  ([generics-tck ] (.methodWithBooleanParameterizedReturn generics-tck )))
(defn method-with-byte-parameterized-return
  ([generics-tck ] (.methodWithByteParameterizedReturn generics-tck )))
(defn method-with-character-parameterized-return
  ([generics-tck ] (.methodWithCharacterParameterizedReturn generics-tck )))
(defn method-with-class-type-function-param
  ([generics-tck type f] (.methodWithClassTypeFunctionParam generics-tck type f)))
(defn method-with-class-type-function-return
  ([generics-tck type f] (.methodWithClassTypeFunctionReturn generics-tck type f)))
(defn method-with-class-type-handler
  ([generics-tck type f] (.methodWithClassTypeHandler generics-tck type f)))
(defn method-with-class-type-handler-async-result
  ([generics-tck type f] (.methodWithClassTypeHandlerAsyncResult generics-tck type f)))
(defn method-with-class-type-param
  ([generics-tck type u] (.methodWithClassTypeParam generics-tck type u)))
(defn method-with-class-type-parameterized-return
  ([generics-tck type] (.methodWithClassTypeParameterizedReturn generics-tck type)))
(defn method-with-class-type-return
  ([generics-tck type] (.methodWithClassTypeReturn generics-tck type)))
(defn method-with-data-object-parameterized-return
  ([generics-tck ] (.methodWithDataObjectParameterizedReturn generics-tck )))
(defn method-with-double-parameterized-return
  ([generics-tck ] (.methodWithDoubleParameterizedReturn generics-tck )))
(defn method-with-enum-parameterized-return
  ([generics-tck ] (.methodWithEnumParameterizedReturn generics-tck )))
(defn method-with-float-parameterized-return
  ([generics-tck ] (.methodWithFloatParameterizedReturn generics-tck )))
(defn method-with-function-param-boolean-parameterized
  ([generics-tck handler] (.methodWithFunctionParamBooleanParameterized generics-tck handler)))
(defn method-with-function-param-byte-parameterized
  ([generics-tck handler] (.methodWithFunctionParamByteParameterized generics-tck handler)))
(defn method-with-function-param-character-parameterized
  ([generics-tck handler] (.methodWithFunctionParamCharacterParameterized generics-tck handler)))
(defn method-with-function-param-class-type-parameterized
  ([generics-tck type handler] (.methodWithFunctionParamClassTypeParameterized generics-tck type handler)))
(defn method-with-function-param-data-object-parameterized
  ([generics-tck handler] (.methodWithFunctionParamDataObjectParameterized generics-tck handler)))
(defn method-with-function-param-double-parameterized
  ([generics-tck handler] (.methodWithFunctionParamDoubleParameterized generics-tck handler)))
(defn method-with-function-param-enum-parameterized
  ([generics-tck handler] (.methodWithFunctionParamEnumParameterized generics-tck handler)))
(defn method-with-function-param-float-parameterized
  ([generics-tck handler] (.methodWithFunctionParamFloatParameterized generics-tck handler)))
(defn method-with-function-param-gen-enum-parameterized
  ([generics-tck handler] (.methodWithFunctionParamGenEnumParameterized generics-tck handler)))
(defn method-with-function-param-integer-parameterized
  ([generics-tck handler] (.methodWithFunctionParamIntegerParameterized generics-tck handler)))
(defn method-with-function-param-json-array-parameterized
  ([generics-tck handler] (.methodWithFunctionParamJsonArrayParameterized generics-tck handler)))
(defn method-with-function-param-json-object-parameterized
  ([generics-tck handler] (.methodWithFunctionParamJsonObjectParameterized generics-tck handler)))
(defn method-with-function-param-long-parameterized
  ([generics-tck handler] (.methodWithFunctionParamLongParameterized generics-tck handler)))
(defn method-with-function-param-short-parameterized
  ([generics-tck handler] (.methodWithFunctionParamShortParameterized generics-tck handler)))
(defn method-with-function-param-string-parameterized
  ([generics-tck handler] (.methodWithFunctionParamStringParameterized generics-tck handler)))
(defn method-with-function-param-user-type-parameterized
  ([generics-tck handler] (.methodWithFunctionParamUserTypeParameterized generics-tck handler)))
(defn method-with-gen-enum-parameterized-return
  ([generics-tck ] (.methodWithGenEnumParameterizedReturn generics-tck )))
(defn method-with-generic-nullable-api-return
  ([generics-tck not-null] (.methodWithGenericNullableApiReturn generics-tck not-null)))
(defn method-with-handler-async-result-boolean-parameterized
  ([generics-tck handler] (.methodWithHandlerAsyncResultBooleanParameterized generics-tck handler)))
(defn method-with-handler-async-result-byte-parameterized
  ([generics-tck handler] (.methodWithHandlerAsyncResultByteParameterized generics-tck handler)))
(defn method-with-handler-async-result-character-parameterized
  ([generics-tck handler] (.methodWithHandlerAsyncResultCharacterParameterized generics-tck handler)))
(defn method-with-handler-async-result-class-type-parameterized
  ([generics-tck type handler] (.methodWithHandlerAsyncResultClassTypeParameterized generics-tck type handler)))
(defn method-with-handler-async-result-data-object-parameterized
  ([generics-tck handler] (.methodWithHandlerAsyncResultDataObjectParameterized generics-tck handler)))
(defn method-with-handler-async-result-double-parameterized
  ([generics-tck handler] (.methodWithHandlerAsyncResultDoubleParameterized generics-tck handler)))
(defn method-with-handler-async-result-enum-parameterized
  ([generics-tck handler] (.methodWithHandlerAsyncResultEnumParameterized generics-tck handler)))
(defn method-with-handler-async-result-float-parameterized
  ([generics-tck handler] (.methodWithHandlerAsyncResultFloatParameterized generics-tck handler)))
(defn method-with-handler-async-result-gen-enum-parameterized
  ([generics-tck handler] (.methodWithHandlerAsyncResultGenEnumParameterized generics-tck handler)))
(defn method-with-handler-async-result-generic-nullable-api
  ([generics-tck not-null handler] (.methodWithHandlerAsyncResultGenericNullableApi generics-tck not-null handler)))
(defn method-with-handler-async-result-integer-parameterized
  ([generics-tck handler] (.methodWithHandlerAsyncResultIntegerParameterized generics-tck handler)))
(defn method-with-handler-async-result-json-array-parameterized
  ([generics-tck handler] (.methodWithHandlerAsyncResultJsonArrayParameterized generics-tck handler)))
(defn method-with-handler-async-result-json-object-parameterized
  ([generics-tck handler] (.methodWithHandlerAsyncResultJsonObjectParameterized generics-tck handler)))
(defn method-with-handler-async-result-long-parameterized
  ([generics-tck handler] (.methodWithHandlerAsyncResultLongParameterized generics-tck handler)))
(defn method-with-handler-async-result-param-infered
  ([generics-tck param handler] (.methodWithHandlerAsyncResultParamInfered generics-tck param handler)))
(defn method-with-handler-async-result-short-parameterized
  ([generics-tck handler] (.methodWithHandlerAsyncResultShortParameterized generics-tck handler)))
(defn method-with-handler-async-result-string-parameterized
  ([generics-tck handler] (.methodWithHandlerAsyncResultStringParameterized generics-tck handler)))
(defn method-with-handler-async-result-user-type-parameterized
  ([generics-tck handler] (.methodWithHandlerAsyncResultUserTypeParameterized generics-tck handler)))
(defn method-with-handler-boolean-parameterized
  ([generics-tck handler] (.methodWithHandlerBooleanParameterized generics-tck handler)))
(defn method-with-handler-byte-parameterized
  ([generics-tck handler] (.methodWithHandlerByteParameterized generics-tck handler)))
(defn method-with-handler-character-parameterized
  ([generics-tck handler] (.methodWithHandlerCharacterParameterized generics-tck handler)))
(defn method-with-handler-class-type-parameterized
  ([generics-tck type handler] (.methodWithHandlerClassTypeParameterized generics-tck type handler)))
(defn method-with-handler-data-object-parameterized
  ([generics-tck handler] (.methodWithHandlerDataObjectParameterized generics-tck handler)))
(defn method-with-handler-double-parameterized
  ([generics-tck handler] (.methodWithHandlerDoubleParameterized generics-tck handler)))
(defn method-with-handler-enum-parameterized
  ([generics-tck handler] (.methodWithHandlerEnumParameterized generics-tck handler)))
(defn method-with-handler-float-parameterized
  ([generics-tck handler] (.methodWithHandlerFloatParameterized generics-tck handler)))
(defn method-with-handler-gen-enum-parameterized
  ([generics-tck handler] (.methodWithHandlerGenEnumParameterized generics-tck handler)))
(defn method-with-handler-generic-nullable-api
  ([generics-tck not-null handler] (.methodWithHandlerGenericNullableApi generics-tck not-null handler)))
(defn method-with-handler-integer-parameterized
  ([generics-tck handler] (.methodWithHandlerIntegerParameterized generics-tck handler)))
(defn method-with-handler-json-array-parameterized
  ([generics-tck handler] (.methodWithHandlerJsonArrayParameterized generics-tck handler)))
(defn method-with-handler-json-object-parameterized
  ([generics-tck handler] (.methodWithHandlerJsonObjectParameterized generics-tck handler)))
(defn method-with-handler-long-parameterized
  ([generics-tck handler] (.methodWithHandlerLongParameterized generics-tck handler)))
(defn method-with-handler-param-infered
  ([generics-tck param handler] (.methodWithHandlerParamInfered generics-tck param handler)))
(defn method-with-handler-short-parameterized
  ([generics-tck handler] (.methodWithHandlerShortParameterized generics-tck handler)))
(defn method-with-handler-string-parameterized
  ([generics-tck handler] (.methodWithHandlerStringParameterized generics-tck handler)))
(defn method-with-handler-user-type-parameterized
  ([generics-tck handler] (.methodWithHandlerUserTypeParameterized generics-tck handler)))
(defn method-with-integer-parameterized-return
  ([generics-tck ] (.methodWithIntegerParameterizedReturn generics-tck )))
(defn method-with-json-array-parameterized-return
  ([generics-tck ] (.methodWithJsonArrayParameterizedReturn generics-tck )))
(defn method-with-json-object-parameterized-return
  ([generics-tck ] (.methodWithJsonObjectParameterizedReturn generics-tck )))
(defn method-with-long-parameterized-return
  ([generics-tck ] (.methodWithLongParameterizedReturn generics-tck )))
(defn method-with-param-infered-return
  ([generics-tck param] (.methodWithParamInferedReturn generics-tck param)))
(defn method-with-short-parameterized-return
  ([generics-tck ] (.methodWithShortParameterizedReturn generics-tck )))
(defn method-with-string-parameterized-return
  ([generics-tck ] (.methodWithStringParameterizedReturn generics-tck )))
(defn method-with-user-type-parameterized-return
  ([generics-tck ] (.methodWithUserTypeParameterizedReturn generics-tck )))