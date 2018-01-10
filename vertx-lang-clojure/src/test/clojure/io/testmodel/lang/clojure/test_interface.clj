(ns io.testmodel.lang.clojure.test-interface)

(import io.vertx.codegen.testmodel.TestInterface)
(import io.vertx.core.json.JsonArray)
(import io.vertx.codegen.testmodel.TestEnum)
(import io.vertx.core.json.JsonObject)
(import io.vertx.codegen.testmodel.TestDataObject)
(import io.vertx.core.Handler)
(import io.vertx.codegen.testmodel.RefedInterface1)
(import io.vertx.codegen.testmodel.ConcreteHandlerUserType)
(import io.vertx.codegen.testmodel.AbstractHandlerUserType)
(import io.vertx.codegen.testmodel.ConcreteHandlerUserTypeExtension)
(import io.vertx.codegen.testmodel.TestGenEnum)

(defn fluent-method
  ([test-interface str] (.fluentMethod test-interface str)))
(defn method-with-abstract-handler-user-type-subtype
  ([test-interface handler] (.methodWithAbstractHandlerUserTypeSubtype test-interface handler)))
(defn method-with-abstract-vertx-gen-return
  ([test-interface ] (.methodWithAbstractVertxGenReturn test-interface )))
(defn method-with-basic-boxed-params
  ([test-interface b s i l f d bool ch] (.methodWithBasicBoxedParams test-interface b s i l f d bool ch)))
(defn method-with-basic-params
  ([test-interface b s i l f d bool ch str] (.methodWithBasicParams test-interface b s i l f d bool ch str)))
(defn method-with-boolean-return
  ([test-interface ] (.methodWithBooleanReturn test-interface )))
(defn method-with-byte-return
  ([test-interface ] (.methodWithByteReturn test-interface )))
(defn method-with-cached-list-return
  ([test-interface ] (.methodWithCachedListReturn test-interface )))
(defn method-with-cached-return
  ([test-interface foo] (.methodWithCachedReturn test-interface foo)))
(defn method-with-cached-return-primitive
  ([test-interface arg] (.methodWithCachedReturnPrimitive test-interface arg)))
(defn method-with-char-return
  ([test-interface ] (.methodWithCharReturn test-interface )))
(defn method-with-complex-json-array-return
  ([test-interface ] (.methodWithComplexJsonArrayReturn test-interface )))
(defn method-with-complex-json-object-return
  ([test-interface ] (.methodWithComplexJsonObjectReturn test-interface )))
(defn method-with-concrete-handler-user-type-subtype
  ([test-interface handler] (.methodWithConcreteHandlerUserTypeSubtype test-interface handler)))
(defn method-with-concrete-handler-user-type-subtype-extension
  ([test-interface handler] (.methodWithConcreteHandlerUserTypeSubtypeExtension test-interface handler)))
(defn method-with-data-object-null-return
  ([test-interface ] (.methodWithDataObjectNullReturn test-interface )))
(defn method-with-data-object-param
  ([test-interface data-object] (.methodWithDataObjectParam test-interface data-object)))
(defn method-with-data-object-return
  ([test-interface ] (.methodWithDataObjectReturn test-interface )))
(defn method-with-double-return
  ([test-interface ] (.methodWithDoubleReturn test-interface )))
(defn method-with-enum-param
  ([test-interface str-val weirdo] (.methodWithEnumParam test-interface str-val weirdo)))
(defn method-with-enum-return
  ([test-interface str-val] (.methodWithEnumReturn test-interface str-val)))
(defn method-with-float-return
  ([test-interface ] (.methodWithFloatReturn test-interface )))
(defn method-with-gen-enum-param
  ([test-interface str-val weirdo] (.methodWithGenEnumParam test-interface str-val weirdo)))
(defn method-with-gen-enum-return
  ([test-interface str-val] (.methodWithGenEnumReturn test-interface str-val)))
(defn method-with-generic-handler
  ([test-interface type handler] (.methodWithGenericHandler test-interface type handler)))
