# vertx-lang-clojure
Vert.x Clojure support.

Currently this fork is SNAPSHOT, so you need to `mvn install` to use.

### How to use?

Maven (in your pom.xml):
```xml
<dependency>
  <groupId>com.w2v4</groupId>
  <artifactId>vertx-lang-clojure</artifactId>
  <version>3.8.2-SNAPSHOT</version>
</dependency>
```

Leiningen (in your `project.clj`):

```clojure
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [io.vertx/vertx-web "3.8.2"]
                 [com.w2v4/vertx-lang-clojure "3.8.2-SNAPSHOT"]]
```


### Hello from Vert.x!

```clojure
(ns example.server
 (:require [io.vertx.clojure.core.vertx :as vertx]
           [io.vertx.clojure.core.http.http-server :as server]
           [io.vertx.clojure.core.http.http-server-request :as request]
           [io.vertx.clojure.core.http.http-server-response :as response]))

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

### Vert.x instance

If you’re embedding Vert.x then you simply create an instance as follows:

```clojure
(ns ...
  (:require [io.vertx.clojure.core.vertx :as vertx]))

;create a vertx instance
(vertx/vertx)
```

### Verticle

Verticle namespace files normally include a start function which is the entry point of verticle deployment.

Here’s an example verticle:
```clojure

;Called when verticle is deployed
(defn start [] )

;Optional - called when verticle is undeployed
(defn stop [] )

```

When Vert.x deploys the verticle it will call the start method, and when the method has completed the verticle will be considered started.

You can also optionally provide vertx and context parameters. This will be used by developers when the functions are considered pure.

```clojure

;Following functions format are all allowed, pick one.
(defn start [context vertx] )
(defn start [vertx context] )
(defn start [vertx] )
(defn start [context] )

;Following functions format are all allowed, pick one.
(defn stop [context vertx] )
(defn stop [vertx context] )
(defn stop [vertx] )
(defn stop [context] )

```

### Verticle Deployment

You could deploy a Clojure verticle with ".clj" suffix or "clj:" prefix:

```clojure
(ns example.verticle
  (:require [io.vertx.clojure.core.vertx :as vertx]))

(defn start [vertx]
  (vertx/deploy-verticle vertx "io.vertx.sample_verticle.clj"))
;or
(defn start [vertx]
  (vertx/deploy-verticle vertx "clj:io.vertx.sample_verticle"))
```

;TODO

- [x] Auto-generate thin wrap APIs by using Codegen
- [x] VerticleWrapper of generated APIs(ClojureVerticle for .clj suffix namespaces)
- [x] ClojureVerticleFactory service
- [x] Tests
- [ ] Auto-generate docs by using Docgen
- [ ] Using Codox to generate on-line Clojure documentation
