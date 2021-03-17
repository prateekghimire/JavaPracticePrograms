package com.company;

public class StringClass {
    public static void main(String[] args) {
        String name = new String(" Pratik Ghimire ");
        String upper=name.toUpperCase();
        String lower=name.toLowerCase();
        System.out.println(name.length());
        System.out.println(name.trim().length());
        System.out.println(name.substring(1,5));
        System.out.println(name.replace("Pratik","Ram"));
        System.out.println(name.startsWith(" "));
        System.out.println(name.endsWith("e "));
        System.out.println(name.charAt(1));
        System.out.println(name.indexOf("Pratik"));
    }
}
