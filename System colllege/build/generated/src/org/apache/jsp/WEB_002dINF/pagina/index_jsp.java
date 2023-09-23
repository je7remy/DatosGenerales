package org.apache.jsp.WEB_002dINF.pagina;

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Usuario Opcion</title>\n");
      out.write("            <link href=\"css/diseño.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Usuario Opcion</h1>\n");
      out.write("           ");
 out.println("Informacion"); 
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <form action=\"proceso.jsp\" method=\"post\">\n");
      out.write("            \n");
      out.write("    Nombre:\n");
      out.write("    <input type=\"text\" name=\"nombre\">\n");
      out.write("    <br/>\n");
      out.write("    Apellido:\n");
      out.write("    <input type=\"text\" name=\"apellido\">\n");
      out.write("    <br/>\n");
      out.write("    Edad:\n");
      out.write("    <input type=\"text\" name=\"edad\">\n");
      out.write(" \n");
      out.write("    <br/>\n");
      out.write("    Lenguaje preferido:\n");
      out.write("    <select name=\"lenguaje\">\n");
      out.write("      <option value=\"java\">java\n");
      out.write("      <option value=\"jsp\" selected>jsp\n");
      out.write("      <option value=\"php\">php\n");
      out.write("      <option value=\"C/C++\">C/C++\n");
      out.write("      <option value=\"C#\">C#\n");
      out.write("      <option value=\"Asp\">Asp\n");
      out.write("      <option value=\"AS3\">AS3\n");
      out.write("    </select>\n");
      out.write("    <br/>\n");
      out.write("    Me gusta el:\n");
      out.write("    <br/>\n");
      out.write("    <input type=\"Radio\" name=\"preferencia\" value= \"Diseño\"checked>Diseño\n");
      out.write("    <br/>\n");
      out.write("    <input type=\"Radio\" name= \"preferencia\"value=\"Programacion\">Programacion\n");
      out.write("    <br/>\n");
      out.write("    <input type=\"Radio\" name= \"preferencia\"value=\"Modelado\">Modelado\n");
      out.write("    <br/>\n");
      out.write("    <input type=\"Radio\" name= \"preferencia\"value=\"Gerencia\">Gerencia de proyectos\n");
      out.write("    <br/>\n");
      out.write(" \n");
      out.write("   \n");
      out.write("</form>\n");
      out.write("        </center>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
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
