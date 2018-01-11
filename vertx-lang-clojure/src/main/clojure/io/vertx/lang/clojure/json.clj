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

