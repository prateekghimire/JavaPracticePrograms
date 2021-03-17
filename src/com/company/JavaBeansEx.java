package com.company;

public class JavaBeansEx {
    public static void main(String[] args) {
        JavaBeans obj=new JavaBeans();
        obj.setAge(24);
        obj.setName("Pratik");
        System.out.println(obj.getName()+obj.getAge());
    }
}
