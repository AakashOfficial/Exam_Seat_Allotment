<%-- 
    Document   : getusp
    Created on : 26 Jan, 2017, 10:05:22 AM
    Author     : mithunlal
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page import="java.sql.SQLException"%>
<%@page import="SeatAllotment.Connectivity"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <ul>
            <li><p><b>Username:</b></p>
                <% String s= request.getParameter("user");
                    out.println(s);%>
            </li>
        </ul>
            <ul>
                <li>
                    <p><b>Password:</b></p>
                    <% Connectivity c=new Connectivity();
                       c.connect();
                      
                        String p=request.getParameter("pass");
                        out.println(p);
                        String l="use mysql";
                       
                        try
                        {
                            c.st.executeQuery(l);
                             //c.st.execute("create table usn(username character(20),user_id character(20),password character(20),privilege character(20))");
                        //c.st.executeUpdate("insert into usn values('jj','jerin','jj',1)");
                        String chkquery="select * from usn where username='"+s+"'";
                            c.rs=c.st.executeQuery(chkquery);
                            while(c.rs.next())
                            {
                            String a=c.rs.getString(1);
                            String b=c.rs.getString(2);
                            String ca=c.rs.getString(3);
                            String d=c.rs.getString(4);
                            if(ca.compareTo(p)==0)
                            {
                            Cookie username=new Cookie("username",a);
                            Cookie userid=new Cookie("userid",b);
                            Cookie privilege=new Cookie("privilege",d);
                            username.setMaxAge(30*60);
                            userid.setMaxAge(30*60);
                            privilege.setMaxAge(30*60);
                            response.addCookie(username);
                            response.addCookie(userid);
                            response.addCookie(privilege);
                            out.print("login succ");
                            //System.out.println("className.methodName()");
                            String site="./HomePage.jsp";
                            response.sendRedirect(site);
                            }
                            else
                            {
                                String site1="./Login.jsp";
                                out.print("::::::::::::::::::::::");
                                response.sendRedirect(site1);
                            }
                            }
                            
                        }
                        catch(SQLException e)
                        {
                            out.println(e.getMessage()+"::::");
                        }
                        catch(NullPointerException e)
                        {
                            out.print("Nullpointer exception");
                        }
                        %>
                </li>
            </ul>
           
                
               
    </body>
</html>
