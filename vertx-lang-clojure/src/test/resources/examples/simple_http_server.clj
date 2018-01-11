(ns examples.simple-http-server
  (:require
   [io.vertx.clojure.core.vertx :as vertx]
   [io.vertx.clojure.core.http.http-server :as server]
   [io.vertx.clojure.core.http.http-server-request :as request]
   [io.vertx.clojure.core.http.http-server-response :as response]))

(defn handle-request [req]
  (let [response (request/response req)]
    (response/put-header response "content-type" "text/plain")
    (response/end response "Hello from Vert.x!")))

(defn start [vertx]
  (let [http-server (vertx/create-http-server vertx)]
    (server/request-handler http-server (vertx/handler handle-request))
    (server/listen http-server 8080)))