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
public class RecursionFactorial {
    
    public static int factorial(int a){
        if(a>1){
            return a*factorial(a-1);
        }
        return 1;
    }
    
    
    
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
    
}
