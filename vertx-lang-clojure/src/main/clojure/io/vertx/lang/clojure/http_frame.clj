(ns io.vertx.lang.clojure.http-frame)

(import io.vertx.core.http.HttpFrame)

(defn flags
  ([http-frame ] (.flags http-frame )))
(defn payload
  ([http-frame ] (.payload http-frame )))
(defn type
  ([http-frame ] (.type http-frame )))