(ns responder.core
  (:gen-class
   :name responder.core
   :methods [^{:static true} [wow [String] void]
             ^{:static true} [foo [String] void]]
   )
  )

(defn -wow
  "experiment with passing more elaborate objects from java"
  [x]
  (prn "this is the type of the argument passed")
  (prn (type x)))

(defn -foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, from clojure!"))
