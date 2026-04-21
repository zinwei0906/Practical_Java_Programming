package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Productorders;
import java.util.List;

public final class ABCwebpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\"/>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("        <meta name=\"keywords\" content=\"HTML,CSS,JavaScript,JSP,Servlet,Java\"/>\n");
      out.write("        <meta name=\"author\" content=\"TAN ZIN WEI\"/>\n");
      out.write("        <meta name=\"language\" content=\"English\"/>\n");
      out.write("        <title>ABC Spare Parts Company</title>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.js\"></script>\n");
      out.write("        <script src=\"https://cdn.datatables.net/1.10.22/js/jquery.dataTables.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.datatables.net/1.10.22/js/dataTables.bootstrap4.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/1.10.22/css/dataTables.bootstrap4.min.css\">\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('#FormTable').DataTable();\n");
      out.write("            })\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <br/><br/><br/>\n");
      out.write("        <h1 style=\"text-align: center\">ABC Spare Parts Company</h1>\n");
      out.write("        <div class=\"container py-5\">\n");
      out.write("            <h1 style=\"text-align: center\"><b>Order Report</b></h1>\n");
      out.write("            <table id=\"FormTable\" style=\"width:100%\" class=\"table table-striped table-bordered\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th style=\"width: 10%;\">ID</th>\n");
      out.write("                        <th style=\"width: 10%;\">Product ID</th>\n");
      out.write("                        <th style=\"width: 10%;\">DESCRIPTION</th>\n");
      out.write("                        <th style=\"width: 10%;\">IMAGE</th>\n");
      out.write("                        <th style=\"width: 10%;\">UNIT</th>\n");
      out.write("                        <th style=\"width: 10%;\">RETAIL PRICE</th>\n");
      out.write("                        <th style=\"width: 10%;\">FREIGHT CHARGES</th>\n");
      out.write("                        <th style=\"width: 10%;\">PACKAGING COATS</th>\n");
      out.write("                        <th style=\"width: 10%;\">Amount</th>\n");
      out.write("                        <th style=\"width: 10%;\">Discount</th>\n");
      out.write("                        <th style=\"width: 10%;\">Total Amount</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        List<Productorders> ABCList = (List) session.getAttribute("ABCList");

                        if (ABCList == null) {
                    
      out.write("\n");
      out.write("                    <tr><td colspan='15'><h1 style='text-align:center'>0 Records > <a style=\"font-size: 100px;\" href=\"ABCServlet\">Refresh</a></h1></td></tr>\n");
      out.write("                    ");

                    } else {
                        for (Productorders product : ABCList) {

                    
      out.write("\n");
      out.write("                    <tr><td>");
      out.print( product.getId());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( product.getProductid());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( product.getDescription());
      out.write("</td>\n");
      out.write("                        <td><img width='120' height='80' src='image/");
      out.print(product.getImage());
      out.write(".jpg'/></td>\n");
      out.write("                        <td>");
      out.print( product.getUnit());
      out.write("unit</td>\n");
      out.write("                        <td>RM ");
      out.print( product.getRetailprice());
      out.write("</td>\n");
      out.write("                        <td>RM ");
      out.print( product.getFreightcharges());
      out.write("</td>\n");
      out.write("                        <td>RM ");
      out.print( product.getPackagingcoats());
      out.write("</td>\n");
      out.write("                        <td>RM ");
      out.print(product.getAmount());
      out.write("</td>   \n");
      out.write("                        <td>");
      out.print(product.getDiscount());
      out.write("%</td>  \n");
      out.write("                        <td>RM ");
      out.print(product.getTotalAmount());
      out.write("</td> \n");
      out.write("                    </tr>\n");
      out.write("                    ");
  }
                        }
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
