/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ashraftask;

/**
 *
 * @author HP
 */
public class ArrngeValuesinTwoArrays {

    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7,10,41};
        int b[] = {2, 4, 6, 8,22,99,123};
        int c[] = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
//        for(int i=0;i<c.length;i++)
        while (k < c.length) {
            if ((i < a.length )&& (j < b.length)) {
                if (a[i] < b[j]) {
                    c[k] = a[i];
                    i++;
                } else {
                    c[k] = b[j];
                    j++;
                }
                k++;
            } else if ((i < a.length) || (j == b.length)) {
                c[k] = a[i];
                k++;
                i++;
            } else if ((i == a.length) || (j < b.length)) {
                c[k] = b[j];
                k++;
                j++;
            }
        }
//        System.out.println(array.toString(c[k]));
        for (i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }

}
