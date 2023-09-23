package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Usuarios_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<title>IATESA</title>\n");
      out.write(" <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("<!-- coneciones css -->\n");
      out.write("<link href=\"Css/boostrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"Css/indexCSS.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"Css/Usuarios.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<script src=\"js/all.js\" type=\"text/javascript\"></script>\n");
      out.write("       \n");
      out.write("<!-- Bootstrap CSS -->\n");
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\n");
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-lg fixed-top\">\n");
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
      out.write("    <a class=\"nav-link \" href=\"#\">Docentes |</a>\n");
      out.write("</li>\n");
      out.write("<li class=\"nav-item\">\n");
      out.write("    <a class=\"nav-link \" href=\"#\">Calificaciones |</a>\n");
      out.write("</li>\n");
      out.write("<li class=\"nav-item\">\n");
      out.write("    <a class=\"nav-link \" href=\"#\">Documentación |</a>\n");
      out.write("</li>\n");
      out.write("<li class=\"nav-item\">\n");
      out.write("    <a class=\"nav-link \" href=\"#\">Coordinación Pedagógica |</a>\n");
      out.write("</li>\n");
      out.write("<li class=\"nav-item\">\n");
      out.write("    <a class=\"nav-link \" href=\"#\">Empresa |</a>\n");
      out.write("</li>\n");
      out.write("\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<br>\n");
      out.write(" \n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <nav id=\"sidebar\">\n");
      out.write("                <div class=\"sidebar-header\">\n");
      out.write("                        \n");
      out.write("                        <label>⚙ Configuracion de acceso</label> \n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <ul class=\"list-unstyled components\">\n");
      out.write("                   <li>\n");
      out.write("                        <a href=\"#homeSubmenu\" data-toggle=\"collapse\" aria-expanded=\"false\" class=\"dropdown-toggle\">Sub menu</a>\n");
      out.write("                        <ul class=\"collapse list-unstyled\" id=\"homeSubmenu\">\n");
      out.write("         \n");
      out.write("                            <li><a href=\"#\">Estudiantes</a></li>\n");
      out.write("                            <li><a href=\"#\">Docentes</a></li>\n");
      out.write("                            <li><a href=\"#\">Datos generales</a></li>\n");
      out.write("                            <li><a href=\"#\">Documentación</a></li>\n");
      out.write("                            <li><a href=\"#\">Calificaciones</a></li>\n");
      out.write("                            <li><a href=\"#\">Coordinación Pedagógica</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                   </li>\n");
      out.write("                    <li>\n");
      out.write("                         <div class=\"sidebar-header\">\n");
      out.write("                    <h3>Estudiante</h3>\n");
      out.write("                     <div class=\"form-check\">\n");
      out.write("                     <input class=\"form-check-input\" type=\"checkbox\" id=\"gridCheck\">\n");
      out.write("                     <label class=\"form-check-label\" for=\"gridCheck\">\n");
      out.write("                     Registrar Estudiante\n");
      out.write("                     </label> <br>\n");
      out.write("                     <input class=\"form-check-input\" type=\"checkbox\" id=\"gridCheck\">\n");
      out.write("                     <label class=\"form-check-label\" for=\"gridCheck\">\n");
      out.write("                     Registrar Tutor\n");
      out.write("                     </label>\n");
      out.write("                     </div>\n");
      out.write("                </div>    \n");
      out.write("                       <div class=\"sidebar-header\">\n");
      out.write("                    <h3>Docente</h3>\n");
      out.write("                     <div class=\"form-check\">\n");
      out.write("                     <input class=\"form-check-input\" type=\"checkbox\" id=\"gridCheck\">\n");
      out.write("                     <label class=\"form-check-label\" for=\"gridCheck\">\n");
      out.write("                     Registrar Docente\n");
      out.write("                     </label>\n");
      out.write("                     </div>\n");
      out.write("                </div>\n");
      out.write("         \n");
      out.write("                    </li>\n");
      out.write("                  <div class=\"sidebar-header\">\n");
      out.write("                    <h3>Consultas y Reportes</h3>\n");
      out.write("                     <div class=\"form-check\">\n");
      out.write("                     <input class=\"form-check-input\" type=\"checkbox\" id=\"gridCheck\">\n");
      out.write("                     <label class=\"form-check-label\" for=\"gridCheck\">\n");
      out.write("                     CGRAL de Estudiante\n");
      out.write("                     </label> <br>\n");
      out.write("                     <input class=\"form-check-input\" type=\"checkbox\" id=\"gridCheck\">\n");
      out.write("                     <label class=\"form-check-label\" for=\"gridCheck\">\n");
      out.write("                     Tutor/Estudiante\n");
      out.write("                     </label>\n");
      out.write("                         </div>\n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("            <div class=\"content\">\n");
      out.write("              \n");
      out.write("             \n");
      out.write("\n");
      out.write("<style>\n");
      out.write(".img-file>input {\n");
      out.write("display: none;}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<ul class=\"list-group\">\n");
      out.write("<div class=\"container\">\n");
      out.write("<section class=\"form_wrap\">\n");
      out.write("<div class=\"col-md-12\">\n");
      out.write("<div class=\"well well-sm\">\n");
      out.write("\n");
      out.write("<fieldset>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <br>\n");
      out.write("  <center>\n");
      out.write("<div class=\"img-file\">\n");
      out.write("<h1 class=\"klk\">✍ Registrar Usuarios &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;   \n");
      out.write("<a title=\"Busqueda Usuarios\" href=\"http://localhost:8080/System%20colllege/BusquedaUsuarios.jsp\">\n");
      out.write("<img src=\"https://icon-library.net/images/upload-photo-icon/upload-photo-icon-29.jpg\" \n");
      out.write("width=\"50px\" height=\"50px\" alt=\"Usuarios\" /></a>\n");
      out.write("</h1>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<h5>\n");
      out.write("&nbsp; &nbsp;  <div class=\"form-row\">\n");
      out.write("  &nbsp; &nbsp;  &nbsp; &nbsp;  &nbsp; &nbsp;  <div class=\"col-md-5 mb-3\">\n");
      out.write("      <label for=\"exampleFormControlSelect1\">ID Empleado</label>\n");
      out.write("      <div class=\"input-group\">\n");
      out.write("<div class=\"input-group-prepend\">\n");
      out.write("<span class=\"input-group-text\"><i class=\"fas fa-key\"></i></span>\n");
      out.write("</div>                  \n");
      out.write("      <br>\n");
      out.write("    <select class=\"form-control\" id=\"exampleFormControlSelect1\">\n");
      out.write("                <option value=\"01\">01 Silvestre Cruz</option>\n");
      out.write("                <option value=\"02\">02 Nieves</option>\n");
      out.write("                <option value=\"03\">03 Gabriel </option>\n");
      out.write("                <option value=\"04\">04 Rosely</option>\n");
      out.write("                <option value=\"05\">05 Luis Alfredo</option> \n");
      out.write("    </select>\n");
      out.write("      </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("  &nbsp; &nbsp;  &nbsp; &nbsp;  &nbsp; &nbsp;  <div class=\"col-md-5 mb-3\">\n");
      out.write("    <label for=\"validationDefault02\">Usuario</label>\n");
      out.write("    <div class=\"input-group\">\n");
      out.write("<div class=\"input-group-prepend\">\n");
      out.write("<span class=\"input-group-text\"><i class=\"fas fa-user-tie\"></i></span>\n");
      out.write("</div>                  \n");
      out.write("    <br>\n");
      out.write("<input type=\"text\" class=\"form-control\" id=\"validationDefault02\" placeholder=\"\" required>\n");
      out.write("    </div></div><br><br><br>\n");
      out.write("  \n");
      out.write("  &nbsp; &nbsp;  &nbsp; &nbsp;  &nbsp; &nbsp;  <div class=\"col-md-5 mb-5\">\n");
      out.write("    <label for=\"validationDefault02\">Clave</label>\n");
      out.write("    <div class=\"input-group\">\n");
      out.write("<div class=\"input-group-prepend\">\n");
      out.write("<span class=\"input-group-text\">🔒</span>\n");
      out.write("</div>                  \n");
      out.write("    <br>\n");
      out.write("<input type=\"password\" class=\"form-control\" id=\"validationDefault03\" placeholde=\"Ej: Silvestre\" required>\n");
      out.write("</div>\n");
      out.write("  </div>\n");
      out.write(" &nbsp; &nbsp;  &nbsp; &nbsp;  &nbsp; &nbsp;  <div class=\"col-md-5 mb-5\">\n");
      out.write("    <label for=\"validationDefault03\">Confirmar clave</label>\n");
      out.write("    <div class=\"input-group\">\n");
      out.write("<div class=\"input-group-prepend\">\n");
      out.write("<span class=\"input-group-text\">🔐</span>\n");
      out.write("</div>                  \n");
      out.write("    <br>\n");
      out.write("<input type=\"password\" class=\"form-control\" id=\"validationDefault04\"  placeholde=\"Ej: Las Martinez\" required>\n");
      out.write("    </div></div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</h5>\n");
      out.write("  </center>   \n");
      out.write("<button class=\"btn btn-primary\" type=\"submit\">Enviar Formulario</button>\n");
      out.write("<button class=\"btn btn-danger\" type=\"submit\">Cancelar</button>\n");
      out.write("</fieldset></div></div></section></div></ul></div></div>\n");
      out.write(" \n");
      out.write("        \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("<!--\n");
      out.write("<ul class=\"list-group\">\n");
      out.write("<div class=\"container\">\n");
      out.write("<section class=\"form_wrap\">\n");
      out.write("<div class=\"col-md-12\">\n");
      out.write("<div class=\"well well-sm\">\n");
      out.write("\n");
      out.write("<fieldset>\n");
      out.write("    <br>\n");
      out.write("    <center>  <h3>IATESA</h3> </center>\n");
      out.write("    <h2>Sub Menu</h2>  \n");
      out.write("    <h4>Registrar</h4>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</fieldset>\n");
      out.write("</div></div></section></div></ul>\n");
      out.write("-->\n");
      out.write("<footer>\n");
      out.write("\n");
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
      out.write("<p> 2020-2021 Company, Inc. &middot; <a href=\"#\">Privacy</a> &middot; <a href=\"#\">Terms JEREMY</a></p>  \n");
      out.write("<br>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/popper.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/jquery-3.4.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>");
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
