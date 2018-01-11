(ns io.vertx.clojure.core.file.async-file)

(import io.vertx.core.file.AsyncFile)
(import io.vertx.core.buffer.Buffer)
(import io.vertx.core.Handler)

(defn close
  ([async-file ] (.close async-file ))
  ([async-file handler] (.close async-file handler)))
(defn drain-handler
  ([async-file handler] (.drainHandler async-file handler)))
(defn end
  ([async-file t] (.end async-file t))
  ([async-file ] (.end async-file )))
(defn end-handler
  ([async-file end-handler] (.endHandler async-file end-handler)))
(defn exception-handler
  ([async-file handler] (.exceptionHandler async-file handler)))
(defn flush
  ([async-file ] (.flush async-file ))
  ([async-file handler] (.flush async-file handler)))
(defn handler
  ([async-file handler] (.handler async-file handler)))
(defn pause
  ([async-file ] (.pause async-file )))
(defn read
  ([async-file buffer offset position length handler] (.read async-file buffer offset position length handler)))
(defn resume
  ([async-file ] (.resume async-file )))
(defn set-read-buffer-size
  ([async-file read-buffer-size] (.setReadBufferSize async-file read-buffer-size)))
(defn set-read-pos
  ([async-file read-pos] (.setReadPos async-file read-pos)))
(defn set-write-pos
  ([async-file write-pos] (.setWritePos async-file write-pos)))
(defn set-write-queue-max-size
  ([async-file max-size] (.setWriteQueueMaxSize async-file max-size)))
(defn write
  ([async-file data] (.write async-file data))
  ([async-file buffer position handler] (.write async-file buffer position handler)))
(defn write-queue-full
  ([async-file ] (.writeQueueFull async-file )))
(defn handler [f]
  (reify
   io.vertx.core.Handler
   (handle [this para]
           (f para))))