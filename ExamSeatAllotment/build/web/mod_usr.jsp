<%-- 
    Document   : mod_usr.jsp
    Created on : 6 Aug, 2017, 10:24:45 PM
    Author     : mithunlal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.SQLException"%>
<%@page import="SeatAllotment.Connectivity"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <body>
        <%
            String a=request.getParameter("Uname");
            String b=request.getParameter("Pword");
            String c=request.getParameter("Cpword");
            String pass;
            Connectivity conn=new Connectivity();
                conn.connect();
                String q="use mysql";
                String q1="select password from usn where username='"+a+"'";
                String upquery="update usn set password='"+c+"' where username='"+a+"'";
                try
                {
                    conn.st.executeQuery(q);
                    conn.rs=conn.st.executeQuery(q1);
                    if(!conn.rs.isBeforeFirst()&&conn.rs.getRow()==0)
                    {
                         response.setStatus(response.SC_MOVED_TEMPORARILY);
                       String del="Invalid Username or Password....Try again";
                       String d="User_management.jsp";
                       response.setHeader("Location","redirect.jsp?msg="+del+"&dir="+d+"");
                        
                    }
                    else
                    {
                        while(conn.rs.next())
                        {
                         pass=conn.rs.getString(1);
                    if(b.equals(pass))
                    {
                        conn.st.executeUpdate(upquery);
                        response.setStatus(response.SC_MOVED_TEMPORARILY);
                       String del="Updated Successfully";
                       String d="User_management.jsp";
                       response.setHeader("Location","redirect.jsp?msg="+del+"&dir="+d+"");
                    }
                    else
                    {
                        response.setStatus(response.SC_MOVED_TEMPORARILY);
                       String del="Old Password didn't match....Try again";
                       String d="User_management.jsp";
                       response.setHeader("Location","redirect.jsp?msg="+del+"&dir="+d+"");
                    }
                    }
                    }
                }
                catch(SQLException evt)
                {
                    out.println(evt.getMessage());
                }
                       
            
            
            %>
    </body>
</html>
