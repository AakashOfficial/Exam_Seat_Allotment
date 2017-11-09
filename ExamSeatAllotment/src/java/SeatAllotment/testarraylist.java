/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SeatAllotment;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author JERIN_JACOB
 */



//fro SQL TESTING



public class testarraylist {
    public static void main(String[] args) throws SQLException {
        ArrayList<String> ax=new ArrayList<String>(); 
           
            
            Connectivity c=new Connectivity();
                       c.connect();
            c.st.executeQuery("use mysql");
            c.st.execute("create table StudentList(ROLL_NO integer(6),branch character(10),sub1 character(20),sub2 character(20),sub3 character(20),sub4 character(20),sub5 character(20),sub6 character(20),sub7 character(20),sub8 character(20),sub9 character(20),sub10 character(20),sub11 character(20));");
            //c.st.execute("drop table Class");
//             while(c.rs.next())
//                            {
//                            String a=c.rs.getString(1);
//                            String b=c.rs.getString(2);
//                            String ca=c.rs.getString(3);
//                            String d=c.rs.getString(4);
//                            }
    }
}
