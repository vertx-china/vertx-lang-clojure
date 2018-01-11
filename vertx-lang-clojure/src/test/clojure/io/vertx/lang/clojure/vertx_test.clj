(ns io.vertx.lang.clojure.vertx-test
  (:require [clojure.test :as test]
            [io.vertx.lang.clojure.json :as json]
            [io.vertx.clojure.codegen.testmodel.data-object-tck :as dot]
            [io.vertx.clojure.codegen.testmodel.data-object-with-values :as values]))

(import io.vertx.codegen.testmodel.DataObjectTCKImpl)

(test/deftest addition
  (test/is (= 2 (+ 1 1))))

(test/run-tests 'io.vertx.lang.clojure.vertx-test)