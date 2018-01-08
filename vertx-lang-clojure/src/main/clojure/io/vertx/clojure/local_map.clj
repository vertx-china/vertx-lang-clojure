(ns io.vertx.clojure.local-map)

(import io.vertx.core.shareddata.LocalMap)

(defn replace-if-present
  ([local-map key old-value new-value] (.replaceIfPresent local-map key old-value new-value)))
(defn get-or-default
  ([local-map key default-value] (.getOrDefault local-map key default-value)))
(defn contains-key
  ([local-map key] (.containsKey local-map key)))
(defn clear
  ([local-map ] (.clear local-map )))
(defn is-empty
  ([local-map ] (.isEmpty local-map )))
(defn replace
  ([local-map key value] (.replace local-map key value)))
(defn put
  ([local-map key value] (.put local-map key value)))
(defn remove
  ([local-map key] (.remove local-map key)))
(defn contains-value
  ([local-map value] (.containsValue local-map value)))
(defn size
  ([local-map ] (.size local-map )))
(defn get
  ([local-map key] (.get local-map key)))
(defn put-if-absent
  ([local-map key value] (.putIfAbsent local-map key value)))
(defn close
  ([local-map ] (.close local-map )))
(defn remove-if-present
  ([local-map key value] (.removeIfPresent local-map key value)))