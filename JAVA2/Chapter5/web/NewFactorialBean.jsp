<%-- NewFactorialBean.jsp --%>
<%@page import="domain.NewFactorialBean" %>
<jsp:useBean id="factorialBeanId" 
             class="domain.NewFactorialBean" scope="page" >
</jsp:useBean>
<jsp:setProperty name="factorialBeanId" property="*" />
<html>
    <head>
        <title>NewFactorialBean</title>
    </head>
    <body>
        <h3>NewFactorialBean: Compute Factorial Using a Bean</h3>
        <form method="post">
            Enter new value: <input name="number" /><br /><br />
            <input type="submit" name="Submit" value="Compute Factorial" />
            <input type="reset" value="Reset" /><br /><br />
            Factorial of
            <jsp:getProperty name="factorialBeanId" property="number" /> is
            <%@page import="java.text.*" %>
            <%= NewFactorialBean.format(factorialBeanId.getFactorial()) %>
        </form>
    </body>
</html>
