<%-- 
    Document   : Testing
    Created on : Feb 17, 2021, 3:27:27 PM
    Author     : Wei
--%>

<%@page import="domain.Count" contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="count" scope="application" class="domain.Count"></jsp:useBean>
    <!DOCTYPE html>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>JSP Page</title>
        </head>
        <body>
            <h1>Testing Java Bean IN JSP</h1>
        <% count.increaseCount();%>
        <%=count.getCount()%>
    </body>
</html>
