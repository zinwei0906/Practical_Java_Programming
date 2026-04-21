package controller;

import entity.Student;
import entity.Subject;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.transaction.UserTransaction;

/**
 *
 * @author Wei
 */
public class ReadStudentandSubject extends HttpServlet {

    @PersistenceContext(unitName = "Practical7PU")
    private EntityManager em;
    @Resource
    private javax.transaction.UserTransaction utx;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            //Create String value and store the parameter name id
            String studentID = request.getParameter("id");
            Student student = em.find(Student.class, studentID);
            //Create httpsession
            HttpSession session = request.getSession();
            //Store the student class into session
            session.setAttribute("Student", student);
            List<Subject> subjectList = em.createNamedQuery("Subject.findAll").getResultList();
            //Store the List Subject into the session
            session.setAttribute("SubjectList", subjectList);
            response.sendRedirect("enterSubject.jsp");
        }
    }
}
