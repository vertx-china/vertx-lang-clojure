# vertx-lang-clojure
Vert.x Clojure support

### How to use?

Maven(in your pom.xml):
```xml
<dependency>
  <groupId>com.w2v4</groupId>
  <artifactId>vertx-lang-clojure</artifactId>
  <version>3.5.1.1</version>
</dependency>
```

Gradle(in your build.gradle file):
```groovy
dependencies {
  compile 'com.w2v4:vertx-lang-clojure:3.5.1.1'
}
```

### Hello from Vert.x!

```clojure
(:require [io.vertx.clojure.core.vertx :as vertx]
            [io.vertx.clojure.core.http.http-server :as server]
            [io.vertx.clojure.core.http.http-server-request :as request]
            [io.vertx.clojure.core.http.http-server-response :as response])

(defn handle-request [req]
  (let [response (request/response req)]
    (-> response
        (response/put-header "content-type" "text/plain")
        (response/end "Hello from Vert.x!"))))

(defn start [vertx]
  (let [http-server (vertx/create-http-server vertx)]
    (-> http-server
        (server/request-handler (vertx/handler handle-request))
        (server/listen 8080))))
```

;TODO

- [x] Auto-generate thin wrap APIs by using Codegen
- [x] VerticleWrapper of generated APIs(ClojureVerticle for .clj suffix namespaces)
- [x] ClojureVerticleFactory service
- [x] Tests
- [ ] Auto-generate docs by using Docgen
- [ ] Using Codox to generate on-line Clojure documentation