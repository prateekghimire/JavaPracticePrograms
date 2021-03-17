package com.company;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Day number");
        int num=obj.nextByte();
        switch (num){

            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Holiday");
                break;
        }
    }
}
