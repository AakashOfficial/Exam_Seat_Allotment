<%-- 
    Document   : del_class.jsp
    Created on : 6 Aug, 2017, 6:11:43 PM
    Author     : mithunlal
--%>
<%@page import="java.sql.SQLException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="SeatAllotment.Connectivity"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <%
            String a=request.getParameter("Name");
            Connectivity cn=new Connectivity();
                       cn.connect();
                       String l="use mysql";
                       String q="delete from class where name='"+a+"'";
                       try{
                           cn.st.executeQuery(l);
                           cn.st.executeUpdate(q);
                           
                       }catch(SQLException evt)
                       {
                            out.println(evt.getMessage());
                        }
                       response.setStatus(response.SC_MOVED_TEMPORARILY);
                       String del="Deleted Successfully";
                       String d="class_management.jsp";
                       response.setHeader("Location","redirect.jsp?msg="+del+"&dir="+d+"");
            
            %>
    </body>
</html>
