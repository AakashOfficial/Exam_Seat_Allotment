<%-- 
    Document   : ins_user.jsp
    Created on : 8 Apr, 2017, 6:31:37 PM
    Author     : mithunlal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.SQLException"%>
<%@page import="SeatAllotment.Connectivity"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <ul>
    <li>
        <%
            String a=request.getParameter("Username");
            String b=request.getParameter("Userid");
            String c=request.getParameter("Password");
            String d=request.getParameter("Cpassword");
            String e=request.getParameter("Privilege");
            if(c.equals(d))
            {
                Connectivity conn=new Connectivity();
                conn.connect();
                String q="use mysql";
                String insquery="insert into usn values('"+a+"','"+b+"','"+c+"','"+e+"')";
                try
                {
                    conn.st.executeQuery(q);
                    conn.st.executeUpdate(insquery);
                }
                catch(SQLException evt)
                {
                    out.println(evt.getMessage());
                }
                       response.setStatus(response.SC_MOVED_TEMPORARILY);
                       String del="Inserted Successfully";
                       String dir1="User_management.jsp";
                       response.setHeader("Location","redirect.jsp?msg="+del+"&dir="+dir1+"");
            }
            


            
            
            
            
            
            %>
    </li>
        </ul>
    </body>
</html>
