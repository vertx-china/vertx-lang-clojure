(ns io.vertx.clojure.core.http.http-server-file-upload)

(import io.vertx.core.Handler)
(import io.vertx.core.http.HttpServerFileUpload)
(import io.vertx.core.streams.WriteStream)

(defn charset
  ([http-server-file-upload] (.charset http-server-file-upload)))
(defn content-transfer-encoding
  ([http-server-file-upload] (.contentTransferEncoding http-server-file-upload)))
(defn content-type
  ([http-server-file-upload] (.contentType http-server-file-upload)))
(defn end-handler
  ([http-server-file-upload end-handler] (.endHandler http-server-file-upload end-handler)))
(defn exception-handler
  ([http-server-file-upload handler] (.exceptionHandler http-server-file-upload handler)))
(defn fetch
  ([http-server-file-upload amount] (.fetch http-server-file-upload amount)))
(defn file
  ([http-server-file-upload] (.file http-server-file-upload)))
(defn filename
  ([http-server-file-upload] (.filename http-server-file-upload)))
(defn handler
  ([f]
    (reify
     io.vertx.core.Handler
     (handle [this para]
           (f para))))
  ([http-server-file-upload handler] (.handler http-server-file-upload handler)))
(defn is-size-available
  ([http-server-file-upload] (.isSizeAvailable http-server-file-upload)))
(defn name
  ([http-server-file-upload] (.name http-server-file-upload)))
(defn pause
  ([http-server-file-upload] (.pause http-server-file-upload)))
(defn pipe
  ([http-server-file-upload] (.pipe http-server-file-upload)))
(defn pipe-to
  ([http-server-file-upload dst] (.pipeTo http-server-file-upload dst))
  ([http-server-file-upload dst handler] (.pipeTo http-server-file-upload dst handler)))
(defn resume
  ([http-server-file-upload] (.resume http-server-file-upload)))
(defn size
  ([http-server-file-upload] (.size http-server-file-upload)))
(defn stream-to-file-system
  ([http-server-file-upload filename] (.streamToFileSystem http-server-file-upload filename)))