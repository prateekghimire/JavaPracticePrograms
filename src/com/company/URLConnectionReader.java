package com.company;

import java.net.*;
import java.io.*;
public class URLConnectionReader {
    public static void main(String[] args) throws Exception {
        URL google =new URL("https://google.com");
        URLConnection uc =google.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));

        while (in.readLine()!=null){
            System.out.println(in.readLine());
        }
    }
}