/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import clojure.java.api.Clojure;
import clojure.lang.IFn;

/**
 *
 * @author jacek
 */
public class Javaapplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("In the beginning there is java classpath");

        System.out.println(System.getProperty("java.class.path"));

        System.out.println("after classpath");

        Helloer helloer = new Helloer();

        helloer.everyone();

        String rs = helloer.everyoneReturned();
        System.out.println(rs);

        // any other namespace needs to be "required"
        IFn require = Clojure.var("clojure.core", "require");
        require.invoke(Clojure.read("jac.responder"));

        IFn foo = Clojure.var("jac.responder", "foo");
        foo.invoke("bar");

        IFn clpath = Clojure.var("jac.responder", "clpath");
        clpath.invoke();

        IFn wow = Clojure.var("jac.responder", "wow");
        // error for some reason this can not find java classes
        wow.invoke();

        //jac.responder.foo("123");
        //jac.responder.wow();
        System.out.println("the end");
    }
}
