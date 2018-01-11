(ns io.vertx.clojure.codegen.testmodel.interface-with-string-arg)

(import io.vertx.codegen.testmodel.InterfaceWithStringArg)

(defn get-value
  ([interface-with-string-arg ] (.getValue interface-with-string-arg )))
(defn meth
  ([interface-with-string-arg ] (.meth interface-with-string-arg )))
(defn set-value
  ([interface-with-string-arg value] (.setValue interface-with-string-arg value)))