/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tasks.MarketTask;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class TaskDemo {
    
    public static void main(String[] args) {
        

        List<Customer> cl = new ArrayList(); 
        
        cl.add(new Customer(1234,"BV",90942));
        cl.add(new Customer(2,"Hbk",2345));
        cl.add(new Customer(3,"Sa",88381));
        
        try (FileWriter out = new FileWriter("C:\\Users\\HP\\Desktop\\Markettask\\CustomerData.dat")) {
            
            for (Customer c : cl) {
                out.write(c.getCustomerId() + ",");
                out.write(c.getName() + ",");
                out.write(c.getMobileNumber() + "\n");
                System.out.println(c);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }


    
//    public static void main3(String[] args) {
//        
//        List<Customer> cl = new ArrayList(); 
//        
//        cl.add(new Customer(1,"BV",90942));
//        cl.add(new Customer(2,"Hbk",2345));
//        cl.add(new Customer(3,"Sa",88381));
//        
//        try(FileWriter out = new FileWriter("C:\\Users\\HP\\Desktop\\Markettask\\CustomerData.dat")){
//            for(Customer c:cl)
//            {
//              out.write(c.getName());
//              out.write(c.getMobileNumber());
//              out.write(c.getCustomerId());
//              
//               System.out.println(c);
//               
//            }
//        }catch(IOException ioe){
//        
//        }
//    }
    
}
