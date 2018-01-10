(ns io.testmodel.lang.clojure.interface-with-variable-arg)

(import io.vertx.codegen.testmodel.InterfaceWithVariableArg)

(defn get-other-value
  ([interface-with-variable-arg ] (.getOtherValue interface-with-variable-arg )))
(defn get-value
  ([interface-with-variable-arg ] (.getValue interface-with-variable-arg )))
(defn set-other-value
  ([interface-with-variable-arg value] (.setOtherValue interface-with-variable-arg value)))
(defn set-value
  ([interface-with-variable-arg value] (.setValue interface-with-variable-arg value)))