(ns io.vertx.clojure.cli)

(import io.vertx.core.cli.CLI)
(import io.vertx.core.cli.Option)
(import io.vertx.core.cli.Argument)

(defn set-name
  ([cli name] (.setName cli name)))
(defn set-summary
  ([cli summary] (.setSummary cli summary)))
(defn add-arguments
  ([cli args] (.addArguments cli args)))
(defn get-name
  ([cli ] (.getName cli )))
(defn get-summary
  ([cli ] (.getSummary cli )))
(defn get-option
  ([cli name] (.getOption cli name)))
(defn get-argument
  ([cli name] (.getArgument cli name))
  ([cli index] (.getArgument cli index)))
(defn parse
  ([cli arguments] (.parse cli arguments))
  ([cli arguments validate] (.parse cli arguments validate)))
(defn set-description
  ([cli desc] (.setDescription cli desc)))
(defn get-description
  ([cli ] (.getDescription cli )))
(defn is-hidden
  ([cli ] (.isHidden cli )))
(defn remove-option
  ([cli name] (.removeOption cli name)))
(defn add-argument
  ([cli arg] (.addArgument cli arg)))
(defn add-option
  ([cli option] (.addOption cli option)))
(defn remove-argument
  ([cli index] (.removeArgument cli index)))
(defn set-hidden
  ([cli hidden] (.setHidden cli hidden)))
(defn create
  ([name] (CLI/create name)))
(defn set-options
  ([cli options] (.setOptions cli options)))
(defn get-arguments
  ([cli ] (.getArguments cli )))
(defn set-arguments
  ([cli args] (.setArguments cli args)))
(defn get-options
  ([cli ] (.getOptions cli )))
(defn add-options
  ([cli options] (.addOptions cli options)))