package io.vertx.lang.clojure;

import io.vertx.core.Future;
import io.vertx.core.http.*;
import io.vertx.test.core.VertxTestBase;
import org.junit.Test;

public class VerticleTest extends VertxTestBase {

    @Test
    public void testHttpServer() {
        vertx.deployVerticle("examples.simple_http_server.clj", ar -> {
            assertTrue(ar.succeeded());

            HttpClient client = vertx.createHttpClient(new HttpClientOptions().setLogActivity(true));
            client.request(HttpMethod.GET, 8080, "localhost", "/", ar1 -> {
                if (ar1.succeeded()) {
                    assertTrue(true);
                } else {
                    fail();
                }
                testComplete();
            });
        });
        await();
    }
}
