<%-- DBLoginInitialization.jsp --%>
<%@page import="da.DBBean" %>
<jsp:useBean id="dbBeanId" scope="session" class="da.DBBean"></jsp:useBean>
<jsp:setProperty name="dbBeanId" property="*" />
<html>
    <head>
        <title>DBLoginInitialization</title>
    </head>
    <body>

        <%-- Connect to the database --%>
        <% dbBeanId.initializeJdbc();%>

        <% if (dbBeanId.getConnection() == null) {%>
        Error: Login failed.  Try again.
        <% } 
           else {%>
        <jsp:forward page="Table.jsp" />
        <% }%>
    </body>
</html>
