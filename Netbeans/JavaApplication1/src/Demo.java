/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */

public class Demo {
  int x = 5;
  int y = 9;
  
    public static void main3(String[] args) {
        int a[] = new int[5];
        
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }
  
    public static void main(String[] args) {
        int a;
        a =0x2A;
        System.out.println(a);
        a = 567_432_156;
        System.out.println(a);
        a =040;
        System.out.println(a);
        a =0b110011;
        System.out.println(a);
        a =67_123_1;
        System.out.println(a);
        a =20;
        System.out.println(a);
    }
    public static void main2(String[] args) {
        System.out.println("Hello World");
    }
    
  public static void main1(String[] args) {
    Demo myObj1 = new Demo();
    Demo myObj2 = new Demo();
    System.out.println(myObj1.x);
    System.out.println(myObj2.y);
  }
}

