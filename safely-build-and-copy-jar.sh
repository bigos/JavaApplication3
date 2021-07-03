#!/usr/bin/bash

# make sure we are in the correct folder
cd /home/jacek/NetBeansProjects/JavaApplication3

# TODO the above does not check if we have other classes that we need

# we need to remove this class for the compilation to work
rm ./build/classes/javaapplication3/JavaApplication3.class

# go to clojure folde
cd ./clojure/responder/

# compile and copy the jar file
clj -X:uberjar :jar ./responder.jar :main-class jac.responder
cp ./responder.jar ../../lib/responder.jar
