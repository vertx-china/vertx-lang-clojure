(ns io.vertx.clojure.record-parser)

(import io.vertx.core.parsetools.RecordParser)
(import io.vertx.core.buffer.Buffer)
(import io.vertx.core.streams.ReadStream)
(import io.vertx.core.Handler)

(defn resume
  ([record-parser ] (.resume record-parser )))
(defn handler
  ([record-parser handler] (.handler record-parser handler)))
(defn fixed-size-mode
  ([record-parser size] (.fixedSizeMode record-parser size)))
(defn end-handler
  ([record-parser end-handler] (.endHandler record-parser end-handler)))
(defn new-fixed
  ([size] (RecordParser/newFixed size))
  ([size output] (RecordParser/newFixed size output))
  ([size stream] (RecordParser/newFixed size stream)))
(defn handle
  ([record-parser buffer] (.handle record-parser buffer)))
(defn delimited-mode
  ([record-parser delim] (.delimitedMode record-parser delim))
  ([record-parser delim] (.delimitedMode record-parser delim)))
(defn exception-handler
  ([record-parser handler] (.exceptionHandler record-parser handler)))
(defn set-output
  ([record-parser output] (.setOutput record-parser output)))
(defn pause
  ([record-parser ] (.pause record-parser )))
(defn new-delimited
  ([delim output] (RecordParser/newDelimited delim output))
  ([delim stream] (RecordParser/newDelimited delim stream))
  ([delim] (RecordParser/newDelimited delim))
  ([delim] (RecordParser/newDelimited delim))
  ([delim output] (RecordParser/newDelimited delim output))
  ([delim stream] (RecordParser/newDelimited delim stream)))