/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author jacek
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("the beginning");
        
        Helloer helloer = new Helloer();
        
        helloer.everyone();
        
        String rs = helloer.everyoneReturned();
        System.out.println(rs);
        
        jac.responder.foo("123");
         
        jac.responder.wow();
        
        System.out.println("the end");
    }

}
