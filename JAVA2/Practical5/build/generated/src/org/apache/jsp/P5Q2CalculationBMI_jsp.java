package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import domain.BMI;

public final class P5Q2CalculationBMI_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <title>BMI Calculation</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--        </%@page import = \"domain.BMI\" %>\n");
      out.write("                </% double height = Double.parseDouble(request.getParameter(\"height\"));\n");
      out.write("                    double weight = Double.parseDouble(request.getParameter(\"weight\"));\n");
      out.write("                    BMI bmi = new BMI( weight, height);\n");
      out.write("                    double getBMI = bmi.getBMI();\n");
      out.write("                    String Category = bmi.getStatus(); %>\n");
      out.write("                <h1>BMI Calculation</h1><br/>\n");
      out.write("                <h3>Height : </%= String.format(\"%.2f\", height) %> m</h3>\n");
      out.write("                <h3>Weight : </%= String.format(\"%.2f\", weight) %> kg</h3>\n");
      out.write("                <h3>BMI : </%= String.format(\"%.2f\", getBMI) %></h3>\n");
      out.write("                <h3>Category : </%= Category %></h3>-->\n");
      out.write("        \n");
      out.write("        ");
      domain.BMI bmi = null;
      synchronized (_jspx_page_context) {
        bmi = (domain.BMI) _jspx_page_context.getAttribute("bmi", PageContext.PAGE_SCOPE);
        if (bmi == null){
          bmi = new domain.BMI();
          _jspx_page_context.setAttribute("bmi", bmi, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("bmi"), request);
      out.write("\n");
      out.write("        <h1>BMI Calculation</h1><br/>\n");
      out.write("        <h3>Height : ");
      out.print( String.format("%.2f", bmi.getHeight()) );
      out.write(" m</h3>\n");
      out.write("        <h3>Weight : ");
      out.print( String.format("%.2f", bmi.getWeight()) );
      out.write(" kg</h3>\n");
      out.write("        <h3>BMI : ");
      out.print( String.format("%.2f", bmi.getBMI()) );
      out.write("</h3>\n");
      out.write("        <h3>Category : ");
      out.print( bmi.getStatus() );
      out.write("</h3>\n");
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
