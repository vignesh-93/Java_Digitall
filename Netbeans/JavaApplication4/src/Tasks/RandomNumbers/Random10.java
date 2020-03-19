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
public class Random10 {
 
    public static void main(String[] args) {
        
        int first = 10;
        int last = 100;
        int range = last - first;
        
        for(int i = 0;i<10;i++){
       
//        int random = Math.random()*range + ; 
        int random = (int)(Math.random() * range) + first; 
        System.out.println(random);
        }
    }
    
}
