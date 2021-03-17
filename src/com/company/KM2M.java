package com.company;

import java.util.Scanner;

public class KM2M {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter KM");
    float km=obj.nextFloat();
    float m=km*1000;
        System.out.println(m+" meters.");
}
}
