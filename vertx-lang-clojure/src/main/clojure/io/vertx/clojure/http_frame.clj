(ns io.vertx.clojure.http-frame)

(import io.vertx.core.http.HttpFrame)

(defn payload
  ([http-frame ] (.payload http-frame )))
(defn flags
  ([http-frame ] (.flags http-frame )))
(defn type
  ([http-frame ] (.type http-frame )))