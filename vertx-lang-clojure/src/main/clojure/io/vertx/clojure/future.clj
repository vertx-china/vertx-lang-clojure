(ns io.vertx.clojure.future)

(import io.vertx.core.Future)
(import io.vertx.core.Handler)
(import io.vertx.core.Future)
(import java.util.function.Function)

(defn otherwise
  ([future mapper] (.otherwise future mapper))
  ([future value] (.otherwise future value)))
(defn set-handler
  ([future handler] (.setHandler future handler)))
(defn recover
  ([future mapper] (.recover future mapper)))
(defn cause
  ([future ] (.cause future )))
(defn failed
  ([future ] (.failed future )))
(defn map-empty
  ([future ] (.mapEmpty future )))
(defn otherwise-empty
  ([future ] (.otherwiseEmpty future )))
(defn failed-future
  ([t] (Future/failedFuture t))
  ([failure-message] (Future/failedFuture failure-message)))
(defn result
  ([future ] (.result future )))
(defn fail
  ([future cause] (.fail future cause))
  ([future failure-message] (.fail future failure-message)))
(defn compose
  ([future handler next] (.compose future handler next))
  ([future mapper] (.compose future mapper)))
(defn future
  ([handler] (Future/future handler))
  ([] (Future/future )))
(defn succeeded-future
  ([] (Future/succeededFuture ))
  ([result] (Future/succeededFuture result)))
(defn try-complete
  ([future result] (.tryComplete future result))
  ([future ] (.tryComplete future )))
(defn completer
  ([future ] (.completer future )))
(defn complete
  ([future result] (.complete future result))
  ([future ] (.complete future )))
(defn try-fail
  ([future cause] (.tryFail future cause))
  ([future failure-message] (.tryFail future failure-message)))
(defn map
  ([future mapper] (.map future mapper))
  ([future value] (.map future value)))
(defn is-complete
  ([future ] (.isComplete future )))
(defn succeeded
  ([future ] (.succeeded future )))