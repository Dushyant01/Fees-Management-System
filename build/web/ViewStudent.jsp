<%-- 
    Document   : viewaccountant1
    Created on : Jan 3, 2019, 7:52:01 PM
    Author     : Dushyant
--%>
<%@page import="student.userDao"%>
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
        <title>JSP Page</title>
         <style> a{ color: #FF0000; } </style>
    </head>
    <body>
        <h1>View Accountant</h1>
        <table border='1' style="width:100%">
          <tr>
              <th>Id</th>
              <th>Name</th>
              <th>Email</th>
              <th>Sex</th>
              <th>Stream</th>
              <th>Fee</th>
              <th>Paid</th>
              <th>Due</th>
              <th>Contact</th>
          </tr>    
           <%@include file="background.html" %>
          <%    
                userDao u= new userDao();
                ResultSet rs=u.getData("select * from student");
                while(rs.next())
          {%>
<tr>
    <td><%=rs.getString(1)%></td>
    <td><%=rs.getString(2)%></td>
    <td><%=rs.getString(3)%></td>
    <td><%=rs.getString(4)%></td>
    <td><%=rs.getString(5)%></td>
    <td><%=rs.getString(6)%>
    <td><%=rs.getString(7)%></td>
    <td><%=rs.getString(8)%></td>
    <td><%=rs.getString(9)%></td>
    <td> <a style="text-decoration:none" href="edit.jsp?id=<%=rs.getString(1)%>">edit</a></td>
    <td> <a style="text-decoration:none" href="delete.jsp?id=<%=rs.getString(1)%>">delete</a></td></td>
    </tr>
<%}%>
        </table>
    </body>
</html>
