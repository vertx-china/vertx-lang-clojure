(ns io.vertx.clojure.core.http.request-options)

(import io.vertx.core.http.RequestOptions)

(defn from-json [^RequestOptions json] (new RequestOptions json))

(defn set-host [^RequestOptions request-options host] (.setHost request-options host))
(defn get-host [^RequestOptions request-options] (.getHost request-options))
(defn set-port [^RequestOptions request-options port] (.setPort request-options port))
(defn get-port [^RequestOptions request-options] (.getPort request-options))
(defn set-ssl [^RequestOptions request-options ssl] (.setSsl request-options ssl))
(defn is-ssl [^RequestOptions request-options] (.isSsl request-options))
(defn set-uri [^RequestOptions request-options uri] (.setURI request-options uri))
(defn get-uri [^RequestOptions request-options] (.getURI request-options))