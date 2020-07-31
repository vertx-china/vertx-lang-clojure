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
            System.out.println("**** DEployed ! ***");
            HttpClient client = vertx.createHttpClient(new HttpClientOptions().setLogActivity(true));
            Future<HttpClientResponse> res = client.get(8080, "localhost", "/");

            res.onSuccess(resp -> {
                assertEquals(200, resp.statusCode());
                testComplete();
            });
        });
        await();
    }
}
