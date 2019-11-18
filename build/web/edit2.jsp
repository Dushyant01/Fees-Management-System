<%-- 
    Document   : edit2
    Created on : Dec 31, 2018, 9:42:08 PM
    Author     : Dushyant
--%>

<%@page import="project.userDao"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>
            
        </title>
    </head>
    <body>
     
       <%
           try{
                    String id=request.getParameter("id");
                    String name=request.getParameter("name");
                    String password=request.getParameter("password");
                    String email=request.getParameter("email");
                    String address=request.getParameter("address");
                    String contact=request.getParameter("contact");
                    
                    int s=Integer.parseInt(id);
                    userDao u=new userDao();
                    int i1=u.setData("update accountant set name='"+name+"',password='"+password+"',email='"+email+"',address='"+address+"',contact='"+contact+"' where id='"+s+"'");
                    if(i1>=1)
                    {
                  
       response.sendRedirect("viewaccountant1.jsp");
                    }
                    else
                    {
                        out.print("error");
                    }
                  
           }       
           catch(Exception e)
           {
               out.print("Didnot get update");
               
           }
           %>
        </form
        </body>
</html>
