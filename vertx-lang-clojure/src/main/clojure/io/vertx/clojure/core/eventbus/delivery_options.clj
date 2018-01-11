(ns io.vertx.clojure.core.eventbus.delivery-options)

(import io.vertx.core.eventbus.DeliveryOptions)
(import io.vertx.core.json.JsonObject)

(defn new-instance
  ([] (new DeliveryOptions))
  ([^JsonObject json] (new DeliveryOptions json)))

(defn set-codec-name [^DeliveryOptions delivery-options codec-name] (.setCodecName delivery-options codec-name))
(defn get-codec-name [^DeliveryOptions delivery-options] (.getCodecName delivery-options))
(defn add-header [^DeliveryOptions delivery-options headers] (.addHeader delivery-options headers))
(defn set-send-timeout [^DeliveryOptions delivery-options send-timeout] (.setSendTimeout delivery-options send-timeout))
(defn get-send-timeout [^DeliveryOptions delivery-options] (.getSendTimeout delivery-options))