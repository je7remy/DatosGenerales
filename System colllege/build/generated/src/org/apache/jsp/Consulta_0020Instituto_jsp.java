package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Consulta_0020Instituto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"css consulta.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("     \n");
      out.write("    <body>\n");
      out.write("        <center>  <h1>Consulta Instituto</h1>\n");
      out.write("   \n");
      out.write("         <table class=\"tabla\">\n");
      out.write("             <tr>\n");
      out.write("   <th>ID Institucion</th>\n");
      out.write("    <th>Institucion</th>\n");
      out.write("     <th>Direccion</th>\n");
      out.write("       </tr>\n");
      out.write("       \n");
      out.write("       <tr>\n");
      out.write("     <th>Correo electronico</th>\n");
      out.write("      <th>Telefono</th>\n");
      out.write("       <th>Codigo Gestion</th>\n");
      out.write("       </tr>\n");
      out.write("       <th>Codigo Cartografia</th>\n");
      out.write("        <th>Website</th>\n");
      out.write("         <th>ID Director</th>\n");
      out.write("         <tr></tr>\n");
      out.write("          <th>Slogan</th>\n");
      out.write("          <th>Sector</th>\n");
      out.write("           <th>Zona</th>\n");
      out.write("           </tr>\n");
      out.write("           <tr>\n");
      out.write("          <th>Jornada</th>\n");
      out.write("            <th>ID Regional</th>\n");
      out.write("             <th>ID Distrito</th>\n");
      out.write("             </tr>\n");
      out.write("         </table>\n");
      out.write("         \n");
      out.write("    </center>\n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("          \n");
      out.write("  \n");
      out.write("       \n");
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
