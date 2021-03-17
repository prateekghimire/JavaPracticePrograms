package com.company;

import javax.swing.*;
import java.awt.*;


class LayoutBorder{
    JFrame f;
    JButton b1,b2,b3,b4,b5;

    LayoutBorder(){
        f=new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        b1=new JButton("Button1");
        b2=new JButton("Button2");
        b3=new JButton("Button3");
        b4=new JButton("Button4");
        b5=new JButton("Button5");

        f.add(b1,BorderLayout.NORTH);
        f.add(b2,BorderLayout.SOUTH);
        f.add(b3,BorderLayout.WEST);
        f.add(b4,BorderLayout.EAST);
        f.add(b5,BorderLayout.CENTER);

        f.setSize(900,300);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new LayoutBorder();
    }


}