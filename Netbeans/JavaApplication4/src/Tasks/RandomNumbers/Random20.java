/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tasks.RandomNumbers;

/**
 *
 * @author HP
 */
public class Random20 {
    
    public static void main(String[] args) {
        
        int first = 50;
        int last = 80;
        int range = last - first;
        
        for(int i = 0;i<20;i++){
       
//        int random = (int) ((Math.random() * ( last - first )) + first);
        int random = (int) (first + (Math.random() * range)); 
        System.out.println(random);
        }
    }
    
}
