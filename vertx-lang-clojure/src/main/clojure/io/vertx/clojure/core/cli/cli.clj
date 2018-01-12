(ns io.vertx.clojure.core.cli.cli)

(import io.vertx.core.cli.Argument)
(import io.vertx.core.cli.CLI)
(import io.vertx.core.cli.Option)
(import java.util.List)

(defn add-argument
  ([cli arg] (.addArgument cli arg)))
(defn add-arguments
  ([cli args] (.addArguments cli args)))
(defn add-option
  ([cli option] (.addOption cli option)))
(defn add-options
  ([cli options] (.addOptions cli options)))
(defn create
  ([name] (CLI/create name)))
(defn get-argument
  ([cli index-or-name] (.getArgument cli index-or-name)))
(defn get-arguments
  ([cli ] (.getArguments cli )))
(defn get-description
  ([cli ] (.getDescription cli )))
(defn get-name
  ([cli ] (.getName cli )))
(defn get-option
  ([cli name] (.getOption cli name)))
(defn get-options
  ([cli ] (.getOptions cli )))
(defn get-summary
  ([cli ] (.getSummary cli )))
(defn is-hidden
  ([cli ] (.isHidden cli )))
(defn parse
  ([cli arguments] (.parse cli arguments))
  ([cli arguments validate] (.parse cli arguments validate)))
(defn remove-argument
  ([cli index] (.removeArgument cli index)))
(defn remove-option
  ([cli name] (.removeOption cli name)))
(defn set-arguments
  ([cli args] (.setArguments cli args)))
(defn set-description
  ([cli desc] (.setDescription cli desc)))
(defn set-hidden
  ([cli hidden] (.setHidden cli hidden)))
(defn set-name
  ([cli name] (.setName cli name)))
(defn set-options
  ([cli options] (.setOptions cli options)))
(defn set-summary
  ([cli summary] (.setSummary cli summary)))