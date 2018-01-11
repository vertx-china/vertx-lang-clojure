(ns io.vertx.clojure.codegen.testmodel.concrete-handler-user-type)

(import io.vertx.codegen.testmodel.ConcreteHandlerUserType)
(import io.vertx.codegen.testmodel.RefedInterface1)

(defn handle
  ([concrete-handler-user-type arg0] (.handle concrete-handler-user-type arg0)))