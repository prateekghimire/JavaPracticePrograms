package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class WindowExample {
        JFrame f;
        WindowExample(){
            f=new JFrame();
            f.setLayout(null);
            f.setSize(500,500);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.addWindowListener(new WindowAdapter() {
                @Override
                public void windowOpened(WindowEvent e) {
                    System.out.println("Window opened");

                }
            });

            f.setVisible(true);
        }


    public static void main(String[] args) {
        new WindowExample();
    }
}