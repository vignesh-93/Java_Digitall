/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitallschool.training.spiders;

/**
 *
 * @author HP
 */
public class AccountDemo {

    public static void main(String[] args) {
        
        SavingsAccount a1 = new SavingsAccount(123434567,500);
//        a1.debit(2000);
//        System.out.println("------");
//        a1.debit(500);
//        System.out.println("------");
        a1.debit(500);
        a1.getAccountNumber();
        System.out.println("------");
        
//        a1.debit(12000);
//        System.out.println("------");
//        a1.debit(9500);
//        System.out.println("------");
    
    
//        Account a2 = new SavingsAccount();
//        a2.debit(2000);
//        System.out.println("---");
        
    }
    
}
