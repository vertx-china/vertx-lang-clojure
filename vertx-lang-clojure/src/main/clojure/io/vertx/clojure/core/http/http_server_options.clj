(ns io.vertx.clojure.core.http.http-server-options)

(import io.vertx.core.http.HttpServerOptions)
(import io.vertx.core.json.JsonObject)

(defn new-instance
  ([] (new HttpServerOptions))
  ([^JsonObject json] (new HttpServerOptions json)))

(defn set-accept-backlog [^HttpServerOptions http-server-options accept-backlog] (.setAcceptBacklog http-server-options accept-backlog))
(defn get-accept-backlog [^HttpServerOptions http-server-options] (.getAcceptBacklog http-server-options))
(defn set-accept-unmasked-frames [^HttpServerOptions http-server-options accept-unmasked-frames] (.setAcceptUnmaskedFrames http-server-options accept-unmasked-frames))
(defn is-accept-unmasked-frames [^HttpServerOptions http-server-options] (.isAcceptUnmaskedFrames http-server-options))
(defn set-alpn-versions [^HttpServerOptions http-server-options alpn-versions] (.setAlpnVersions http-server-options alpn-versions))
(defn get-alpn-versions [^HttpServerOptions http-server-options] (.getAlpnVersions http-server-options))
(defn set-client-auth [^HttpServerOptions http-server-options client-auth] (.setClientAuth http-server-options client-auth))
(defn get-client-auth [^HttpServerOptions http-server-options] (.getClientAuth http-server-options))
(defn set-client-auth-required [^HttpServerOptions http-server-options client-auth-required] (.setClientAuthRequired http-server-options client-auth-required))
(defn is-client-auth-required [^HttpServerOptions http-server-options] (.isClientAuthRequired http-server-options))
(defn set-compression-level [^HttpServerOptions http-server-options compression-level] (.setCompressionLevel http-server-options compression-level))
(defn get-compression-level [^HttpServerOptions http-server-options] (.getCompressionLevel http-server-options))
(defn set-compression-supported [^HttpServerOptions http-server-options compression-supported] (.setCompressionSupported http-server-options compression-supported))
(defn is-compression-supported [^HttpServerOptions http-server-options] (.isCompressionSupported http-server-options))
(defn add-crl-path [^HttpServerOptions http-server-options crl-paths] (.addCrlPath http-server-options crl-paths))
(defn get-crl-paths [^HttpServerOptions http-server-options] (.getCrlPaths http-server-options))
(defn add-crl-value [^HttpServerOptions http-server-options crl-values] (.addCrlValue http-server-options crl-values))
(defn get-crl-values [^HttpServerOptions http-server-options] (.getCrlValues http-server-options))
(defn set-decoder-initial-buffer-size [^HttpServerOptions http-server-options decoder-initial-buffer-size] (.setDecoderInitialBufferSize http-server-options decoder-initial-buffer-size))
(defn get-decoder-initial-buffer-size [^HttpServerOptions http-server-options] (.getDecoderInitialBufferSize http-server-options))
(defn set-decompression-supported [^HttpServerOptions http-server-options decompression-supported] (.setDecompressionSupported http-server-options decompression-supported))
(defn is-decompression-supported [^HttpServerOptions http-server-options] (.isDecompressionSupported http-server-options))
(defn add-enabled-cipher-suite [^HttpServerOptions http-server-options enabled-cipher-suites] (.addEnabledCipherSuite http-server-options enabled-cipher-suites))
(defn get-enabled-cipher-suites [^HttpServerOptions http-server-options] (.getEnabledCipherSuites http-server-options))
(defn add-enabled-secure-transport-protocol [^HttpServerOptions http-server-options enabled-secure-transport-protocols] (.addEnabledSecureTransportProtocol http-server-options enabled-secure-transport-protocols))
(defn set-enabled-secure-transport-protocols [^HttpServerOptions http-server-options enabled-secure-transport-protocols] (.setEnabledSecureTransportProtocols http-server-options enabled-secure-transport-protocols))
(defn get-enabled-secure-transport-protocols [^HttpServerOptions http-server-options] (.getEnabledSecureTransportProtocols http-server-options))
(defn set-handle100-continue-automatically [^HttpServerOptions http-server-options handle100-continue-automatically] (.setHandle100ContinueAutomatically http-server-options handle100-continue-automatically))
(defn is-handle100-continue-automatically [^HttpServerOptions http-server-options] (.isHandle100ContinueAutomatically http-server-options))
(defn set-host [^HttpServerOptions http-server-options host] (.setHost http-server-options host))
(defn get-host [^HttpServerOptions http-server-options] (.getHost http-server-options))
(defn set-http2-connection-window-size [^HttpServerOptions http-server-options http2-connection-window-size] (.setHttp2ConnectionWindowSize http-server-options http2-connection-window-size))
(defn get-http2-connection-window-size [^HttpServerOptions http-server-options] (.getHttp2ConnectionWindowSize http-server-options))
(defn set-idle-timeout [^HttpServerOptions http-server-options idle-timeout] (.setIdleTimeout http-server-options idle-timeout))
(defn get-idle-timeout [^HttpServerOptions http-server-options] (.getIdleTimeout http-server-options))
(defn set-idle-timeout-unit [^HttpServerOptions http-server-options idle-timeout-unit] (.setIdleTimeoutUnit http-server-options idle-timeout-unit))
(defn get-idle-timeout-unit [^HttpServerOptions http-server-options] (.getIdleTimeoutUnit http-server-options))
(defn set-initial-settings [^HttpServerOptions http-server-options initial-settings] (.setInitialSettings http-server-options initial-settings))
(defn get-initial-settings [^HttpServerOptions http-server-options] (.getInitialSettings http-server-options))
(defn set-jdk-ssl-engine-options [^HttpServerOptions http-server-options jdk-ssl-engine-options] (.setJdkSslEngineOptions http-server-options jdk-ssl-engine-options))
(defn get-jdk-ssl-engine-options [^HttpServerOptions http-server-options] (.getJdkSslEngineOptions http-server-options))
(defn set-key-store-options [^HttpServerOptions http-server-options key-store-options] (.setKeyStoreOptions http-server-options key-store-options))
(defn get-key-store-options [^HttpServerOptions http-server-options] (.getKeyStoreOptions http-server-options))
(defn set-log-activity [^HttpServerOptions http-server-options log-activity] (.setLogActivity http-server-options log-activity))
(defn get-log-activity [^HttpServerOptions http-server-options] (.getLogActivity http-server-options))
(defn set-max-chunk-size [^HttpServerOptions http-server-options max-chunk-size] (.setMaxChunkSize http-server-options max-chunk-size))
(defn get-max-chunk-size [^HttpServerOptions http-server-options] (.getMaxChunkSize http-server-options))
(defn set-max-header-size [^HttpServerOptions http-server-options max-header-size] (.setMaxHeaderSize http-server-options max-header-size))
(defn get-max-header-size [^HttpServerOptions http-server-options] (.getMaxHeaderSize http-server-options))
(defn set-max-initial-line-length [^HttpServerOptions http-server-options max-initial-line-length] (.setMaxInitialLineLength http-server-options max-initial-line-length))
(defn get-max-initial-line-length [^HttpServerOptions http-server-options] (.getMaxInitialLineLength http-server-options))
(defn set-max-websocket-frame-size [^HttpServerOptions http-server-options max-websocket-frame-size] (.setMaxWebsocketFrameSize http-server-options max-websocket-frame-size))
(defn get-max-websocket-frame-size [^HttpServerOptions http-server-options] (.getMaxWebsocketFrameSize http-server-options))
(defn set-max-websocket-message-size [^HttpServerOptions http-server-options max-websocket-message-size] (.setMaxWebsocketMessageSize http-server-options max-websocket-message-size))
(defn get-max-websocket-message-size [^HttpServerOptions http-server-options] (.getMaxWebsocketMessageSize http-server-options))
(defn set-open-ssl-engine-options [^HttpServerOptions http-server-options open-ssl-engine-options] (.setOpenSslEngineOptions http-server-options open-ssl-engine-options))
(defn get-open-ssl-engine-options [^HttpServerOptions http-server-options] (.getOpenSslEngineOptions http-server-options))
(defn set-pem-key-cert-options [^HttpServerOptions http-server-options pem-key-cert-options] (.setPemKeyCertOptions http-server-options pem-key-cert-options))
(defn get-pem-key-cert-options [^HttpServerOptions http-server-options] (.getPemKeyCertOptions http-server-options))
(defn set-pem-trust-options [^HttpServerOptions http-server-options pem-trust-options] (.setPemTrustOptions http-server-options pem-trust-options))
(defn get-pem-trust-options [^HttpServerOptions http-server-options] (.getPemTrustOptions http-server-options))
(defn set-per-frame-websocket-compression-supported [^HttpServerOptions http-server-options per-frame-websocket-compression-supported] (.setPerFrameWebsocketCompressionSupported http-server-options per-frame-websocket-compression-supported))
(defn get-per-frame-websocket-compression-supported [^HttpServerOptions http-server-options] (.getPerFrameWebsocketCompressionSupported http-server-options))
(defn set-per-message-websocket-compression-supported [^HttpServerOptions http-server-options per-message-websocket-compression-supported] (.setPerMessageWebsocketCompressionSupported http-server-options per-message-websocket-compression-supported))
(defn get-per-message-websocket-compression-supported [^HttpServerOptions http-server-options] (.getPerMessageWebsocketCompressionSupported http-server-options))
(defn set-pfx-key-cert-options [^HttpServerOptions http-server-options pfx-key-cert-options] (.setPfxKeyCertOptions http-server-options pfx-key-cert-options))
(defn get-pfx-key-cert-options [^HttpServerOptions http-server-options] (.getPfxKeyCertOptions http-server-options))
(defn set-pfx-trust-options [^HttpServerOptions http-server-options pfx-trust-options] (.setPfxTrustOptions http-server-options pfx-trust-options))
(defn get-pfx-trust-options [^HttpServerOptions http-server-options] (.getPfxTrustOptions http-server-options))
(defn set-port [^HttpServerOptions http-server-options port] (.setPort http-server-options port))
(defn get-port [^HttpServerOptions http-server-options] (.getPort http-server-options))
(defn set-receive-buffer-size [^HttpServerOptions http-server-options receive-buffer-size] (.setReceiveBufferSize http-server-options receive-buffer-size))
(defn get-receive-buffer-size [^HttpServerOptions http-server-options] (.getReceiveBufferSize http-server-options))
(defn set-reuse-address [^HttpServerOptions http-server-options reuse-address] (.setReuseAddress http-server-options reuse-address))
(defn is-reuse-address [^HttpServerOptions http-server-options] (.isReuseAddress http-server-options))
(defn set-reuse-port [^HttpServerOptions http-server-options reuse-port] (.setReusePort http-server-options reuse-port))
(defn is-reuse-port [^HttpServerOptions http-server-options] (.isReusePort http-server-options))
(defn set-send-buffer-size [^HttpServerOptions http-server-options send-buffer-size] (.setSendBufferSize http-server-options send-buffer-size))
(defn get-send-buffer-size [^HttpServerOptions http-server-options] (.getSendBufferSize http-server-options))
(defn set-sni [^HttpServerOptions http-server-options sni] (.setSni http-server-options sni))
(defn is-sni [^HttpServerOptions http-server-options] (.isSni http-server-options))
(defn set-so-linger [^HttpServerOptions http-server-options so-linger] (.setSoLinger http-server-options so-linger))
(defn get-so-linger [^HttpServerOptions http-server-options] (.getSoLinger http-server-options))
(defn set-ssl [^HttpServerOptions http-server-options ssl] (.setSsl http-server-options ssl))
(defn is-ssl [^HttpServerOptions http-server-options] (.isSsl http-server-options))
(defn set-ssl-handshake-timeout [^HttpServerOptions http-server-options ssl-handshake-timeout] (.setSslHandshakeTimeout http-server-options ssl-handshake-timeout))
(defn get-ssl-handshake-timeout [^HttpServerOptions http-server-options] (.getSslHandshakeTimeout http-server-options))
(defn set-ssl-handshake-timeout-unit [^HttpServerOptions http-server-options ssl-handshake-timeout-unit] (.setSslHandshakeTimeoutUnit http-server-options ssl-handshake-timeout-unit))
(defn get-ssl-handshake-timeout-unit [^HttpServerOptions http-server-options] (.getSslHandshakeTimeoutUnit http-server-options))
(defn set-tcp-cork [^HttpServerOptions http-server-options tcp-cork] (.setTcpCork http-server-options tcp-cork))
(defn is-tcp-cork [^HttpServerOptions http-server-options] (.isTcpCork http-server-options))
(defn set-tcp-fast-open [^HttpServerOptions http-server-options tcp-fast-open] (.setTcpFastOpen http-server-options tcp-fast-open))
(defn is-tcp-fast-open [^HttpServerOptions http-server-options] (.isTcpFastOpen http-server-options))
(defn set-tcp-keep-alive [^HttpServerOptions http-server-options tcp-keep-alive] (.setTcpKeepAlive http-server-options tcp-keep-alive))
(defn is-tcp-keep-alive [^HttpServerOptions http-server-options] (.isTcpKeepAlive http-server-options))
(defn set-tcp-no-delay [^HttpServerOptions http-server-options tcp-no-delay] (.setTcpNoDelay http-server-options tcp-no-delay))
(defn is-tcp-no-delay [^HttpServerOptions http-server-options] (.isTcpNoDelay http-server-options))
(defn set-tcp-quick-ack [^HttpServerOptions http-server-options tcp-quick-ack] (.setTcpQuickAck http-server-options tcp-quick-ack))
(defn is-tcp-quick-ack [^HttpServerOptions http-server-options] (.isTcpQuickAck http-server-options))
(defn set-traffic-class [^HttpServerOptions http-server-options traffic-class] (.setTrafficClass http-server-options traffic-class))
(defn get-traffic-class [^HttpServerOptions http-server-options] (.getTrafficClass http-server-options))
(defn set-trust-store-options [^HttpServerOptions http-server-options trust-store-options] (.setTrustStoreOptions http-server-options trust-store-options))
(defn get-trust-store-options [^HttpServerOptions http-server-options] (.getTrustStoreOptions http-server-options))
(defn set-use-alpn [^HttpServerOptions http-server-options use-alpn] (.setUseAlpn http-server-options use-alpn))
(defn is-use-alpn [^HttpServerOptions http-server-options] (.isUseAlpn http-server-options))
(defn set-use-pooled-buffers [^HttpServerOptions http-server-options use-pooled-buffers] (.setUsePooledBuffers http-server-options use-pooled-buffers))
(defn is-use-pooled-buffers [^HttpServerOptions http-server-options] (.isUsePooledBuffers http-server-options))
(defn set-websocket-allow-server-no-context [^HttpServerOptions http-server-options websocket-allow-server-no-context] (.setWebsocketAllowServerNoContext http-server-options websocket-allow-server-no-context))
(defn get-websocket-allow-server-no-context [^HttpServerOptions http-server-options] (.getWebsocketAllowServerNoContext http-server-options))
(defn set-websocket-compression-level [^HttpServerOptions http-server-options websocket-compression-level] (.setWebsocketCompressionLevel http-server-options websocket-compression-level))
(defn get-websocket-compression-level [^HttpServerOptions http-server-options] (.getWebsocketCompressionLevel http-server-options))
(defn set-websocket-preferred-client-no-context [^HttpServerOptions http-server-options websocket-preferred-client-no-context] (.setWebsocketPreferredClientNoContext http-server-options websocket-preferred-client-no-context))
(defn get-websocket-preferred-client-no-context [^HttpServerOptions http-server-options] (.getWebsocketPreferredClientNoContext http-server-options))
(defn set-websocket-sub-protocols [^HttpServerOptions http-server-options websocket-sub-protocols] (.setWebsocketSubProtocols http-server-options websocket-sub-protocols))
(defn get-websocket-sub-protocols [^HttpServerOptions http-server-options] (.getWebsocketSubProtocols http-server-options))
(defn to-json [^HttpServerOptions http-server-options] (.toJson http-server-options))