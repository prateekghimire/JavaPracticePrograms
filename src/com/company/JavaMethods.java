package com.company;

public class JavaMethods {
    static int display(String name,String message){
        System.out.println("Hello "+name+", This is your secret message: "+message);
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(display("Pratik","We have a meeting tomorrow"));
    }
}
