<%-- 
    Document   : del_usr.jsp
    Created on : 8 Apr, 2017, 7:00:25 PM
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
        <%
            String a=request.getParameter("Username");
            String b=request.getParameter("Password");
            String c=request.getParameter("Cpassword");
             if(b.equals(c))
            {
                Connectivity conn=new Connectivity();
                conn.connect();
                String q="use mysql";
                String delquery="delete from usn where username='"+a+"'";
                try
                {
                    conn.st.executeQuery(q);
                    conn.st.executeUpdate(delquery);
                }
                catch(SQLException evt)
                {
                    out.println(evt.getMessage());
                }
                       response.setStatus(response.SC_MOVED_TEMPORARILY);
                       String del="Deleted Successfully";
                       String d="User_management.jsp";
                       response.setHeader("Location","redirect.jsp?msg="+del+"&dir="+d+"");
                
            }
             else
            {
                       response.setStatus(response.SC_MOVED_TEMPORARILY);
                       String del="Passwords don't match!!..Try Again";
                       String dir1="User_management.jsp";
                       response.setHeader("Location","redirect.jsp?msg="+del+"&dir="+dir1+"");
                
            }
            
            
            
            %>
    </body>
</html>
