package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class fseccion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("      <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"Css/csseccion.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"Css/boostrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>IATESA</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <nav class=\"navbar navbar-expand-lg fixed-top\">\n");
      out.write("            <a class=\"nav-link logo\" href=\"#\">IATESA</a>\n");
      out.write("\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"enlaces navbar-nav ml-auto\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link \" href=\"#\">| Estudiantes |</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link \" href=\"#\">Docentes |</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link \" href=\"#\">Calificaciones |</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link \" href=\"#\">Documentación |</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link \" href=\"#\">Coordinación Pedagógica |</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link \" href=\"#\">Empresa |</a>\n");
      out.write("                    </li>\n");
      out.write("                   \n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write(" <p class=\"titulo\">Registro De Sección</p>\n");
      out.write(" \n");
      out.write("    <center> <div class=\"main-container\">\n");
      out.write("        <table>\n");
      out.write("           <thead>\n");
      out.write("            \n");
      out.write("                           \n");
      out.write("                    <tr>\n");
      out.write("                         \n");
      out.write("               <th>ID Sección<br> <select name=\"selectpro1\">\n");
      out.write("                <option value=\"01\">01   A</option>\n");
      out.write("                <option value=\"02\">02   B</option>\n");
      out.write("                <option value=\"03\">03   C</option>\n");
      out.write("                <option value=\"04\">04   D</option>\n");
      out.write("                \n");
      out.write("                 </select><br></th><th>Sección<br><input type=\"text\" name=\"txtcla\"><br></th>\n");
      out.write("                           \n");
      out.write("                    </tr>\n");
      out.write("                \n");
      out.write("                       <tr>\n");
      out.write("            \n");
      out.write("                        <th><br>\n");
      out.write("   \n");
      out.write("           <div>\n");
      out.write("               \n");
      out.write("       \n");
      out.write("           </div>\n");
      out.write("          \n");
      out.write("            \n");
      out.write("                            \n");
      out.write("                    </tr>\n");
      out.write("               \n");
      out.write("                </thead>\n");
      out.write("                  \n");
      out.write("            </table>\n");
      out.write("             &nbsp; <button type=\"button\" class=\"btn btn-primary\"> Guardar Datos </button> \n");
      out.write("        </div> \n");
      out.write("       \n");
      out.write("           </div>\n");
      out.write("           \n");
      out.write("  \n");
      out.write("       \n");
      out.write("     </center>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("       \n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/popper.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/jquery-3.4.1.min.js\" type=\"text/javascript\"></script>  \n");
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
