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
public class SortingAlgorithm {
 
    public static void main(String[] args) 
    {
        int[] a={18,25,14,6,32,21,13,15};
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " "); 
        }
        System.out.println("");
        bubbleSort(a);
            for(int i=0;i<a.length;i++)
            {
                System.out.print(a[i] + " "); 
            }
    }
    
    public static void bubbleSort(int[] x)
    {
          int count = 0;
          for(int i=0;i < x.length; i++)
          {
              for(int j = i+1;j < x.length; j++) 
              {
                count++;
                  if(x[i]>x[j]){
                      int temp = x[i];
                      x[i] = x[j];
                      x[j] = temp;
                  }
              }
          }
          System.out.println("Number of times : " + count);
    }
    
}
