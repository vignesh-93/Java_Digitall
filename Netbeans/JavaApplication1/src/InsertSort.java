/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;

/**
 *
 * @author HP
 */
public class InsertSort {
    
    public static void main(String[] args) {
        int[] input = {9, 7, 3, 5, 4};

//        int currentIndex = 3;
//        int currentValue = input[currentIndex];

    
    for (int j = 1; j < input.length; j++) {
            int i = 0;
            int currentValue = input[j];
            for (i = j - 1; i >= 0; i--) {
                if (input[i] > currentValue) {
                    input[i + 1] = input[i];
                } else {
                    break;
                }
            }

            input[i + 1] = currentValue;
        }

        System.out.println(Arrays.toString(input));
    }

 }
 