(defproject mike/bidi-and-liberator "0.0.1-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.taoensso/timbre "4.8.0"]
                 [com.stuartsierra/component "0.3.2"]
                 [environ "1.1.0"]
                 [ring/ring-core "1.5.1"]
                 [ring/ring-jetty-adapter "1.5.1"]
                 [liberator "0.14.1"]
                 [bidi "2.0.16"]]
  :source-paths ["src/clj"]
  :test-paths ["test/clj"]
  :profiles {:uberjar {:aot :all
                       :main bidi-and-yada.main}
             :dev {:source-paths ["dev"]
                   :target-path "target/dev"
                   :dependencies [[org.clojure/tools.namespace "0.2.11"]
                                  [clj-http "3.4.1"]
                                  [org.clojure/data.json "0.2.6"]]}})
