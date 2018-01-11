(ns io.vertx.clojure.core.file.copy-options)

(import io.vertx.core.file.CopyOptions)
(import io.vertx.core.json.JsonObject)

(defn new-instance
  ([] (new CopyOptions))
  ([^JsonObject json] (new CopyOptions json)))

(defn set-atomic-move [^CopyOptions copy-options atomic-move] (.setAtomicMove copy-options atomic-move))
(defn is-atomic-move [^CopyOptions copy-options] (.isAtomicMove copy-options))
(defn set-copy-attributes [^CopyOptions copy-options copy-attributes] (.setCopyAttributes copy-options copy-attributes))
(defn is-copy-attributes [^CopyOptions copy-options] (.isCopyAttributes copy-options))
(defn set-nofollow-links [^CopyOptions copy-options nofollow-links] (.setNofollowLinks copy-options nofollow-links))
(defn is-nofollow-links [^CopyOptions copy-options] (.isNofollowLinks copy-options))
(defn set-replace-existing [^CopyOptions copy-options replace-existing] (.setReplaceExisting copy-options replace-existing))
(defn is-replace-existing [^CopyOptions copy-options] (.isReplaceExisting copy-options))