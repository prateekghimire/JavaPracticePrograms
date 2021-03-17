package com.company;

public class SumOfFirstNNumbers {
   static int mainfunc(int x){
        if(x==0){
            return 0;
        }
        else {
            return x+mainfunc(x-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(mainfunc(1));
    }
}
