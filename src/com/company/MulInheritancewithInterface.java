package com.company;

interface parent1{

    default void display(){
        System.out.println("Method of parent1");
    }
}

interface parent2{

    default void display(){
        System.out.println("Method of parent2");
    }
}


public class MulInheritancewithInterface implements parent1,parent2{

     public void display(){
        System.out.println("Method of child");
        parent1.super.display();
        parent2.super.display();
    }

    public static void main(String[] args) {
        MulInheritancewithInterface obj=new MulInheritancewithInterface();
        obj.display();
    }
}
