(ns io.vertx.clojure.buffer)

(import io.vertx.core.buffer.Buffer)
(import io.vertx.core.buffer.Buffer)

(defn append-buffer
  ([buffer buff] (.appendBuffer buffer buff))
  ([buffer buff offset len] (.appendBuffer buffer buff offset len)))
(defn append-byte
  ([buffer b] (.appendByte buffer b)))
(defn append-double
  ([buffer d] (.appendDouble buffer d)))
(defn append-float
  ([buffer f] (.appendFloat buffer f)))
(defn append-int
  ([buffer i] (.appendInt buffer i)))
(defn append-int-le
  ([buffer i] (.appendIntLE buffer i)))
(defn append-long
  ([buffer l] (.appendLong buffer l)))
(defn append-long-le
  ([buffer l] (.appendLongLE buffer l)))
(defn append-medium
  ([buffer i] (.appendMedium buffer i)))
(defn append-medium-le
  ([buffer i] (.appendMediumLE buffer i)))
(defn append-short
  ([buffer s] (.appendShort buffer s)))
(defn append-short-le
  ([buffer s] (.appendShortLE buffer s)))
(defn append-string
  ([buffer str enc] (.appendString buffer str enc))
  ([buffer str] (.appendString buffer str)))
(defn append-unsigned-byte
  ([buffer b] (.appendUnsignedByte buffer b)))
(defn append-unsigned-int
  ([buffer i] (.appendUnsignedInt buffer i)))
(defn append-unsigned-int-le
  ([buffer i] (.appendUnsignedIntLE buffer i)))
(defn append-unsigned-short
  ([buffer s] (.appendUnsignedShort buffer s)))
(defn append-unsigned-short-le
  ([buffer s] (.appendUnsignedShortLE buffer s)))
(defn buffer
  ([] (Buffer/buffer ))
  ([string-or-initial-size-hint] (Buffer/buffer string-or-initial-size-hint))
  ([string enc] (Buffer/buffer string enc)))
(defn copy
  ([buffer ] (.copy buffer )))
(defn get-buffer
  ([buffer start end] (.getBuffer buffer start end)))
(defn get-byte
  ([buffer pos] (.getByte buffer pos)))
(defn get-double
  ([buffer pos] (.getDouble buffer pos)))
(defn get-float
  ([buffer pos] (.getFloat buffer pos)))
(defn get-int
  ([buffer pos] (.getInt buffer pos)))
(defn get-int-le
  ([buffer pos] (.getIntLE buffer pos)))
(defn get-long
  ([buffer pos] (.getLong buffer pos)))
(defn get-long-le
  ([buffer pos] (.getLongLE buffer pos)))
(defn get-medium
  ([buffer pos] (.getMedium buffer pos)))
(defn get-medium-le
  ([buffer pos] (.getMediumLE buffer pos)))
(defn get-short
  ([buffer pos] (.getShort buffer pos)))
(defn get-short-le
  ([buffer pos] (.getShortLE buffer pos)))
(defn get-string
  ([buffer start end enc] (.getString buffer start end enc))
  ([buffer start end] (.getString buffer start end)))
(defn get-unsigned-byte
  ([buffer pos] (.getUnsignedByte buffer pos)))
(defn get-unsigned-int
  ([buffer pos] (.getUnsignedInt buffer pos)))
(defn get-unsigned-int-le
  ([buffer pos] (.getUnsignedIntLE buffer pos)))
(defn get-unsigned-medium
  ([buffer pos] (.getUnsignedMedium buffer pos)))
(defn get-unsigned-medium-le
  ([buffer pos] (.getUnsignedMediumLE buffer pos)))
(defn get-unsigned-short
  ([buffer pos] (.getUnsignedShort buffer pos)))
(defn get-unsigned-short-le
  ([buffer pos] (.getUnsignedShortLE buffer pos)))
(defn length
  ([buffer ] (.length buffer )))
(defn set-buffer
  ([buffer pos b] (.setBuffer buffer pos b))
  ([buffer pos b offset len] (.setBuffer buffer pos b offset len)))
(defn set-byte
  ([buffer pos b] (.setByte buffer pos b)))
(defn set-double
  ([buffer pos d] (.setDouble buffer pos d)))
(defn set-float
  ([buffer pos f] (.setFloat buffer pos f)))
(defn set-int
  ([buffer pos i] (.setInt buffer pos i)))
(defn set-int-le
  ([buffer pos i] (.setIntLE buffer pos i)))
(defn set-long
  ([buffer pos l] (.setLong buffer pos l)))
(defn set-long-le
  ([buffer pos l] (.setLongLE buffer pos l)))
(defn set-medium
  ([buffer pos i] (.setMedium buffer pos i)))
(defn set-medium-le
  ([buffer pos i] (.setMediumLE buffer pos i)))
(defn set-short
  ([buffer pos s] (.setShort buffer pos s)))
(defn set-short-le
  ([buffer pos s] (.setShortLE buffer pos s)))
(defn set-string
  ([buffer pos str] (.setString buffer pos str))
  ([buffer pos str enc] (.setString buffer pos str enc)))
(defn set-unsigned-byte
  ([buffer pos b] (.setUnsignedByte buffer pos b)))
(defn set-unsigned-int
  ([buffer pos i] (.setUnsignedInt buffer pos i)))
(defn set-unsigned-int-le
  ([buffer pos i] (.setUnsignedIntLE buffer pos i)))
(defn set-unsigned-short
  ([buffer pos s] (.setUnsignedShort buffer pos s)))
(defn set-unsigned-short-le
  ([buffer pos s] (.setUnsignedShortLE buffer pos s)))
(defn slice
  ([buffer ] (.slice buffer ))
  ([buffer start end] (.slice buffer start end)))
(defn to-json-array
  ([buffer ] (.toJsonArray buffer )))
(defn to-json-object
  ([buffer ] (.toJsonObject buffer )))
(defn to-string
  ([buffer ] (.toString buffer ))
  ([buffer enc] (.toString buffer enc)))