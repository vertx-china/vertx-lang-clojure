package io.vertx.lang.clojure;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Clojure Json corresponding util class
 * @author <a href="mailto:chengen.zhao@whitewoodcity.com">Chengen Zhao</a>
 */
public class Json {
  public static Object set(JsonArray jsonArray, int pos, Object value){
    List list = jsonArray.getList();
    if(pos > list.size()) list.add(value);
    else list.add(pos,value);
    return jsonArray;
  }

  public static Object set(JsonObject jsonObject, String key, Object value){
    return jsonObject.put(key,value);
  }

  public static Object get(JsonArray jsonArray, int pos){
    if(pos >= jsonArray.size()) return null;
    return jsonArray.getValue(pos);
  }

  public static Object get(JsonObject jsonObject, String key){
    return jsonObject.getValue(key);
  }

  public static Object remove(JsonArray jsonArray, int pos){
    if(pos >= jsonArray.size()) return null;
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

  public static Object values(JsonObject jsonObject){
    return jsonObject.getMap().values();
  }

  public static Object values(JsonArray jsonArray){
    return jsonArray.getList();
  }

  public static Object keySet(JsonObject jsonObject){
    return jsonObject.getMap().keySet();
  }

  public static Object keySet(JsonArray jsonArray){
    List list = new ArrayList();
    for(int i=0;i<jsonArray.size();i++){
      list.add(i);
    }
    return list;
  }
}
