<%-- 
    Document   : ins_student
    Created on : 12 Sep, 2017, 10:22:22 AM
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
            String a=request.getParameter("ROLL_NO");
            int aa=Integer.parseInt(a);
            String b=request.getParameter("BRANCH");
            String c=request.getParameter("SUB[1]");
            String d=request.getParameter("SUB[2]");
            String e=request.getParameter("SUB[3]");
            String f=request.getParameter("SUB[4]");
            String g=request.getParameter("SUB[5]");
            String h=request.getParameter("SUB[6]");
            String i=request.getParameter("SUB[7]");
            String j=request.getParameter("SUB[8]");
            String k=request.getParameter("SUB[8]");
            String l=request.getParameter("SUB[9]");
            String m=request.getParameter("SUB[10]");
            String n=request.getParameter("disabled");
            n.toUpperCase();
             Connectivity cn=new Connectivity();
                       cn.connect();
                       String l1="use mysql";
                       String q="insert into studentlist values("+aa+",'"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"','"+l+"','"+m+"','"+n+"')";
                       try{
                           cn.st.executeQuery(l1);
                           cn.st.executeUpdate(q);
                           
                       }catch(SQLException evt)
                       {
                            out.println(evt.getMessage());
                        }
                       response.setStatus(response.SC_MOVED_TEMPORARILY);
                       String del="Inserted Successfully";
                       String dir1="student_management.jsp";
                       response.setHeader("Location","redirect.jsp?msg="+del+"&dir="+dir1+"");
            
            
            
            
            %>
    </body>
</html>
