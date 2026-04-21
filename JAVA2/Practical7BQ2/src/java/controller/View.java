package controller;

import model.Item;
import model.ItemService;
import java.io.*;
import java.util.List;
import java.util.logging.*;
import javax.persistence.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class View extends HttpServlet {

    @PersistenceContext
    EntityManager em;
    private String Title = "Title is missing.";
    private String StoreName = "Store Name is missing.";
    private String ContactUs = "ContactUs is missing.";

    @Override
    public void init() throws ServletException {
        ServletConfig config = getServletConfig();
        if (config.getInitParameter("viewTitle") != null) {
            Title = config.getInitParameter("viewTitle");
        }

        ServletContext context = getServletContext();
        if (context.getInitParameter("storeName") != null) {
            StoreName = context.getInitParameter("storeName");
        }
        if (context.getInitParameter("contactUs") != null) {
            ContactUs = context.getInitParameter("contactUs");
        }
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            ItemService itemService = new ItemService(em);
            List<Item> itemList = itemService.findAll();
            HttpSession session = request.getSession();
            session.setAttribute("Title", Title);
            session.setAttribute("StoreName", StoreName);
            session.setAttribute("ContactUs", ContactUs);
            session.setAttribute("itemList", itemList);
            response.sendRedirect("secureUser/Display.jsp");
        } catch (Exception ex) {
            Logger.getLogger(AddItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
