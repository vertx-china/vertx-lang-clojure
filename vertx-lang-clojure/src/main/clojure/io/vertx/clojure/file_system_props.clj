(ns io.vertx.clojure.file-system-props)

(import io.vertx.core.file.FileSystemProps)

(defn unallocated-space
  ([file-system-props ] (.unallocatedSpace file-system-props )))
(defn total-space
  ([file-system-props ] (.totalSpace file-system-props )))
(defn usable-space
  ([file-system-props ] (.usableSpace file-system-props )))