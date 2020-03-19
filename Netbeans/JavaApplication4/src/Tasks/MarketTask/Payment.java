/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tasks.MarketTask;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Payment {

    private int paymentId;
    private int customerId;
    private int amount;
    private LocalDate paidOn;
    static List<Payment> paymentList = new ArrayList();

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public LocalDate getPaidOn() {
        return paidOn;
    }

    public void setPaidOn(LocalDate paidOn) {
        this.paidOn = paidOn;
    }

    public Payment(int paymentId, int customerId, LocalDate paidOn, int amount) {
        this.paymentId = paymentId;
        this.customerId = customerId;
        this.paidOn = paidOn;
        this.amount = amount;
    }
    
    @Override
    public String toString(){
            return "[" + paymentId + ", " + customerId + ", " + paidOn + ", " + amount + "]";
    }
    
    
    static void addPayment() {
        Scanner s = new Scanner(System.in);
       
       System.out.println("Enter payment ID :");
       int pid = s.nextInt();
       System.out.println("Enter customer ID :");
       int cid = s.nextInt();
//       System.out.println("Paid on :");
       LocalDate date = LocalDate.now();
       System.out.println("Enter Amount :");
       int amt = s.nextInt();
       
       paymentList.add(new Payment( pid,cid,date,amt));
       
          try (FileWriter out = new FileWriter
                                ("C:\\Users\\HP\\Desktop\\Markettask\\New folder\\PaymentListData_New.dat",true)){
           for (Payment py : paymentList) {
               out.write(py.getPaymentId() + ",");
               out.write(py.getCustomerId() + ",");
               out.write(py.getPaidOn() + ",");
               out.write(py.getAmount() + "      ");
             }
             System.out.println("Payment Detail Transfered");
         } catch (FileNotFoundException fno) {
           fno.printStackTrace();
       } catch (IOException ioe) {
           ioe.printStackTrace();
       }
    }

    static void viewPayment() {
         try{
            System.out.println("Payment Details");
            BufferedReader in;
            in = new BufferedReader(
                new FileReader("C:\\Users\\HP\\Desktop\\Markettask\\New folder\\PaymentListData_New.dat"));
            String r = "";
            if((r = in.readLine())!=null){
               String spl[] = r.split(",");
               for(int i=0;i<spl.length;i++){
                   System.out.println(spl[i]);
                System.out.println("");
               }
            }
            
        } catch (FileNotFoundException ex) {
           
        } catch (IOException ex) {
            
        }

    }

    static void updatePayment() {
        
    }

    static void exitPayment() {
        
    }
    
}
