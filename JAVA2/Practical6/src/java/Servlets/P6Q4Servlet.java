package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/P6Q4Servlet")
public class P6Q4Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            Cookie ck[] = request.getCookies();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet P6Q4GetCookies</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Retrieve Value From Cookie</h1>");
            out.println("<h3>Hi " + ck[0].getValue() + " ,welcome</h3>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
