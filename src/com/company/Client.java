package com.company;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 6868);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            DataInputStream din = new DataInputStream(s.getInputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while(true){
                System.out.print("Client:");
                String msg = br.readLine();
                dout.writeUTF(msg);

                String reply = din.readUTF();
                if(!reply.equals("bye"))
                    System.out.println("Server :"+reply);
                else{
                    System.out.println("Server :"+reply);
                    break;
                }

            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }


}