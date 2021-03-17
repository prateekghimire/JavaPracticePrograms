package com.company;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIAdd implements ActionListener {
    JFrame frame;
    JTextField number1,number2;
    JButton click;
    JTextField results;

    GUIAdd(){
        frame=new JFrame("Add 2 numbers");
        frame.setBounds(500,50,500,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        number1=new JTextField();
        number1.setBounds(50,50,300,50);
        number2=new JTextField();
        number2.setBounds(50,110,300,50);

        click=new JButton("Add two numbers");
        click.setBounds(50,170,300,30);
        click.addActionListener(this);

        results = new JTextField();
        results.setBounds(50,210,300,50);

        frame.add(number1);
        frame.add(number2);
        frame.add(click);
        frame.add(results);
        frame.setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        int num1=Integer.parseInt(number1.getText());
        int num2=Integer.parseInt(number2.getText());
        int result=num1+num2;
        results.setText(Integer.toString(result));
    }
    public static void main(String[] args) {
        new GUIAdd();
    }
}
