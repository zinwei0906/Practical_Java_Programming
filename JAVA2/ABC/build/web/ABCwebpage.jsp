<%-- 
    Document   : ABCwebpage
    Created on : Apr 7, 2021, 3:09:31 PM
    Author     : Wei
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="Model.Productorders"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <meta name="keywords" content="HTML,CSS,JavaScript,JSP,Servlet,Java"/>
        <meta name="author" content="TAN ZIN WEI"/>
        <meta name="language" content="English"/>
        <title>ABC Spare Parts Company</title>
        <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
        <script src="https://cdn.datatables.net/1.10.22/js/jquery.dataTables.min.js"></script>
        <script src="https://cdn.datatables.net/1.10.22/js/dataTables.bootstrap4.min.js"></script>
        <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.22/css/dataTables.bootstrap4.min.css">
        <script>
            $(document).ready(function () {
                $('#FormTable').DataTable();
            })
        </script>
    </head>
    <body>
        <br/><br/><br/>
        <h1 style="text-align: center">ABC Spare Parts Company</h1>
        <div class="container py-5">
            <h1 style="text-align: center"><b>Order Report</b></h1>
            <table id="FormTable" style="width:100%;" class="table table-striped table-bordered">
                <thead>
                    <tr>
                        <th style="width: 5%;">Product ID</th>
                        <th style="width: 5%;">DESCRIPTION</th>
                        <th style="width: 5%;">IMAGE</th>
                        <th style="width: 5%;">UNIT</th>
                        <th style="width: 5%;">RETAIL PRICE</th>
                        <th style="width: 5%;">FREIGHT CHARGES</th>
                        <th style="width: 5%;">PACKAGING COATS</th>
                        <th style="width: 5%;">Amount</th>
                        <th style="width: 5%;">Discount</th>
                        <th style="width: 5%;">Total Amount</th>
                        <th style="width: 5%;">Total Payment</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        List<Productorders> ABCList = (List) session.getAttribute("ABCList");
                        DecimalFormat df = new DecimalFormat("#,##0.00");
                        if (ABCList == null) {
                    %>
                    <tr><td colspan='15'><h1 style='text-align:center'>0 Records > <a style="font-size: 100px;" href="ABCServlet">Refresh</a></h1></td></tr>
                    <%
                    } else {
                        for (Productorders product : ABCList) {

                    %>
                    <tr>
                        <td><%= product.getProductid()%></td>
                        <td><%= product.getDescription()%></td>
                        <td><img width='120' height='80' src='image/<%=product.getImage()%>.jpg'/></td>
                        <td><%= product.getUnit()%>unit</td>
                        <td>RM <%= product.getRetailprice()%></td>
                        <td>RM <%= product.getFreightcharges()%></td>
                        <td>RM <%= product.getPackagingcoats()%></td>
                        <td>RM <%=product.getAmount()%></td>   
                        <td><%=product.getDiscount()%>%</td>  
                        <td>RM <%=product.getTotalAmount()%></td> 
                        <td>RM <%=df.format(product.getTotalPayment())%></td>
                    </tr>
                    <%  }
                        }%>
                </tbody>
            </table>
        </div>
    </body>
</html>