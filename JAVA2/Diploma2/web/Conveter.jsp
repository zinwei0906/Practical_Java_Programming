<%-- 
    Document   : Conveter
    Created on : Oct 1, 2021, 8:12:20 PM
    Author     : RSD2G6 TAN ZIN WEI
--%>
<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Converter</title>
    </head>
    <body>
        <form action="" method="post">
            <h1>Currency Converter (From Foreign Currency to RM)</h1>
            Amount : <input type="text" name="amount" value="<% if (request.getParameter("amount") != null) {
                out.println(request.getParameter("amount"));
            }
                            %>"/>
            <h3>Convert From</h3>
            <select name="Money">
                <option value="EUR" >European Dollar</option>
                <option value="INR" >Indian Rupee</option>
                <option value="JPY" >Japanese Yen</option>
                <option value="USD" >US Dollar</option>
            </select>
            <input type="submit" name="submit" value="Convert" />
        </form>
        <%
        if (request.getParameter("amount") != null && request.getParameter("Money") != null) {
        Double amount = Double.parseDouble(request.getParameter("amount"));
        String typeMoney = request.getParameter("Money");
        Double RM = 0.00;
        if (typeMoney.equals("EUR")) {
        RM = amount * 4.874321;
        } else if (typeMoney.equals("INR")) {
        RM = amount * 0.0554551;
        } else if (typeMoney.equals("JPY")) {
        RM = amount * 0.0385443;
        } else if (typeMoney.equals("USD")) {
        RM = amount * 4.04724;
        }
        DecimalFormat format = new DecimalFormat("#0.00000");
        out.println("<h3>" + amount + " " + typeMoney +" = " + format.format(RM) + " MYR</h3>");
        }
        %>
    </body>
</html>
