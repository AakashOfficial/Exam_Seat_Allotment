<%-- 
    Document   : fetch_allotment.jsp
    Created on : 23 Apr, 2017, 11:18:39 PM
    Author     : mithunlal
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page import="java.sql.SQLException"%>
<%@page import="SeatAllotment.CreateAllotment"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String classes[]=new String[100];
            String subjectcode[]=new String[100];
            String p,sub;
            int i,q,k;
         for(i=0,q=0,k=0;i<100;i++)
         {
             p="class"+i;
             sub="sub"+i;
             String a=request.getParameter(p);
             if(a!=null)
             {
                 out.print(a);
                 classes[q++]=a;
             }
             String b=request.getParameter(sub);
             if(b!=null)
             {
                 out.print(b);
                 subjectcode[k++]=b;
             }
         }
         String date=request.getParameter("date");
         String fan=request.getParameter("fan");
         //StringBuffer fan=new StringBuffer(request.getParameter("fan"));
             fan.toUpperCase();
         new CreateAllotment(classes,q,subjectcode,k,date+"-"+fan);
            out.print("q="+q+"k="+k);
            %>
        
    </body>
</html>
