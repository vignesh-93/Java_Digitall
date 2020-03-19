/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitallschool.training.spiders.dateANDtime;

import java.time.LocalDate;

/**
 *
 * @author HP
 */
public class DateDemo {
    
    public static void main(String[] args) {
        
//        LocalDate l1 = new LocalDate();
        
        LocalDate l = LocalDate.now();
        System.out.println(l);
        LocalDate l1 = LocalDate.of(2019, 04, 23);
        System.out.println(l1);
    }
    
}
