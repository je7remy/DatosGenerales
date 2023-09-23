package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Cargo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("     <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <link href=\"Css/departamentocss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"Css/boostrap_3.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <header> \n");
      out.write("     \n");
      out.write("    <nav class=\"navbar navbar-expand-lg fixed-top\">\n");
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
      out.write("</header>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <h1>Formulario Cargo</h1>\n");
      out.write("        <br>\n");
      out.write("    \n");
      out.write("    <div id=\"cuerpo\">\n");
      out.write("    \n");
      out.write("        <div id=\"formulario\">\n");
      out.write("            <form name=\"formcargo\" action=\"procesar.php\" method=\"post\">\n");
      out.write("                <table border=\"0\">\n");
      out.write("                \n");
      out.write("                    \n");
      out.write("     <\n");
      out.write("                 \n");
      out.write("                         <td>IDCargo</td>\n");
      out.write("                        <td>\n");
      out.write("                            \n");
      out.write("                            <select id=\"cbCargo\">\n");
      out.write("                            <option value=\"1\">01</option>\n");
      out.write("                             <option value=\"2\">02</option>\n");
      out.write("                             <option value=\"3\">03</option>\n");
      out.write("                             \n");
      out.write("                        \n");
      out.write("                        </select>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td>\n");
      out.write("                         \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        </td>     \n");
      out.write("                          \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                       \n");
      out.write("                    <td>Cargo</td>\n");
      out.write("                    <td>\n");
      out.write("                        <div class=\"logo\">\n");
      out.write("                         <input type=\"text \"  name=\"txtCargo\"/>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        </td>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                  \n");
      out.write("                    \n");
      out.write("                  \n");
      out.write("                      \n");
      out.write("                    <tr>\n");
      out.write("                       \n");
      out.write("                    <td>Funcion</td>\n");
      out.write("                    <td>\n");
      out.write("                        <div class=\"logo\">\n");
      out.write("                         <input type=\"text \"  name=\"txtfunciojn\"/>\n");
      out.write("                             \n");
      out.write("                       \n");
      out.write("                          <tr>\n");
      out.write("                              \n");
      out.write("                        <td>Estado</td>\n");
      out.write("                        <td>\n");
      out.write("                            \n");
      out.write("                            <select id=\"cbestado\">\n");
      out.write("                            <option value=\"1\">Activo</option>\n");
      out.write("                             <option value=\"2\">Inactivo</option>\n");
      out.write("                             \n");
      out.write("                        \n");
      out.write("                        </select>\n");
      out.write("                        \n");
      out.write("                        </td>\n");
      out.write("                      </tr>\n");
      out.write("                    \n");
      out.write("                      \n");
      out.write("               \n");
      out.write("                 \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                </table>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("            <button type=\"buttton\" class=\"btn btn-primary\"> guardar Datos</button>\n");
      out.write("\n");
      out.write("                \n");
      out.write("                 \n");
      out.write("        \n");
      out.write("            </form>\n");
      out.write("        </center>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("           \n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/popper.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/jquery-3.4.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("            </body>\n");
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
