<%-- 
    Document   : studentform
    Created on : Aug 17, 2015, 4:28:15 AM
    Author     : Personal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        	<center>
<form
method="post"
action="http://localhost:8080/javaweb/studentformservlet">
<table>
	<tr>
		<td><b>student</td>
		<td><input type=textarea name="e" size="25" value=""></td>
	</tr>
	<tr>
		<td><b>dept</td>
		<td><input type=textarea name="p"  size="25"  value=""></td>
	</tr>
</table>
<input type=submit value="Submit">
    </body>
</html>