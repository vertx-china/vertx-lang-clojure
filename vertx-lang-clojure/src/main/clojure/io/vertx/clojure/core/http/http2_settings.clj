(ns io.vertx.clojure.core.http.http2-settings)

(import io.vertx.core.http.Http2Settings)

(defn from-json [^Http2Settings json] (new Http2Settings json))

(defn set-header-table-size [^Http2Settings http2-settings header-table-size] (.setHeaderTableSize http2-settings header-table-size))
(defn get-header-table-size [^Http2Settings http2-settings] (.getHeaderTableSize http2-settings))
(defn set-initial-window-size [^Http2Settings http2-settings initial-window-size] (.setInitialWindowSize http2-settings initial-window-size))
(defn get-initial-window-size [^Http2Settings http2-settings] (.getInitialWindowSize http2-settings))
(defn set-max-concurrent-streams [^Http2Settings http2-settings max-concurrent-streams] (.setMaxConcurrentStreams http2-settings max-concurrent-streams))
(defn get-max-concurrent-streams [^Http2Settings http2-settings] (.getMaxConcurrentStreams http2-settings))
(defn set-max-frame-size [^Http2Settings http2-settings max-frame-size] (.setMaxFrameSize http2-settings max-frame-size))
(defn get-max-frame-size [^Http2Settings http2-settings] (.getMaxFrameSize http2-settings))
(defn set-max-header-list-size [^Http2Settings http2-settings max-header-list-size] (.setMaxHeaderListSize http2-settings max-header-list-size))
(defn get-max-header-list-size [^Http2Settings http2-settings] (.getMaxHeaderListSize http2-settings))
(defn set-push-enabled [^Http2Settings http2-settings push-enabled] (.setPushEnabled http2-settings push-enabled))
(defn is-push-enabled [^Http2Settings http2-settings] (.isPushEnabled http2-settings))