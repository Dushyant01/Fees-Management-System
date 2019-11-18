<%-- 
    Document   : accountantlogin
    Created on : Jan 4, 2019, 7:34:31 AM
    Author     : Dushyant
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Accountant Login </title>
    </head>
    <body>
        <h1>Accountant Login</h1>
        <form  method="post">
             <%@include file="background.html" %>
            <fieldset>
                <table>
                <legend>
                    <b>AccountantOnly</b>
                </legend>
                <tr><td><b>Accountant_Email:<br><input type="email" name="email"></b></td></tr>
                <tr><td><b>AccountantPassword:<br><input type="password" name="password"></b></td></tr>
                        <tr><td>    <input type="submit"  value="submit"name="b"></b></td></tr>
               </table>
            </fieldset> 
                
        </form>
         <%
            
        String c=request.getParameter("email");
        String d=request.getParameter("password");
         boolean b=false;
        if(request.getParameter("b")!=null)
        {
        try{
                if(!c.equals("")&&!d.equals(""))
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/practiseproject", "root", "");
         
           PreparedStatement  ps=conn.prepareStatement("select * from accountant where email='"+c+"' and password='"+d+"'");
           ResultSet rs=ps.executeQuery();
           b=rs.next();
           
                    
           if(b)
           {
           response.sendRedirect("viewstudentaction.jsp");
           }
           else
           {
               out.print("please enter valid username");
           }
                }
                else
                {
                out.print("enter your details");
                }
        }
        catch(Exception e)
        {
        
        }
        }
        
            %>
    </body>
</html>

    </body>
</html>
