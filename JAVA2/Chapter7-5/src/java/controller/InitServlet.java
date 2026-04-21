/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author JONATHAN
 */
public class InitServlet extends HttpServlet {

    private String facultyName = "Faculty name is missing.";
    private String emailAddr = "Email address is missing.";

    @Override
    public void init() throws ServletException {
        ServletConfig config = getServletConfig();
        if (config.getInitParameter("facultyName") != null) {
            facultyName = config.getInitParameter("facultyName");
        }
        if (config.getInitParameter("emailAddress") != null) {
            emailAddr = config.getInitParameter("emailAddress");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("facultyName", facultyName);
        session.setAttribute("emailAddress", emailAddr);
        RequestDispatcher rd = request.getRequestDispatcher("DisplayServletInitParams.jsp");
        rd.forward(request, response);
    }
}
