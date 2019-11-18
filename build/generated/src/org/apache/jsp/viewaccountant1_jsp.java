package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import project.userDao;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class viewaccountant1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/links.html");
    _jspx_dependants.add("/background.html");
  }

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
      out.write("<head>\n");
      out.write("<style>\n");
      out.write("    ul \n");
      out.write("    {\n");
      out.write("        list-style-type: none;\n");
      out.write("        margin: 0;\n");
      out.write("        padding: 0;\n");
      out.write("        overflow: hidden;\n");
      out.write("        background-color: #333;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    li \n");
      out.write("    {\n");
      out.write("      float: left;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    li a, .dropbtn \n");
      out.write("    {\n");
      out.write("      display: inline-block;\n");
      out.write("      color: white;\n");
      out.write("      text-align: center;\n");
      out.write("      padding: 14px 16px;\n");
      out.write("      text-decoration: none;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    li a:hover, .dropdown:hover .dropbtn \n");
      out.write("    {\n");
      out.write("      background-color: red;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    li.dropdown \n");
      out.write("    {\n");
      out.write("      display: inline-block;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .dropdown-content \n");
      out.write("    {\n");
      out.write("      display: none;\n");
      out.write("      position: absolute;\n");
      out.write("      background-color: #f9f9f9;\n");
      out.write("      min-width: 160px;\n");
      out.write("      box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("      z-index: 1;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .dropdown-content a \n");
      out.write("    {\n");
      out.write("      color: black;\n");
      out.write("      padding: 12px 16px;\n");
      out.write("      text-decoration: none;\n");
      out.write("      display: block;\n");
      out.write("      text-align: left;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .dropdown-content a:hover \n");
      out.write("    {\n");
      out.write("        background-color: #f1f1f1;}\n");
      out.write("\n");
      out.write("    .dropdown:hover .dropdown-content {\n");
      out.write("      display: block;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<ul>\n");
      out.write("  <li class=\"dropdown\">\n");
      out.write("    <a href=\"#\" class=\"dropbtn\">Admin</a>\n");
      out.write("    <div class=\"dropdown-content\">\n");
      out.write("        <a href=\"AddAccountant.jsp\">NewRegistration</a>\n");
      out.write("        <a href=\"viewaccountant1.jsp\">ShowAllRegestration</a>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </li>\n");
      out.write("  <li class=\"dropdown\">\n");
      out.write("    <a href=\"javascript:void(0)\" class=\"dropbtn\">Accountant</a>\n");
      out.write("    <div class=\"dropdown-content\">\n");
      out.write("      <a href=\"#\">FINANCE</a>\n");
      out.write("      <a href=\"#\">MANAGEMENT</a>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <style> \n");
      out.write("             a{ color: #FF0000;}\n");
      out.write("             table\n");
      out.write("             {\n");
      out.write("                 text-align:center;\n");
      out.write("             }\n");
      out.write("         </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        <a style=\"text-decoration:none\" href=\"AddAccountant.jsp\">New Registration</a>\n");
      out.write("        <h1>View Accountant</h1>\n");
      out.write("        <table border='1' style=\"width:100%\">\n");
      out.write("          <tr>\n");
      out.write("              <th>Id</th>\n");
      out.write("              <th>Name</th>\n");
      out.write("              <th>Password</th>\n");
      out.write("              <th>Email</th>\n");
      out.write("              <th>Address</th>\n");
      out.write("              <th>Contact</th>\n");
      out.write("              <th>edit</th>\n");
      out.write("              <th>delete</th>\n");
      out.write("            \n");
      out.write("          </tr>\n");
      out.write("           \n");
      out.write("           ");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        \n");
      out.write("           \n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: lightblue\">\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("          ");

               
                String name=(String)session.getAttribute("user");  
                out.print("Welcome  "+name);  
                userDao u= new userDao();
                ResultSet rs=u.getData("select * from accountant");
                while(rs.next())
{         
      out.write("\n");
      out.write("<tr><td>");
      out.print(rs.getString(1));
      out.write("</td><td>");
      out.print(rs.getString(2));
      out.write("</td><td>");
      out.print(rs.getString(3));
      out.write("</td><td>");
      out.print(rs.getString(4));
      out.write("</td><td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString(6));
      out.write("<td> <a style=\"text-decoration:none\" href=\"edit.jsp?id=");
      out.print(rs.getString(1));
      out.write("\">edit</a></td><td> <a style=\"text-decoration:none\" href=\"delete.jsp?id=");
      out.print(rs.getString(1));
      out.write("\">delete</a></td></td>\n");
      out.write("    </tr>\n");
      out.write("\n");
}
      out.write("\n");
      out.write("        </table>\n");
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
