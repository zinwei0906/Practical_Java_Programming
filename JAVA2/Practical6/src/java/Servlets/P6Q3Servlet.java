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
import domain.Loan;
import java.text.DecimalFormat;
import javax.servlet.http.HttpSession;

public class P6Q3Servlet extends HttpServlet {

    private static DecimalFormat df2 = new DecimalFormat("#.##");

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            double loanAmount = Double.parseDouble(request.getParameter("loanAmount"));
            double annualInterestRate = Double.parseDouble(request.getParameter("annualInterestRate"));
            int numberOfYears = Integer.parseInt(request.getParameter("numberOfYears"));
            Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

            //Store Session Nam "LoanSession"
            HttpSession session = request.getSession();
            session.setAttribute("LoanSession", loan);

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GetLoan</title>");
            out.println("<link rel='stylesheet' type='text/css' href='Form2.css'/>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 style='margin-left: 20%;'>You entered the following data</h1>");
            out.println("<form method=\"post\" action=\"P6Q3Servlet\" id=\"myform\" name=\"myform\">\n"
                    + "            <table class=\"FormTable\">\n"
                    + "                <tr>\n"
                    + "                    <td class=\"Column1\">Loan Amount (RM) </td>\n"
                    + "                    <td class=\"Column2\">RM " + loanAmount + "</td>\n"
                    + "                </tr>\n"
                    + "                <tr>\n"
                    + "                    <td class=\"Column1\">Annual Interest Rate </td>\n"
                    + "                    <td class=\"Column2\">" + annualInterestRate + "</td>\n"
                    + "                </tr>\n"
                    + "                <tr>\n"
                    + "                    <td class=\"Column1\">Number of Years </td>\n"
                    + "                    <td class=\"Column2\">" + numberOfYears + "</td>\n"
                    + "                </tr>\n"
                    + "            </table>\n"
                    + "            <!--Submit Button-->\n"
                    + "            <div class=\"wrapper2\">\n"
                    + "                <div class=\"link_wrapper\">\n"
                    + "                    <a><button type=\"submit\" name=\"submit\" id=\"Submit\" value=\"Submit\">Confirm</button></a>\n"
                    + "                    <div class=\"icon\">\n"
                    + "                        <svg xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 268.832 268.832\">\n"
                    + "                        <path d=\"M265.17 125.577l-80-80c-4.88-4.88-12.796-4.88-17.677 0-4.882 4.882-4.882 12.796 0 17.678l58.66 58.66H12.5c-6.903 0-12.5 5.598-12.5 12.5 0 6.903 5.597 12.5 12.5 12.5h213.654l-58.66 58.662c-4.88 4.882-4.88 12.796 0 17.678 2.44 2.44 5.64 3.66 8.84 3.66s6.398-1.22 8.84-3.66l79.997-80c4.883-4.882 4.883-12.796 0-17.678z\"/>\n"
                    + "                        </svg>\n"
                    + "                    </div>\n"
                    + "                </div>\n"
                    + "            </div>\n"
                    + "        </form>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            //Session
            HttpSession session = request.getSession();
            Loan loan = (Loan) (session.getAttribute("LoanSession"));
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PostLoan</title>");
            out.println("<link rel='stylesheet' type='text/css' href='Form2.css'/>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 style='margin-left: 20%;'>Loan Payment</h1>");
            out.println("            <table class=\"FormTable\">\n"
                    + "                <tr>\n"
                    + "                    <td class=\"Column1\">Loan Amount (RM) </td>\n"
                    + "                    <td class=\"Column2\">RM " + df2.format(loan.getLoanAmount()) + "</td>\n"
                    + "                </tr>\n"
                    + "                <tr>\n"
                    + "                    <td class=\"Column1\">Annual Interest Rate </td>\n"
                    + "                    <td class=\"Column2\">" + loan.getAnnualInterestRate() + "</td>\n"
                    + "                </tr>\n"
                    + "                <tr>\n"
                    + "                    <td class=\"Column1\">Number of Years </td>\n"
                    + "                    <td class=\"Column2\">" + loan.getNumberOfYears() + "</td>\n"
                    + "                </tr>\n"
                    + "                    <td class=\"Column1\">Monthly Payment </td>\n"
                    + "                    <td class=\"Column2\">RM " + df2.format(loan.getMonthlyPayment()) + "</td>\n"
                    + "                </tr>\n"
                    + "                <tr>\n"
                    + "                    <td class=\"Column1\">Total Payment </td>\n"
                    + "                    <td class=\"Column2\">RM " + df2.format(loan.getTotalPayment()) + "</td>\n"
                    + "                </tr>\n"
                    + "            </table>\n"
            );
            out.println("</body>");
            out.println("</html>");
        }
    }
}
