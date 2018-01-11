(ns io.vertx.clojure.core.parsetools.json-parser)

(import io.vertx.core.parsetools.JsonParser)
(import io.vertx.core.buffer.Buffer)
(import io.vertx.core.streams.ReadStream)
(import io.vertx.core.Handler)

(defn array-event-mode
  ([json-parser ] (.arrayEventMode json-parser )))
(defn array-value-mode
  ([json-parser ] (.arrayValueMode json-parser )))
(defn end
  ([json-parser ] (.end json-parser )))
(defn end-handler
  ([json-parser end-handler] (.endHandler json-parser end-handler)))
(defn exception-handler
  ([json-parser handler] (.exceptionHandler json-parser handler)))
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
  ([] (JsonParser/newParser ))
  ([stream] (JsonParser/newParser stream)))
(defn object-event-mode
  ([json-parser ] (.objectEventMode json-parser )))
(defn object-value-mode
  ([json-parser ] (.objectValueMode json-parser )))
(defn pause
  ([json-parser ] (.pause json-parser )))
(defn resume
  ([json-parser ] (.resume json-parser )))
(defn write
  ([json-parser buffer] (.write json-parser buffer)))