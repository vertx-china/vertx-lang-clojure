package io.vertx.lang.clojure;

import io.vertx.core.Vertx;
import org.junit.Test;

public class VerticleTest {

  //todo change to @Test using VerticleTestBase
  public static void main(String[] args){

    Vertx vertx = Vertx.vertx();
    vertx.registerVerticleFactory(new ClojureVerticleFactory());
    vertx.deployVerticle("examples.simple_http_server.clj");
  }
}
