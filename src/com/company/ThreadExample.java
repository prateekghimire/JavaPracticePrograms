package com.company;

class ClassA implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<=10;i++){
            System.out.println("Thread A "+i);
        }
    }
}

class ClassB implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<=10;i++){
            System.out.println("Thread B "+i);
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        Thread t1=new Thread(new ClassA());
        Thread t2 =new Thread(new ClassB());
        t1.setPriority(1);
        t2.setPriority(2);
        t1.start();
        t2.start();
    }
}
