(ns io.vertx.lang.clojure.record-parser)

(import io.vertx.core.parsetools.RecordParser)
(import io.vertx.core.buffer.Buffer)
(import io.vertx.core.streams.ReadStream)
(import io.vertx.core.Handler)

(defn delimited-mode
  ([record-parser delim] (.delimitedMode record-parser delim)))
(defn end-handler
  ([record-parser end-handler] (.endHandler record-parser end-handler)))
(defn exception-handler
  ([record-parser handler] (.exceptionHandler record-parser handler)))
(defn fixed-size-mode
  ([record-parser size] (.fixedSizeMode record-parser size)))
(defn handle
  ([record-parser buffer] (.handle record-parser buffer)))
(defn handler
  ([record-parser handler] (.handler record-parser handler)))
(defn new-delimited
  ([delim stream-or-output] (RecordParser/newDelimited delim stream-or-output))
  ([delim] (RecordParser/newDelimited delim)))
(defn new-fixed
  ([size] (RecordParser/newFixed size))
  ([size stream-or-output] (RecordParser/newFixed size stream-or-output)))
(defn pause
  ([record-parser ] (.pause record-parser )))
(defn resume
  ([record-parser ] (.resume record-parser )))
(defn set-output
  ([record-parser output] (.setOutput record-parser output)))