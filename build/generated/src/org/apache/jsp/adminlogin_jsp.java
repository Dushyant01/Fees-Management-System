package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class adminlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin Login  Page</title>\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Josefin+Sans|Open+Sans+Condensed:300|Satisfy\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Josefin+Sans|Open+Sans+Condensed:300|Satisfy\" rel=\"stylesheet\"> \n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/adminlogin.css\"> \n");
      out.write("       \n");
      out.write("       <meta charset=\"UTF-8\">\n");
      out.write("       <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"header-inside\" id=\"header\">\n");
      out.write("            \n");
      out.write("            <h1>Admin Page</h1>\n");
      out.write("        \n");
      out.write("            <form>         \n");
      out.write("\n");
      out.write("                <div class=\"name-admin\">\n");
      out.write("                    \n");
      out.write("                    <h4>Name: <span class=\"spaned\"><input type=\"text\" placeholder=\"Enter Name\" name=\"name\"></span></h4>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"email-admin\">\n");
      out.write("                    \n");
      out.write("                    <h4>Email: <span class=\"spaned\"><input type=\"email\" placeholder=\"Enter Email\" name=\"email\"></span></h4>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"password-admin\">\n");
      out.write("                    \n");
      out.write("                    <h4>Password: <input type=\"password\" placeholder=\"Enter Password\" name=\"password\"></h4>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"submit-admin\">\n");
      out.write("                    \n");
      out.write("                    <input type=\"submit\" value=\"submit\" name=\"b\">\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        ");

            
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
        
            
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
