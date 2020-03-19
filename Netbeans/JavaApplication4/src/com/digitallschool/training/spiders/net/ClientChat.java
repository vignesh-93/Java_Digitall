/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitallschool.training.spiders.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author HP
 */
public class ClientChat {
    
     public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        Socket server = new Socket("192.168.6.55", 3000);

        BufferedReader in = new BufferedReader(new InputStreamReader(server.getInputStream()));
        PrintWriter out = new PrintWriter(server.getOutputStream(), true);

        String data = "";
        while (true) {
            data = in.readLine();
            System.out.println("Server: " + data);
            if (data.equalsIgnoreCase("Bye")) {
                break;
            }

            System.out.print("Client: ");
            data = input.readLine();
            out.println(data);
            if (data.equalsIgnoreCase("Bye")) {
                break;
            }
        }

        server.close();
    }
    
}
