(ns responder.core
  (:gen-class
   :methods [#^{:static true} [wow [Helloer] void]  ;we have a problem
             #^{:static true} [foo [String] void]]))

(defn -wow
  "experiment with passing more elaborate objects from java"
  [x]
  (prn "this is the type of the argument passed")
  (prn (type x)))

(defn -foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, from clojure!"))
