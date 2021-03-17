package com.company;

public class MethodOverloading {

    static int plus(int x,int y){
        return (x+y);
    }
    static double plus(double x, double y){
        return (x+y);
    }

    public static void main(String[] args) {
        System.out.println(plus(1,2));
        System.out.println(plus(1.5,2.7));
    }
}
