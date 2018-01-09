(ns io.vertx.clojure.buffer)

(import io.vertx.core.buffer.Buffer)
(import io.vertx.core.buffer.Buffer)

(defn append-long-le
  ([buffer l] (.appendLongLE buffer l)))
(defn append-double
  ([buffer d] (.appendDouble buffer d)))
(defn set-unsigned-short-le
  ([buffer pos s] (.setUnsignedShortLE buffer pos s)))
(defn get-byte
  ([buffer pos] (.getByte buffer pos)))
(defn set-unsigned-int
  ([buffer pos i] (.setUnsignedInt buffer pos i)))
(defn append-buffer
  ([buffer buff] (.appendBuffer buffer buff))
  ([buffer buff offset len] (.appendBuffer buffer buff offset len)))
(defn set-unsigned-short
  ([buffer pos s] (.setUnsignedShort buffer pos s)))
(defn set-short
  ([buffer pos s] (.setShort buffer pos s)))
(defn set-long-le
  ([buffer pos l] (.setLongLE buffer pos l)))
(defn set-double
  ([buffer pos d] (.setDouble buffer pos d)))
(defn append-unsigned-byte
  ([buffer b] (.appendUnsignedByte buffer b)))
(defn get-unsigned-int-le
  ([buffer pos] (.getUnsignedIntLE buffer pos)))
(defn slice
  ([buffer ] (.slice buffer ))
  ([buffer start end] (.slice buffer start end)))
(defn get-medium-le
  ([buffer pos] (.getMediumLE buffer pos)))
(defn buffer
  ([] (Buffer/buffer ))
  ([initial-size-hint] (Buffer/buffer initial-size-hint))
  ([string enc] (Buffer/buffer string enc)))
(defn get-unsigned-int
  ([buffer pos] (.getUnsignedInt buffer pos)))
(defn append-string
  ([buffer str enc] (.appendString buffer str enc))
  ([buffer str] (.appendString buffer str)))
(defn append-medium-le
  ([buffer i] (.appendMediumLE buffer i)))
(defn get-unsigned-short
  ([buffer pos] (.getUnsignedShort buffer pos)))
(defn to-json-array
  ([buffer ] (.toJsonArray buffer )))
(defn get-unsigned-short-le
  ([buffer pos] (.getUnsignedShortLE buffer pos)))
(defn set-int
  ([buffer pos i] (.setInt buffer pos i)))
(defn get-int
  ([buffer pos] (.getInt buffer pos)))
(defn append-byte
  ([buffer b] (.appendByte buffer b)))
(defn set-long
  ([buffer pos l] (.setLong buffer pos l)))
(defn set-string
  ([buffer pos str] (.setString buffer pos str))
  ([buffer pos str enc] (.setString buffer pos str enc)))
(defn to-json-object
  ([buffer ] (.toJsonObject buffer )))
(defn append-int
  ([buffer i] (.appendInt buffer i)))
(defn set-unsigned-int-le
  ([buffer pos i] (.setUnsignedIntLE buffer pos i)))
(defn get-short-le
  ([buffer pos] (.getShortLE buffer pos)))
(defn get-medium
  ([buffer pos] (.getMedium buffer pos)))
(defn append-long
  ([buffer l] (.appendLong buffer l)))
(defn set-int-le
  ([buffer pos i] (.setIntLE buffer pos i)))
(defn set-byte
  ([buffer pos b] (.setByte buffer pos b)))
(defn get-buffer
  ([buffer start end] (.getBuffer buffer start end)))
(defn set-short-le
  ([buffer pos s] (.setShortLE buffer pos s)))
(defn get-double
  ([buffer pos] (.getDouble buffer pos)))
(defn append-unsigned-int
  ([buffer i] (.appendUnsignedInt buffer i)))
(defn append-short-le
  ([buffer s] (.appendShortLE buffer s)))
(defn get-float
  ([buffer pos] (.getFloat buffer pos)))
(defn append-float
  ([buffer f] (.appendFloat buffer f)))
(defn get-long-le
  ([buffer pos] (.getLongLE buffer pos)))
(defn set-medium-le
  ([buffer pos i] (.setMediumLE buffer pos i)))
(defn copy
  ([buffer ] (.copy buffer )))
(defn set-unsigned-byte
  ([buffer pos b] (.setUnsignedByte buffer pos b)))
(defn append-unsigned-int-le
  ([buffer i] (.appendUnsignedIntLE buffer i)))
(defn set-float
  ([buffer pos f] (.setFloat buffer pos f)))
(defn get-short
  ([buffer pos] (.getShort buffer pos)))
(defn set-buffer
  ([buffer pos b] (.setBuffer buffer pos b))
  ([buffer pos b offset len] (.setBuffer buffer pos b offset len)))
(defn append-short
  ([buffer s] (.appendShort buffer s)))
(defn length
  ([buffer ] (.length buffer )))
(defn get-unsigned-byte
  ([buffer pos] (.getUnsignedByte buffer pos)))
(defn get-int-le
  ([buffer pos] (.getIntLE buffer pos)))
(defn get-string
  ([buffer start end enc] (.getString buffer start end enc))
  ([buffer start end] (.getString buffer start end)))
(defn append-unsigned-short-le
  ([buffer s] (.appendUnsignedShortLE buffer s)))
(defn append-unsigned-short
  ([buffer s] (.appendUnsignedShort buffer s)))
(defn get-long
  ([buffer pos] (.getLong buffer pos)))
(defn append-int-le
  ([buffer i] (.appendIntLE buffer i)))
(defn get-unsigned-medium-le
  ([buffer pos] (.getUnsignedMediumLE buffer pos)))
(defn get-unsigned-medium
  ([buffer pos] (.getUnsignedMedium buffer pos)))
(defn to-string
  ([buffer ] (.toString buffer ))
  ([buffer enc] (.toString buffer enc)))
(defn buffer-
  ([string] (Buffer/buffer string)))
(defn append-medium
  ([buffer i] (.appendMedium buffer i)))
(defn set-medium
  ([buffer pos i] (.setMedium buffer pos i)))