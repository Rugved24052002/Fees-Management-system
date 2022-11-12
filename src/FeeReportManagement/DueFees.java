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
public class DueFees extends JFrame {
    String x[]={"Roll no","Name","Email","Course","Fee","Paid","Due","address","City","State","Country","mobile"};
    String y[][]=new String[100][12];
    int i=0,j=0;
    JTable t;
    Font f;
    
    DueFees()
    {
      super("Due Fees Student");
      setLocation(1,1);
      setSize(1300,400);
      
      f=new Font("MS UI Gothic",Font.BOLD,15);
      try{
          Connection_Class obj =new Connection_Class();
          String q="select * from add_Student where due>0";
          ResultSet rest=obj.stm.executeQuery(q);
          while(rest.next())
          {
              y[i][j++]=rest.getString("rollno");
              y[i][j++]=rest.getString("name");
              y[i][j++]=rest.getString("email");
              y[i][j++]=rest.getString("course");
              y[i][j++]=rest.getString("fee");
              y[i][j++]=rest.getString("paid");
              y[i][j++]=rest.getString("due");
              y[i][j++]=rest.getString("address");
              y[i][j++]=rest.getString("city");
              y[i][j++]=rest.getString("state");
              y[i][j++]=rest.getString("country");
              y[i][j++]=rest.getString("mobile");
              i++;
              j=0;
          }
          t=new JTable(y,x);
          t.setFont(f);
          
      }
      catch(Exception ee)
      {
          ee.printStackTrace();
      }
      JScrollPane sp=new JScrollPane(t);
      add(sp);
    }
    public static void main(String[] args)
    {
        new DueFees().setVisible(true);
    }
      
      
}
