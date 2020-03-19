/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class ArrayDemo {

    static int[] a = {14, 9, 8, 7, 16, 2, 13, 5};

    public static void main1(String[] args) {

        int a[];
        a = new int[8];
        System.out.println(a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main2(String[] args) {

        int b[];
        b = new int[]{0, 1, 2, 3, 4};

//          int a[] = new int[5];
//          int b[] = {0,1,2,3,4};
    }

    public static void main(String[] args) {

        // To add numbers in an array
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println(sum);

        //To find smallest number in an array
        int num = a[0];
        for (int i = 0; i < a.length; i++) {
            //System.out.println(a[i]);
            if (num > a[i]) {
                num = a[i];
            }
        }
        System.out.println(num);

        //To find the sum of all the digits in an array [Ex:[14,13] ==> 1+4+1+3] 
        int total = 0;
        int fnd;
        for (int i = 0; i < a.length; i++) {
            fnd = a[i];
        {
            while (fnd > 0) {
                total = total + (fnd % 10);
                fnd = fnd / 10;
            }
        }
        }
        System.out.println(total);

    }
}
