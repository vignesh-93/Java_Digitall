/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitallschool.training.spiders.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author HP
 */
public class AlgorithmsDemo {
    
    public static void main(String[] args) {
        List t = new ArrayList();
        for(int i=0; i<10; i++){
            t.add((int)(10 + Math.random() * 30));
        }
        
        System.out.println(t);
        Collections.shuffle(t);
        System.out.println(t);
        Collections.rotate(t, 3);
        System.out.println(t);
        Collections.reverse(t);
        System.out.println(t);
        Collections.swap(t, 4, 9);
        System.out.println(t);
        
        Collections.fill(t, 20);
        
        System.out.println(t);
    }

    
}
