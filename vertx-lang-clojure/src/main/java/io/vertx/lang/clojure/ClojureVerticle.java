package io.vertx.lang.clojure;

import clojure.java.api.Clojure;
import clojure.lang.IFn;
import io.vertx.core.Context;
import io.vertx.core.Future;
import io.vertx.core.Verticle;
import io.vertx.core.Vertx;

import java.util.HashMap;
import java.util.Map;

public class ClojureVerticle implements Verticle {

  private static final String NS_IO_VERTX_CLOJURE_CORE_CORE = "io.vertx.clojure.core.core";

  private String ns;
  private Vertx vertx;
  private Context context;

  public ClojureVerticle(String ns) {
    this.ns = ns;
  }

  @Override
  public Vertx getVertx() {
    return vertx;
  }

  @Override
  public void init(Vertx vertx, Context context) {
    this.vertx = vertx;
    this.context = context;
  }

  @Override
  public void start(Future<Void> startFuture) {
    try {
      IFn iFn = Clojure.var("clojure.core", "require");
      iFn.invoke(Clojure.read(NS_IO_VERTX_CLOJURE_CORE_CORE));

      iFn = Clojure.var("clojure.core", "require");
      iFn.invoke(Clojure.read(ns));

      iFn = Clojure.var(NS_IO_VERTX_CLOJURE_CORE_CORE,"exists");
      if(iFn.invoke(ns+"/start")==null) throw new Exception("start method e.g.(defn start[vertx] (println vertx)) does not exist.");

      Map objectMap = new HashMap() {{
        put("vertx", vertx);
        put("context", context);
      }};

      IFn startIFn = Clojure.var(ns, "start");
      IFn getInfo = Clojure.var(NS_IO_VERTX_CLOJURE_CORE_CORE, "get-method-parameters");
      String rawParams = getInfo.invoke(startIFn).toString();
      rawParams = rawParams.trim().substring(1, rawParams.length() - 1);
      String[] paramNames = rawParams.split(" ");
      switch (paramNames.length) {
        case 1:
          startIFn.invoke(objectMap.get(paramNames[0]));
          break;
        case 2:
          startIFn.invoke(objectMap.get(paramNames[0]), objectMap.get(paramNames[1]));
          break;
        default:
          startIFn.invoke();
          break;
      }
      startFuture.complete();
    } catch (Throwable e) {
      startFuture.fail(e);
    }
  }

  @Override
  public void stop(Future<Void> stopFuture) {
    try {
      IFn iFn = Clojure.var("clojure.core", "require");
      iFn.invoke(Clojure.read(NS_IO_VERTX_CLOJURE_CORE_CORE));

      iFn = Clojure.var("clojure.core", "require");
      iFn.invoke(Clojure.read(ns));

      iFn = Clojure.var(NS_IO_VERTX_CLOJURE_CORE_CORE,"exists");
      if(iFn.invoke(ns+"/stop")==null){
        stopFuture.complete();
        return;
      }

      Map objectMap = new HashMap() {{
        put("vertx", vertx);
        put("context", context);
      }};

      IFn stopIFn = Clojure.var(ns, "stop");
      IFn getInfo = Clojure.var(NS_IO_VERTX_CLOJURE_CORE_CORE, "get-method-parameters");
      String rawParams = getInfo.invoke(stopIFn).toString();
      rawParams = rawParams.trim().substring(1, rawParams.length() - 1);
      String[] paramNames = rawParams.split(" ");
      switch (paramNames.length) {
        case 1:
          stopIFn.invoke(objectMap.get(paramNames[0]));
          break;
        case 2:
          stopIFn.invoke(objectMap.get(paramNames[0]), objectMap.get(paramNames[1]));
          break;
        default:
          stopIFn.invoke();
          break;
      }
      stopFuture.complete();
    } catch (Throwable e) {
      stopFuture.fail(e);
    }
  }
}
