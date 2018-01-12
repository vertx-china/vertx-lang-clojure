(ns io.vertx.clojure.codegen.testmodel.test-data-object)

(import io.vertx.codegen.testmodel.TestDataObject)
(import io.vertx.core.json.JsonObject)

(defn new-instance
  ([^JsonObject json] (new TestDataObject json)))

(defn set-bar [^TestDataObject test-data-object bar] (.setBar test-data-object bar))
(defn get-bar [^TestDataObject test-data-object] (.getBar test-data-object))
(defn set-foo [^TestDataObject test-data-object foo] (.setFoo test-data-object foo))
(defn get-foo [^TestDataObject test-data-object] (.getFoo test-data-object))
(defn set-wibble [^TestDataObject test-data-object wibble] (.setWibble test-data-object wibble))
(defn get-wibble [^TestDataObject test-data-object] (.getWibble test-data-object))
(defn to-json [^TestDataObject test-data-object] (.toJson test-data-object))