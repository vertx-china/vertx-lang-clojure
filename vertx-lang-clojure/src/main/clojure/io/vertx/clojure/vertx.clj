(ns io.vertx.clojure.vertx)

(import io.vertx.core.Vertx)
(import io.vertx.core.net.NetServerOptions)
(import io.vertx.core.DeploymentOptions)
(import io.vertx.core.dns.DnsClientOptions)
(import io.vertx.core.VertxOptions)
(import io.vertx.core.http.HttpServerOptions)
(import io.vertx.core.http.HttpClientOptions)
(import io.vertx.core.datagram.DatagramSocketOptions)
(import io.vertx.core.Handler)
(import io.vertx.core.net.NetClientOptions)

(defn cancel-timer
  ([vertx id] (.cancelTimer vertx id)))
(defn close
  ([vertx ] (.close vertx ))
  ([vertx completion-handler] (.close vertx completion-handler)))
(defn clustered-vertx
  ([options result-handler] (Vertx/clusteredVertx options result-handler)))
(defn create-datagram-socket
  ([vertx options] (.createDatagramSocket vertx options))
  ([vertx ] (.createDatagramSocket vertx )))
(defn create-dns-client
  ([vertx port host] (.createDnsClient vertx port host))
  ([vertx ] (.createDnsClient vertx ))
  ([vertx options] (.createDnsClient vertx options)))
(defn create-http-client
  ([vertx options] (.createHttpClient vertx options))
  ([vertx ] (.createHttpClient vertx )))
(defn create-http-server
  ([vertx options] (.createHttpServer vertx options))
  ([vertx ] (.createHttpServer vertx )))
(defn create-net-client
  ([vertx options] (.createNetClient vertx options))
  ([vertx ] (.createNetClient vertx )))
(defn create-net-server
  ([vertx options] (.createNetServer vertx options))
  ([vertx ] (.createNetServer vertx )))
(defn create-shared-worker-executor
  ([vertx name] (.createSharedWorkerExecutor vertx name))
  ([vertx name pool-size] (.createSharedWorkerExecutor vertx name pool-size))
  ([vertx name pool-size max-execute-time] (.createSharedWorkerExecutor vertx name pool-size max-execute-time)))
(defn current-context
  ([] (Vertx/currentContext )))
(defn deploy-verticle
  ([vertx name] (.deployVerticle vertx name))
  ([vertx name completion-handler] (.deployVerticle vertx name completion-handler))
  ([vertx name options completion-handler] (.deployVerticle vertx name options completion-handler)))
(defn deploy-verticle-
  ([vertx name options] (.deployVerticle vertx name options)))
(defn deployment-i-ds
  ([vertx ] (.deploymentIDs vertx )))
(defn event-bus
  ([vertx ] (.eventBus vertx )))
(defn exception-handler
  ([vertx handler] (.exceptionHandler vertx handler)))
(defn execute-blocking
  ([vertx blocking-code-handler ordered result-handler] (.executeBlocking vertx blocking-code-handler ordered result-handler))
  ([vertx blocking-code-handler result-handler] (.executeBlocking vertx blocking-code-handler result-handler)))
(defn file-system
  ([vertx ] (.fileSystem vertx )))
(defn get-or-create-context
  ([vertx ] (.getOrCreateContext vertx )))
(defn is-clustered
  ([vertx ] (.isClustered vertx )))
(defn is-metrics-enabled
  ([vertx ] (.isMetricsEnabled vertx )))
(defn is-native-transport-enabled
  ([vertx ] (.isNativeTransportEnabled vertx )))
(defn periodic-stream
  ([vertx delay] (.periodicStream vertx delay)))
(defn run-on-context
  ([vertx action] (.runOnContext vertx action)))
(defn set-periodic
  ([vertx delay handler] (.setPeriodic vertx delay handler)))
(defn set-timer
  ([vertx delay handler] (.setTimer vertx delay handler)))
(defn shared-data
  ([vertx ] (.sharedData vertx )))
(defn timer-stream
  ([vertx delay] (.timerStream vertx delay)))
(defn undeploy
  ([vertx deployment-id] (.undeploy vertx deployment-id))
  ([vertx deployment-id completion-handler] (.undeploy vertx deployment-id completion-handler)))
(defn vertx
  ([] (Vertx/vertx ))
  ([options] (Vertx/vertx options)))