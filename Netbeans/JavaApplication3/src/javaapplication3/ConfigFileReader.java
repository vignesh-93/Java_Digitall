/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ConfigFileReader {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        File file = new File("C:\\Users\\HP\\Desktop\\Digitall.config.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine())
        {
//            System.out.println(scanner.nextLine());
            String str = scanner.nextLine();
            System.out.println(str);
            String[] split = str.split(",");
            System.out.println(split[0]);
            System.out.println(split[1]);
            
            
        }
    }
    
    static void invoke(String className, String methodName) throws Exception{
        Class meta = Class.forName(className);
       Method[] methodsList =  meta.getMethods();
       
               for(Method method:methodsList){
               System.out.println(method);
               }
                      
    }
    
}
