<%-- 
    Document   : ins_class
    Created on : 12 Feb, 2017, 6:07:56 PM
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
                String a=request.getParameter("Name");
                System.out.println(a);
                String b=request.getParameter("Column");
                int ba=Integer.parseInt(b);
                String c=request.getParameter("Row[1]");
                int ca=Integer.parseInt(c);
                String d=request.getParameter("Row[2]");
                int da=Integer.parseInt(d);
                String e=request.getParameter("Row[3]");
                int ea=Integer.parseInt(e);
                String f=request.getParameter("Row[4]");
                int fa=Integer.parseInt(f);
                String g=request.getParameter("Row[5]");
                int ga=Integer.parseInt(g);
                String h=request.getParameter("Row[6]");
                int ha=Integer.parseInt(h);
                String i=request.getParameter("Row[7]");
                int ia=Integer.parseInt(i);
                String j=request.getParameter("Seat");
                int ja=Integer.parseInt(j);
                String k=request.getParameter("dis");
                Connectivity cn=new Connectivity();
                       cn.connect();
                       //if(a.compareTo("")!=0&&b.compareTo("")!=0)
            
                       String l="use mysql";
                       String q="insert into class values('"+a+"',"+ba+","+ca+","+da+","+ea+","+fa+","+ga+","+ha+","+ia+","+ja+",'"+k+"')";
                       try{
                           cn.st.executeQuery(l);
                           cn.st.executeUpdate(q);
                           
                       }catch(SQLException evt)
                       {
                            out.println(evt.getMessage());
                        }
                       response.setStatus(response.SC_MOVED_TEMPORARILY);
                       String del="Inserted Successfully";
                       String dir1="class_management.jsp";
                       response.setHeader("Location","redirect.jsp?msg="+del+"&dir="+dir1+"");
                    
                    %>
            </li>
        </ul>
    </body>
</html>
