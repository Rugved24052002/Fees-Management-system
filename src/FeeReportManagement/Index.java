/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FeeReportManagement;
import java.awt.event.*;
import java.awt.*;
import static java.awt.Color.BLUE;
import java.sql.*;
import javax.swing.*;
public class Index extends JFrame implements ActionListener 
{
    JLabel l1,l2,l3,l4;
    JButton bt1,bt2;
    JPanel p1,p2,p3;
    Font f,f1;
    
    Index()
    {
        super("Home Page");
        setLocation(100,100);
        setSize(500,200);
        l1= new JLabel("Fee Report");
        l2=new JLabel("Admin Login");
        l3=new JLabel("Accountant Login");
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setForeground(BLUE);
        bt1=new JButton("Login");
        bt2=new JButton("Login");
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        f=new Font("Arial",Font.BOLD,20);
        f1=new Font("Arial",Font.BOLD,15);
        l1.setFont(f);
        l2.setFont(f1);
        l3.setFont(f1);
        bt1.setFont(f1);
        bt2.setFont(f1);
        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("FeeReportManagement/Icon/login_img.png"));
        Image img=i.getImage().getScaledInstance(130,100,Image.SCALE_DEFAULT);
        ImageIcon ii=new ImageIcon(img);
        l4=new JLabel(ii);
        
        p1=new JPanel();
        p1.setLayout(new GridLayout(1,1,10,10));
        p1.add(l1);
        p2=new JPanel();
        p2.setLayout(new GridLayout(2,2,10,10));
        p2.add(l2);
        p2.add(bt1);
        p2.add(l3);
        p2.add(bt2);
        
        p3=new JPanel();
        p3.setLayout(new GridLayout(1,1,10,10));
        p3.add(l4);
        
        setLayout(new BorderLayout(0,0));
        add(p1,"North");
        add(p2,"Center");
        add(p3,"West");
        
        
        
        
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==bt1)
        {
            new Admin_2().setVisible(true);
            this.setVisible(false);
        }
        if(e.getSource()==bt2)
        {
            new Accountant().setVisible(true);
            this.setVisible(false);
        }
        
    }
    public static void main(String[] args)
    {
        new Index().setVisible(true);
    }
    
    
}
