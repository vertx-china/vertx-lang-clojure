(ns io.vertx.clojure.core.cli.argument)

(import io.vertx.core.cli.Argument)
(import io.vertx.core.json.JsonObject)

(defn new-instance
  ([^JsonObject json] (new Argument json)))

(defn set-arg-name [^Argument argument arg-name] (.setArgName argument arg-name))
(defn get-arg-name [^Argument argument] (.getArgName argument))
(defn set-default-value [^Argument argument default-value] (.setDefaultValue argument default-value))
(defn get-default-value [^Argument argument] (.getDefaultValue argument))
(defn set-description [^Argument argument description] (.setDescription argument description))
(defn get-description [^Argument argument] (.getDescription argument))
(defn set-hidden [^Argument argument hidden] (.setHidden argument hidden))
(defn is-hidden [^Argument argument] (.isHidden argument))
(defn set-index [^Argument argument index] (.setIndex argument index))
(defn get-index [^Argument argument] (.getIndex argument))
(defn set-multi-valued [^Argument argument multi-valued] (.setMultiValued argument multi-valued))
(defn is-multi-valued [^Argument argument] (.isMultiValued argument))
(defn set-required [^Argument argument required] (.setRequired argument required))
(defn is-required [^Argument argument] (.isRequired argument))
(defn to-json [^Argument argument] (.toJson argument))