<%-- Table.jsp --%>
<%@page import="da.DBBean" %>
<jsp:useBean id="dbBeanId" scope="session" class="da.DBBean"></jsp:useBean>
<html>
    <head>
        <title>Table</title>
    </head>
    <body>
        <% String[] tables = dbBeanId.getTables();
        if (tables == null) { %>
        No tables
        <% }
        else { %>
        <form method="post" action="BrowseTable.jsp">
            Select a table
            <select name="tablename" size="1">
                <% for (int i = 0; i < tables.length; i++) { %>
                <option><%= tables[i] %></option>
                <% }
        } %>
            </select><br /><br /><br />
            <input type="submit" name="Submit" value="Browse Table Content">
            <input type="reset" value="Reset">
        </form>
    </body>
</html>
