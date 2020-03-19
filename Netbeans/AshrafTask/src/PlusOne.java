
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class PlusOne {

    public static void main(String[] args) {
         
        int arr[] = {1,5,8};
        List<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            a.add(arr[i]);
        }
         int n = a.size()-1; 
        a.set(n,a.get(n)+1);
        for(int i=n;i>0 && a.get(i)==10;--i){
        a.set(i,0);
        a.set(i-1,a.get(i-1)+1);
        }
        if(a.get(0)==10){
        a.set(0,1);
        a.add(0);
        }
        for(int i:a)
        {
            System.out.println(i);
        }
        
       
//        int add[] = {9,9,9,9};
//        for(int i=add.length-1;i>=0;i--){
//            
//            add[i]=add[i]+1;
//            if(add[i]==10){
//                add[i]=0;
//            }else{
//                break;
//            }
//        }
//        for(int i=0;i<add.length;i++){
//            System.out.println(add[i]);
//        }
  }
 
}
