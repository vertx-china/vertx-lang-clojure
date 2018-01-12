package io.vertx.lang.clojure;

import io.vertx.codegen.PropertyInfo;
import io.vertx.core.http.HttpClient;
import io.vertx.core.http.HttpClientOptions;
import io.vertx.core.http.HttpClientRequest;
import io.vertx.core.http.HttpMethod;
import io.vertx.test.core.VertxTestBase;
import org.junit.Test;

public class VerticleTest extends VertxTestBase {

  @Test
  public void testHttpServer(){
    vertx.deployVerticle("examples.simple_http_server.clj", ar -> {
//      if(!ar.succeeded()){
//        ar.cause().printStackTrace();
//      }
      assertTrue(ar.succeeded());
      HttpClient client = vertx.createHttpClient(new HttpClientOptions());
      HttpClientRequest req = client.request(HttpMethod.GET, 8080, "localhost", "/");
      req.exceptionHandler(err -> fail());
      req.handler(resp -> {
        assertEquals(200, resp.statusCode());
        testComplete();
      });
      req.end();
    });
    await();
  }

//  PropertyInfo
}
