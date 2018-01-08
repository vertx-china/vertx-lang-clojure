(ns io.vertx.clojure.http-client-request)

(import io.vertx.core.http.HttpClientRequest)
(import io.vertx.core.buffer.Buffer)
(import io.vertx.core.http.HttpFrame)
(import io.vertx.core.Handler)

(defn handler
  ([http-client-request handler] (.handler http-client-request handler)))
(defn stream-id
  ([http-client-request ] (.streamId http-client-request )))
(defn write-queue-full
  ([http-client-request ] (.writeQueueFull http-client-request )))
(defn absolute-uri
  ([http-client-request ] (.absoluteURI http-client-request )))
(defn push-handler
  ([http-client-request handler] (.pushHandler http-client-request handler)))
(defn set-follow-redirects
  ([http-client-request follow-redirects] (.setFollowRedirects http-client-request follow-redirects)))
(defn set-write-queue-max-size
  ([http-client-request max-size] (.setWriteQueueMaxSize http-client-request max-size)))
(defn path
  ([http-client-request ] (.path http-client-request )))
(defn drain-handler
  ([http-client-request handler] (.drainHandler http-client-request handler)))
(defn is-chunked
  ([http-client-request ] (.isChunked http-client-request )))
(defn connection-handler
  ([http-client-request handler] (.connectionHandler http-client-request handler)))
(defn write-custom-frame
  ([http-client-request type flags payload] (.writeCustomFrame http-client-request type flags payload))
  ([http-client-request frame] (.writeCustomFrame http-client-request frame)))
(defn get-raw-method
  ([http-client-request ] (.getRawMethod http-client-request )))
(defn end
  ([http-client-request chunk] (.end http-client-request chunk))
  ([http-client-request chunk enc] (.end http-client-request chunk enc))
  ([http-client-request chunk] (.end http-client-request chunk))
  ([http-client-request ] (.end http-client-request )))
(defn connection
  ([http-client-request ] (.connection http-client-request )))
(defn set-raw-method
  ([http-client-request method] (.setRawMethod http-client-request method)))
(defn write
  ([http-client-request data] (.write http-client-request data))
  ([http-client-request chunk] (.write http-client-request chunk))
  ([http-client-request chunk enc] (.write http-client-request chunk enc)))
(defn send-head
  ([http-client-request ] (.sendHead http-client-request ))
  ([http-client-request completion-handler] (.sendHead http-client-request completion-handler)))
(defn get-host
  ([http-client-request ] (.getHost http-client-request )))
(defn resume
  ([http-client-request ] (.resume http-client-request )))
(defn set-host
  ([http-client-request host] (.setHost http-client-request host)))
(defn headers
  ([http-client-request ] (.headers http-client-request )))
(defn method
  ([http-client-request ] (.method http-client-request )))
(defn query
  ([http-client-request ] (.query http-client-request )))
(defn set-chunked
  ([http-client-request chunked] (.setChunked http-client-request chunked)))
(defn uri
  ([http-client-request ] (.uri http-client-request )))
(defn pause
  ([http-client-request ] (.pause http-client-request )))
(defn continue-handler
  ([http-client-request handler] (.continueHandler http-client-request handler)))
(defn set-timeout
  ([http-client-request timeout-ms] (.setTimeout http-client-request timeout-ms)))
(defn end-handler
  ([http-client-request end-handler] (.endHandler http-client-request end-handler)))
(defn reset
  ([http-client-request ] (.reset http-client-request ))
  ([http-client-request code] (.reset http-client-request code)))
(defn put-header
  ([http-client-request name value] (.putHeader http-client-request name value)))
(defn exception-handler
  ([http-client-request handler] (.exceptionHandler http-client-request handler)))