(defn method-with-generic-handler-async-result
  ([test-interface type async-result-handler] (.methodWithGenericHandlerAsyncResult test-interface type async-result-handler)))
(defn method-with-generic-param
  ([test-interface type u] (.methodWithGenericParam test-interface type u)))
(defn method-with-generic-return
  ([test-interface type] (.methodWithGenericReturn test-interface type)))
(defn method-with-generic-user-type-return
  ([test-interface value] (.methodWithGenericUserTypeReturn test-interface value)))
(defn method-with-handler-async-result-boolean
  ([test-interface send-failure handler] (.methodWithHandlerAsyncResultBoolean test-interface send-failure handler)))
(defn method-with-handler-async-result-byte
  ([test-interface send-failure handler] (.methodWithHandlerAsyncResultByte test-interface send-failure handler)))
(defn method-with-handler-async-result-character
  ([test-interface send-failure handler] (.methodWithHandlerAsyncResultCharacter test-interface send-failure handler)))
(defn method-with-handler-async-result-complex-json-array
  ([test-interface handler] (.methodWithHandlerAsyncResultComplexJsonArray test-interface handler)))
(defn method-with-handler-async-result-complex-json-object
  ([test-interface handler] (.methodWithHandlerAsyncResultComplexJsonObject test-interface handler)))
(defn method-with-handler-async-result-data-object
  ([test-interface send-failure handler] (.methodWithHandlerAsyncResultDataObject test-interface send-failure handler)))
(defn method-with-handler-async-result-double
  ([test-interface send-failure handler] (.methodWithHandlerAsyncResultDouble test-interface send-failure handler)))
(defn method-with-handler-async-result-float
  ([test-interface send-failure handler] (.methodWithHandlerAsyncResultFloat test-interface send-failure handler)))
(defn method-with-handler-async-result-generic-return
  ([test-interface handler] (.methodWithHandlerAsyncResultGenericReturn test-interface handler)))
(defn method-with-handler-async-result-generic-user-type
  ([test-interface value handler] (.methodWithHandlerAsyncResultGenericUserType test-interface value handler)))
(defn method-with-handler-async-result-integer
  ([test-interface send-failure handler] (.methodWithHandlerAsyncResultInteger test-interface send-failure handler)))
(defn method-with-handler-async-result-json-array
  ([test-interface handler] (.methodWithHandlerAsyncResultJsonArray test-interface handler)))
(defn method-with-handler-async-result-json-object
  ([test-interface handler] (.methodWithHandlerAsyncResultJsonObject test-interface handler)))
(defn method-with-handler-async-result-long
  ([test-interface send-failure handler] (.methodWithHandlerAsyncResultLong test-interface send-failure handler)))
(defn method-with-handler-async-result-null-json-array
  ([test-interface handler] (.methodWithHandlerAsyncResultNullJsonArray test-interface handler)))
(defn method-with-handler-async-result-null-json-object
  ([test-interface handler] (.methodWithHandlerAsyncResultNullJsonObject test-interface handler)))
(defn method-with-handler-async-result-short
  ([test-interface send-failure handler] (.methodWithHandlerAsyncResultShort test-interface send-failure handler)))
(defn method-with-handler-async-result-string
  ([test-interface send-failure handler] (.methodWithHandlerAsyncResultString test-interface send-failure handler)))
(defn method-with-handler-async-result-string-return
  ([test-interface expected fail] (.methodWithHandlerAsyncResultStringReturn test-interface expected fail)))
(defn method-with-handler-async-result-user-types
  ([test-interface handler] (.methodWithHandlerAsyncResultUserTypes test-interface handler)))
(defn method-with-handler-async-result-vertx-gen-return
  ([test-interface expected fail] (.methodWithHandlerAsyncResultVertxGenReturn test-interface expected fail)))
(defn method-with-handler-async-result-void
  ([test-interface send-failure handler] (.methodWithHandlerAsyncResultVoid test-interface send-failure handler)))
