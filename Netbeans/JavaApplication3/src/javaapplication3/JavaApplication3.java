/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.lang.reflect.Method;

/**
 *
 * @author HP
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        invoke("javaapplication3.Customer","doSomething");
    }
    
    static void invoke(String className, String methodName) throws Exception{
        Class meta = Class.forName(className);
       Method[] methodsList =  meta.getMethods();
       
               for(Method method:methodsList){
               System.out.println(method);
               }
                      
    }
    
   
    
}
