(ns io.vertx.clojure.file-system)

(import io.vertx.core.file.FileSystem)
(import io.vertx.core.buffer.Buffer)
(import io.vertx.core.file.OpenOptions)
(import io.vertx.core.file.CopyOptions)
(import io.vertx.core.Handler)

(defn move-blocking
  ([file-system from to] (.moveBlocking file-system from to)))
(defn symlink-blocking
  ([file-system link existing] (.symlinkBlocking file-system link existing)))
(defn delete-blocking
  ([file-system path] (.deleteBlocking file-system path)))
(defn link
  ([file-system link existing handler] (.link file-system link existing handler)))
(defn read-symlink
  ([file-system link handler] (.readSymlink file-system link handler)))
(defn read-symlink-blocking
  ([file-system link] (.readSymlinkBlocking file-system link)))
(defn delete
  ([file-system path handler] (.delete file-system path handler)))
(defn create-file
  ([file-system path handler] (.createFile file-system path handler))
  ([file-system path perms handler] (.createFile file-system path perms handler)))
(defn read-file-blocking
  ([file-system path] (.readFileBlocking file-system path)))
(defn chmod-recursive-blocking
  ([file-system path perms dir-perms] (.chmodRecursiveBlocking file-system path perms dir-perms)))
(defn truncate
  ([file-system path len handler] (.truncate file-system path len handler)))
(defn copy-recursive
  ([file-system from to recursive handler] (.copyRecursive file-system from to recursive handler)))
(defn symlink
  ([file-system link existing handler] (.symlink file-system link existing handler)))
(defn chmod
  ([file-system path perms handler] (.chmod file-system path perms handler)))
(defn chmod-blocking
  ([file-system path perms] (.chmodBlocking file-system path perms)))
(defn fs-props-blocking
  ([file-system path] (.fsPropsBlocking file-system path)))
(defn copy
  ([file-system from to handler] (.copy file-system from to handler))
  ([file-system from to options handler] (.copy file-system from to options handler)))
(defn copy-recursive-blocking
  ([file-system from to recursive] (.copyRecursiveBlocking file-system from to recursive)))
(defn delete-recursive
  ([file-system path recursive handler] (.deleteRecursive file-system path recursive handler)))
(defn mkdir
  ([file-system path handler] (.mkdir file-system path handler))
  ([file-system path perms handler] (.mkdir file-system path perms handler)))
(defn write-file
  ([file-system path data handler] (.writeFile file-system path data handler)))
(defn copy-blocking
  ([file-system from to] (.copyBlocking file-system from to)))
(defn chmod-recursive
  ([file-system path perms dir-perms handler] (.chmodRecursive file-system path perms dir-perms handler)))
(defn chown-blocking
  ([file-system path user group] (.chownBlocking file-system path user group)))
(defn lprops-blocking
  ([file-system path] (.lpropsBlocking file-system path)))
(defn move
  ([file-system from to handler] (.move file-system from to handler))
  ([file-system from to options handler] (.move file-system from to options handler)))
(defn delete-recursive-blocking
  ([file-system path recursive] (.deleteRecursiveBlocking file-system path recursive)))
(defn write-file-blocking
  ([file-system path data] (.writeFileBlocking file-system path data)))
(defn create-file-blocking
  ([file-system path] (.createFileBlocking file-system path))
  ([file-system path perms] (.createFileBlocking file-system path perms)))
(defn chown
  ([file-system path user group handler] (.chown file-system path user group handler)))
(defn unlink-blocking
  ([file-system link] (.unlinkBlocking file-system link)))
(defn link-blocking
  ([file-system link existing] (.linkBlocking file-system link existing)))
(defn open-blocking
  ([file-system path options] (.openBlocking file-system path options)))
(defn truncate-blocking
  ([file-system path len] (.truncateBlocking file-system path len)))
(defn mkdirs-blocking
  ([file-system path] (.mkdirsBlocking file-system path))
  ([file-system path perms] (.mkdirsBlocking file-system path perms)))
(defn props
  ([file-system path handler] (.props file-system path handler)))
(defn lprops
  ([file-system path handler] (.lprops file-system path handler)))
(defn props-blocking
  ([file-system path] (.propsBlocking file-system path)))
(defn mkdir-blocking
  ([file-system path] (.mkdirBlocking file-system path))
  ([file-system path perms] (.mkdirBlocking file-system path perms)))
(defn read-dir
  ([file-system path handler] (.readDir file-system path handler))
  ([file-system path filter handler] (.readDir file-system path filter handler)))
(defn unlink
  ([file-system link handler] (.unlink file-system link handler)))
(defn read-file
  ([file-system path handler] (.readFile file-system path handler)))
(defn exists-blocking
  ([file-system path] (.existsBlocking file-system path)))
(defn fs-props
  ([file-system path handler] (.fsProps file-system path handler)))
(defn mkdirs
  ([file-system path handler] (.mkdirs file-system path handler))
  ([file-system path perms handler] (.mkdirs file-system path perms handler)))
(defn exists
  ([file-system path handler] (.exists file-system path handler)))
(defn read-dir-blocking
  ([file-system path] (.readDirBlocking file-system path))
  ([file-system path filter] (.readDirBlocking file-system path filter)))
(defn open
  ([file-system path options handler] (.open file-system path options handler)))