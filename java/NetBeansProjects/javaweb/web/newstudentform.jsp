<%-- 
    Document   : newstudentform
    Created on : Aug 17, 2015, 5:56:48 PM
    Author     : Personal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>student registration form</title>
    </head>
    <body>
        <form method="get" action="http://localhost:8080/javaweb/newstudentformservlet">
<p>
Id <input type="textarea" name="id" size="25" value="">
</p>
<p>
Name <input type="textarea" name="name" size="25" value="">
</p>
<p>
Dept <input type="textarea" name="dept" size="25" value="">
</p>
<p>
<input type="submit" name="submit" value="Submit">
<input type="reset" name="reset" value="Reset">
</p>
</form>
    </body>
</html>
