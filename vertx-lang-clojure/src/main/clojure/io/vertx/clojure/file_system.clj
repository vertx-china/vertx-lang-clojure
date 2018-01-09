(ns io.vertx.clojure.file-system)

(import io.vertx.core.file.FileSystem)
(import io.vertx.core.buffer.Buffer)
(import io.vertx.core.file.OpenOptions)
(import io.vertx.core.file.CopyOptions)
(import io.vertx.core.Handler)

(defn chmod
  ([file-system path perms handler] (.chmod file-system path perms handler)))
(defn chmod-blocking
  ([file-system path perms] (.chmodBlocking file-system path perms)))
(defn chmod-recursive
  ([file-system path perms dir-perms handler] (.chmodRecursive file-system path perms dir-perms handler)))
(defn chmod-recursive-blocking
  ([file-system path perms dir-perms] (.chmodRecursiveBlocking file-system path perms dir-perms)))
(defn chown
  ([file-system path user group handler] (.chown file-system path user group handler)))
(defn chown-blocking
  ([file-system path user group] (.chownBlocking file-system path user group)))
(defn copy
  ([file-system from to handler] (.copy file-system from to handler))
  ([file-system from to options handler] (.copy file-system from to options handler)))
(defn copy-blocking
  ([file-system from to] (.copyBlocking file-system from to)))
(defn copy-recursive
  ([file-system from to recursive handler] (.copyRecursive file-system from to recursive handler)))
(defn copy-recursive-blocking
  ([file-system from to recursive] (.copyRecursiveBlocking file-system from to recursive)))
(defn create-file
  ([file-system path handler] (.createFile file-system path handler))
  ([file-system path perms handler] (.createFile file-system path perms handler)))
(defn create-file-blocking
  ([file-system path] (.createFileBlocking file-system path))
  ([file-system path perms] (.createFileBlocking file-system path perms)))
(defn delete
  ([file-system path handler] (.delete file-system path handler)))
(defn delete-blocking
  ([file-system path] (.deleteBlocking file-system path)))
(defn delete-recursive
  ([file-system path recursive handler] (.deleteRecursive file-system path recursive handler)))
(defn delete-recursive-blocking
  ([file-system path recursive] (.deleteRecursiveBlocking file-system path recursive)))
(defn exists
  ([file-system path handler] (.exists file-system path handler)))
(defn exists-blocking
  ([file-system path] (.existsBlocking file-system path)))
(defn fs-props
  ([file-system path handler] (.fsProps file-system path handler)))
(defn fs-props-blocking
  ([file-system path] (.fsPropsBlocking file-system path)))
(defn link
  ([file-system link existing handler] (.link file-system link existing handler)))
(defn link-blocking
  ([file-system link existing] (.linkBlocking file-system link existing)))
(defn lprops
  ([file-system path handler] (.lprops file-system path handler)))
(defn lprops-blocking
  ([file-system path] (.lpropsBlocking file-system path)))
(defn mkdir
  ([file-system path handler] (.mkdir file-system path handler))
  ([file-system path perms handler] (.mkdir file-system path perms handler)))
(defn mkdir-blocking
  ([file-system path] (.mkdirBlocking file-system path))
  ([file-system path perms] (.mkdirBlocking file-system path perms)))
(defn mkdirs
  ([file-system path handler] (.mkdirs file-system path handler))
  ([file-system path perms handler] (.mkdirs file-system path perms handler)))
(defn mkdirs-blocking
  ([file-system path] (.mkdirsBlocking file-system path))
  ([file-system path perms] (.mkdirsBlocking file-system path perms)))
(defn move
  ([file-system from to handler] (.move file-system from to handler))
  ([file-system from to options handler] (.move file-system from to options handler)))
(defn move-blocking
  ([file-system from to] (.moveBlocking file-system from to)))
(defn open
  ([file-system path options handler] (.open file-system path options handler)))
(defn open-blocking
  ([file-system path options] (.openBlocking file-system path options)))
(defn props
  ([file-system path handler] (.props file-system path handler)))
(defn props-blocking
  ([file-system path] (.propsBlocking file-system path)))
(defn read-dir
  ([file-system path handler] (.readDir file-system path handler))
  ([file-system path filter handler] (.readDir file-system path filter handler)))
(defn read-dir-blocking
  ([file-system path] (.readDirBlocking file-system path))
  ([file-system path filter] (.readDirBlocking file-system path filter)))
(defn read-file
  ([file-system path handler] (.readFile file-system path handler)))
(defn read-file-blocking
  ([file-system path] (.readFileBlocking file-system path)))
(defn read-symlink
  ([file-system link handler] (.readSymlink file-system link handler)))
(defn read-symlink-blocking
  ([file-system link] (.readSymlinkBlocking file-system link)))
(defn symlink
  ([file-system link existing handler] (.symlink file-system link existing handler)))
(defn symlink-blocking
  ([file-system link existing] (.symlinkBlocking file-system link existing)))
(defn truncate
  ([file-system path len handler] (.truncate file-system path len handler)))
(defn truncate-blocking
  ([file-system path len] (.truncateBlocking file-system path len)))
(defn unlink
  ([file-system link handler] (.unlink file-system link handler)))
(defn unlink-blocking
  ([file-system link] (.unlinkBlocking file-system link)))
(defn write-file
  ([file-system path data handler] (.writeFile file-system path data handler)))
(defn write-file-blocking
  ([file-system path data] (.writeFileBlocking file-system path data)))