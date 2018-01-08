(ns io.vertx.clojure.async-file)

(import io.vertx.core.file.AsyncFile)
(import io.vertx.core.buffer.Buffer)
(import io.vertx.core.Handler)

(defn resume
  ([async-file ] (.resume async-file )))
(defn set-read-buffer-size
  ([async-file read-buffer-size] (.setReadBufferSize async-file read-buffer-size)))
(defn handler
  ([async-file handler] (.handler async-file handler)))
(defn read
  ([async-file buffer offset position length handler] (.read async-file buffer offset position length handler)))
(defn write-queue-full
  ([async-file ] (.writeQueueFull async-file )))
(defn pause
  ([async-file ] (.pause async-file )))
(defn set-write-queue-max-size
  ([async-file max-size] (.setWriteQueueMaxSize async-file max-size)))
(defn drain-handler
  ([async-file handler] (.drainHandler async-file handler)))
(defn flush
  ([async-file ] (.flush async-file ))
  ([async-file handler] (.flush async-file handler)))
(defn set-write-pos
  ([async-file write-pos] (.setWritePos async-file write-pos)))
(defn end-handler
  ([async-file end-handler] (.endHandler async-file end-handler)))
(defn end
  ([async-file t] (.end async-file t))
  ([async-file ] (.end async-file )))
(defn write
  ([async-file data] (.write async-file data))
  ([async-file buffer position handler] (.write async-file buffer position handler)))
(defn exception-handler
  ([async-file handler] (.exceptionHandler async-file handler)))
(defn close
  ([async-file ] (.close async-file ))
  ([async-file handler] (.close async-file handler)))
(defn set-read-pos
  ([async-file read-pos] (.setReadPos async-file read-pos)))