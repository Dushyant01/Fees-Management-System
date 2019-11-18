<%-- 
    Document   : links
    Created on : Jun 19, 2019, 10:13:20 AM
    Author     : Dushyant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
    ul 
    {
        list-style-type: none;
        margin: 0;
        padding: 0;
        overflow: hidden;
        background-color: #333;
    }

    li 
    {
      float: left;
    }

    li a, .dropbtn 
    {
      display: inline-block;
      color: white;
      text-align: center;
      padding: 14px 16px;
      text-decoration: none;
    }

    li a:hover, .dropdown:hover .dropbtn 
    {
      background-color: red;
    }

    li.dropdown 
    {
      display: inline-block;
    }

    .dropdown-content 
    {
      display: none;
      position: absolute;
      background-color: #f9f9f9;
      min-width: 160px;
      box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
      z-index: 1;
    }

    .dropdown-content a 
    {
      color: black;
      padding: 12px 16px;
      text-decoration: none;
      display: block;
      text-align: left;
    }

    .dropdown-content a:hover 
    {
        background-color: #f1f1f1;}

    .dropdown:hover .dropdown-content {
      display: block;
    }
</style>
</head>
<body>
<ul>
  <li class="dropdown">
    <a href="#" class="dropbtn">Admin</a>
    <div class="dropdown-content">
        <a href="AddAccountant.jsp">Add Accountant</a>
        <a href="viewaccountant1.jsp">View All Accountant</a>
    </div>
  </li>
  <li class="dropdown">
    <a href="javascript:void(0)" class="dropbtn">Accountant</a>
    <div class="dropdown-content">
        <a href="AddStudent.jsp">Add Student</a>
        <a href="ViewStudent.jsp">View Students</a>
      
    </div>
  </li>
</ul>


</body>
</html>
