(ns io.vertx.lang.clojure.json-test
  (:require [clojure.test :as test]
            [io.vertx.lang.clojure.json :as json]))

(test/deftest test-put-get
  (let [json (json/new-instance)]
    (-> json
        (json/put "age" 30)
        (json/put "country" "cn")
        (json/put "male" true)
        (json/put "height" 181.5)
        (json/put "redundant" "redundant")
        (json/remove "redundant"))
    (test/is (= 30 (json/get json"age")))
    (test/is (= "cn" (json/get json"country")))
    (test/is (< 180 (json/get json"height")))
    (test/is (= true (json/get json"male")))
    (test/is (= 4 (json/size json)))))

(test/deftest test-json-array
  (let [array (json/new-json-array)]
    (json/add array 1)
    (test/is (= 1 (json/get array 0)))
    (json/add array 1 3 5 7 9)
    (test/is (= 3 (json/get array 2)))
    (json/remove array 3)
    (test/is (= 7 (json/get array 3)))
    (test/is (= 5 (json/size array)))))

(test/run-tests 'io.vertx.lang.clojure.json-test)