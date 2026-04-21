<%-- 
    Document   : enterSubject
    Created on : Mar 11, 2021, 10:32:21 AM
    Author     : Wei
--%>

<%@page import="entity.RegisteredSubject,entity.Student,entity.Subject,entity.Registration"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirm Registered</title>
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
        <h2>Subject Registration Details</h2>
        <%
            Registration registration = (Registration) session.getAttribute("Registration");
            if (registration == null) {

        %>
        <h1>Not Records</h1>

        <%   } else {
        %>
        <table>
            <tr>
                <td>Student : <%=registration.getId().getName()%> [<%=registration.getId().getIc()%>]</td>
            </tr>
            <tr>
                <td>Registration No : <%=registration.getRegId()%></td>
            </tr>
        </table>
        <h1>Registered Subjects</h1>
        <table id="tablestyle">
            <tr>
                <th>No</th>
                <th>Subject Code</th>
                <th>Title</th>
                <th>Fee (RM)</th>

            </tr>
            <%
                List<RegisteredSubject> SubjectList = registration.getRegisteredSubjectList();
                int number = 1;
                for (RegisteredSubject subject : SubjectList) {
            %>
            <tr>
                <td><%=number%></td>
                <td><%=subject.getSubjectCode().getSubjectCode()%></td>
                <td><%=subject.getSubjectCode().getTitle()%></td>
                <td>RM <%=subject.getSubjectCode().getFee()%></td>
            </tr>

            <%
                    number++;
                }
            %>

        </table><br/>
        <h1>Total Amount Due : RM <%=registration.getRegistrationTotal()%></h1>
        <% }%>
        <br/><br/><br/><br/><br/>
    </body>
</html>
