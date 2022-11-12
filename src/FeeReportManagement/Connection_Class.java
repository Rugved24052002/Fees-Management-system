/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FeeReportManagement;
import java.sql.*;

public class Connection_Class {
    Connection con;
    public Statement stm;
    Connection_Class()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:330/fees","root","password");
            stm=con.createStatement();
            if(con.isClosed())
            {
                System.out.println("Not Connected");
            }
            else
            {
                System.out.println("Connected");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            
        }
    }    
    public static void main(String[] args)
        {
            new Connection_Class();
        }
    }
    
