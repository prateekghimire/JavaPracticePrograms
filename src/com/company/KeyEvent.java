package com.company;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyListener;
import java.security.Key;

public class KeyEvent {
    JFrame f;
    JTextField tf;

    KeyEvent(){
        f=new JFrame();
        tf=new JTextField();

        f.setLayout(null);
        f.setSize(400,400);

        tf.setSize(200,200);
        tf.addKeyListener(new KeyAdapter() {
                              @Override
                              public void keyTyped(java.awt.event.KeyEvent e) {
                                  System.out.print(e.getKeyChar());
                                  System.out.println(e.getSource()==tf);
                              }
                          });

                f.add(tf);

        f.setVisible(true);
    }

    public static void main(String[] args) {
        new KeyEvent();
    }
}
