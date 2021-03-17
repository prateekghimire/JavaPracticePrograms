package com.company;

import javax.swing.*;
import java.awt.*;

public class LayoutGridBag {
    JFrame f;
    JButton b1,b2,b3,b4,b5,b6;

    LayoutGridBag(){
        f=new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new GridBagLayout());

        GridBagConstraints cons= new GridBagConstraints();

        b1=new JButton("Button1");
        b2=new JButton("Button2");
        b3=new JButton("Button3");
        b4=new JButton("Button4");
        b5=new JButton("Button5");
        b6=new JButton("Button6");

        cons.gridx=0;
        cons.gridy=0;
        f.add(b1,cons);
        cons.gridx=1;
        cons.gridy=1;
        f.add(b2,cons);
        cons.gridx=2;
        cons.gridy=2;
        f.add(b3,cons);
        cons.gridx=3;
        cons.gridy=3;
        f.add(b4,cons);
        cons.gridx=4;
        cons.gridy=4;
        f.add(b5,cons);
        cons.gridx=5;
        cons.gridy=5;
        f.add(b6,cons);

        f.setSize(900,800);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new LayoutGridBag();
    }

}
