package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import da.DBBean;
import java.util.*;

public final class BrowseTable_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      da.DBBean dbBeanId = null;
      synchronized (session) {
        dbBeanId = (da.DBBean) _jspx_page_context.getAttribute("dbBeanId", PageContext.SESSION_SCOPE);
        if (dbBeanId == null){
          dbBeanId = new da.DBBean();
          _jspx_page_context.setAttribute("dbBeanId", dbBeanId, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("    <html>\n");
      out.write("        <head>\n");
      out.write("            <title>Browse Table</title>\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("        ");
 String tableName = request.getParameter("tablename");
      out.write("\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                ");
 // Add column names to the table
                    ArrayList<String> columnNames = dbBeanId.getColumnNames(tableName);
                    for (int i = 0; i < columnNames.size(); ++i) {
      out.write("\n");
      out.write("                <td>");
      out.print( columnNames.get(i));
      out.write("</td>\n");
      out.write("                ");
 }
      out.write("\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            \n");
      out.write("            ");

                // Display row data
                ArrayList<Object[]> tableRows = dbBeanId.getRows(tableName);
                for (int i = 0; i < tableRows.size(); ++i) {
                    out.println("<tr>");
                    Object[] row = tableRows.get(i);
                    for (int j = 0; j < row.length; ++j) {
      out.write("\n");
      out.write("                        <td>");
      out.print( String.valueOf(row[j]));
      out.write("</td>\n");
      out.write("                 ");
 }
                    out.println("</tr>");
                }
      out.write("\n");
      out.write("        </table>\n");
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
