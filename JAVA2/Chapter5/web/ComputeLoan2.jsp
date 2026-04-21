<%-- ComputeLoan2.jsp --%>
<html>
    <head>
        <title>ComputeLoan2: Compute Loan Using the Loan Class</title>
    </head>
    <body>
        <%@ page import = "domain.Loan" %>
        <% double loanAmount = Double.parseDouble(request.getParameter("loanAmount"));
            double annualInterestRate = Double.parseDouble(request.getParameter("annualInterestRate"));
            int numberOfYears = Integer.parseInt(request.getParameter("numberOfYears"));
            Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
            double monthlyPayment = loan.getMonthlyPayment();
            double totalPayment = loan.getTotalPayment(); %>
        Loan Amount: <%= String.format("%.2f", loanAmount) %><br />
        Annual Interest Rate: <%= String.format("%.2f", annualInterestRate) %><br />
        Number of Years: <%= numberOfYears%><br />
        <b>Monthly Payment: RM<%= String.format("%.2f", monthlyPayment) %><br />
            Total Payment: RM<%= String.format("%.2f", totalPayment) %><br /></b>
    </body>
</html>
