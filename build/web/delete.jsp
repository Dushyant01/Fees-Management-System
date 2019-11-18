<%-- 
    Document   : delete
    Created on : Jan 2, 2019, 12:39:48 PM
    Author     : Dushyant
--%>

<%@page import="project.beanForMe"%>
<%@page import="project.Connectionclass"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="project.userDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>
            Delete
        </title>
    </head>
    <body>
        
          <%
                    String id=request.getParameter("id");
                     int id1=Integer.parseInt(id);
                 
                 
                 Connectionclass n=new Connectionclass();
                 beanForMe d=new beanForMe();
                 d.setId(id1);
                int t= n.delete(d);
                 if(t>=1)
                 {
                     out.print("inserted");
                 }
                 else
                 {
                     out.print("not inserted");
                 }
                 response.sendRedirect("viewaccountant1.jsp");

          %>
    </body>
</html>
