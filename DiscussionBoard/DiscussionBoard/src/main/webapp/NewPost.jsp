<%-- 
    Document   : NewPost
    Created on : Jun 19, 2016, 5:59:02 PM
    Author     : nick
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create a new post</title>
    </head>
    <body>
        <h1>Welcome <!-- username somehow --></h1>
        <h2>Enter a new post</h2>
        <a href="Logout">Logout</a>
        <form action="ShowPosts" method="post">
            <feildset>
                <textarea rows="4" cols="50" name="newPost"></textarea></br>
                <input type="submit"/>
            </feildset>
        </form>
        <p><a href="ShowPosts">Click here</a> to see posts.</p>
    </body>
</html>
