/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionalInterface.LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author HP
 */
public class LambdaDemo {

    public static void main(String[] args) {

        List<Integer> t = Arrays.asList(5, 8, 12, 15, 6);
        System.out.println(t);
        
//        for(Integer i : t){
//            System.out.println(i*i*i);
//        }   
        
//        for(int i=0;i<t.size();i++){
//            Integer v  = t.get(i);
//            System.out.println(v*v*v);
//        }
        
//        t.forEach(i -> System.out.println(i*i*i));
        
          t = t.stream().map(i->i*i*i).collect(Collectors.toList());
          System.out.println(t);
          
    }

}
