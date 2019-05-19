package io.vertx.lang.clojure;

import clojure.java.api.Clojure;
import clojure.lang.*;
import clojure.lang.Compiler;
import io.vertx.core.Context;
import io.vertx.core.Future;
import io.vertx.core.Verticle;
import io.vertx.core.Vertx;

import java.util.HashMap;
import java.util.Map;

/**
 * Clojure language wrapper verticle, when the verticle is generated
 * it will automatically load the corresponding Clojure namespace file
 * and load its start method, currently supports several ways of start
 * start[] start[vertx] start[vertx context] start[context] start[context vertx]
 * @author <a href="mailto:chengen.zhao@whitewoodcity.com">Chengen Zhao</a>
 */
public class ClojureVerticle implements Verticle {

  private static final String NS_IO_VERTX_LANG_CLOJURE_VERTICLE = "io.vertx.lang.clojure.verticle";

  private String ns;
  private Vertx vertx;
  private Context context;

  private boolean requireCompiling = false;

  public ClojureVerticle(String ns) {
    this(ns, false);
  }

  public ClojureVerticle(String ns, boolean requireCompiling) {
    this.ns = ns;
    this.requireCompiling = requireCompiling;
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
      if (requireCompiling) {
        //concurrently compile clj files may cause exception,make it serial
        synchronized (Clojure.class){
          start();
        }
      }else{//the source file should have already been compiled
        start();
      }

      startFuture.complete();
    } catch (Throwable e) {
      startFuture.fail(e);
    }
  }

  private void start() {
    final IFn require = Clojure.var("clojure.core", "require");
    require.invoke(Symbol.intern(NS_IO_VERTX_LANG_CLOJURE_VERTICLE));
    require.invoke(Symbol.intern(ns));

    IFn iFn = Clojure.var(NS_IO_VERTX_LANG_CLOJURE_VERTICLE, "exists");
    if (iFn.invoke(ns + "/start") == null)
      throw new RuntimeException("start method e.g.(defn start[vertx] (println vertx)) does not exist.");


    Map objectMap = new HashMap() {{
      put("vertx", vertx);
      put("context", context);
    }};

    IFn startIFn = Clojure.var(ns, "start");
    IFn getInfo = Clojure.var(NS_IO_VERTX_LANG_CLOJURE_VERTICLE, "get-method-parameters");

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
  }

  @Override
  public void stop(Future<Void> stopFuture) {
    try {
      synchronized (Clojure.class) {
        IFn iFn = Clojure.var("clojure.core", "require");
        iFn.invoke(Clojure.read(NS_IO_VERTX_LANG_CLOJURE_VERTICLE));

        iFn = Clojure.var("clojure.core", "require");
        iFn.invoke(Clojure.read(ns));

        iFn = Clojure.var(NS_IO_VERTX_LANG_CLOJURE_VERTICLE, "exists");
        if (iFn.invoke(ns + "/stop") == null) {
          stopFuture.complete();
          return;
        }

        Map objectMap = new HashMap() {{
          put("vertx", vertx);
          put("context", context);
        }};

        IFn stopIFn = Clojure.var(ns, "stop");
        IFn getInfo = Clojure.var(NS_IO_VERTX_LANG_CLOJURE_VERTICLE, "get-method-parameters");
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
      }
      stopFuture.complete();
    } catch (Throwable e) {
      stopFuture.fail(e);
    }
  }
}
