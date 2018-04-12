(ns io.vertx.clojure.core.http.http-server-request)

(import io.vertx.core.Handler)
(import io.vertx.core.http.HttpServerRequest)

(defn absolute-uri
  ([http-server-request ] (.absoluteURI http-server-request )))
(defn body-handler
  ([http-server-request body-handler] (.bodyHandler http-server-request body-handler)))
(defn bytes-read
  ([http-server-request ] (.bytesRead http-server-request )))
(defn connection
  ([http-server-request ] (.connection http-server-request )))
(defn custom-frame-handler
  ([http-server-request handler] (.customFrameHandler http-server-request handler)))
(defn end-handler
  ([http-server-request end-handler] (.endHandler http-server-request end-handler)))
(defn exception-handler
  ([http-server-request handler] (.exceptionHandler http-server-request handler)))
(defn form-attributes
  ([http-server-request ] (.formAttributes http-server-request )))
(defn get-form-attribute
  ([http-server-request attribute-name] (.getFormAttribute http-server-request attribute-name)))
(defn get-header
  ([http-server-request header-name] (.getHeader http-server-request header-name)))
(defn get-param
  ([http-server-request param-name] (.getParam http-server-request param-name)))
(defn handler
  ([f]
    (reify
     io.vertx.core.Handler
     (handle [this para]
           (f para))))
  ([http-server-request handler] (.handler http-server-request handler)))
(defn headers
  ([http-server-request ] (.headers http-server-request )))
(defn host
  ([http-server-request ] (.host http-server-request )))
(defn is-ended
  ([http-server-request ] (.isEnded http-server-request )))
(defn is-expect-multipart
  ([http-server-request ] (.isExpectMultipart http-server-request )))
(defn is-ssl
  ([http-server-request ] (.isSSL http-server-request )))
(defn local-address
  ([http-server-request ] (.localAddress http-server-request )))
(defn method
  ([http-server-request ] (.method http-server-request )))
(defn net-socket
  ([http-server-request ] (.netSocket http-server-request )))
(defn params
  ([http-server-request ] (.params http-server-request )))
(defn path
  ([http-server-request ] (.path http-server-request )))
(defn pause
  ([http-server-request ] (.pause http-server-request )))
(defn query
  ([http-server-request ] (.query http-server-request )))
(defn raw-method
  ([http-server-request ] (.rawMethod http-server-request )))
(defn remote-address
  ([http-server-request ] (.remoteAddress http-server-request )))
(defn response
  ([http-server-request ] (.response http-server-request )))
(defn resume
  ([http-server-request ] (.resume http-server-request )))
(defn scheme
  ([http-server-request ] (.scheme http-server-request )))
(defn set-expect-multipart
  ([http-server-request expect] (.setExpectMultipart http-server-request expect)))
(defn upgrade
  ([http-server-request ] (.upgrade http-server-request )))
(defn upload-handler
  ([http-server-request upload-handler] (.uploadHandler http-server-request upload-handler)))
(defn uri
  ([http-server-request ] (.uri http-server-request )))
(defn version
  ([http-server-request ] (.version http-server-request )))