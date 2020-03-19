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
public class Algorithm 
{
           
    public static void main(String[] args) {
        
        int a =10,b=15,c=40,d=11;
//        System.out.println(a+" "+b+" "+c+" "+d);
        max(a,b);
        min(c,d);
        
        int[] array={18,25,14,6,32,21,13,15};
        Array(array);
        ArrayMax(array);
        ArrayMin(array);
        ArrayRev(array);
        
        char[] str={'a','b','c','d','e'};
        ArrayRot(str);
    }
    
    public static void max(int x,int y) {
        if(x>y)
        {
            System.out.println("Max is " + x);
        }
            System.out.println("Max is " +y);
    }
    
    public static void min(int x,int y) {
        if(x<y)
        {
            System.out.println("Min is " + x);
        }
        System.out.println("Min is " + y);
    }
    
    public static void Array(int[] array) {
        int total = 0;
        int count = 0;
        for(int i=0;i<array.length;i++){
//            System.out.println(array[i]);
              total += array[i];
              count ++;
        }System.out.println("Total : " + total);
         System.out.println("Count : " +count);
         System.out.println("Average : " + (total/count));
    }  
    
    public static void ArrayMax(int[] array) {
        int temp = array[0];
        for(int i=1;i<array.length;i++){
            if(temp < array[i]){
                temp = array[i];
            }
        }System.out.println("Max in Array : " + temp);
    }
    
    public static void ArrayMin(int[] array) {
           int temp = array[0];
        for(int i=1;i<array.length;i++){
            if(temp > array[i]){
                temp = array[i];
            }
        }System.out.println("Min in Array : " + temp);
    }
    
    public static void ArrayRev(int[] array) {
         for(int i = array.length-1;i >= 0;i--){
             System.out.println(array[i] + " ");
         }
    }

    public static void ArrayRot(char[] str) {
        int n = str.length; 
        int i =3;
        for(int j=0;j<n;j++){
            if(i==n){
                i = 0;
            }
            System.out.println(str[i]);
            i++;
        }
    }
}
