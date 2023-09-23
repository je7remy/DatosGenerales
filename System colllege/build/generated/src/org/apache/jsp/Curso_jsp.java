package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Curso_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link href=\"Css/Css.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <meta charset=\"utf-8\"/>\n");
      out.write("    <meta name =\"author\" content=\"scarlet/\">\n");
      out.write("    <meta name=\"description\" content=\"Divs y css/\">\n");
      out.write("    <title> Formulario</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" herf=\"estilos.css\">\n");
      out.write("    <link href=\"boostrap.csscurso.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <link href=\"csscurso.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\n");
      out.write("\n");
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<script src=\"https://kit.fontawesome.com/a076d05399.js\"></script>\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/popper.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/jquery-3.4.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<!-- <script>window.jQuery || document.write('<script src=\"/docs/4.4/assets/js/vendor/jquery.slim.min.js\"><\\/script>')</script><script src=\"/docs/4.4/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-6khuMg9gaYr5AxOqhkVIODVIvm9ynTT5J4V1cfthmT+emCG6yVmEZsRHdxlotUnm\" crossorigin=\"anonymous\"></script>         -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("     </head>\n");
      out.write("    \n");
      out.write("    <body> \n");
      out.write("        \n");
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
      out.write("        \n");
      out.write("          \n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("       \n");
      out.write("            <tr>\n");
      out.write("            <center>  \n");
      out.write("            <h1>  Registrar Curso </h1>\n");
      out.write("            \n");
      out.write("             <div id=\"cuerpo\">\n");
      out.write("    \n");
      out.write("        <div id=\"formulario\">\n");
      out.write("            <form name=\"formregistro\" action=\"procesar.php\" method=\"post\">\n");
      out.write("                <table border=\"0\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr> \n");
      out.write("                <td>IdCurso</td>\n");
      out.write("                 <td>\n");
      out.write("                     <input type=\"text\" name=\"txtIDCurso\"/>\n");
      out.write("                </td>\n");
      out.write("            \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("             <tr>\n");
      out.write("            \n");
      out.write("            <td>IdGrado</td>\n");
      out.write("        \n");
      out.write("                 <td>\n");
      out.write("                    <input type=\"text\" name=\"txtIdGrado\"/>\n");
      out.write("                 </td>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("         <tr> \n");
      out.write("                <td>Especialidad</td>\n");
      out.write("                 <td>\n");
      out.write("                     <input type=\"text\" name=\"txtEspecialidad\"/>\n");
      out.write("                </td>\n");
      out.write("            \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                 \n");
      out.write("                <td>IdSeccion</td>\n");
      out.write("                 <td>\n");
      out.write("                     <input type=\"text\" name=\"txtIDSeccion\"/>\n");
      out.write("                </td>\n");
      out.write("            \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("             <tr> \n");
      out.write("                <td>Curso</td>\n");
      out.write("                 <td>\n");
      out.write("                     <input type=\"text\" name=\"txtCurso\"/>\n");
      out.write("                </td>\n");
      out.write("            \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("             <tr> \n");
      out.write("                <td>Estado</td>\n");
      out.write("                 <td>\n");
      out.write("                     <input type=\"text\" name=\"txtEstado\"/>\n");
      out.write("                </td>\n");
      out.write("            \n");
      out.write("            </tr>\n");
      out.write("                </form>\n");
      out.write("        \n");
      out.write("     \n");
      out.write("    \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("            </center> \n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/popper.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/jquery-3.4.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
