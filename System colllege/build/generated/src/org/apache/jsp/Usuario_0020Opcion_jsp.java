package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Usuario_0020Opcion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<!-- conecciones css -->\n");
      out.write("<link href=\"Css/Style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"Css/indexCSS.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"Css/boostrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<!-- Bootstrap CSS -->\n");
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\n");
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("<script src=\"https://kit.fontawesome.com/a076d05399.js\"></script>\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script>window.jQuery || document.write('<script src=\"/docs/4.4/assets/js/vendor/jquery.slim.min.js\"><\\/script>')</script><script src=\"/docs/4.4/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-6khuMg9gaYr5AxOqhkVIODVIvm9ynTT5J4V1cfthmT+emCG6yVmEZsRHdxlotUnm\" crossorigin=\"anonymous\"></script>\n");
      out.write("<nav class=\"navbar navbar-expand-lg fixed-top\">\n");
      out.write("    \n");
      out.write("<a class=\"nav-link logo\" href=\"#\">IATESA</a>\n");
      out.write("<br> <br> <br>\n");
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
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("</nav>        \n");
      out.write("<br> <br> <br> <br>\n");
      out.write("<style>\n");
      out.write(".img-file>input {\n");
      out.write("display: none;}\n");
      out.write("</style>\n");
      out.write("<ul class=\"list-group\">\n");
      out.write("<div class=\"container\">\n");
      out.write("<section class=\"form_wrap\">\n");
      out.write("<div class=\"col-md-12\">\n");
      out.write("<div class=\"well well-sm\">\n");
      out.write("<fieldset>\n");
      out.write("<br>\n");
      out.write("<div class=\"img-file\">\n");
      out.write("<center> <h1 class=\"klk\">Usuario Opcion &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;   \n");
      out.write("<a title=\"Busqueda\" href=\"#\">\n");
      out.write("<img src=\"https://icon-library.net/images/upload-photo-icon/upload-photo-icon-29.jpg\" \n");
      out.write("width=\"50px\" height=\"50px\" alt=\"Regional\" /></a>\n");
      out.write("</h1></center>\n");
      out.write("</div> \n");
      out.write("<br> <br>\n");
      out.write("<h2>\n");
      out.write("<div class=\"form-row\">\n");
      out.write("<div class=\"col-md-4 mb-3\">\n");
      out.write("<label for=\"validationDefault01\">Secuencia</label>\n");
      out.write("<input readonly type=\"number\" class=\"form-control\" id=\"validationDefault01\" value=\"ID\" required placeholder=\" 01\">\n");
      out.write("</div>\n");
      out.write("<div class=\"col-md-4 mb-3\">\n");
      out.write("<label for=\"validationDefault02\">ID Usuario</label>\n");
      out.write("<input readonly type=\"Number\" class=\"form-control\" id=\"validationDefault02\" value=\"Regional\" required placeholder=\" 01\">\n");
      out.write("</div>\n");
      out.write("<div class=\"col-md-4 mb-4\">\n");
      out.write("<label for=\"validationDefault02\">ID Menu</label>\n");
      out.write("<input readonly type=\"number\" class=\"form-control\" id=\"validationDefault03\" value=\"\" required placeholder=\"01\">\n");
      out.write("</div>\n");
      out.write("<div class=\"col-md-4 mb-4\">\n");
      out.write("<label for=\"validationDefault03\">ID Opcion</label>\n");
      out.write("<div class=\"form-check\">\n");
      out.write("<input class=\"form-check-input\" type=\"checkbox\" value=\"\" id=\"defaultCheck1\">\n");
      out.write("<label class=\"form-check-label\" for=\"defaultCheck1\">\n");
      out.write("Profesor\n");
      out.write("</label>\n");
      out.write("</div>\n");
      out.write("<div class=\"form-check\">\n");
      out.write("<input class=\"form-check-input\" type=\"checkbox\" value=\"\" id=\"defaultCheck1\">\n");
      out.write("<label class=\"form-check-label\" for=\"defaultCheck1\">\n");
      out.write("Estudiante\n");
      out.write("</label>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<!--   <select class=\"custom-select\" multiple>\n");
      out.write("<option selected>Open this select menu</option>\n");
      out.write("<option value=\"1\">One</option>\n");
      out.write("<option value=\"2\">Two</option>\n");
      out.write("<option value=\"3\">Three</option>\n");
      out.write("</select> -->\n");
      out.write("<div class=\"col-md-4 mb-5\">\n");
      out.write("<label for=\"validationDefault02\">Estado</label>\n");
      out.write("<div class=\"form-check\">\n");
      out.write("<input class=\"form-check-input\" type=\"checkbox\" value=\"\" id=\"defaultCheck1\">\n");
      out.write("<label class=\"form-check-label\" for=\"defaultCheck1\">\n");
      out.write("Activo\n");
      out.write("</label>\n");
      out.write("</div>\n");
      out.write("<div class=\"form-check\">\n");
      out.write("<input class=\"form-check-input\" type=\"checkbox\" value=\"\" id=\"defaultCheck1\">\n");
      out.write("<label class=\"form-check-label\" for=\"defaultCheck1\">\n");
      out.write("Inactivo\n");
      out.write("</label>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</h2>\n");
      out.write("<div class=\"form-group\">\n");
      out.write("<div class=\"form-check\">\n");
      out.write("<input class=\"form-check-input\" type=\"checkbox\" value=\"\" id=\"invalidCheck2\" required>\n");
      out.write("<label class=\"form-check-label\" for=\"invalidCheck2\">\n");
      out.write("¿Acepta todas las condiciones?\n");
      out.write("</label>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<button class=\"btn btn-primary\" type=\"submit\">Enviar Formulario</button>\n");
      out.write("</fieldset>\n");
      out.write("</div>  </div> </section> </div>\n");
      out.write("</ul>\n");
      out.write("<footer>\n");
      out.write("<h3>IATESA</h3>\n");
      out.write("<ul class=\"enlaces nav-footer navbar-nav ml-auto\">\n");
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
      out.write("</ul>\n");
      out.write("<div class=\"footer-redes\">\n");
      out.write("<a href=\"#\"><i class=\"fab fa-facebook\"></i></a>\n");
      out.write("<a href=\"#\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("<a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("</div>\n");
      out.write("<p> 2020-2021 Company, Inc. &middot; <a href=\"#\">Privacy</a> &middot; <a href=\"#\">Terms</a></p>  \n");
      out.write("<br>\n");
      out.write("</footer>\n");
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
