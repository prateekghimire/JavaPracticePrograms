package com.company;

public class ExceptionEx {

    public static double dividefunc(int a,int b) throws ArithmeticException{
        double result=a/b;
        return result;
    }

    public static void main(String[] args) {
        try {
            System.out.println(dividefunc(10, 5));
        }

        catch (ArithmeticException e){
            System.out.println("Exception occured");
        }

        finally{
            System.out.println("Final statement");
        }
    }
}
