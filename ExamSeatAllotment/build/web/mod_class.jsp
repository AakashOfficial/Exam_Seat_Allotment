<%-- 
    Document   : mod_class.jsp
    Created on : 6 Aug, 2017, 6:45:17 PM
    Author     : mithunlal
--%>

<%@page import="java.sql.SQLException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="SeatAllotment.Connectivity"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
                       String l="use mysql";
                       String q="update class set colmn="+ba+",row1="+ca+",row2="+da+",row3="+ea+",row4="+fa+",row5="+ga+",row6="+ha+",row7="+ia+",Seattype="+ja+",dis='"+k+"' where name='"+a+"'";
                       try{
                           cn.st.executeQuery(l);
                           cn.st.executeUpdate(q);
                           
                       }catch(SQLException evt)
                       {
                            out.println(evt.getMessage());
                        }
                       response.setStatus(response.SC_MOVED_TEMPORARILY);
                       String del="Updated Successfully";
                       String dir1="class_management.jsp";
                       response.setHeader("Location","redirect.jsp?msg="+del+"&dir="+dir1+"");
              
            
            %>
    </head>
    <body>
        
    </body>
</html>
