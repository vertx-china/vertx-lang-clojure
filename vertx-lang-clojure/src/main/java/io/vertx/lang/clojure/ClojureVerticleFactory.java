package io.vertx.lang.clojure;

import io.vertx.core.Verticle;
import io.vertx.core.Vertx;
import io.vertx.core.spi.VerticleFactory;

public class ClojureVerticleFactory implements VerticleFactory {

  private Vertx vertx;

  @Override
  public String prefix() {
    return "clj";
  }

  @Override
  public boolean blockingCreate() {
    return true;
  }

  @Override
  public void init(Vertx vertx) {
    this.vertx = vertx;
  }

  @Override
  public Verticle createVerticle(String verticleName, ClassLoader classLoader) throws Exception {

    String ns = verticleName;

    if (ns.endsWith("."+prefix())) {
      ns = ns.substring(0, ns.indexOf("."+prefix()));
    }
    if (ns.startsWith(prefix()+":")) {
      ns = ns.substring((prefix()+":").length());
    }

    ns = ns.replace("_","-");

    return new ClojureVerticle(ns);
  }

}
