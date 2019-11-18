<%-- 
    Document   : AddStudent.jsp
    Created on : Jan 4, 2019, 12:51:17 PM
    Author     : Dushyant
--%>
<%@page import="student.beanForMe"%>
<%@page import="student.Connectionclass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="links.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add Student</h1>
        <div style="height: 40px; width: 100%">
        </div>
        <form>
            <table> 
                <tr><td>Name:</td><td><input type="text" name="name"><br></td></tr>
                <tr><td>Email:</td><td><input type="email"name="email"><br></td></tr>
                <tr><td>Sex:</td><td><input type="radio" name="sex" value="male" > Male
                        <input type="radio" name="sex" value="female"> Female<br></td></tr>
                <tr><td>Stream:</td><td><select name="stream">
                <option>CSE</option>
                <option>Mechanical</option>
                <option>Civil</option>
                <option>Electrical</option>
                <option>IT</option>
                        </select><br></td></tr>
                <tr><td>Fee: </td><td> <input type="number" name="fee"><br></td></tr>
               <tr><td>Paid:</td><td><input type="number" name="paid"><br></td></tr>
               <tr><td>Due:</td><td><input type="number" name="due"><br></td></tr>
               <tr><td>Contact:</td><td><input type="number" name="contact"><br></td></tr>
               <tr><td colspan="2"><input type="submit" name="submit" value="submit"></td></tr>   
            </table>
               <%if(request.getParameter("submit")!=null)
               {%>
                 <jsp:useBean id="obj" class="student.beanForMe"></jsp:useBean>
                <jsp:setProperty name="obj" property="*"></jsp:setProperty>
        <%
            Connectionclass ne=new Connectionclass();
          int i1=ne.save(obj);
          if(i1>0)
          {
          System.out.println("inserted");
          }
          else
          {
          System.out.println("not inserted");
          }
          
}
            %>
        </form>
    </body>
</html>
