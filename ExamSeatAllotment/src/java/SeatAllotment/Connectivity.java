/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mithunlal
 */
package SeatAllotment;
import java.sql.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Connectivity {
    public Connection con;
    public Statement st;
    public ResultSet rs;
  
        public void connect()
    {
        try
        {
            java.lang.Class.forName("com.mysql.jdbc.Driver");
            String username="root";
            String password="mithun";
            String url="jdbc:mysql://127.0.0.1:3306/?user=root";
            con=DriverManager.getConnection(url,username,password);
            System.out.println("ok");
            st=con.createStatement();
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connectivity.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Connectivity.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void closing() throws SQLException
    {
        con.close();
       /* String s="use mysql";
        String q="create table table1(id integer(10))";
        try
        {
            st.executeUpdate(s);
            st.executeUpdate(q);
        } catch (SQLException ex) {
            Logger.getLogger(Connectivity.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
    }
}
class main
{
    public static void main(String args[])
    {
        Connectivity c=new Connectivity();
     
            c.connect();
            //c.execute();
        
    }
}
