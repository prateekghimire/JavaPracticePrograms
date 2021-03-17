package com.company;
import java.io.*;

public class FileRead {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("Test.txt");
        int i;
        while((i=fr.read())!=-1){
            System.out.print((char) i);
        }
    }
}
