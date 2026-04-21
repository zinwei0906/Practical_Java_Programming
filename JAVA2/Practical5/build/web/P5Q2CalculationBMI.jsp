<%-- 
    Document   : P5Q2CalculationBMI
    Created on : Feb 25, 2021, 9:26:01 AM
    Author     : Wei
--%>

<!DOCTYPE html>
<html>
    <head>

        <title>BMI Calculation</title>
    </head>
    <body>
        <!--        </%@page import = "domain.BMI" %>
                </% double height = Double.parseDouble(request.getParameter("height"));
                    double weight = Double.parseDouble(request.getParameter("weight"));
                    BMI bmi = new BMI( weight, height);
                    double getBMI = bmi.getBMI();
                    String Category = bmi.getStatus(); %>
                <h1>BMI Calculation</h1><br/>
                <h3>Height : </%= String.format("%.2f", height) %> m</h3>
                <h3>Weight : </%= String.format("%.2f", weight) %> kg</h3>
                <h3>BMI : </%= String.format("%.2f", getBMI) %></h3>
                <h3>Category : </%= Category %></h3>-->
        <%@page import = "domain.BMI" %>
        <jsp:useBean id="bmi" class="domain.BMI" scope="page" ></jsp:useBean>
        <jsp:setProperty name="bmi" property="*" />
        <h1>BMI Calculation</h1><br/>
        <h3>Height : <%= String.format("%.2f", bmi.getHeight()) %> m</h3>
        <h3>Weight : <%= String.format("%.2f", bmi.getWeight()) %> kg</h3>
        <h3>BMI : <%= String.format("%.2f", bmi.getBMI()) %></h3>
        <h3>Category : <%= bmi.getStatus() %></h3>
    </body>
</html>
