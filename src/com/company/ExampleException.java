package com.company;

public class ExampleException {
    void divide(int x, int y) throws ArithmeticException{
        float ans;
        try{
            if(y==0)
                throw new ArithmeticException("Error Occured because denominator is Zero");
            System.out.println((float)x/y);
        }
        catch (ArithmeticException e){
            System.out.println("Error");
        }
    }
    public static void main(String[] args){
        ExampleException obj = new ExampleException();
        obj.divide(5,3);
    }
}
