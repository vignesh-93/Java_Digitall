/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import static assignment.Menu.mainMenu;
import static assignment.Payment.paymentList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class PaymentService {
    
    static void paymentDetails(){
    
        try(BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Sathiyaseelan\\Documents\\temp\\payment.data"))){
        String temp = "";
        
        while((temp = in.readLine()) != null){
            String s[] = temp.split(",");
            
            paymentList.add(new Payment(
                    Integer.parseInt(s[0]),
                    Integer.parseInt(s[1]),
                    LocalDate.parse(s[2]),
                    Double.parseDouble(s[3])
                    
                    
            ));    
        }
        }catch(IOException ie){
        
        }
        
    }
    
     static void addPayment() {
        Scanner s = new Scanner(System.in);
       
       System.out.println("Enter payment ID :");
       int pid = s.nextInt();
       System.out.println("Enter customer ID :");
       int cid = s.nextInt();
       System.out.println("Paid on :");
       LocalDate date = LocalDate.now();
       System.out.println("Enter Amount :");
       double amt = s.nextDouble();
       
       paymentList.add(new Payment( pid,cid,date,amt));
       
          try (FileWriter out = new FileWriter("C:\\Users\\Sathiyaseelan\\Documents\\temp\\payment.data")) {
           for (Payment py : paymentList) {
               
               out.write(py.getPayment_Id() + ",");
               out.write(py.getCustomer_Id() + ",");
               out.write(py.getPaidOn() + ",");
               out.write(py.getAmount() + "      ");
     
           }
             System.out.println("File Copied Succesfully");
               
       } catch (IOException ioe) {
           ioe.printStackTrace();
       }
         mainMenu();
     }

    static void PaymentViewMenu() {
       
    }

    static void PaymentStatistics() {
    
    }

    static void PaymentExit() {
        
    }
    
}
