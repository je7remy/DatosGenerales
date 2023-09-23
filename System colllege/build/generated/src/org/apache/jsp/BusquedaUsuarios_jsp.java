package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class BusquedaUsuarios_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\"> \n");
      out.write("    <link rel=\"shortcut icon\" href=\"#\" /> \n");
      out.write("    <title>IATESA </title>\n");
      out.write("   \n");
      out.write("      \n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <!-- CSS personalizado -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"main.css\">  \n");
      out.write("      \n");
      out.write("    <!--datables CSS básico-->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"datatables/datatables.min.css\"/>\n");
      out.write("    <!--datables estilo bootstrap 4 CSS-->  \n");
      out.write("    <link rel=\"stylesheet\"  type=\"text/css\" href=\"datatables/DataTables-1.10.18/css/dataTables.bootstrap4.min.css\">\n");
      out.write("           \n");
      out.write("    <!--font awesome con CDN-->  \n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.2/css/all.css\" integrity=\"sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay\" crossorigin=\"anonymous\">  \n");
      out.write("    <!-- coneciones css -->\n");
      out.write("<link href=\"Css/all.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"Css/boostrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"Css/indexCSS.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"Css/BusquedaRegional.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<!-- Bootstrap CSS -->\n");
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"https://kit.fontawesome.com/a076d05399.js\"></script>\n");
      out.write("<script src=\"js/all.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/jquery-3.4.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/popper.min.js\" type=\"text/javascript\"></script>  \n");
      out.write("  </head>\n");
      out.write("    \n");
      out.write("  <body> \n");
      out.write("      <nav class=\"navbar navbar-expand-lg fixed-top\">\n");
      out.write("<a class=\"nav-link logo\" href=\"#\">IATESA</a>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("<ul class=\"enlaces navbar-nav ml-auto\">\n");
      out.write("<li class=\"nav-item\">\n");
      out.write("<a class=\"nav-link \" href=\"#\">| Estudiantes |</a>\n");
      out.write("</li>\n");
      out.write("<li class=\"nav-item\">\n");
      out.write("<a class=\"nav-link \" href=\"#\">Docentes |</a>\n");
      out.write("</li>\n");
      out.write("<li class=\"nav-item\">\n");
      out.write("<a class=\"nav-link \" href=\"#\">Calificaciones |</a>\n");
      out.write("</li>\n");
      out.write("<li class=\"nav-item\">\n");
      out.write("<a class=\"nav-link \" href=\"#\">Documentación |</a>\n");
      out.write("</li>\n");
      out.write("<li class=\"nav-item\">\n");
      out.write("<a class=\"nav-link \" href=\"#\">Coordinación Pedagógica |</a>\n");
      out.write("</li>\n");
      out.write("<li class=\"nav-item\">\n");
      out.write("<a class=\"nav-link \" href=\"#\">Empresa |</a>\n");
      out.write("</li>\n");
      out.write("\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("</nav>\n");
      out.write("    \n");
      out.write("    <br><br><br><br><br>\n");
      out.write("    <br>\n");
      out.write("<center> \n");
      out.write("\n");
      out.write("        <h3><i class=\"fas fa-search\"></i> Busqueda Usuarios</h3></center> <br> <br>\n");
      out.write("       <header>\n");
      out.write("      <!--<h1 class=\"text-center text-light\">DATATABLES</h1>\n");
      out.write("         <h2 class=\"text-center text-light\">Cómo <span class=\"badge badge-warning\">Personalizar</span></h2> -->\n");
      out.write("     </header>    \n");
      out.write("    <div style=\"height:50px\"></div>\n");
      out.write("     \n");
      out.write("    <!--Ejemplo tabla con DataTables-->\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <div class=\"table-responsive\">        \n");
      out.write("                        <table id=\"example\" class=\"table table-striped table-bordered\" cellspacing=\"0\" width=\"100%\">\n");
      out.write("                 <thead>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"col\">ID</th>\n");
      out.write("      <th scope=\"col\">Empleado</th>\n");
      out.write("      <th scope=\"col\">Usuario</th>\n");
      out.write("      <th scope=\"col\">Clave</th>\n");
      out.write("      <th scope=\"col\">Confirmar Clave</th>\n");
      out.write("     \n");
      out.write("    </tr>\n");
      out.write("  </thead>\n");
      out.write("  <tbody>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">01</th>\n");
      out.write("      <td>Silvestre Cruz</td>\n");
      out.write("      <td>Silvestre Cruz</td>\n");
      out.write("      <td>*********</td>\n");
      out.write("      <td>*********</td>\n");
      out.write("    \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">02</th>\n");
      out.write("      <td>Nieves</td>\n");
      out.write("      <td>Nieves</td>\n");
      out.write("     <td>*********</td>\n");
      out.write("      <td>*********</td>\n");
      out.write("     \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">03</th>\n");
      out.write("     <td>Gabriel</td>\n");
      out.write("      <td>Gabriel</td>\n");
      out.write("       <td>*********</td>\n");
      out.write("      <td>*********</td>\n");
      out.write("     \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">04</th>\n");
      out.write("      <td>Rosely</td>\n");
      out.write("      <td>Rosely</td>\n");
      out.write("      <td>*********</td>\n");
      out.write("      <td>*********</td>\n");
      out.write("    \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">05</th>\n");
      out.write("      <td>Luis Alfredo</td>\n");
      out.write("      <td>Luis Alfredo</td>\n");
      out.write("       <td>*********</td>\n");
      out.write("      <td>*********</td>\n");
      out.write("    </tr>\n");
      out.write("   \n");
      out.write("  </tbody>\n");
      out.write("   </table>                  \n");
      out.write("  </tbody>\n");
      out.write("                        </table>          <br>          <br>      <br>       \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("        </div>  \n");
      out.write("    </div>    <center>\n");
      out.write("<button class=\"btn btn-primary\" type=\"submit\">Aceptar</button>\n");
      out.write("<button class=\"btn btn-danger\" type=\"submit\">Cancelar</button> </center>\n");
      out.write(" <br>      <br>  \n");
      out.write("    <!-- jQuery, Popper.js, Bootstrap JS -->\n");
      out.write("    <script src=\"jquery/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <script src=\"popper/popper.min.js\"></script>\n");
      out.write("    <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("      \n");
      out.write("    <!-- datatables JS -->\n");
      out.write("    <script type=\"text/javascript\" src=\"datatables/datatables.min.js\"></script>    \n");
      out.write("     \n");
      out.write("    <!-- para usar botones en datatables JS -->  \n");
      out.write("  <!--  <script src=\"datatables/Buttons-1.5.6/js/dataTables.buttons.min.js\"></script>  \n");
      out.write("    <script src=\"datatables/JSZip-2.5.0/jszip.min.js\"></script>    \n");
      out.write("    <script src=\"datatables/pdfmake-0.1.36/pdfmake.min.js\"></script>    \n");
      out.write("    <script src=\"datatables/pdfmake-0.1.36/vfs_fonts.js\"></script>\n");
      out.write("    <script src=\"datatables/Buttons-1.5.6/js/buttons.html5.min.js\"></script>\n");
      out.write("     -->\n");
      out.write("    <!-- código JS propìo-->    \n");
      out.write("    \n");
      out.write("    <script src=\"Busquedas.js\" type=\"text/javascript\"></script>\n");
      out.write("    <br>\n");
      out.write("<footer>\n");
      out.write("<h3>IATESA</h3>\n");
      out.write("\n");
      out.write("<ul class=\"enlaces nav-footer navbar-nav ml-auto\">\n");
      out.write("\n");
      out.write("<li class=\"nav-item\">\n");
      out.write("<a class=\"nav-link \" href=\"#\">| Estudiantes |</a>  \n");
      out.write("</li>\n");
      out.write("<li class=\"nav-item\">\n");
      out.write("<a class=\"nav-link \" href=\"#\">Docentes |</a>  \n");
      out.write("</li>\n");
      out.write("<li class=\"nav-item\">\n");
      out.write("<a class=\"nav-link \" href=\"#\">Calificaciones |</a>   \n");
      out.write("</li>\n");
      out.write("<li class=\"nav-item\">\n");
      out.write("<a class=\"nav-link \" href=\"#\">Documentación |</a>    \n");
      out.write("</li>\n");
      out.write("<li class=\"nav-item\">\n");
      out.write("<a class=\"nav-link \" href=\"#\">Coordinación Pedagógica |</a>  \n");
      out.write("</li>\n");
      out.write("<li class=\"nav-item\">\n");
      out.write("<a class=\"nav-link \" href=\"#\">Empresa |</a> \n");
      out.write("</li>\n");
      out.write("\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("<div class=\"footer-redes\">\n");
      out.write("<a href=\"#\"><i class=\"fab fa-facebook\"></i></a>\n");
      out.write("<a href=\"#\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("<a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("</div>\n");
      out.write("<p> 2020-2021 Company, Inc. &middot; <a href=\"#\">Privacy</a> &middot; <a href=\"#\">Terms Jeremy</a></p>  \n");
      out.write("<br>  \n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("    \n");
      out.write("  </body>\n");
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
