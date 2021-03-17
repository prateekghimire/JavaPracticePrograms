package com.company;

public class OOP {
    int length,breadth;

    void setParam(int x, int y){
        this.length=x;
        this.breadth=y;
    }

    void displayArea()
    {
        System.out.println(this.length*this.breadth);
    }

    public static void main(String[] args) {

        OOP obj= new OOP();
        obj.setParam(5,0);
        obj.displayArea();
    }
    }

