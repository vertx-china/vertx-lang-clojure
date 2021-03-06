(ns io.vertx.clojure.core.file.file-props)

(import io.vertx.core.file.FileProps)

(defn creation-time
  ([file-props ] (.creationTime file-props )))
(defn is-directory
  ([file-props ] (.isDirectory file-props )))
(defn is-other
  ([file-props ] (.isOther file-props )))
(defn is-regular-file
  ([file-props ] (.isRegularFile file-props )))
(defn is-symbolic-link
  ([file-props ] (.isSymbolicLink file-props )))
(defn last-access-time
  ([file-props ] (.lastAccessTime file-props )))
(defn last-modified-time
  ([file-props ] (.lastModifiedTime file-props )))
(defn size
  ([file-props ] (.size file-props )))