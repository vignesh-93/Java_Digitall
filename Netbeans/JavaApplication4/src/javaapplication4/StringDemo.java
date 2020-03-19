/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import static java.lang.Character.isAlphabetic;
import static java.lang.Character.isDigit;
import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

/**
 *
 * @author HP
 */
public class StringDemo {
    //Using ASCII Values and Converting into Char Array
    public static void main3(String[] args) {
//                String s = "Manchester City Football Club is an English football club based in Manchester, "
//                + "that competes in the Premier League, the top flight of English football. "
//                + "Founded in 1880 as St. Mark's (West Gorton), "
//                + "it became Ardwick Association Football Club in 1887 and Manchester City in 1894. "
//                + "The club's home ground is the City of Manchester Stadium in east Manchester,"
//                + " to which it moved in 2003, having played at Maine Road since 1923.";
                String s = "qwertyuQWERT123";
                char[] p = s.toCharArray();
                
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        for(int i=0;i<p.length;i++)
        {
        if(p[i]>=97 && p[i]<=122)
            {
            count1++;
            }
        if(p[i]>=65 && p[i]<=95)
            {
            count2++;
            }
        if(p[i]>=48 && p[i]<=57)
            {
            count3++;
            }
        }
        System.out.println(count2 + " Upper");
        System.out.println(count1 + " Lower");
        System.out.println(count3 + " Numbers");
    }
    
    //Using Methods and Invoking 
    public static void main4(String[] args) {
    
        String s = "Manchester City Football Club is an English football club based in Manchester, "
                + "that competes in the Premier League, the top flight of English football. "
                + "Founded in 1880 as St. Mark's (West Gorton), "
                + "it became Ardwick Association Football Club in 1887 and Manchester City in 1894. "
                + "The club's home ground is the City of Manchester Stadium in east Manchester,"
                + " to which it moved in 2003, having played at Maine Road since 1923.";
       
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        for(int i=0;i<s.length();i++)
        {
            if(isDigit(s.charAt(i)))
            {
            count1++;
            }
            if(isUpperCase(s.charAt(i)))
            {
            count2++;
            }
            if(isLowerCase(s.charAt(i)))
            {
            count3++;
            }
            if(isAlphabetic(s.charAt(i)))
            {
            count4++;
            }
        }
        System.out.println(s);
        System.out.println(s.length() + " Total");
        System.out.println(count1 + " Number");
        System.out.println(count2 + " Upper");
        System.out.println(count3 + " Lower");
        System.out.println(count4 + " Alpa");
        
    }
    
    public static void main(String[] args) {
        String s = "Java Programming Language";
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.charAt(6));
        System.out.println(s.contains("ram"));
        System.out.println(s.indexOf("ram"));
        System.out.println(s.indexOf("rom"));
        System.out.println(s.indexOf("ng"));
        System.out.println(s.lastIndexOf("ng"));
        System.out.println(s.lastIndexOf(74));             // 74--> J ASCII value
        System.out.println(s.indexOf('a',s.indexOf('a')+1));
        System.out.println("-----------------------------");
        System.out.println(s.lastIndexOf(97));             // 97 --> a ASCII value
  
    }
    
    public static void main1(String[] args) {
        
        String s = "Hyy";
        System.out.println(s);
        System.out.println(s.hashCode());
        System.out.println(System.identityHashCode(s));
        System.out.println("-------------");
        
        String s2= "Hyy";
        System.out.println(s);
        System.out.println(s2.hashCode());
        System.out.println(System.identityHashCode(s2));
        System.out.println("-------------");
        
        String s3 = new String("Hyy");
        System.out.println(s);
        System.out.println(s3.hashCode());
        System.out.println(System.identityHashCode(s3));
        System.out.println("-------------");
    }
    
    
    public static void main2(String[] args) {
        String s = "Java Programming Language";
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.charAt(6));
        System.out.println(s.contains("ram"));
        System.out.println(s.indexOf("ram"));
        System.out.println(s.indexOf("rom"));
        System.out.println(s.indexOf("ng"));
        System.out.println(s.lastIndexOf("ng"));
        System.out.println(s.lastIndexOf(65));
        System.out.println(s.indexOf('a',s.indexOf('a')+1));
        System.out.println("-----------------------------");

        char c = 'a';
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            count++;
            if (s.charAt(i) == c) {
                System.out.println(i);
            }
        }
        System.out.println("Count " + count);

        count = 0;
        int index = -1;

        do {
            count++;
            index = s.indexOf(c, index+1);
            
            if(index != -1){
                System.out.println(index);
            }
        } while (index != -1);

        System.out.println("Count " + count);
    }

    
}
    
