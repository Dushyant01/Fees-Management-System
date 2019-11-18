<%-- 
    Document   : edit
    Created on : Dec 31, 2018, 7:38:22 PM
    Author     : Dushyant
--%>

<%@page import="project.userDao"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="links.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>
            Edit Page
        </title>
    </head>
    <body>
        <h1>Edit The data</h1>
          <%
                    String id=request.getParameter("id");
                     int s=Integer.parseInt(id);
                 
                 userDao u= new userDao();
      ResultSet rs=u.getData("select * from accountant where id='"+s+"'");
                  
                  while(rs.next())
            {%>
            <form action="edit2.jsp" method="get">
        <table>
            
                
                <td><input type='hidden' name='id' value=<%=rs.getString(1)%>></td> 
                <tr><td>Name:</td><td><input type='text' name='name' value=<%=rs.getString(2)%>></td></tr>
                <tr><td>Password:</td><td><input type='password' name='password' value=<%=rs.getString(3)%>></td></tr>
                <tr><td>Email:</td><td><input type='email' name='email' value=<%=rs.getString(4)%>></td></tr>
                <tr><td>Address:</td><td><input type='text' name='address' value=<%=rs.getString(5)%>></td></tr>
                <tr><td>Contact:</td><td><input type='number' name='contact' value=<%=rs.getString(6)%>></td></tr>
                        
                        <tr><td colspan="2"><input type="submit" value="Edit & Save "/></td></tr>
                        </table>
            </form>
                        <%}%>
                   
                    
            
            
        </table>
        
    </body>
</html>
