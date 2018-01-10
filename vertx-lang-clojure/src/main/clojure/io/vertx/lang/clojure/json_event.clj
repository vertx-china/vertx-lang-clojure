(ns io.vertx.lang.clojure.json-event)

(import io.vertx.core.parsetools.JsonEvent)

(defn array-value
  ([json-event ] (.arrayValue json-event )))
(defn binary-value
  ([json-event ] (.binaryValue json-event )))
(defn boolean-value
  ([json-event ] (.booleanValue json-event )))
(defn double-value
  ([json-event ] (.doubleValue json-event )))
(defn field-name
  ([json-event ] (.fieldName json-event )))
(defn float-value
  ([json-event ] (.floatValue json-event )))
(defn integer-value
  ([json-event ] (.integerValue json-event )))
(defn is-array
  ([json-event ] (.isArray json-event )))
(defn is-boolean
  ([json-event ] (.isBoolean json-event )))
(defn is-null
  ([json-event ] (.isNull json-event )))
(defn is-number
  ([json-event ] (.isNumber json-event )))
(defn is-object
  ([json-event ] (.isObject json-event )))
(defn is-string
  ([json-event ] (.isString json-event )))
(defn long-value
  ([json-event ] (.longValue json-event )))
(defn map-to
  ([json-event type] (.mapTo json-event type)))
(defn object-value
  ([json-event ] (.objectValue json-event )))
(defn string-value
  ([json-event ] (.stringValue json-event )))
(defn type
  ([json-event ] (.type json-event )))
(defn value
  ([json-event ] (.value json-event )))