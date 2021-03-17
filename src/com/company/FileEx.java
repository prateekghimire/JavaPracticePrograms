package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileEx{

    public static void main(String[] args) {

        FileReader fr=null;
        FileWriter fw=null;
        int i;
        String content="";
        try{
            fr=new FileReader("C:/Users/Prati/Documents/documents.txt");
            fw=new FileWriter("C:/Users/Prati/Documents/copywithjava.txt");

            while((i=fr.read())!=-1){
                content=content+(char)i;
            }
            System.out.println(content.length());

            //for(int x=0;x<content.length();x++){
            //    fw.write(content.charAt(x));
            //}
            fw.write(content);
            fr.close();
            fw.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found ");
        }
        catch (IOException e){
            System.out.println("IO Exception");
        }
        finally {
            System.out.println("File written successfully");
        }
    }

}