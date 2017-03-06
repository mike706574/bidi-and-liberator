(ns bidi-and-liberator.system
  (:require [clojure.string :refer [blank?]]
            [com.stuartsierra.component :as component]
            [taoensso.timbre :as log]
            [ring.adapter.jetty :refer [run-jetty]]
            [liberator.core :refer [defresource]]
            [bidi.ring :refer (make-handler)]
            [bidi-and-liberator.service :refer [jetty-service]])
  (:gen-class :main true))

(defresource hello-world
  :available-media-types ["text/plain"]
  :handle-ok "Hello, world!")

(def routes
  ["/" {"hello" hello-world}])

(defn system [config]
  {:app (jetty-service config (make-handler routes))})
