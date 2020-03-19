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
public abstract class Account {
    
    private int accountNumber;
    protected String type;
    protected double balance;
    
    {
     balance = 10000;
    }
    
    public int getAccountNumber() {
        System.out.println("Account Number "+ accountNumber);
        return accountNumber;
    }
    
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    
    public Account(int acc,int bal){
        accountNumber = acc;
        balance = bal;
    }
    
    public abstract void credit(double i);
    
    public abstract void debit(double i);
    
}
