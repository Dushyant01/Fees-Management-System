<%-- 
    Document   : adminlogin
    Created on : Jan 3, 2019, 2:07:56 PM
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
        <title>Admin Login  Page</title>
        
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

	<meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        
        <link href="https://fonts.googleapis.com/css?family=Josefin+Sans|Open+Sans+Condensed:300|Satisfy" rel="stylesheet">

	<link href="https://fonts.googleapis.com/css?family=Josefin+Sans|Open+Sans+Condensed:300|Satisfy" rel="stylesheet"> 

        <link rel="stylesheet" type="text/css" href="CSS/adminlogin.css"> 
       
       <meta charset="UTF-8">
       <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        
        <div class="header-inside" id="header">
            
            <h1>Admin Page</h1>
        
            <form>         

                <div class="name-admin">
                    
                    <h4>Name: <span class="spaned"><input type="text" placeholder="Enter Name" name="name"></span></h4>
                    
                </div>
                
                <div class="email-admin">
                    
                    <h4>Email: <span class="spaned"><input type="email" placeholder="Enter Email" name="email"></span></h4>
                    
                </div>
                
                <div class="password-admin">
                    
                    <h4>Password: <input type="password" placeholder="Enter Password" name="password"></h4>
                    
                </div>
                
                <div class="submit-admin">
                    
                    <input type="submit" value="submit" name="b">
                    
                </div>
            
            </form>
            
        </div>
        
        <%
            
            String name=request.getParameter("name");  
        session.setAttribute("user",name);
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
           PreparedStatement  ps=conn.prepareStatement("select * from admin where email='"+c+"' and password='"+d+"'");
           ResultSet rs=ps.executeQuery();
           b=rs.next();   
           if(b)
           {
           response.sendRedirect("viewaccountant1.jsp");
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