(defn method-with-handler-basic-types
  ([test-interface byte-handler short-handler int-handler long-handler float-handler double-handler boolean-handler char-handler string-handler] (.methodWithHandlerBasicTypes test-interface byte-handler short-handler int-handler long-handler float-handler double-handler boolean-handler char-handler string-handler)))
(defn method-with-handler-complex-json
  ([test-interface json-object-handler json-array-handler] (.methodWithHandlerComplexJson test-interface json-object-handler json-array-handler)))
(defn method-with-handler-data-object
  ([test-interface handler] (.methodWithHandlerDataObject test-interface handler)))
(defn method-with-handler-generic-return
  ([test-interface handler] (.methodWithHandlerGenericReturn test-interface handler)))
(defn method-with-handler-generic-user-type
  ([test-interface value handler] (.methodWithHandlerGenericUserType test-interface value handler)))
(defn method-with-handler-json
  ([test-interface json-object-handler json-array-handler] (.methodWithHandlerJson test-interface json-object-handler json-array-handler)))
(defn method-with-handler-string-return
  ([test-interface expected] (.methodWithHandlerStringReturn test-interface expected)))
(defn method-with-handler-throwable
  ([test-interface handler] (.methodWithHandlerThrowable test-interface handler)))
(defn method-with-handler-user-types
  ([test-interface handler] (.methodWithHandlerUserTypes test-interface handler)))
(defn method-with-handler-vertx-gen-return
  ([test-interface expected] (.methodWithHandlerVertxGenReturn test-interface expected)))
(defn method-with-handler-void
  ([test-interface handler] (.methodWithHandlerVoid test-interface handler)))
(defn method-with-int-return
  ([test-interface ] (.methodWithIntReturn test-interface )))
(defn method-with-json-array-return
  ([test-interface ] (.methodWithJsonArrayReturn test-interface )))
(defn method-with-json-object-return
  ([test-interface ] (.methodWithJsonObjectReturn test-interface )))
(defn method-with-json-params
  ([test-interface json-object json-array] (.methodWithJsonParams test-interface json-object json-array)))
(defn method-with-long-return
  ([test-interface ] (.methodWithLongReturn test-interface )))
(defn method-with-null-json-array-return
  ([test-interface ] (.methodWithNullJsonArrayReturn test-interface )))
(defn method-with-null-json-object-return
  ([test-interface ] (.methodWithNullJsonObjectReturn test-interface )))
(defn method-with-null-json-params
  ([test-interface json-object json-array] (.methodWithNullJsonParams test-interface json-object json-array)))
(defn method-with-object-param
  ([test-interface str obj] (.methodWithObjectParam test-interface str obj)))
(defn method-with-short-return
  ([test-interface ] (.methodWithShortReturn test-interface )))
(defn method-with-string-return
  ([test-interface ] (.methodWithStringReturn test-interface )))
(defn method-with-throwable-param
  ([test-interface t] (.methodWithThrowableParam test-interface t)))
(defn method-with-throwable-return
  ([test-interface str-val] (.methodWithThrowableReturn test-interface str-val)))
(defn method-with-user-types
  ([test-interface refed] (.methodWithUserTypes test-interface refed)))
(defn method-with-vertx-gen-null-return
  ([test-interface ] (.methodWithVertxGenNullReturn test-interface )))
(defn method-with-vertx-gen-return
  ([test-interface ] (.methodWithVertxGenReturn test-interface )))
(defn other-super-method-with-basic-params
  ([test-interface b s i l f d bool ch str] (.otherSuperMethodWithBasicParams test-interface b s i l f d bool ch str)))
(defn overloaded-method
  ([test-interface str refed-or-handler] (.overloadedMethod test-interface str refed-or-handler))
  ([test-interface str refed handler] (.overloadedMethod test-interface str refed handler))
  ([test-interface str refed period handler] (.overloadedMethod test-interface str refed period handler)))
(defn static-factory-method
  ([foo] (TestInterface/staticFactoryMethod foo)))
(defn super-method-overloaded-by-subclass
  ([test-interface s] (.superMethodOverloadedBySubclass test-interface s)))