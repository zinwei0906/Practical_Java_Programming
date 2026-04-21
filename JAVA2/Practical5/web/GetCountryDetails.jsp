<%-- 
    Document   : GetCountryDetails
    Created on : Feb 25, 2021, 10:54:20 AM
    Author     : Wei
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get Country Details</title>
    </head>
    <body>
        <%-- GetCountryData.jsp --%>
        <%@page import="domain.Country" %>
        <jsp:useBean id="country" class="domain.Country" scope="session"></jsp:useBean>
        <jsp:setProperty name="country" property="*" />
        <h1>Get Country Details</h1>
        <%
            if (country.getName() == null || country.getFullName() == null || country.getCapital() == null) {
                out.println("Country Name, Full Name and Capital are required");
                return;
            }
        %>

        <h2>The Country Detail : </h2>
        <h3>Country Name : <%= country.getName() %></h3>
        <h3>Country Full Name : <%= country.getFullName() %></h3>
        <h3>Country Capital : <%= country.getCapital() %></h3>
        <form method="post" action="SaveCountryDetails.jsp"><br/>
            <input type="submit" value="Confirm">
        </form>
    </body>
</html>
