/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

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

/**
 *
 * @author Wei
 */
public class ABCServlet extends HttpServlet {

    @PersistenceContext(unitName = "ABCPU")
    private EntityManager em;
    @Resource
    private javax.transaction.UserTransaction utx;


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            //Create the HTTPsession
            HttpSession session = request.getSession();
            //Read all the records from database and store in List Object
            List<Object> List = em.createNamedQuery("Productorders.findAll").getResultList();
            //Set the session is List object
            session.setAttribute("ABCList", List);
            //Go to the URL JSP Page
            out.println("123");
            response.sendRedirect("ABCwebpage.jsp");
        }
    }
    public void persist(Object object) {
        try {
            utx.begin();
            em.persist(object);
            utx.commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            throw new RuntimeException(e);
        }
    }

}
