package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>IATESA</title>\n");
      out.write("<link href=\"Css/Style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"Css/boostrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"Css/indexCSS.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("<link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css\">\n");
      out.write("<script src=\"https://kit.fontawesome.com/b99e675b6e.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
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
      out.write("\n");
      out.write("    <br> <br> <br> <br> <br> <br> <br> <br> <br> <br>\n");
      out.write("\t<script src=\"https://kit.fontawesome.com/b99e675b6e.js\"></script>\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\n");
      out.write("\t<script>\n");
      out.write("\t\t$(document).ready(function(){\n");
      out.write("\t\t\t$(\".hamburger\").click(function(){\n");
      out.write("\t\t\t   $(\".wrapper\").toggleClass(\"collapse\");\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"wrapper\">\n");
      out.write("  <div class=\"top_navbar\">\n");
      out.write("    <div class=\"hamburger\">\n");
      out.write("       <div class=\"one\"></div>\n");
      out.write("       <div class=\"two\"></div>\n");
      out.write("       <div class=\"three\"></div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"top_menu\">\n");
      out.write("      <div class=\"logo\">logo</div>\n");
      out.write("      <ul>\n");
      out.write("        <li><a href=\"#\">\n");
      out.write("          <i class=\"fas fa-search\"></i></a></li>\n");
      out.write("        <li><a href=\"#\">\n");
      out.write("          <i class=\"fas fa-bell\"></i>\n");
      out.write("          </a></li>\n");
      out.write("        <li><a href=\"#\">\n");
      out.write("          <i class=\"fas fa-user\"></i>\n");
      out.write("          </a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <div class=\"sidebar\">\n");
      out.write("      <ul>\n");
      out.write("        <li><a href=\"#\">\n");
      out.write("          <span class=\"icon\"><i class=\"fas fa-book\"></i></span>\n");
      out.write("          <span class=\"title\">Books</span></a></li>\n");
      out.write("        <li><a href=\"#\">\n");
      out.write("          <span class=\"icon\"><i class=\"fas fa-file-video\"></i></span>\n");
      out.write("          <span class=\"title\">Movies</span>\n");
      out.write("          </a></li>\n");
      out.write("        <li><a href=\"#\">\n");
      out.write("          <span class=\"icon\"><i class=\"fas fa-volleyball-ball\"></i></span>\n");
      out.write("          <span class=\"title\">Sports</span>\n");
      out.write("          </a></li>\n");
      out.write("        <li><a href=\"#\" class=\"active\">\n");
      out.write("          <span class=\"icon\"><i class=\"fas fa-blog\"></i></span>\n");
      out.write("          <span class=\"title\">Blogs</span>\n");
      out.write("          </a></li>\n");
      out.write("        <li><a href=\"#\">\n");
      out.write("          <span class=\"icon\"><i class=\"fas fa-leaf\"></i></span>\n");
      out.write("          <span class=\"title\">Nature</span>\n");
      out.write("          </a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("</body>\n");
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
      out.write("<p> 2020-2021 Company, Inc. &middot; <a href=\"#\">Privacy</a> &middot; <a href=\"#\">Terms</a></p>  \n");
      out.write("  \n");
      out.write("</footer>\n");
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
