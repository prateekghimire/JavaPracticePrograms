package com.company;
import javax.swing.*;
import java.awt.event.ActionListener;

public class ActionEvent implements ActionListener {
    JFrame f;
    JButton b;

    ActionEvent(){
        f=new JFrame();
        f.setSize(400,400);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b=new JButton("Button");
        b.setBounds(50,50,100,50);

        b.addActionListener(this);

        f.add(b);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        System.out.println("You clicked the button");
        System.out.println(e.getSource()==b);
    }

    public static void main(String[] args) {
        new ActionEvent();
    }
}
