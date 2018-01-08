(ns io.vertx.clojure.http-server-response)

(import io.vertx.core.http.HttpServerResponse)
(import io.vertx.core.buffer.Buffer)
(import io.vertx.core.http.HttpFrame)
(import io.vertx.core.http.HttpMethod)
(import io.vertx.core.MultiMap)
(import io.vertx.core.Handler)

(defn get-status-message
  ([http-server-response ] (.getStatusMessage http-server-response )))
(defn stream-id
  ([http-server-response ] (.streamId http-server-response )))
(defn write-continue
  ([http-server-response ] (.writeContinue http-server-response )))
(defn write-queue-full
  ([http-server-response ] (.writeQueueFull http-server-response )))
(defn set-write-queue-max-size
  ([http-server-response max-size] (.setWriteQueueMaxSize http-server-response max-size)))
(defn body-end-handler
  ([http-server-response handler] (.bodyEndHandler http-server-response handler)))
(defn drain-handler
  ([http-server-response handler] (.drainHandler http-server-response handler)))
(defn is-chunked
  ([http-server-response ] (.isChunked http-server-response )))
(defn write-custom-frame
  ([http-server-response type flags payload] (.writeCustomFrame http-server-response type flags payload))
  ([http-server-response frame] (.writeCustomFrame http-server-response frame)))
(defn end
  ([http-server-response chunk] (.end http-server-response chunk))
  ([http-server-response chunk enc] (.end http-server-response chunk enc))
  ([http-server-response chunk] (.end http-server-response chunk))
  ([http-server-response ] (.end http-server-response )))
(defn write
  ([http-server-response data] (.write http-server-response data))
  ([http-server-response chunk enc] (.write http-server-response chunk enc))
  ([http-server-response chunk] (.write http-server-response chunk)))
(defn close
  ([http-server-response ] (.close http-server-response )))
(defn head-written
  ([http-server-response ] (.headWritten http-server-response )))
(defn headers-end-handler
  ([http-server-response handler] (.headersEndHandler http-server-response handler)))
(defn bytes-written
  ([http-server-response ] (.bytesWritten http-server-response )))
(defn headers
  ([http-server-response ] (.headers http-server-response )))
(defn set-status-message
  ([http-server-response status-message] (.setStatusMessage http-server-response status-message)))
(defn set-status-code
  ([http-server-response status-code] (.setStatusCode http-server-response status-code)))
(defn put-trailer
  ([http-server-response name value] (.putTrailer http-server-response name value)))
(defn set-chunked
  ([http-server-response chunked] (.setChunked http-server-response chunked)))
(defn close-handler
  ([http-server-response handler] (.closeHandler http-server-response handler)))
(defn push
  ([http-server-response method host path handler] (.push http-server-response method host path handler))
  ([http-server-response method path headers handler] (.push http-server-response method path headers handler))
  ([http-server-response method path handler] (.push http-server-response method path handler))
  ([http-server-response method host path headers handler] (.push http-server-response method host path headers handler)))
(defn trailers
  ([http-server-response ] (.trailers http-server-response )))
(defn send-file
  ([http-server-response filename] (.sendFile http-server-response filename))
  ([http-server-response filename offset] (.sendFile http-server-response filename offset))
  ([http-server-response filename offset length] (.sendFile http-server-response filename offset length))
  ([http-server-response filename result-handler] (.sendFile http-server-response filename result-handler))
  ([http-server-response filename offset result-handler] (.sendFile http-server-response filename offset result-handler))
  ([http-server-response filename offset length result-handler] (.sendFile http-server-response filename offset length result-handler)))
(defn get-status-code
  ([http-server-response ] (.getStatusCode http-server-response )))
(defn end-handler
  ([http-server-response handler] (.endHandler http-server-response handler)))
(defn ended
  ([http-server-response ] (.ended http-server-response )))
(defn closed
  ([http-server-response ] (.closed http-server-response )))
(defn reset
  ([http-server-response ] (.reset http-server-response ))
  ([http-server-response code] (.reset http-server-response code)))
(defn put-header
  ([http-server-response name value] (.putHeader http-server-response name value)))
(defn exception-handler
  ([http-server-response handler] (.exceptionHandler http-server-response handler)))