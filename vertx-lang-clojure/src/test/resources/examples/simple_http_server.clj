(ns examples.simple-http-server)

(require
 '[io.vertx.clojure.core.core :as core]
 '[io.vertx.lang.clojure.vertx :as vertx]
 '[io.vertx.lang.clojure.http-server :as server]
 '[io.vertx.lang.clojure.http-server-request :as request]
 '[io.vertx.lang.clojure.http-server-response :as response])

(defn handle-request [req]
  do
  (def response (request/response req))
  (response/put-header response "content-type" "text/plain")
  (response/end response "Hello from Vert.x!"))

(defn start [vertx]
  do
  (def http-server (vertx/create-http-server vertx))
  (server/request-handler http-server (core/handler handle-request))
  (server/listen http-server 8080))
