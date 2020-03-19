/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FTP;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.net.Socket;

/**
 *
 * @author HP
 */
public class DigitallFTPClient {
 
    public static void main(String[] args) throws Exception {
        
        BufferedReader dt = new BufferedReader(new InputStreamReader(System.in)); 
//        dt.readUTF();
//        dt.readLine();
//          Socket clientSocket = new Socket("192.168.6.55",2015);
//        Socket clientSocket = new Socket("192.168.6.94",3000);
        Socket clientSocket = new Socket("192.168.6.123",3000);
//       Socket clientSocket = new Socket("192.168.6.126",5000);
        BufferedReader server = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); 
//        System.out.println("Connected");
//        System.out.println(server.readLine());
        
         PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
//        /*out.write("HI");
//        out.newLine();
//        out.flush();*/
//        out.println("HI:Vignesh");
        out.println("GIVE : ftpdemo.txt");
        while(server.readLine() != null){
        System.out.println(server.readLine());
        }
    }
}
