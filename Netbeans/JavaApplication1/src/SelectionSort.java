/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */

import java.util.Arrays;

public class SelectionSort {
    
    public static void main(String[] args) {
        int[] input = {8,1,0,3,9,6,5,7,2,4};
        
        System.out.println(Arrays.toString(input));
        System.out.println("--------");
        selectionSort(input);
        System.out.println("--------");
        System.out.println(Arrays.toString(input));
    }


    public static void selectionSort(int[] input) {
            
        
        for(int i=0;i<input.length;i++){
            int small = i;
            for(int j=i+1;j<input.length;j++){
                if(input[j]<input[small]){
                    small = j;
                }
            }
//         int temp = input[small];
//         input[small]=input[i];
//         input[i]=temp;

            int temp = input[i];
            input[i] = input[small];
            input[small] = temp;


            System.out.println(Arrays.toString(input));
        }
        
    }
    
    
//    public static void insertionSort(int array[]) {  
//        int n = array.length;  
//        for (int j = 1; j < n; j++) {  
//            int key = array[j];  
//            int i = j-1;  
//            while ( (i > -1) && ( array [i] > key ) ) {  
//                array [i+1] = array [i];  
//                i--;  
//            }  
//            array[i+1] = key;  
//        }  
//    }  
//       
//    public static void main(String a[]){    
//        int[] arr1 = {9,14,3,2,43,11,58,22};    
//        System.out.println("Before Insertion Sort");    
//        for(int i:arr1){    
//            System.out.print(i+" ");    
//        }    
//        System.out.println();    
//            
//        insertionSort(arr1);//sorting array using insertion sort    
//           
//        System.out.println("After Insertion Sort");    
//        for(int i:arr1){    
//            System.out.print(i+" ");    
//        }    
//    }    

}
