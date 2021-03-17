package com.company;

import java.util.Locale;

public class JavaArrays {
    public static void main(String[] args) {
        String[] players={"Ronaldo","Messi","Neymar","Salah","Pogba"};

        int i;
        for(i=0;i< players.length;i++){
            System.out.println(players[i].toLowerCase());
            if(players[i]=="Pogba"){
                System.out.println("Pogba found in the list");
            }
        }
    }
}
