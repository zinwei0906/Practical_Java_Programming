package controller;

import entity.Passenger;
import java.io.*;
import java.util.List;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.transaction.UserTransaction;

public class AddPassenger extends HttpServlet {
  @PersistenceContext EntityManager em;
  @Resource UserTransaction utx;
    
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    try {
      String ic = request.getParameter("ic");
      String name = request.getParameter("name");
      Passenger p = new Passenger(ic, name);
      utx.begin();
      em.persist(p);
      utx.commit();
      
      request.setAttribute("passenger", p);
      RequestDispatcher rd = request.getRequestDispatcher("PassengerView.jsp");
      rd.forward(request, response);
    } catch (Exception ex) {
      request.setAttribute("exception", ex);
      RequestDispatcher rd = request.getRequestDispatcher("ExceptionView.jsp");
      rd.forward(request, response);
    }
    
  }

}
