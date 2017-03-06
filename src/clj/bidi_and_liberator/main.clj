(ns bidi-and-liberator.main
  (:require [com.stuartsierra.component :as component]
            [environ.core :refer [env]]
            [taoensso.timbre :as log]
            [bidi-and-liberator.system :as system])
  (:gen-class :main true))

(defn -main
  [& [port]]
  (let [port (Integer. (or port (env :port) 5000))]
    (log/info (str "Using port " port "."))
    (component/start-system
     (system/system {:id "bidi-and-liberator" :port port}))
    @(promise)))
