(ns io.vertx.clojure.http-client-response)

(import io.vertx.core.http.HttpClientResponse)
(import io.vertx.core.Handler)

(defn body-handler
  ([http-client-response body-handler] (.bodyHandler http-client-response body-handler)))
(defn cookies
  ([http-client-response ] (.cookies http-client-response )))
(defn custom-frame-handler
  ([http-client-response handler] (.customFrameHandler http-client-response handler)))
(defn end-handler
  ([http-client-response end-handler] (.endHandler http-client-response end-handler)))
(defn exception-handler
  ([http-client-response handler] (.exceptionHandler http-client-response handler)))
(defn get-header
  ([http-client-response header-name] (.getHeader http-client-response header-name)))
(defn get-trailer
  ([http-client-response trailer-name] (.getTrailer http-client-response trailer-name)))
(defn handler
  ([http-client-response handler] (.handler http-client-response handler)))
(defn headers
  ([http-client-response ] (.headers http-client-response )))
(defn net-socket
  ([http-client-response ] (.netSocket http-client-response )))
(defn pause
  ([http-client-response ] (.pause http-client-response )))
(defn request
  ([http-client-response ] (.request http-client-response )))
(defn resume
  ([http-client-response ] (.resume http-client-response )))
(defn status-code
  ([http-client-response ] (.statusCode http-client-response )))
(defn status-message
  ([http-client-response ] (.statusMessage http-client-response )))
(defn trailers
  ([http-client-response ] (.trailers http-client-response )))
(defn version
  ([http-client-response ] (.version http-client-response )))