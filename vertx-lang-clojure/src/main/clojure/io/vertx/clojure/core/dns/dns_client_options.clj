(ns io.vertx.clojure.core.dns.dns-client-options)

(import io.vertx.core.dns.DnsClientOptions)
(import io.vertx.core.json.JsonObject)

(defn new-instance
  ([] (new DnsClientOptions))
  ([^JsonObject json] (new DnsClientOptions json)))

(defn set-host [^DnsClientOptions dns-client-options host] (.setHost dns-client-options host))
(defn get-host [^DnsClientOptions dns-client-options] (.getHost dns-client-options))
(defn set-port [^DnsClientOptions dns-client-options port] (.setPort dns-client-options port))
(defn get-port [^DnsClientOptions dns-client-options] (.getPort dns-client-options))
(defn set-query-timeout [^DnsClientOptions dns-client-options query-timeout] (.setQueryTimeout dns-client-options query-timeout))
(defn get-query-timeout [^DnsClientOptions dns-client-options] (.getQueryTimeout dns-client-options))
(defn to-json [^DnsClientOptions dns-client-options] (.toJson dns-client-options))