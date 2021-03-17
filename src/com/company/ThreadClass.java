package com.company;

class Aa extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("Thread A "+i);
        }
    }
}

class Bb extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("Thread B "+i);
        }
    }

}

public class ThreadClass {
    public static void main(String[] args) {
        Aa obj1=new Aa();
        Bb obj2=new Bb();
        obj1.setPriority(10);
        obj2.setPriority(5);
        obj1.start();
        obj2.start();
    }
}
