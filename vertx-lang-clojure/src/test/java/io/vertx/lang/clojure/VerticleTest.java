package io.vertx.lang.clojure;

import io.vertx.core.http.*;
import io.vertx.test.core.VertxTestBase;
import org.junit.Test;

public class VerticleTest extends VertxTestBase {

  @Test
  public void testHttpServer() {
    vertx.deployVerticle("examples.simple_http_server.clj", ar -> {
      assertTrue(ar.succeeded());
      HttpClient client = vertx.createHttpClient(new HttpClientOptions());
      HttpClientRequest req = client.request(HttpMethod.GET, 8080, "localhost", "/");
      req.exceptionHandler(err -> fail());
      req.setHandler(ar2 -> {
        if (ar2.succeeded()) {
          HttpClientResponse resp = ar2.result();
          assertEquals(200, resp.statusCode());
          testComplete();
        }
      });
      req.end();
    });
    await();
  }
}
