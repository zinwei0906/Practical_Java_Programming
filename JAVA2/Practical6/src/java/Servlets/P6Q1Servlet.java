package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class P6Q1Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String name = request.getParameter("name");
            Cookie ck = new Cookie("StudentName", name);//creating cookie object  
            response.addCookie(ck);//adding cookie in the response  
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GetForm</title>");
            out.println("<link rel='stylesheet' type='text/css' href='Form.css'/>");
            out.println("</head>");
            out.println("<body>");
            out.println("<br/><br/><table class=\"FormTable\">\n"
                    + "                <tr>\n"
                    + "                    <td class=\"Column1\">Student ID</td>\n"
                    + "                    <td class=\"Column2\">" + request.getParameter("id") + "</td>\n"
                    + "                </tr>\n"
                    + "                <tr>\n"
                    + "                    <td class=\"Column1\">IC Number</td>\n"
                    + "                    <td class=\"Column2\">" + request.getParameter("ic") + "</td>\n"
                    + "                </tr>\n"
                    + "                <tr>\n"
                    + "                    <td class=\"Column1\">Name</td>\n"
                    + "                    <td class=\"Column2\">" + request.getParameter("name") + "</td>\n"
                    + "                </tr>\n"
                    + "                <tr>\n"
                    + "                    <td class=\"Column1\">Level</td>\n"
                    + "                    <td class=\"Column2\">" + request.getParameter("level") + "</td>\n"
                    + "                </tr>\n"
                    + "                <tr>\n"
                    + "                    <td class=\"Column1\">Programme</td>\n"
                    + "                    <td class=\"Column2\">" + request.getParameter("programme") + "</td>\n"
                    + "                </tr>\n"
                    + "                <tr>\n"
                    + "                    <td class=\"Column1\">Year of Study</td>\n"
                    + "                    <td class=\"Column2\">" + request.getParameter("year") + "</td>\n"
                    + "                </tr>\n"
                    + "            </table>"
                    + "                <a style='margin-left: 35%;' href=\"P6Q4Servlet\" >Click Here!!!</a>\n");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
