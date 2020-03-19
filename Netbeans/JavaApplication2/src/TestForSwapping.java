/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class TestForSwapping {
    
    public static void main1(String[] args) {
            
        int[] a = {3, 9, 12, 5, 2, 8, 15, 4, 10, 2};
        int temp = 0;
        int j = a.length-1;
        for(int i=0;i<j;i++){
            if(a[i]%2!=0)
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j--;
            }
//            System.out.println(j);
//            System.out.println(a[a.length-1] + " " + a[i]);
            System.out.println(a[i]);
        }
        
    }
    
    public static void main(String[] args) {
        int[] a = {3, 9, 12, 5, 2, 8, 15, 4, 10, 2};
        int i = a[0];
        int j = a.length-1;
        int temp = 0;
        while(i<j){
            if(a[i]%2==0) i++;
            if(a[j]%2!=0) j--;
                if(i<j){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
        }System.out.println(a[i]);
    }
    
}
