package com.company;

import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        //System.out.println("Enter marks of 5 subjects");
        //float a=obj.nextFloat();
        //float b=obj.nextFloat();
        //float c=obj.nextFloat();
        //float d=obj.nextFloat();
        //float e=obj.nextFloat();
        //float percentage=(a+b+c+d+e)/5;
        //System.out.println("Your Percentage is "+percentage);
        System.out.println("Please Enter your name");
        String name=obj.nextLine();
        String message="Welcome "+name;
        System.out.println(message.toUpperCase());

    }
}
