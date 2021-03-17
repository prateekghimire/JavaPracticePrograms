package com.company;
import java.net.*;
public class InetAddressEx {

    public static void main(String[] args) throws Exception {
        InetAddress address=InetAddress.getByName("www.google.com");
        System.out.println(address.getHostName());
        System.out.println(address.getHostAddress());

    }
}
