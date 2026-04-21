<%-- 
    Document   : P5Q1
    Created on : Feb 25, 2021, 8:55:09 AM
    Author     : Wei
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Factorial Table</title>
        <style>
            table,th,tr,td{
                border: 2px solid black;
            }
            table,h1{
                margin-left: 100px;
            }
        </style>
    </head>
    <body>
        <h1>Factorial Table</h1>
        <table>
            <tr >
                <th>Number</th>
                <th>Factorial</th>
            </tr>
            <% for(int num=1;num<10;num++){ %>
            <tr>
                <td><%=num%></td>
                <td><%=computeFactorial(num)%></td>
            </tr>
            <% }%>
        </table>
        <%! private int computeFactorial(int number) {
        if (number == 0)
        return 1;
        else
        return number * computeFactorial(number - 1);
        }
        %>
    </body>
</html>
