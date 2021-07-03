(ns jac.responder
  (:gen-class
   :methods [#^{:static true} [wow [] void]
             #^{:static true} [foo [String] void]])
  (:import (javaapplication3 Helloer)))

;;; the problem is we have to find how to pass classes and onjects defined on java side
(defn -wow
  "experiment with passing more elaborate objects from java"
  []
  (prn "this may use helloer method to print something")
  (let [hl (new Helloer)]
    (. Helloer (everyone))))

(defn -foo
  "I don't do a whole lot."
  [x]
  (prn x "Hello, from Clojure!"))
