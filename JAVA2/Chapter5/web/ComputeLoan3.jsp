<%-- ComputeLoan3.jsp --%>
<html>
    <head>
        <title>ComputeLoan3: Associating Bean Properties with Input Parameters</title>
    </head>
    <body>
        <%@ page import = "domain.Loan" %>
        <jsp:useBean id="loan" class="domain.Loan" scope="page" ></jsp:useBean>
        <jsp:setProperty name="loan" property="*" />
        Loan Amount: <%= String.format("%.2f", loan.getLoanAmount()) %><br />
        Annual Interest Rate: <%= String.format("%.2f", loan.getAnnualInterestRate()) %><br />
        Number of Years: <%= loan.getNumberOfYears() %><br />
        <b>Monthly Payment: RM<%= String.format("%.2f", loan.getMonthlyPayment()) %><br />
            Total Payment: RM<%= String.format("%.2f", loan.getTotalPayment()) %><br /></b>
    </body>
</html>
