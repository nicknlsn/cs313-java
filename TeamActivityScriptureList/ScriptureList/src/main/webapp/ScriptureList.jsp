<%-- 
    Document   : ScriptureList
    Created on : Jun 16, 2016, 10:11:10 AM
    Author     : nick
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Steve's Scriptures</title>
    </head>
    <body>
        <h1>Steve's Favorite Scripture Application</h1>
        <ul>
            <%
                List<String> scriptures = (List<String>)request.getAttribute("scriptures");
                
                for (String scripture : scriptures) {
                    out.println("<li>" + scripture + "</li>");
                }
            %>            
        </ul>
    </body>
</html>
