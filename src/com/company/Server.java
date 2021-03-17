package com.company;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            DataInputStream din;
            DataOutputStream dout;

            System.out.println("Server Initiated......");
            ServerSocket ss = new ServerSocket(6868);
            Socket s = ss.accept();
            din = new DataInputStream(s.getInputStream());
            dout = new DataOutputStream(s.getOutputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while(true){

                String msg = din.readUTF();
                if(!msg.equals("bye"))
                    System.out.println("Client:"+msg);
                else{
                    System.out.println("Client:"+msg);
                    break;
                }
                System.out.print("Server :");
                String reply = br.readLine();
                if(!reply.equals("bye"))
                    dout.writeUTF(reply);
                else{
                    dout.writeUTF(reply);
                    break;
                }

            }
            din.close();
            dout.close();
            s.close();
            ss.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }


}