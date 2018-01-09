(ns examples.simple-http-server)

(require
 '[io.vertx.clojure.core :as vertx.core]
 '[io.vertx.clojure.vertx :as vertx.vertx]
 '[io.vertx.clojure.http-server :as server]
 '[io.vertx.clojure.http-server-request :as request]
 '[io.vertx.clojure.http-server-response :as response])

(defn handle-request [req]
  (response/end
   (request/response req)
   "Hello from Vert.x!"))

(defn start [vertx]
  do
  (def http-server (vertx.vertx/create-http-server vertx))
  (server/request-handler http-server (vertx.core/handler handle-request))
  (server/listen http-server 8080))
