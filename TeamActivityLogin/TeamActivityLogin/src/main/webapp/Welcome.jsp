<%-- 
    Document   : Welcome
    Created on : Jun 14, 2016, 11:01:57 AM
    Author     : nick
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome ${param.username}!</h1>
        
        <form action="Logout" method="POST">
            <input type="submit" value="Logout"/>
        </form>
    </body>
</html>
