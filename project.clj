(defproject net-queues "0.1.0"
  :description "Durable, networked queues for distributed systems"
  :url "http://www.github.com/brennonyork/net-queues"
  :license {:name "MIT"
            :url "http://opensource.org/licenses/MIT"}

  :main net-queues.core

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [factual/durable-queue "0.1.3"]
                 [aleph "0.4.0-beta3"]])
