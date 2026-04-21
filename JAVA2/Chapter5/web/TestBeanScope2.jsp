<%-- TestBeanScope2.jsp --%>
<%@page import="domain.Count2" %>
<jsp:useBean id="count" scope="application" class="domain.Count2"></jsp:useBean>
<html>
    <head>
        <title>TestBeanScope2</title>
    </head>
    <body>
        <h3>Testing Bean Scope in JSP (Application)</h3>
        <% count.increaseCount(); %>
        You are visitor number <%= count.getCount() %><br />
        From host: <%= request.getRemoteHost() %>
        and session: <%= session.getId() %>
    </body>
</html>
