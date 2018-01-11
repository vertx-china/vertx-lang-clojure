(ns io.vertx.lang.clojure.delivery-options)

(import io.vertx.core.eventbus.DeliveryOptions)

(defn from-json [^DeliveryOptions json] (new DeliveryOptions json))

(defn set-codec-name [^DeliveryOptions delivery-options codec-name] (.setCodecName delivery-options codec-name))
(defn get-codec-name [^DeliveryOptions delivery-options] (.getCodecName delivery-options))
(defn add-header [^DeliveryOptions delivery-options headers] (.addHeader delivery-options headers))
(defn set-send-timeout [^DeliveryOptions delivery-options send-timeout] (.setSendTimeout delivery-options send-timeout))
(defn get-send-timeout [^DeliveryOptions delivery-options] (.getSendTimeout delivery-options))