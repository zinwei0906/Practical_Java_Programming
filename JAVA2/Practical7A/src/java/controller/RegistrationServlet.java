package controller;

import entity.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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

/**
 *
 * @author Wei
 */
public class RegistrationServlet extends HttpServlet {

    @PersistenceContext(unitName = "Practical7PU")
    private EntityManager em;
    @Resource
    private javax.transaction.UserTransaction utx;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String selectSubjects[] = request.getParameterValues("select");
            if (selectSubjects == null) {
                out.println("<h1>Please Choose at least 1 Subject!!!</h1><br/>");
                out.println("<h3><a href='enterSubject.jsp' >Go Back the Enter Subject Page</a></h3>");
            } else {
                String studentID = request.getParameter("id");
                String studentName = request.getParameter("name");
                String studentIC = request.getParameter("ic");
                String studentPhone = request.getParameter("phone");
                Student student = new Student(studentID, studentIC, studentName, studentPhone);

                List<RegisteredSubject> registeredSubjectList = new ArrayList<RegisteredSubject>();
                for (int number = 0; number < selectSubjects.length; number++) {
                    Subject subject = em.find(Subject.class, selectSubjects[number]);
                    registeredSubjectList.add(new RegisteredSubject(subject));
                }
                Registration registration = new Registration(student, registeredSubjectList);
                
                //Set the REGISTERED_SUBJECT Table REG_id 
                registration.settingRegisteredSubjectID(registeredSubjectList);
                //Persist/Add the class records into the database
                persist(registration);
                HttpSession session = request.getSession();
                //Store the Registration class into session
                session.setAttribute("Registration", registration);
                response.sendRedirect("ConfirmRegistered.jsp");
            }

        }
    }

    public void persist(Object object) {
        try {
            utx.begin();
            em.persist(object);
//            em.flush();
//            em.refresh(object);
            utx.commit();

        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            throw new RuntimeException(e);
        }
    }


}
