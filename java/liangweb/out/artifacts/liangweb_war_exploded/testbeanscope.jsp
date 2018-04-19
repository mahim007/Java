<%--
  Created by IntelliJ IDEA.
  User: mahim
  Date: 06-Oct-17
  Time: 3:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="mahim.Count" %>
<jsp:useBean id="count" scope="application" class="mahim.Count" >
</jsp:useBean>

<html>
<head>
    <title>testing the bean scope</title>
</head>
<body>
<h3> Testing Bean scope in JSP (Application) </h3>
    <% count.increase_cnt(); %>
    You are visitor number= <%= count.getCnt()%> <br>
    From Host= <%= request.getRemoteHost() %><br>
    ans session= <%=session.getId()%>
</body>
</html>
