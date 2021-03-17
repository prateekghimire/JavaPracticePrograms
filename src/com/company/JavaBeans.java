package com.company;

import java.io.Serializable;

public class JavaBeans implements Serializable {
    String name;
    int age;

    public JavaBeans(){}

    public void setName(String x){
        this.name=x;
    }
    public void setAge(int x){
        this.age=x;
    }
    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }
}
