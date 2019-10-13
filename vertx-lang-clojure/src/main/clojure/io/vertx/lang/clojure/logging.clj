(ns io.vertx.lang.clojure.logging)


(import io.vertx.core.logging.Logger)
(import io.vertx.core.logging.LoggerFactory)

(defn create-logger
  ([^String name] (LoggerFactory/getLogger name)))

(defn info
  ([^Logger logger message] (.info logger message))
  ([^Logger logger message & rest] (.info logger message rest)))

(defn trace
  ([^Logger logger message] (.trace logger message))
  ([^Logger logger message & rest] (.trace logger message rest)))

(defn debug
  ([^Logger logger message] (.debug logger message))
  ([^Logger logger message & rest] (.debug logger message rest)))

(defn warn
  ([^Logger logger message] (.warn logger message))
  ([^Logger logger message & rest] (.warn logger message rest)))

(defn error
  ([^Logger logger message] (.error logger message))
  ([^Logger logger message & rest] (.error logger message rest)))
