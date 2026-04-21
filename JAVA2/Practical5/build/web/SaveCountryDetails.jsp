<%-- 
    Document   : SaveCountryDetails
    Created on : Feb 25, 2021, 10:55:34 AM
    Author     : Wei
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SAVE Country Details</title>
    </head>
    <body>
        <%-- StoreProgramme.jsp --%>
        <%@page import="domain.Country" %>
        <jsp:useBean id="country" class="domain.Country" scope="session"></jsp:useBean>
        <jsp:useBean id="countryda"  class="da.CountriesDA" scope="application"></jsp:useBean>

        <%
            countryda.addRecord(country);
            
            out.println(country.getName() + " | " + country.getFullName() +" | "+ country.getCapital()+" has been stored in the database");
            out.close();
//
//out.println("<table>");
////ArrayList dataList = new ArrayList();
////CountriesDA countries = new CountriesDA();
////Country country : countries.getCountries()
//// add some data in it....
//ArrayList dataList = new ArrayList();
//for (Iterator iter = dataList.iterator(); iter.hasNext();) {
//    out.println("<tr><td>" + (String)(iter.next()) + "</td></tr>");
//}
//out.println("</table>");
        %>
    </body>
</html>
