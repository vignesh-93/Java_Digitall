/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitallschool.training.spiders.learn.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class JDBCDemo {

    static BufferedReader input = null;

    static {
        input = new BufferedReader(new InputStreamReader(System.in));
    }

    public static void main(String[] args) throws Exception {
//        addAuthor();
//        readAuthor();
          addPublisher();
          readPublisher();
    }

    
    //Author Working
    
    public static void addAuthor() {

//        Scanner dbData = new Scanner(System.in);
////        int id = dbData.nextInt();
//        String name = dbData.next();
//        String mail = dbData.next();
//        String profile = dbData.next();
//        String blog = dbData.next();
//        Connection root = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","student123");
//        Statement stmnt = root.createStatement();
//        String query = "Insert into authors values('"+name+"','"+mail+"','"+profile+"','"+blog+"')";
//        int rs1 = stmnt.executeUpdate(query);       
//        ResultSet addqry = stmnt.executeQuery("insert into authors values(id,name,mail,profile,blog)");
        try {
            input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("##### Author Details #####");
            System.out.println("Enter the name");
            String name = input.readLine();
            System.out.println("Enter the email");
            String mail = input.readLine();
            System.out.println("Enter the Profile");
            String profile = input.readLine();
            System.out.println("Enter the blog");
            String blog = input.readLine();
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root",
                    "student123"); Statement st = con.createStatement();) {
                String insertQuery = ("INSERT INTO authors " + "VALUES (0,'" + name + "','" + mail + "','" + profile
                        + "','" + blog + "')");
                st.executeUpdate(insertQuery);
                System.out.println("Record inserted");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void readAuthor() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "student123");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM authors");

            while (rs.next()) {
//                System.out.println(
//                        rs.getInt(1) + "#"
//                        + rs.getString(2) + "#"
//                        + rs.getString(3) + "#"
//                        + rs.getString(4) + "#"
//                        + rs.getString(5) + "#"
//                );
                    System.out.printf("%5d | %-25s | %-25s | %-30s | %-15s%n", 
                            rs.getInt(1), rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5));
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Publisher Work && Using Transaction
    
    public static void addPublisher() {
        try {
            //Getting data from the User
            input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("##### Publisher Details #####");
            System.out.println("Enter the name");
            String name = input.readLine();
            System.out.println("Enter the email");
            String mail = input.readLine();
            System.out.println("Contact");
            int contact;
            contact = (int) Long.parseLong(input.readLine());
            System.out.println("Address");
            String address = input.readLine();
            //Establishing the Connection
            //Creating a statement 
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root",
                    "student123"); Statement st = con.createStatement();) 
            {
            //Starting Transaction  
            con.setAutoCommit(false);
                try(Statement st1 = con.createStatement();){
                //Inserting Punlisher Data into DB
                String insertQuery = ("INSERT INTO publishers " + "VALUES (0,'" + name + "','" + mail + "','" + contact
                        + "','" + address + "')");
                st.executeUpdate(insertQuery);
                con.commit();
                System.out.println("Commit Successful");
                System.out.println("Record inserted");  
                }catch(Exception e){
//                    e.printStackTrace();
                      System.out.println("Rollback to Orginal Data");
                      con.rollback();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
        public static void readPublisher() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "student123");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM publishers");

            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + "|"
                        + rs.getString(2) + "|"
                        + rs.getString(3) + "|"
                        + rs.getInt(4) + "|"
                        + rs.getString(5) + "|"
                );
//                    System.out.printf("%5d | %-25s | %-25s | %-30d | %-15s%n", 
//                            rs.getInt(1), rs.getString(2),rs.getString(3), rs.getInt(4), rs.getString(5));
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
