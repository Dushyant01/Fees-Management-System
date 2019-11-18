<%-- 
    Document   : AddAccountant
    Created on : Jan 3, 2019, 6:21:35 PM
    Author     : Dushyant
--%>

<%@page import="project.beanForMe"%>
<%@page import="project.Connectionclass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="links.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Accountant Page</title>
        <style>a { color: #FF0000; } </style>
    </head>
    <body>
          <%@include file="background.html" %>
          
          <form method="post">
                <fieldset>
                    <legend><b>Enter the Accountant Details</b></legend>
                    <table> 
                        <tr><td><b>Name:</b></td><td><input type='text' name='name' ></td></tr>
                        <tr><td><b>Password:</b></td><td><input type='password' name='password' ></td></tr>
                        <tr><td><b>Email:</b></td><td><input type='email' name='email' ></td></tr>
                        <tr><td><b>Address:</b></td><td><input type='text' name='address' ></td></tr>
                        <tr><td><b>Contact:</b></td><td><input type='number' name='contact'></td></tr>
                        <tr><td colspan="2"><input type="submit" value="Save"/></td></tr>
                    </table>
                </fieldset>    
        </form>
        <jsp:useBean id="obj" class="project.beanForMe"></jsp:useBean>
        <jsp:setProperty name="obj" property="*"></jsp:setProperty>
      
        
        <%
            Connectionclass ne=new Connectionclass();
            ne.save(obj);
            
            %>
    </body>
</html>
