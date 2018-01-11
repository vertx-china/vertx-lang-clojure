package io.vertx.lang.clojure;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

public class Json {
  public static Object get(JsonArray jsonArray, int pos){
    return jsonArray.getValue(pos);
  }

  public static Object get(JsonObject jsonObject, String key){
    return jsonObject.getValue(key);
  }
}
