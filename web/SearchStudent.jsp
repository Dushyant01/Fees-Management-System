<%-- 
    Document   : SearchStudent
    Created on : Jun 20, 2019, 10:09:10 AM
    Author     : Dushyant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="links.jsp"%>
<!DOCTYPE html>
<html>
    <head>
       
    </head>
    <body>
        <table>
            <form>
                <tr><td>Enter Email:</td><td><input type="email"name="email" <br></td></tr>
                <tr><td colspan="2"><input type="submit"value="submit"name="submit"</td></tr>
           </form>
        </table>
                
                <%
                if(request.getParameter("submit")!=null)
                %>
           
    </body>
</html>
