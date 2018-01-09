(ns io.vertx.clojure.future)

(import io.vertx.core.Future)
(import io.vertx.core.Handler)
(import io.vertx.core.Future)
(import java.util.function.Function)

(defn cause
  ([future ] (.cause future )))
(defn complete
  ([future result] (.complete future result))
  ([future ] (.complete future )))
(defn completer
  ([future ] (.completer future )))
(defn compose
  ([future handler next] (.compose future handler next))
  ([future mapper] (.compose future mapper)))
(defn fail
  ([future failure-message-or-cause] (.fail future failure-message-or-cause)))
(defn failed
  ([future ] (.failed future )))
(defn failed-future
  ([failure-message-or-t] (Future/failedFuture failure-message-or-t)))
(defn future
  ([handler] (Future/future handler))
  ([] (Future/future )))
(defn is-complete
  ([future ] (.isComplete future )))
(defn map
  ([future value-or-mapper] (.map future value-or-mapper)))
(defn map-empty
  ([future ] (.mapEmpty future )))
(defn otherwise
  ([future value-or-mapper] (.otherwise future value-or-mapper)))
(defn otherwise-empty
  ([future ] (.otherwiseEmpty future )))
(defn recover
  ([future mapper] (.recover future mapper)))
(defn result
  ([future ] (.result future )))
(defn set-handler
  ([future handler] (.setHandler future handler)))
(defn succeeded
  ([future ] (.succeeded future )))
(defn succeeded-future
  ([] (Future/succeededFuture ))
  ([result] (Future/succeededFuture result)))
(defn try-complete
  ([future result] (.tryComplete future result))
  ([future ] (.tryComplete future )))
(defn try-fail
  ([future failure-message-or-cause] (.tryFail future failure-message-or-cause)))