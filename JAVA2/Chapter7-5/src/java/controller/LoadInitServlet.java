/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JONATHAN
 */
public class LoadInitServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        String institutionName = "Institution name is missing.";
        ServletContext context = getServletContext();
        if (context.getInitParameter("institutionName") != null) {
            institutionName = context.getInitParameter("institutionName");
        }
        context.setAttribute("institutionName", institutionName);
     }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>In LoadInitServlet's doGet()</h1>");
        out.println("<h2>Institution name: " + getServletContext().getAttribute("institutionName")+"<h2>");
    }

}
