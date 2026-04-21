<%-- BrowseTable.jsp --%>
<%@page import="da.DBBean" %>
<jsp:useBean id="dbBeanId" scope="session" class="da.DBBean"></jsp:useBean>
    <html>
        <head>
            <title>Browse Table</title>
        </head>
        <body>
        <% String tableName = request.getParameter("tablename");%>
        <table border="1">
            <tr>
                <% // Add column names to the table
                    ArrayList<String> columnNames = dbBeanId.getColumnNames(tableName);
                    for (int i = 0; i < columnNames.size(); ++i) {%>
                <td><%= columnNames.get(i)%></td>
                <% }%>
            </tr>

            <%@page import="java.util.*" %>
            <%
                // Display row data
                ArrayList<Object[]> tableRows = dbBeanId.getRows(tableName);
                for (int i = 0; i < tableRows.size(); ++i) {
                    out.println("<tr>");
                    Object[] row = tableRows.get(i);
                    for (int j = 0; j < row.length; ++j) {%>
                        <td><%= String.valueOf(row[j])%></td>
                 <% }
                    out.println("</tr>");
                }%>
        </table>

    </body>
</html>
