/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author HP
 */
public class Multiarray {

    public static void main(String[] args) {
        int[][] a = {{5, 10, 15}, {20, 28, 30}, {26, 37, 58}};
        int sum = 0;
        int count = 0;
        int val = 28;
        String str = "It's not available";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                count++;
                if (val == a[i][j]) {
                    str = "It's available";
                }
            }
        }
        System.out.println(str);
        System.out.println(count);
    }

}
