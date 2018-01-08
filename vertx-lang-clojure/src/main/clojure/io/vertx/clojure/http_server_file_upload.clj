(ns io.vertx.clojure.http-server-file-upload)

(import io.vertx.core.http.HttpServerFileUpload)
(import io.vertx.core.Handler)

(defn resume
  ([http-server-file-upload ] (.resume http-server-file-upload )))
(defn handler
  ([http-server-file-upload handler] (.handler http-server-file-upload handler)))
(defn charset
  ([http-server-file-upload ] (.charset http-server-file-upload )))
(defn content-transfer-encoding
  ([http-server-file-upload ] (.contentTransferEncoding http-server-file-upload )))
(defn pause
  ([http-server-file-upload ] (.pause http-server-file-upload )))
(defn stream-to-file-system
  ([http-server-file-upload filename] (.streamToFileSystem http-server-file-upload filename)))
(defn filename
  ([http-server-file-upload ] (.filename http-server-file-upload )))
(defn size
  ([http-server-file-upload ] (.size http-server-file-upload )))
(defn end-handler
  ([http-server-file-upload end-handler] (.endHandler http-server-file-upload end-handler)))
(defn name
  ([http-server-file-upload ] (.name http-server-file-upload )))
(defn is-size-available
  ([http-server-file-upload ] (.isSizeAvailable http-server-file-upload )))
(defn exception-handler
  ([http-server-file-upload handler] (.exceptionHandler http-server-file-upload handler)))
(defn content-type
  ([http-server-file-upload ] (.contentType http-server-file-upload )))