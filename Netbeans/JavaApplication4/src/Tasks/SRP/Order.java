/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tasks.SRP;

import java.time.YearMonth;
import java.util.Date;

/**
 *
 * @author HP
 */
public class Order {

    int orderId;
    Date orderedOn;
    double amount;

    int[] orderItemIds;
    double[] orderItemPrices;
    int[] orderItemQuantities;

   interface Payment{}
   interface Shipping{}

  

    public void createOrder() {
        System.out.println("Order is created");
    }

   
    public boolean processOrder() {
        throw new UnsupportedOperationException("To be implemented");
    }

    
    
}
