/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FeeReportManagement;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.*;
import static java.awt.Color.BLUE;
import java.sql.*;
import javax.swing.*;

public class Accountant extends JFrame implements ActionListener {
    JLabel l1,l2,l3;
    JTextField tf;
    JPasswordField pf;
    JButton bt1,bt2;
    JPanel p1,p2;
    Font f,f1;
    Accountant()
    {
        super("Accountant Page");
        setLocation(100,100);
        setSize(500,200);
        
        l1=new JLabel("Accountant Login");
        l2=new JLabel("Name");
        l3=new JLabel("Password");
        
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setForeground(BLUE);
        
         bt1=new JButton("Login");
        bt2=new JButton("Cancel");
        
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        
        f=new Font("Arial",Font.BOLD,20);
        f1=new Font("Arial",Font.BOLD,15);
        
        l1.setFont(f);
        l2.setFont(f1);
        l3.setFont(f1);
        bt1.setFont(f1);
        bt2.setFont(f1);
        
        tf=new JTextField();
        pf=new JPasswordField();
        tf.setFont(f1);
        pf.setFont(f1);
        
        p1=new JPanel();
        p1.setLayout(new GridLayout(1,1,10,10));
        p1.add(l1);
        
        p2=new JPanel();
        p2.setLayout(new GridLayout(3,2,10,10));
        p2.add(l2);
        p2.add(tf);
        p2.add(l3);
        p2.add(pf);
        p2.add(bt1);
        p2.add(bt2);
        
        setLayout(new BorderLayout(0,0));
        add(p1,"North");
        add(p2,"Center");
     
        
    }
    public void actionPerformed(ActionEvent e)
    {
            String name=tf.getText();
            char[] Pass=pf.getPassword();
            String Pass_2 = String.valueOf(Pass);
            if(e.getSource()==bt1)
            {
                try
                {
                    Connection_Class obj = new Connection_Class();
                    String q="select * from accountant where name='"+name+"'and password='"+Pass_2+"'";
                    ResultSet rest=obj.stm.executeQuery(q);
                    if(rest.next())
                    {
                        new AccountantSection().setVisible(true);
                        this.setVisible(false);
                        
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Your Id and Password are wrong");
                        this.setVisible(false);
                    }
                }
                catch(Exception ee)
                {
                    ee.printStackTrace();
                }
            }
            if(e.getSource()==bt2)
            {
                this.setVisible(false);
                
            }
           
         
    }    
    public static void main(String[] args)
    {
        new Accountant().setVisible(true);
        
    }
    
}
