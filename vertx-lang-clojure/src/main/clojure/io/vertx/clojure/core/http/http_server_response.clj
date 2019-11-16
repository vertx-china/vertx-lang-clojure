(ns io.vertx.clojure.core.http.http-server-response)

(import io.vertx.core.Handler)
(import io.vertx.core.MultiMap)
(import io.vertx.core.buffer.Buffer)
(import io.vertx.core.http.Cookie)
(import io.vertx.core.http.HttpFrame)
(import io.vertx.core.http.HttpMethod)
(import io.vertx.core.http.HttpServerResponse)
(import io.vertx.core.http.StreamPriority)

(defn add-cookie
  ([http-server-response cookie] (.addCookie http-server-response cookie)))
(defn body-end-handler
  ([http-server-response handler] (.bodyEndHandler http-server-response handler)))
(defn bytes-written
  ([http-server-response] (.bytesWritten http-server-response)))
(defn close
  ([http-server-response] (.close http-server-response)))
(defn close-handler
  ([http-server-response handler] (.closeHandler http-server-response handler)))
(defn closed
  ([http-server-response] (.closed http-server-response)))
(defn drain-handler
  ([http-server-response handler] (.drainHandler http-server-response handler)))
(defn end
  ([http-server-response handler] (.end http-server-response handler))
  ([http-server-response chunk handler] (.end http-server-response chunk handler))
  ([http-server-response chunk enc handler] (.end http-server-response chunk enc handler)))
(defn end-handler
  ([http-server-response handler] (.endHandler http-server-response handler)))
(defn ended
  ([http-server-response] (.ended http-server-response)))
(defn exception-handler
  ([http-server-response handler] (.exceptionHandler http-server-response handler)))
(defn get-status-code
  ([http-server-response] (.getStatusCode http-server-response)))
(defn get-status-message
  ([http-server-response] (.getStatusMessage http-server-response)))
(defn head-written
  ([http-server-response] (.headWritten http-server-response)))
(defn headers
  ([http-server-response] (.headers http-server-response)))
(defn headers-end-handler
  ([http-server-response handler] (.headersEndHandler http-server-response handler)))
(defn is-chunked
  ([http-server-response] (.isChunked http-server-response)))
(defn push
  ([http-server-response method path-or-host headers-or-path handler] (.push http-server-response method path-or-host headers-or-path handler))
  ([http-server-response method path handler] (.push http-server-response method path handler))
  ([http-server-response method host path headers handler] (.push http-server-response method host path headers handler)))
(defn put-header
  ([http-server-response name value] (.putHeader http-server-response name value)))
(defn put-trailer
  ([http-server-response name value] (.putTrailer http-server-response name value)))
(defn remove-cookie
  ([http-server-response name] (.removeCookie http-server-response name))
  ([http-server-response name invalidate] (.removeCookie http-server-response name invalidate)))
(defn reset
  ([http-server-response] (.reset http-server-response))
  ([http-server-response code] (.reset http-server-response code)))
(defn send-file
  ([http-server-response filename result-handler] (.sendFile http-server-response filename result-handler))
  ([http-server-response filename offset result-handler] (.sendFile http-server-response filename offset result-handler))
  ([http-server-response filename offset length result-handler] (.sendFile http-server-response filename offset length result-handler)))
(defn set-chunked
  ([http-server-response chunked] (.setChunked http-server-response chunked)))
(defn set-status-code
  ([http-server-response status-code] (.setStatusCode http-server-response status-code)))
(defn set-status-message
  ([http-server-response status-message] (.setStatusMessage http-server-response status-message)))
(defn set-stream-priority
  ([http-server-response stream-priority] (.setStreamPriority http-server-response stream-priority)))
(defn set-write-queue-max-size
  ([http-server-response max-size] (.setWriteQueueMaxSize http-server-response max-size)))
(defn stream-id
  ([http-server-response] (.streamId http-server-response)))
(defn trailers
  ([http-server-response] (.trailers http-server-response)))
(defn write
  ([http-server-response chunk-or-data handler] (.write http-server-response chunk-or-data handler))
  ([http-server-response chunk enc handler] (.write http-server-response chunk enc handler)))
(defn write-continue
  ([http-server-response] (.writeContinue http-server-response)))
(defn write-custom-frame
  ([http-server-response type flags payload] (.writeCustomFrame http-server-response type flags payload))
  ([http-server-response frame] (.writeCustomFrame http-server-response frame)))
(defn write-queue-full
  ([http-server-response] (.writeQueueFull http-server-response)))
(defn handler [f]
  (reify
   io.vertx.core.Handler
   (handle [this para]
           (f para))))