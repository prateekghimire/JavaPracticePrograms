package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class FocusEventEx implements FocusListener {

    JFrame f;
    JButton b1,b2;

    FocusEventEx()
    {
        f=new JFrame();
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1=new JButton("Button1");
        b2=new JButton("Button2");

        f.add(b1);
        f.add(b2);

        b1.addFocusListener(this);
        b2.addFocusListener(this);

        f.setLayout(new GridLayout(1,1));
        f.setVisible(true);
    }

    @Override
    public void focusGained(FocusEvent e) {
        if(e.getSource()==b1){
            System.out.println("Button1 got focus");
        }
        else {
            System.out.println("Button2 got focus");
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if(e.getSource()==b1){
            System.out.println("Button1 lost focus");
        }
        else {
            System.out.println("Button2 lost focus");
        }
    }

    public static void main(String[] args) {
        new FocusEventEx();
    }
}
