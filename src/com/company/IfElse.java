package com.company;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any number");
        int a=obj.nextInt();
        if(a%2==0){
            System.out.println("The number you entered is even");
        }
        else{
            System.out.println("The number you entered is odd");
        }
    }
}
