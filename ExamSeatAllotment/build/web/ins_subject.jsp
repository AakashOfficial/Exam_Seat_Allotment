<%-- 


    Document   : ins_subject
    Created on : 12 Feb, 2017, 7:21:50 PM
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
       <ul>
           <li>
               <%
                   String a=request.getParameter("text1");
                   int aa=Integer.parseInt(a);
                   String b=request.getParameter("text2");
                   String c=request.getParameter("text3");
                   String d=request.getParameter("text4");
                   String e=request.getParameter("text5");
                   String f=request.getParameter("text6");
                   String g=request.getParameter("text7");
                   String h=request.getParameter("text8");
                   String i=request.getParameter("text9");
                   String j=request.getParameter("text10");
                   String k=request.getParameter("text11");
                   String l=request.getParameter("text12");
                   Connectivity cn=new Connectivity();
                       cn.connect();
                       String li="use mysql";
                       String q="insert into r6roll values('"+aa+"',"+b+","+c+","+d+","+e+","+f+","+g+","+h+","+i+","+k+","+l+")";
                       try{
                           cn.st.executeQuery(li);
                           cn.st.executeUpdate(q);
                           
                       }catch(SQLException evt)
                       {
                            out.println(evt.getMessage());
                        }
                
                





                %>
               
           </li>
       </ul>
    </body>
</html>
