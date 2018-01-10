(ns io.testmodel.lang.clojure.interface-with-api-arg)

(import io.vertx.codegen.testmodel.InterfaceWithApiArg)
(import io.vertx.codegen.testmodel.RefedInterface1)

(defn get-value
  ([interface-with-api-arg ] (.getValue interface-with-api-arg )))
(defn meth
  ([interface-with-api-arg ] (.meth interface-with-api-arg )))
(defn set-value
  ([interface-with-api-arg value] (.setValue interface-with-api-arg value)))