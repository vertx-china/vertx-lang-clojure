(ns io.vertx.clojure.multi-map)

(import io.vertx.core.MultiMap)
(import io.vertx.core.MultiMap)

(defn add
  ([multi-map name value] (.add multi-map name value)))
(defn get-all
  ([multi-map name] (.getAll multi-map name)))
(defn set
  ([multi-map name value] (.set multi-map name value)))
(defn is-empty
  ([multi-map ] (.isEmpty multi-map )))
(defn clear
  ([multi-map ] (.clear multi-map )))
(defn case-insensitive-multi-map
  ([] (MultiMap/caseInsensitiveMultiMap )))
(defn remove
  ([multi-map name] (.remove multi-map name)))
(defn contains
  ([multi-map name] (.contains multi-map name)))
(defn names
  ([multi-map ] (.names multi-map )))
(defn size
  ([multi-map ] (.size multi-map )))
(defn add-all
  ([multi-map map] (.addAll multi-map map)))
(defn get
  ([multi-map name] (.get multi-map name)))
(defn set-all
  ([multi-map map] (.setAll multi-map map)))