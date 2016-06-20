<%-- 
    Document   : index
    Created on : Jun 19, 2016, 5:32:28 PM
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
        <h1>This is a java discussion board app from index.jsp</h1>

        <% 
// check for session and redirect to new post page if a user is logged in
if (session.getAttribute("username") != null) {
    response.sendRedirect("NewPost.jsp");
}
        %>
        
        <form action="Login" method="post">
            <fieldset>
                <p>Username: <input name="username" type="text"/></p>
                <p>Password: <input name="password" type="password"/></p>
                <input type="submit"/>
            </fieldset>
        </form>
        
    </body>
</html>
