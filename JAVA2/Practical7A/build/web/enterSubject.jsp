<%-- 
    Document   : enterSubject
    Created on : Mar 11, 2021, 10:32:21 AM
    Author     : Wei
--%>
<%@page import="java.util.List"%>
<%@page import="entity.Subject"%>
<jsp:useBean id="Student" scope="session" class="entity.Student" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Subject</title>
        <style>
            #tablestyle {
                font-family: Arial, Helvetica, sans-serif;
                border-collapse: collapse;
                width: 50%;

            }

            #tablestyle td, #tablestyle th {
                border: 1px solid #ddd;
                padding: 8px;
            }

            #tablestyle tr:nth-child(even){background-color: #f2f2f2;}

            #tablestyle tr:hover {background-color: #ddd;}

            #tablestyle th {
                padding-top: 12px;
                padding-bottom: 12px;
                background-color: #4CAF50;
                color: white;
                text-align: center;
            }
            input[type=text], select {
                width: 100%;
                padding: 12px 20px;
                margin: 8px 0;
                display: inline-block;
                border: 1px solid #ccc;
                border-radius: 4px;
                box-sizing: border-box;
            }

            input[type=submit] {
                width: 20%;
                background-color: #4CAF50;
                color: white;
                padding: 14px 20px;
                margin: 8px 0;
                border: none;
                border-radius: 4px;
                cursor: pointer;
            }

            input[type=submit]:hover {
                background-color: #45a049;
            }
            input[type=reset] {
                width: 20%;
                background-color: red;
                color: white;
                padding: 14px 20px;
                margin: 8px 0;
                border: none;
                border-radius: 4px;
                cursor: pointer;
            }
            input[type=checkbox] {
                width: 30px; 
                height: 30px; 
            }

        </style>
    </head>
    <body>
        <h1>Excel Tuition Center</h1>
        <h2>Registration of Subject</h2>
        <%
            if (Student == null) {
        %>
        <h1>Not Such Student ID</h1>

        <%   } else {
        %>
        <form action="RegistrationServlet" method="post">
            <table>
                <tr>
                    <td>Student ID : </td>
                    <td> : </td>
                    <td><input type="text" name="id" value="<%=Student.getId()%>" readonly /></td>
                </tr>
                <tr>
                    <td>Student Name</td>
                    <td> : </td>
                    <td><input type="text" name="name" value="<%=Student.getName()%>" readonly /></td>
                </tr>
                <tr>
                    <td>My Kad Number</td>
                    <td> : </td>
                    <td><input type="text" name="ic" value="<%=Student.getIc()%>" readonly /></td>
                </tr>
                <tr>
                    <td>Contact Number</td>
                    <td> : </td>
                    <td><input type="text" name="phone" value="<%=Student.getPhone()%>" readonly /></td>
                </tr>
            </table>
            <h1>Select Subjects</h1>
            <table id="tablestyle">
                <tr>
                    <th>Subject Code</th>
                    <th>Title</th>
                    <th>Fee (RM)</th>
                    <th>Select</th>
                </tr>
                <%
                    List<Subject> SubjectList = (List) session.getAttribute("SubjectList");
                    for (Subject subject : SubjectList) {
                %>
                <tr>
                    <td><%=subject.getSubjectCode()%></td>
                    <td><%=subject.getTitle()%></td>
                    <td>RM <%=subject.getFee()%></td>
                    <td style="text-align: center"><input type="checkbox" name="select" value="<%=subject.getSubjectCode()%>"/> </td>
                </tr>

                <%
                    }
                %>

            </table><br/>
            <input type="submit" value="Confirm Registration"/>
            <input type="reset" value="Reset"/>
            <% }%>
        </form>
        <br/><br/><br/><br/><br/>
    </body>
</html>
