/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tasks.SRP;

import java.time.YearMonth;

/**
 *
 * @author HP
 */
public class CCPayment implements Payment{
    
    long creditCardNumber;
    String nameOnCreditCard;
    YearMonth creditCardExpiryDate;
    short creditCardCVVNumber;
    
     public boolean processCCPayment() {
        throw new UnsupportedOperationException("To be implemented");
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
