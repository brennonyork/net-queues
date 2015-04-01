(ns net-queues.api
  (:gen-class))

(defn start-server
  "Starts a server for type `stype` on port `sport` with acceptible types
  being :tcp or :http"
  [stype sport]
  {:pre ; ensure the port is between 0 and 65535
   [(< 0 sport (- 0x10000 1))]}
  (condp = stype
    :tcp (println "tcp server with port" sport)
    :http (println "http server with port" sport)
    (println "cannot determine type" stype)))

(defn stop-server
  "Gracefully shuts down a server")
