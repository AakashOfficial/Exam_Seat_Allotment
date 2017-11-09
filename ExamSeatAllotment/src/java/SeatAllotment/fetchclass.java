/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SeatAllotment;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author mithunlal
 */
public class fetchclass {
    public void fetch()
    {
    Connectivity co=new Connectivity();
    co.connect();
    String l="use mysql";
    String q="select * from class";
   try {
            co.st.executeQuery(l);
            co.rs=co.st.executeQuery(q);
            while(co.rs.next())
            {
                Staticpr.a=co.rs.getString(l);
                Staticpr.b=co.rs.getInt(2);
                Staticpr.c=co.rs.getInt(3);
                Staticpr.d=co.rs.getInt(4);
                Staticpr.e=co.rs.getInt(5);
                Staticpr.f=co.rs.getInt(6);
                Staticpr.g=co.rs.getInt(7);
                Staticpr.h=co.rs.getInt(8);
                Staticpr.i=co.rs.getInt(9);
                Staticpr.j=co.rs.getInt(10);
                Staticpr.k=co.rs.getString(11);
            }
        } catch (SQLException ex) {
            Logger.getLogger(fetchclass.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
    
    
}
