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
public class AlgorithmBigO {

    public static void main(String[] args) {
        int[] stock = {310,310,275,275,260,290,260,260,230,230,230,310,300};
            for(int i=0;i<stock.length;i++)
                {
                    if(stock[i] == 300)
                        {
                            System.out.println(i);
                        }
                }
    }
    
    public static void main2(String[] args) {
        int[] stock = {310,310,275,275,260,290,260,260,230,230,230,310,300};
        int profit = 0;
        for(int i=1;i<stock.length;i++){
            for(int j=0;j<i;j++){
            profit = Math.max(stock[i]-stock[j],profit);         //Using Math.max
            }
        }System.out.println(profit);
    }
    
    public static void main1(String[] args) {
           
        int[] stock = {310,310,275,275,260,290,260,260,230,230,230,310,300};
        int profit=0;
        for(int i=1;i<stock.length;i++)
        { 
            for(int j=0;j<i;j++)
            {
                if(stock[j]-stock[i] > profit)               //Using IF condition
                {
                profit = stock[j] - stock[i];
                }
            }
        }
        System.out.println( profit );
     }

    
    
    
}
