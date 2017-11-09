<%-- 
    Document   : redirect
    Created on : 6 Aug, 2017, 5:35:59 PM
    Author     : mithunlal
--%>

<%@page import="java.sql.SQLException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="SeatAllotment.Connectivity"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            String a=request.getParameter("msg");
            String b=request.getParameter("dir");
            out.print("<h1>"+a+"</h1></br>");
            out.print("<a href="+b+">Click here!</a>");
            
            
            %>
        
        
    </body>
</html>
