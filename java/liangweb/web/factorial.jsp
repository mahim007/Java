<%--
  Created by IntelliJ IDEA.
  User: mahim
  Date: 07-Jul-17
  Time: 1:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Factorial from 0 to 10</title>
</head>
<body>
    <% for (int i=0;i<=10;i++){ %>
        Factorial of <%= i %> is
        <%= fact(i) %> <br>
    <% } %>

    <%! private long fact(int n){
        if(n==0) return  1;
        return  n*fact(n-1);
    }%>
</body>
</html>
