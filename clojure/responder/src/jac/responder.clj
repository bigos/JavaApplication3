(ns jac.responder
  (:gen-class
   :methods [#^{:static true} [wow [Helloer] void]  ;we have a problem
             #^{:static true} [foo [String] void]]))

;;; the problem is we have to find how to pass classes and onjects defined on java side
(defn -wow
  "experiment with passing more elaborate objects from java"
  [x]
  (prn "this is the type of the argument passed")
  (prn (type x)))

(defn -foo
  "I don't do a whole lot."
  [x]
  (prn x "Hello, from Clojure!"))
