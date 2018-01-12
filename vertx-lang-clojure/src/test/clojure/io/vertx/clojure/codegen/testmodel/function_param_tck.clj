(ns io.vertx.clojure.codegen.testmodel.function-param-tck)

(import io.vertx.codegen.testmodel.FunctionParamTCK)
(import io.vertx.codegen.testmodel.RefedInterface1)
(import java.util.function.Function)

(defn method-with-basic-param
  ([function-param-tck byte-func short-func integer-func long-func float-func double-func boolean-func char-func string-func] (.methodWithBasicParam function-param-tck byte-func short-func integer-func long-func float-func double-func boolean-func char-func string-func)))
(defn method-with-basic-return
  ([function-param-tck byte-func short-func integer-func long-func float-func double-func boolean-func char-func string-func] (.methodWithBasicReturn function-param-tck byte-func short-func integer-func long-func float-func double-func boolean-func char-func string-func)))
(defn method-with-data-object-param
  ([function-param-tck func] (.methodWithDataObjectParam function-param-tck func)))
(defn method-with-data-object-return
  ([function-param-tck func] (.methodWithDataObjectReturn function-param-tck func)))
(defn method-with-enum-param
  ([function-param-tck func] (.methodWithEnumParam function-param-tck func)))
(defn method-with-enum-return
  ([function-param-tck func] (.methodWithEnumReturn function-param-tck func)))
(defn method-with-generic-param
  ([function-param-tck t func] (.methodWithGenericParam function-param-tck t func)))
(defn method-with-generic-return
  ([function-param-tck func] (.methodWithGenericReturn function-param-tck func)))
(defn method-with-generic-user-type-param
  ([function-param-tck t func] (.methodWithGenericUserTypeParam function-param-tck t func)))
(defn method-with-generic-user-type-return
  ([function-param-tck func] (.methodWithGenericUserTypeReturn function-param-tck func)))
(defn method-with-json-param
  ([function-param-tck object-func array-func] (.methodWithJsonParam function-param-tck object-func array-func)))
(defn method-with-json-return
  ([function-param-tck object-func array-func] (.methodWithJsonReturn function-param-tck object-func array-func)))
(defn method-with-list-param
  ([function-param-tck string-func] (.methodWithListParam function-param-tck string-func)))
(defn method-with-list-return
  ([function-param-tck func] (.methodWithListReturn function-param-tck func)))
(defn method-with-map-param
  ([function-param-tck func] (.methodWithMapParam function-param-tck func)))
(defn method-with-map-return
  ([function-param-tck func] (.methodWithMapReturn function-param-tck func)))
(defn method-with-nullable-list-param
  ([function-param-tck func] (.methodWithNullableListParam function-param-tck func)))
(defn method-with-nullable-list-return
  ([function-param-tck func] (.methodWithNullableListReturn function-param-tck func)))
(defn method-with-object-param
  ([function-param-tck arg func] (.methodWithObjectParam function-param-tck arg func)))
(defn method-with-object-return
  ([function-param-tck func] (.methodWithObjectReturn function-param-tck func)))
(defn method-with-set-param
  ([function-param-tck func] (.methodWithSetParam function-param-tck func)))
(defn method-with-set-return
  ([function-param-tck func] (.methodWithSetReturn function-param-tck func)))
(defn method-with-user-type-param
  ([function-param-tck arg func] (.methodWithUserTypeParam function-param-tck arg func)))
(defn method-with-void-param
  ([function-param-tck func] (.methodWithVoidParam function-param-tck func)))
(defn function [f]
  (reify
   java.util.function.Function
   (apply [this para]
           (f para))))