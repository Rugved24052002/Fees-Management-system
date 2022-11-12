/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FeeReportManagement;

import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
public class ViewAccountant extends JFrame implements ActionListener {
  String x[]={"Name","password","Email","Contact no","Address"};
  
String y[][]=new String[100][5];
int i=0,j=0;
JTable t;
Font f,f1;
 ViewAccountant()
 {
      super("Accountant Information");
      setLocation(1,1);
      setSize(800,400);
      f=new Font("MS UI Gothic",Font.BOLD,15);
      try
      {
          Connection_Class obj =new Connection_Class();
          String q="select * from accountant";
          ResultSet rest=obj.stm.executeQuery(q);
          while(rest.next())
          {
              y[i][j++]=rest.getString("name");
              y[i][j++]=rest.getString("password");
              y[i][j++]=rest.getString("email");
              y[i][j++]=rest.getString("contact");
              y[i][j++]=rest.getString("address");
              i++;
              j=0;
          }
          t=new JTable(y,x);
          t.setFont(f);
          
          
          
      }
      catch(Exception ex)
      {
          ex.printStackTrace();
      }
      JScrollPane sp=new JScrollPane(t);
      add(sp);
      
 }
 public static void main(String[] args)
 {
     new ViewAccountant().setVisible(true);
 }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
