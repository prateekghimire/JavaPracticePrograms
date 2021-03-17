package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaGUI implements ActionListener {
    JFrame f;
    JButton b;
    int i=0;
    public JavaGUI(){
        f=new JFrame();
        f.setBounds(0,0,500,300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        b=new JButton("Click to generate number");
        b.setBounds(30,50,200,50);
        b.addActionListener(this);

        f.add(b);
    }
    public void actionPerformed(ActionEvent ae){
        b.setText(Integer.toString(i));
        System.out.println(ae.getSource()==b);
        i=i+1;
    }
    public static void main(String[] args){
        new JavaGUI();
    }
}
