(ns io.testmodel.clojure.super-interface1)

(import io.vertx.codegen.testmodel.SuperInterface1)

(defn super-method-overloaded-by-subclass
  ([super-interface1 ] (.superMethodOverloadedBySubclass super-interface1 )))
(defn super-method-with-basic-params
  ([super-interface1 b s i l f d bool ch str] (.superMethodWithBasicParams super-interface1 b s i l f d bool ch str)))