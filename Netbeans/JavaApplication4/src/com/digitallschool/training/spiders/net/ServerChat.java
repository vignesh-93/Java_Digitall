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
public class ServerChat {
    
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        ServerSocket server = new ServerSocket(3000);
        Socket client = server.accept();

        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);

        String data = "Hello";
        out.println(data);
        while (true) {
            data = in.readLine();
            System.out.println("Client: " + data);
            if (data.equalsIgnoreCase("Bye")) {
                break;
            }

            System.out.print("Server: ");
            data = input.readLine();
            out.println(data);
            if (data.equalsIgnoreCase("Bye")) {
                break;
            }
        }

        client.close();
        server.close();
    }

}
