(ns io.vertx.clojure.codegen.testmodel.super-interface2)

(import io.vertx.codegen.testmodel.SuperInterface2)

(defn other-super-method-with-basic-params
  ([super-interface2 b s i l f d bool ch str] (.otherSuperMethodWithBasicParams super-interface2 b s i l f d bool ch str)))