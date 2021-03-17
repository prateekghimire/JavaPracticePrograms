package com.company;

abstract class Person{
    abstract void run();
}

public class AbstractClassEx extends Person {
    void run(){
        System.out.println("Running");
    }

    public static void main(String[] args) {
        AbstractClassEx obj = new AbstractClassEx();
        obj.run();
    }
}
