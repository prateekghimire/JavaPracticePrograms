package com.company;

import javax.swing.*;
import java.awt.*;

public class LayoutGrid {
    JFrame f;
    JButton b1,b2,b3,b4,b5,b6;

    LayoutGrid(){
        f=new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        b1=new JButton("Button1");
        b2=new JButton("Button2");
        b3=new JButton("Button3");
        b4=new JButton("Button4");
        b5=new JButton("Button5");
        b6=new JButton("Button6");

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);

        f.setSize(900,300);
        f.setLayout(new GridLayout(2,2));
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new LayoutGrid();
    }

}
