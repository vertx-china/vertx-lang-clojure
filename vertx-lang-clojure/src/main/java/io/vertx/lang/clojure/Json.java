package io.vertx.lang.clojure;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.util.Iterator;
import java.util.Map;

public class Json {
  public static Object get(JsonArray jsonArray, int pos){
    return jsonArray.getValue(pos);
  }

  public static Object get(JsonObject jsonObject, String key){
    return jsonObject.getValue(key);
  }

  public static Object remove(JsonArray jsonArray, int pos){
    return jsonArray.remove(pos);
  }

  public static Object remove(JsonObject jsonObject, String key){
    return jsonObject.remove(key);
  }

  public static Object removeValue(JsonArray jsonArray, Object value){
    Iterator iterator = jsonArray.iterator();
    while(iterator.hasNext()){
      Object obj = iterator.next();
      if(obj == value || obj.equals(value)){
        iterator.remove();
      }
    }
    return jsonArray;
  }

  public static Object removeValue(JsonObject jsonObject, Object value){
    jsonObject.getMap().entrySet().removeIf(entry -> (entry.getValue()==value || entry.getValue().equals(value)));
    return jsonObject;
  }

}
