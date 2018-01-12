(ns io.vertx.lang.clojure.json-test
  (:require [clojure.test :as test]
            [io.vertx.lang.clojure.json :as json]))

(test/deftest test-json-object
  (let [json (json/new-instance)]
    (-> json
        (json/put "age" 30)
        (json/put "country" "cn")
        (json/put "male" true)
        (json/put "height" 181.5)
        (json/put "redundant" "redundant")
        (json/del "redundant" "male")
        (json/put "redundant" "not really"))
    (test/is (= 30 (json/get json "age")))
    (test/is (= "cn" (json/get json "country")))
    (test/is (< 180 (json/get json "height")))
    (test/is (= nil (json/get json "male")))
    (test/is (= 4 (json/size json)))))

(test/deftest test-json-array
  (let [array (json/new-json-array)]
    (json/add array 1)
    (test/is (= 1 (json/get array 0)))
    (json/add array 1 3 5 7 9)
    (test/is (= 3 (json/get array 2)))
    (json/del array 3 4)
    (test/is (= 7 (json/get array 3)))
    (test/is (= 4 (json/size array)))))

(test/deftest test-json-delete
  (let [obj   (json/new-json-object)
        array (json/new-json-array)]

    (-> obj
        (json/put "age" 30)
        (json/put "male" false)
        (json/put "height" 181.5)
        (json/put "country" "cn")
        (json/delete-values "cn" 30))
    (test/is (= 2 (json/size obj)))

    (json/add array 1 2 "3" false true obj)
    (json/delete-values array "3" 2 7)
    (test/is (= 4 (json/size array)))))

(test/deftest test-json-set
  (let [obj   (json/new-json-object)
        array (json/new-json-array)]
    (-> array
        (json/set 3 1)
        (json/set 2 2)
        (json/set 1 3)
        (json/set 0 4)
        (json/insert 0 0)
        (json/del 1))
    (test/is (= 4 (json/size array)))))

(test/deftest test-json-nil-return
  (let [obj   (json/new-json-object)
        array (json/new-json-array)]
    (test/is (= nil (json/get array 3)))
    (test/is (= nil (json/get obj "3")))
    (test/is (= nil (json/remove obj "3")))
    (test/is (= nil (json/remove array 3)))))

(test/deftest test-json-constructor
  (let [obj   (json/new-json-object {"ok" 1 :key 2 3 2})
        array (json/new-json-array [1 2 3 2])]
    (test/is (= 1 (json/get obj "ok")))
    (test/is (= 2 (json/get array 1)))
    (test/is (= 1 (first (json/values array))))
    (test/is (contains? (json/key-set obj) :key))))

(test/run-tests 'io.vertx.lang.clojure.json-test)