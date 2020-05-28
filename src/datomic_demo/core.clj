(ns datomic-demo.core
  (:require [datomic.api :as d]))

(defn connect
  [uri]
  (if (d/create-database uri)
    (d/connect uri))) 

