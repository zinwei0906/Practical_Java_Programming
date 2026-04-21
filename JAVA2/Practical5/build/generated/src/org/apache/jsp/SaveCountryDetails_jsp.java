package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import domain.Country;

public final class SaveCountryDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>SAVE Country Details</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        \n");
      out.write("        ");
      domain.Country country = null;
      synchronized (session) {
        country = (domain.Country) _jspx_page_context.getAttribute("country", PageContext.SESSION_SCOPE);
        if (country == null){
          country = new domain.Country();
          _jspx_page_context.setAttribute("country", country, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      da.CountriesDA countryda = null;
      synchronized (application) {
        countryda = (da.CountriesDA) _jspx_page_context.getAttribute("countryda", PageContext.APPLICATION_SCOPE);
        if (countryda == null){
          countryda = new da.CountriesDA();
          _jspx_page_context.setAttribute("countryda", countryda, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("        ");

            countryda.addRecord(country);
            
            out.println(country.getName() + " | " + country.getFullName() +" | "+ country.getCapital()+" has been stored in the database");
            out.close();
//
//out.println("<table>");
////ArrayList dataList = new ArrayList();
////CountriesDA countries = new CountriesDA();
////Country country : countries.getCountries()
//// add some data in it....
//ArrayList dataList = new ArrayList();
//for (Iterator iter = dataList.iterator(); iter.hasNext();) {
//    out.println("<tr><td>" + (String)(iter.next()) + "</td></tr>");
//}
//out.println("</table>");
        
      out.write("\n");
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
