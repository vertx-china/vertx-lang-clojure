(ns io.vertx.clojure.core.dns.dns-client)

(import io.vertx.core.dns.DnsClient)
(import io.vertx.core.Handler)

(defn lookup
  ([dns-client name handler] (.lookup dns-client name handler)))
(defn lookup4
  ([dns-client name handler] (.lookup4 dns-client name handler)))
(defn lookup6
  ([dns-client name handler] (.lookup6 dns-client name handler)))
(defn resolve-a
  ([dns-client name handler] (.resolveA dns-client name handler)))
(defn resolve-aaaa
  ([dns-client name handler] (.resolveAAAA dns-client name handler)))
(defn resolve-cname
  ([dns-client name handler] (.resolveCNAME dns-client name handler)))
(defn resolve-mx
  ([dns-client name handler] (.resolveMX dns-client name handler)))
(defn resolve-ns
  ([dns-client name handler] (.resolveNS dns-client name handler)))
(defn resolve-ptr
  ([dns-client name handler] (.resolvePTR dns-client name handler)))
(defn resolve-srv
  ([dns-client name handler] (.resolveSRV dns-client name handler)))
(defn resolve-txt
  ([dns-client name handler] (.resolveTXT dns-client name handler)))
(defn reverse-lookup
  ([dns-client ipaddress handler] (.reverseLookup dns-client ipaddress handler)))