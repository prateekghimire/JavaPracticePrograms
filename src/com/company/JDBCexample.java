package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCexample implements ActionListener {
    JFrame frame;
    JTextField fname;
    JTextField lname;
    JLabel first,last;
    JButton btn;
    JButton display;

    JDBCexample(){
        frame=new JFrame();
        frame.setBounds(400,100,500,180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        first=new JLabel("First Name:");
        first.setBounds(0,0,100,50);

        last=new JLabel("Second Name:");
        last.setBounds(0,60,100,50);

        fname=new JTextField("Enter first name");
        fname.setBounds(110,0,100,50);

        lname=new JTextField("Enter last name");
        lname.setBounds(110,60,100,50);

        btn=new JButton("Submit");
        btn.setBounds(320,20,100,30);
        btn.addActionListener(this);

        display=new JButton("Display");
        display.setBounds(320,60,100,30);
        display.addActionListener(this);

        frame.add(first);
        frame.add(last);
        frame.add(fname);
        frame.add(lname);
        frame.add(btn);
        frame.add(display);

        frame.setLayout(null);
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/java", "root", "UBNqaly W;8b&>{");
            Statement st = con.createStatement();

            if (e.getSource() == display) {
                ResultSet rs = st.executeQuery("select * from javatable");
                while (rs.next()) {
                    System.out.println(rs.getString(1) + " " + rs.getString(2));
                }
            }

            if (e.getSource() == btn) {
                String firstname = fname.getText();
                String lastname = lname.getText();
                String sql = "INSERT INTO javatable VALUES('" + firstname + "','" + lastname + "')";
                System.out.println(sql);
                st.executeUpdate(sql);
                System.out.println("Data Inserted successfully");
            }

        } catch (Exception ex) {
            System.out.println("Error Occured");
        }
    }

    public static void main(String[] args) {
        new JDBCexample();
    }
}
