(ns io.vertx.clojure.core.parsetools.record-parser)

(import io.vertx.core.Handler)
(import io.vertx.core.buffer.Buffer)
(import io.vertx.core.parsetools.RecordParser)
(import io.vertx.core.streams.ReadStream)
(import io.vertx.core.streams.WriteStream)

(defn delimited-mode
  ([record-parser delim] (.delimitedMode record-parser delim)))
(defn end-handler
  ([record-parser end-handler] (.endHandler record-parser end-handler)))
(defn exception-handler
  ([record-parser handler] (.exceptionHandler record-parser handler)))
(defn fetch
  ([record-parser amount] (.fetch record-parser amount)))
(defn fixed-size-mode
  ([record-parser size] (.fixedSizeMode record-parser size)))
(defn handle
  ([record-parser buffer] (.handle record-parser buffer)))
(defn handler
  ([f]
    (reify
     io.vertx.core.Handler
     (handle [this para]
           (f para))))
  ([record-parser handler] (.handler record-parser handler)))
(defn max-record-size
  ([record-parser size] (.maxRecordSize record-parser size)))
(defn new-delimited
  ([delim stream-or-output] (RecordParser/newDelimited delim stream-or-output))
  ([delim] (RecordParser/newDelimited delim)))
(defn new-fixed
  ([size] (RecordParser/newFixed size))
  ([size stream-or-output] (RecordParser/newFixed size stream-or-output)))
(defn pause
  ([record-parser] (.pause record-parser)))
(defn pipe
  ([record-parser] (.pipe record-parser)))
(defn pipe-to
  ([record-parser dst handler] (.pipeTo record-parser dst handler)))
(defn resume
  ([record-parser] (.resume record-parser)))
(defn set-output
  ([record-parser output] (.setOutput record-parser output)))