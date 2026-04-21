/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import domain.Student;
import domain.Programme;
import da.StudentDA;
import da.ProgrammeDA;
import javax.swing.JOptionPane;

/**
 *
 * @author Wei
 */
public class P6Q2Servlet extends HttpServlet {

    private ProgrammeDA progDA = new ProgrammeDA();
    private StudentDA studDA = new StudentDA();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String id = request.getParameter("id");
            String ic = request.getParameter("ic");
            String name = request.getParameter("name");
            char level = request.getParameter("level").charAt(0);
            String code = request.getParameter("programme");
            int year = Integer.parseInt(request.getParameter("year"));

            try {
                Programme prog = progDA.getRecord(code);
                out.println("<h1>Programme is  " + prog.getCode() + prog.getFaculty() + prog.getName() + " has been added to the database</h1>");
//                Student stud = new Student(id, ic, name, level, prog, year);
//                studDA.addRecord(stud);
//                out.println("<h1>Student " + id + " has been added to the database</h1>");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
