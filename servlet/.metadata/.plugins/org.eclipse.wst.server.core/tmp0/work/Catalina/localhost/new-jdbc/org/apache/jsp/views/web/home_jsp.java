/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.55
 * Generated at: 2020-06-16 07:44:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/home/minh/servlet/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/new-jdbc/WEB-INF/lib/sitemesh-2.4.2.jar!/META-INF/sitemesh-decorator.tld", Long.valueOf(1123653092000L));
    _jspx_dependants.put("/common/taglib.jsp", Long.valueOf(1592287923000L));
    _jspx_dependants.put("jar:file:/home/minh/servlet/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/new-jdbc/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1592202015000L));
    _jspx_dependants.put("/WEB-INF/lib/sitemesh-2.4.2.jar", Long.valueOf(1592285541000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>trang chu</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"row\">\n");
      out.write("\n");
      out.write("      <div class=\"col-lg-3\">\n");
      out.write("\n");
      out.write("        <h1 class=\"my-4\">Shop Name</h1>\n");
      out.write("        <div class=\"list-group\">\n");
      out.write("          <a href=\"#\" class=\"list-group-item\">Category 1</a>\n");
      out.write("          <a href=\"#\" class=\"list-group-item\">Category 2</a>\n");
      out.write("          <a href=\"#\" class=\"list-group-item\">Category 3</a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("      <!-- /.col-lg-3 -->\n");
      out.write("\n");
      out.write("      <div class=\"col-lg-9\">\n");
      out.write("\n");
      out.write("        <div id=\"carouselExampleIndicators\" class=\"carousel slide my-4\" data-ride=\"carousel\">\n");
      out.write("          <ol class=\"carousel-indicators\">\n");
      out.write("            <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("            <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\n");
      out.write("            <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\n");
      out.write("          </ol>\n");
      out.write("          <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("            <div class=\"carousel-item active\">\n");
      out.write("              <img class=\"d-block img-fluid\" src=\"http://placehold.it/900x350\" alt=\"First slide\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"carousel-item\">\n");
      out.write("              <img class=\"d-block img-fluid\" src=\"http://placehold.it/900x350\" alt=\"Second slide\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"carousel-item\">\n");
      out.write("              <img class=\"d-block img-fluid\" src=\"http://placehold.it/900x350\" alt=\"Third slide\">\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"prev\">\n");
      out.write("            <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("            <span class=\"sr-only\">Previous</span>\n");
      out.write("          </a>\n");
      out.write("          <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"next\">\n");
      out.write("            <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("            <span class=\"sr-only\">Next</span>\n");
      out.write("          </a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-4 col-md-6 mb-4\">\n");
      out.write("            <div class=\"card h-100\">\n");
      out.write("              <a href=\"#\"><img class=\"card-img-top\" src=\"http://placehold.it/700x400\" alt=\"\"></a>\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                <h4 class=\"card-title\">\n");
      out.write("                  <a href=\"#\">Item One</a>\n");
      out.write("                </h4>\n");
      out.write("                <h5>$24.99</h5>\n");
      out.write("                <p class=\"card-text\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet numquam aspernatur!</p>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"card-footer\">\n");
      out.write("                <small class=\"text-muted\">&#9733; &#9733; &#9733; &#9733; &#9734;</small>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-4 col-md-6 mb-4\">\n");
      out.write("            <div class=\"card h-100\">\n");
      out.write("              <a href=\"#\"><img class=\"card-img-top\" src=\"http://placehold.it/700x400\" alt=\"\"></a>\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                <h4 class=\"card-title\">\n");
      out.write("                  <a href=\"#\">Item Two</a>\n");
      out.write("                </h4>\n");
      out.write("                <h5>$24.99</h5>\n");
      out.write("                <p class=\"card-text\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet numquam aspernatur! Lorem ipsum dolor sit amet.</p>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"card-footer\">\n");
      out.write("                <small class=\"text-muted\">&#9733; &#9733; &#9733; &#9733; &#9734;</small>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-4 col-md-6 mb-4\">\n");
      out.write("            <div class=\"card h-100\">\n");
      out.write("              <a href=\"#\"><img class=\"card-img-top\" src=\"http://placehold.it/700x400\" alt=\"\"></a>\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                <h4 class=\"card-title\">\n");
      out.write("                  <a href=\"#\">Item Three</a>\n");
      out.write("                </h4>\n");
      out.write("                <h5>$24.99</h5>\n");
      out.write("                <p class=\"card-text\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet numquam aspernatur!</p>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"card-footer\">\n");
      out.write("                <small class=\"text-muted\">&#9733; &#9733; &#9733; &#9733; &#9734;</small>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-4 col-md-6 mb-4\">\n");
      out.write("            <div class=\"card h-100\">\n");
      out.write("              <a href=\"#\"><img class=\"card-img-top\" src=\"http://placehold.it/700x400\" alt=\"\"></a>\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                <h4 class=\"card-title\">\n");
      out.write("                  <a href=\"#\">Item Four</a>\n");
      out.write("                </h4>\n");
      out.write("                <h5>$24.99</h5>\n");
      out.write("                <p class=\"card-text\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet numquam aspernatur!</p>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"card-footer\">\n");
      out.write("                <small class=\"text-muted\">&#9733; &#9733; &#9733; &#9733; &#9734;</small>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-4 col-md-6 mb-4\">\n");
      out.write("            <div class=\"card h-100\">\n");
      out.write("              <a href=\"#\"><img class=\"card-img-top\" src=\"http://placehold.it/700x400\" alt=\"\"></a>\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                <h4 class=\"card-title\">\n");
      out.write("                  <a href=\"#\">Item Five</a>\n");
      out.write("                </h4>\n");
      out.write("                <h5>$24.99</h5>\n");
      out.write("                <p class=\"card-text\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet numquam aspernatur! Lorem ipsum dolor sit amet.</p>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"card-footer\">\n");
      out.write("                <small class=\"text-muted\">&#9733; &#9733; &#9733; &#9733; &#9734;</small>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-4 col-md-6 mb-4\">\n");
      out.write("            <div class=\"card h-100\">\n");
      out.write("              <a href=\"#\"><img class=\"card-img-top\" src=\"http://placehold.it/700x400\" alt=\"\"></a>\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                <h4 class=\"card-title\">\n");
      out.write("                  <a href=\"#\">Item Six</a>\n");
      out.write("                </h4>\n");
      out.write("                <h5>$24.99</h5>\n");
      out.write("                <p class=\"card-text\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet numquam aspernatur!</p>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"card-footer\">\n");
      out.write("                <small class=\"text-muted\">&#9733; &#9733; &#9733; &#9733; &#9734;</small>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- /.row -->\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("      <!-- /.col-lg-9 -->\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
