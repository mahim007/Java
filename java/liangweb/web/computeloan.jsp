<%--
  Created by IntelliJ IDEA.
  User: mahim
  Date: 07-Jul-17
  Time: 2:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Compute Loan</title>
</head>
<body>
    <%
        double loanamount=Double.parseDouble(request.getParameter("loanamount"));
        double annual_interest=Double.parseDouble(request.getParameter("interest"));
        double number_of_years=Double.parseDouble(request.getParameter("years"));
        double monthly_interest=annual_interest/1200;

        double monthly_payment=loanamount*monthly_interest/(1-1/Math.pow(1+monthly_interest,number_of_years*12));
        double total_payment=monthly_payment*number_of_years*12;
    %>

Loan Ammount: <%=loanamount%> <br>
Annual Interest Rate: <%=annual_interest%><br>
Number Of Years: <%=number_of_years%><br>
<b>
    Monthly Payment: <%=monthly_payment%><br>
    Total Payment: <%=total_payment%> <br>
</b>
</body>
</html>
