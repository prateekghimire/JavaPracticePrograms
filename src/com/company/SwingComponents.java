package com.company;
import javax.swing.*;
import java.awt.*;

public class SwingComponents {
    JFrame f;
    JTextArea txtarea;
    JScrollPane sp;
    JLabel lbl;
    JCheckBox ch1,ch2;
    SwingComponents(){
        f=new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);

        //txtarea=new JTextArea(5,40);
        //sp=new JScrollPane(txtarea);

        //lbl=new JLabel("This is label.");
        //lbl.setBounds(0,0,50,10);

        //f.add(txtarea);
        //f.add(lbl);

        ch1=new JCheckBox("Choice1");
        ch2=new JCheckBox("Choice2");
        f.add(ch1);
        f.add(ch2);

        f.setVisible(true);
    }

    public static void main(String[] args) {
        new SwingComponents();
    }
}
