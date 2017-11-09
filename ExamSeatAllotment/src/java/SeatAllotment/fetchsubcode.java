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
public class fetchsubcode {
    public void fetchsub(String p)
    {
        Connectivity co=new Connectivity();
        co.connect();
        int a;
        String b;
        String c;
        String d;
        String e;
        String f;
        String g;
        String h;
        String i;
        String j;
        String k;
        String li;
        String l="use mysql";
        String q="select * from r6roll where sub1='"+p+"' or sub2='"+p+"' or sub3='"+p+"' or sub4='"+p+"' or sub5='"+p+"' or sub6='"+p+"' or sub7='"+p+"' or sub8='"+p+"' or sub9='"+p+"' or sub10='"+p+"'";
        try {
            co.st.executeQuery(l);
            co.rs=co.st.executeQuery(q);
            while(co.rs.next())
            {
                  a=co.rs.getInt(1);
                  System.out.println(a);
                  b=co.rs.getString(2);
                  c=co.rs.getString(3);
                  d=co.rs.getString(4);
                  e=co.rs.getString(5);
                  f=co.rs.getString(6);
                  g=co.rs.getString(7);
                  h=co.rs.getString(8);
                  i=co.rs.getString(9);
                  j=co.rs.getString(10);
                  k=co.rs.getString(11);
                  li=co.rs.getString(12);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(fetchclass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
class main1
{
    public static void main(String[] args)
    {
        fetchsubcode f=new fetchsubcode();
        
    }
}