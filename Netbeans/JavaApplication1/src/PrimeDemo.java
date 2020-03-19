/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class PrimeDemo {

    public static void main(String[] args) {
        System.out.println(isprime(27));
        System.out.println(isprime(1));
        System.out.println(isprime(13));
    }

    static boolean isprime(int a) {
        if (a == 0 || a == 1) {
//          System.out.println("Neither Prime nor Composite");
            return false;
        } else {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    return false;
                }
                //return true;
            }
        }
        return true;
    }
}
