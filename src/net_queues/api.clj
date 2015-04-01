(ns net-queues.api
  (:require [net-queues.util :as util])
  (:gen-class))

(defn start-server
  "Starts a server for type `stype` on port `sport` with acceptible types
  being :tcp or :http"
  [stype sport]
  {:pre ; ensure the port is between 0 and 65535
   [(< 0 sport (- 0x10000 1))]}
  ; setup a shutdown hook to properly handle resource deallocation
  (.addShutdownHook (Runtime/getRuntime) util/shutdown-hook)
  (condp = stype
    :tcp (println "tcp server with port" sport)
    :http (println "http server with port" sport)
    (println "cannot determine type" stype)))
