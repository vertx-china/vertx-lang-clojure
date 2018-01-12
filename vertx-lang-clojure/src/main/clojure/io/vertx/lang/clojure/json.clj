;json wrapper of io.vertx.core.json.JsonObject & io.vertx.core.json.JsonArray

(ns io.vertx.lang.clojure.json)

(import io.vertx.core.json.JsonObject)
(import io.vertx.core.json.JsonArray)
(import io.vertx.lang.clojure.Json)

(defn new-json-array ([] (new JsonArray)))
(defn new-json-object [] (new JsonObject))
(defn new-instance [] (new-json-object))
;put key-value pair to a jsonobject
(defn put [^JsonObject json field value] (.put json field value))
;insert value to specific position of a jsonarray
(defn insert [^JsonArray json index value] (.add (.getList json) index value) json)
;set allows both jsonobject and jsonarray to be set, translate put for jsonobject, add/insert for jsonarray
(defn set [json field-or-pos value] (Json/set json field-or-pos value))
;get value in specific pos or field, return nil if does not exist
(defn get-value [json field-or-pos] (Json/get json field-or-pos))
;abbrevation for get-value function
(defn get [json field-or-pos] (get-value json field-or-pos))
;add value to the jsonarray
(defn add-value [^JsonArray array value] (.add array value))
;abbrevation for add-value function
(defn add [^JsonArray array & values] (reduce add-value array values))
;remove method and return removed object from the collection
(defn remove [json field-or-pos] (Json/remove json field-or-pos))
;delete one single element
(defn delete-element [json field-or-pos]
  (remove json field-or-pos)
  json)
;delete will return json rather then removed object
(defn delete [json & field-or-pos]
  (reduce delete-element json field-or-pos))
;abbrevation for delete function
(defn del [json & field-or-pos]
  (reduce delete-element json field-or-pos))

(defn size [json] (.size json))

(defn length [json] (size json))
;delete all entries with value in the jsonobj or jsonarray
(defn delete-value [json value] (Json/removeValue json value))
;delete all entries with multiple values
(defn delete-values [json & values] (reduce delete-value json values))

;todo key-set value-set