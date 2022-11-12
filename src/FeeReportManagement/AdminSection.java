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


public class AdminSection extends JFrame implements ActionListener
{
    JLabel l1,l2,l3;
    JButton bt1,bt2,bt3;
    JPanel p1,p2;
    JTextField tf;
    JPasswordField pf;
    Font f,f1;
    AdminSection()
    {
        super("Admin Section");
        setLocation(100,100);
        setSize(400,280);
        l1= new JLabel("Admin Section");
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setForeground(BLUE);
        
        bt1=new JButton("Add Accountant");
        bt2=new JButton("View Accountant");
        bt3=new JButton("Logout Admin");
        
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("FeeReportManagement/Icon/admin.jfif"));
        Image img2=img.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        l2=new JLabel(img3);
        
        f=new Font("Arial",Font.BOLD,20);
        f1=new Font("Arial",Font.BOLD,15);
        
        l1.setFont(f);
        
        bt1.setFont(f1);
        bt2.setFont(f1);
        bt3.setFont(f1);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        p1=new JPanel();
        p1.setLayout(new GridLayout(4,1,10,10));
        p1.add(l1);
        p1.add(bt1);
        p1.add(bt2);
        p1.add(bt3);
        
        p2=new JPanel();
        p2.setLayout(new GridLayout(1,1,10,10));
        p2.add(l2);
        
        setLayout(new BorderLayout(10,10));
        add(p1,"Center");
        add(p2,"East");
        
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==bt1)
        {
            new AddAccountant().setVisible(true);
            
        }
        if(e.getSource()==bt2)
        {
            new ViewAccountant().setVisible(true);
            
        }
        if(e.getSource()==bt3)
        {
            this.setVisible(false);
            new Index().setVisible(true);
        }
        
        
    }
    public static void main(String[] args)
    {
        new AdminSection().setVisible(true);
    }
    
}
