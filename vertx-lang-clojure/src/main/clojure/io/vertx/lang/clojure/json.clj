;json wrapper of io.vertx.core.json.JsonObject & io.vertx.core.json.JsonArray

(ns io.vertx.lang.clojure.json)

(import io.vertx.core.json.JsonObject)
(import io.vertx.core.json.JsonArray)
(import io.vertx.lang.clojure.Json)

(defn new-json-array ([] (new JsonArray)))

(defn new-json-object [] (new JsonObject))

(defn new-instance [] (new-json-object))

(defn put [^JsonObject json field value] (.put json field value))

(defn get-value [json field-or-pos] (Json/get json field-or-pos))

(defn get [json field-or-pos] (get-value json field-or-pos))

(defn add-value [^JsonArray array value] (.add array value))

(defn add [^JsonArray array & values] (reduce add-value array values))

;remove method will return removed object from the collection
(defn remove [json field-or-pos] (Json/remove json field-or-pos))

(defn delete-element [json field-or-pos]
  (remove json field-or-pos)
  json)

;delete will return json rather then removed object
(defn delete [json & field-or-pos]
  (reduce delete-element json field-or-pos))

(defn size [json] (.size json))

(defn length [json] (size json))

(defn delete-value [json value] (Json/removeValue json value))

;complexity o(n^2)
(defn delete-values [json & values] (reduce delete-value json values))

