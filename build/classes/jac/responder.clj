(ns jac.responder
  (:gen-class))

(defn foo [x]
  (println x " says hello from foo"))

(defn wow [inst]
  (. inst (everyone) ))
