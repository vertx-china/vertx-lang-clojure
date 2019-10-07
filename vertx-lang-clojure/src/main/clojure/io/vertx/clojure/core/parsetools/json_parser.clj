(ns io.vertx.clojure.core.parsetools.json-parser)

(import io.vertx.core.Handler)
(import io.vertx.core.buffer.Buffer)
(import io.vertx.core.parsetools.JsonParser)
(import io.vertx.core.streams.ReadStream)
(import io.vertx.core.streams.WriteStream)

(defn array-event-mode
  ([json-parser] (.arrayEventMode json-parser)))
(defn array-value-mode
  ([json-parser] (.arrayValueMode json-parser)))
(defn end
  ([json-parser] (.end json-parser)))
(defn end-handler
  ([json-parser end-handler] (.endHandler json-parser end-handler)))
(defn exception-handler
  ([json-parser handler] (.exceptionHandler json-parser handler)))
(defn fetch
  ([json-parser amount] (.fetch json-parser amount)))
(defn handle
  ([json-parser event] (.handle json-parser event)))
(defn handler
  ([f]
    (reify
     io.vertx.core.Handler
     (handle [this para]
           (f para))))
  ([json-parser handler] (.handler json-parser handler)))
(defn new-parser
  ([] (JsonParser/newParser))
  ([stream] (JsonParser/newParser stream)))
(defn object-event-mode
  ([json-parser] (.objectEventMode json-parser)))
(defn object-value-mode
  ([json-parser] (.objectValueMode json-parser)))
(defn pause
  ([json-parser] (.pause json-parser)))
(defn pipe
  ([json-parser] (.pipe json-parser)))
(defn pipe-to
  ([json-parser dst] (.pipeTo json-parser dst))
  ([json-parser dst handler] (.pipeTo json-parser dst handler)))
(defn resume
  ([json-parser] (.resume json-parser)))
(defn write
  ([json-parser buffer] (.write json-parser buffer)))