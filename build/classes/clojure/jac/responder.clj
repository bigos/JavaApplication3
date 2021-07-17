(ns jac.responder
  ;; both java and Clojure need to have the same classpath
  ;(:import (javaapplication3 Helloer))
  (:gen-class))

(defn foo [x]
  (println x " says hello from foo"))

(defn clpath []
  (println "On Clojure side we have that classpath "
           (. System (getProperty "java.class.path"))))

;;; calling a method of java Helloer class
(defn wow []
  (javaapplication3.Helloer/everyone))
