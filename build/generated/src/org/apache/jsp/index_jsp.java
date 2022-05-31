package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1 style=\"text-align:center; color:#33ff33\">Registro de personas</h1>\r\n");
      out.write("\r\n");
      out.write("        <form action=\"recibirr.do\" method=\"POST\">\r\n");
      out.write("            <center>\r\n");
      out.write("            <table border=\"1px\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td> DUI:</td> <td><input type=\"text\" name=\"txtDui\" value=\"\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                \r\n");
      out.write("                      \r\n");
      out.write("                <tr>\r\n");
      out.write("               <td>  Apellidos:</th> <td><input type=\"text\" name=\"txtApellidos\" value=\"\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                \r\n");
      out.write("                <tr>\r\n");
      out.write("                    \r\n");
      out.write("               <td> Nombres:</td> <td><input type=\"text\" name=\"txtNombres\" value=\"\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                  \r\n");
      out.write("                <tr>\r\n");
      out.write("               <td>\r\n");
      out.write("                   <input type=\"submit\" value=\"Registrar Nueva Persona\"/>      \r\n");
      out.write("               </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                   </table>\r\n");
      out.write("                </center>\r\n");
      out.write("        </form>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <h1 style=\"text-align:center; color:yellow\">Eliminar Registro</h1>\r\n");
      out.write("        <h4 style=\"text-align:center; color:red\"> Por favor ingrese el N° de Dui del registro que desea eliminar</h4>\r\n");
      out.write("         <form action=\"eliminar.do\" method=\"POST\">\r\n");
      out.write("            <center>\r\n");
      out.write("            <table border=\"1px\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td> DUI:</td> <td><input type=\"text\" name=\"txtDui\" value=\"\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                             \r\n");
      out.write("                <tr>\r\n");
      out.write("               <td>\r\n");
      out.write("                   <input type=\"submit\" value=\"Eliminar\"/>      \r\n");
      out.write("               </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                   </table>\r\n");
      out.write("                </center>\r\n");
      out.write("        </form>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
