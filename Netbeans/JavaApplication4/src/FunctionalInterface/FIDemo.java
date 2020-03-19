/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionalInterface;

import java.util.function.Function;

/**
 *
 * @author HP
 */
public class FIDemo {

    public static void main(String[] args) {
        UserService u = new UserService();
        u.DoWork(new ProcessAction() {
            @Override
            public void process() {
                System.out.println("Material Action");
            }
        });

        ProcessActionIMPL pa = new ProcessActionIMPL();
        u.DoWork(pa);

        u.DoWork(() -> System.out.println("Payment Action Executed"));
//        u.DoWork(() -> {
//            System.out.println("Payment Action Executed");
//        });

//        Function<String,Integer>i=(e)->e.length();
//        System.out.println(i.apply("bv"));

//          Function<Integer,Integer>i=(e)-> e*e*e;
        Function<Integer, Integer> i = (e) -> {
            return e * e * e;
        };
        System.out.println(i.apply(2));
    }

}
