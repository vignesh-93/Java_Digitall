/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class Payment {
 
    private int payment_Id;
    private int customer_Id;
    private LocalDate paidOn;
    private double amount;
    
    static List<Payment> paymentList = new ArrayList();
    
     public Payment(int pid, int cid, LocalDate date, double amt) {
        setPayment_Id(pid);
        setCustomer_Id(cid);
        setPaidOn(date);
        setAmount(amt);
         
    }
     @Override
    public String toString(){
        return "[" + payment_Id + ", " + customer_Id + ", " + paidOn + ", " + amount + "]";
    }

    public Payment(int i,int c,double a){
        this.payment_Id = i;
        this.amount = a;
        this.customer_Id = c;
    }

    public int getPayment_Id() {
        return payment_Id;
    }

    public void setPayment_Id(int Payment_Id) {
        this.payment_Id = Payment_Id;
    }

    public int getCustomer_Id() {
        return customer_Id;
    }

    public void setCustomer_Id(int customer_Id) {
        this.customer_Id = customer_Id;
    }

    public LocalDate getPaidOn() {
        return paidOn;
    }

    public void setPaidOn(LocalDate paidOn) {
        this.paidOn = paidOn;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
}
