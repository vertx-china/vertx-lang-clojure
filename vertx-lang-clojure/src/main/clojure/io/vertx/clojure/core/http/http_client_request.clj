(ns io.vertx.clojure.core.http.http-client-request)

(import io.vertx.core.Handler)
(import io.vertx.core.buffer.Buffer)
(import io.vertx.core.http.HttpClientRequest)
(import io.vertx.core.http.HttpClientResponse)
(import io.vertx.core.http.HttpFrame)
(import io.vertx.core.http.StreamPriority)
(import java.util.function.Function)

(defn absolute-uri
  ([http-client-request] (.absoluteURI http-client-request)))
(defn compose
  ([http-client-request mapper] (.compose http-client-request mapper))
  ([http-client-request success-mapper failure-mapper] (.compose http-client-request success-mapper failure-mapper)))
(defn connection
  ([http-client-request] (.connection http-client-request)))
(defn continue-handler
  ([http-client-request handler] (.continueHandler http-client-request handler)))
(defn drain-handler
  ([http-client-request handler] (.drainHandler http-client-request handler)))
(defn end
  ([http-client-request chunk handler] (.end http-client-request chunk handler))
  ([http-client-request chunk enc handler] (.end http-client-request chunk enc handler))
  ([http-client-request handler] (.end http-client-request handler)))
(defn exception-handler
  ([http-client-request handler] (.exceptionHandler http-client-request handler)))
(defn flat-map
  ([http-client-request mapper] (.flatMap http-client-request mapper)))
(defn get-authority
  ([http-client-request] (.getAuthority http-client-request)))
(defn get-handler
  ([http-client-request] (.getHandler http-client-request)))
(defn get-stream-priority
  ([http-client-request] (.getStreamPriority http-client-request)))
(defn headers
  ([http-client-request] (.headers http-client-request)))
(defn is-chunked
  ([http-client-request] (.isChunked http-client-request)))
(defn map
  ([http-client-request mapper] (.map http-client-request mapper)))
(defn method
  ([http-client-request] (.method http-client-request)))
(defn net-socket
  ([http-client-request handler] (.netSocket http-client-request handler)))
(defn on-complete
  ([http-client-request handler] (.onComplete http-client-request handler)))
(defn on-failure
  ([http-client-request handler] (.onFailure http-client-request handler)))
(defn on-success
  ([http-client-request handler] (.onSuccess http-client-request handler)))
(defn otherwise
  ([http-client-request value-or-mapper] (.otherwise http-client-request value-or-mapper)))
(defn otherwise-empty
  ([http-client-request] (.otherwiseEmpty http-client-request)))
(defn path
  ([http-client-request] (.path http-client-request)))
(defn push-handler
  ([http-client-request handler] (.pushHandler http-client-request handler)))
(defn put-header
  ([http-client-request name value] (.putHeader http-client-request name value)))
(defn query
  ([http-client-request] (.query http-client-request)))
(defn recover
  ([http-client-request mapper] (.recover http-client-request mapper)))
(defn reset
  ([http-client-request] (.reset http-client-request))
  ([http-client-request code] (.reset http-client-request code)))
(defn result
  ([http-client-request] (.result http-client-request)))
(defn send-head
  ([http-client-request completion-handler] (.sendHead http-client-request completion-handler)))
(defn set-authority
  ([http-client-request authority] (.setAuthority http-client-request authority)))
(defn set-chunked
  ([http-client-request chunked] (.setChunked http-client-request chunked)))
(defn set-follow-redirects
  ([http-client-request follow-redirects] (.setFollowRedirects http-client-request follow-redirects)))
(defn set-handler
  ([http-client-request handler] (.setHandler http-client-request handler)))
(defn set-max-redirects
  ([http-client-request max-redirects] (.setMaxRedirects http-client-request max-redirects)))
(defn set-stream-priority
  ([http-client-request stream-priority] (.setStreamPriority http-client-request stream-priority)))
(defn set-timeout
  ([http-client-request timeout-ms] (.setTimeout http-client-request timeout-ms)))
(defn set-write-queue-max-size
  ([http-client-request max-size] (.setWriteQueueMaxSize http-client-request max-size)))
(defn stream-id
  ([http-client-request] (.streamId http-client-request)))
(defn uri
  ([http-client-request] (.uri http-client-request)))
(defn write
  ([http-client-request chunk-or-data handler] (.write http-client-request chunk-or-data handler))
  ([http-client-request chunk enc handler] (.write http-client-request chunk enc handler)))
(defn write-custom-frame
  ([http-client-request type flags payload] (.writeCustomFrame http-client-request type flags payload))
  ([http-client-request frame] (.writeCustomFrame http-client-request frame)))
(defn write-queue-full
  ([http-client-request] (.writeQueueFull http-client-request)))
(defn handler [f]
  (reify
   io.vertx.core.Handler
   (handle [this para]
           (f para))))
(defn function [f]
  (reify
   java.util.function.Function
   (apply [this para]
           (f para))))