/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionalInterface;

/**
 *
 * @author HP
 */
public class UserService {
    
    public void DoWork(ProcessAction t){
        System.out.println("Work Started");
        t.process();
        System.out.println("Work Ended");
    }
    
}
