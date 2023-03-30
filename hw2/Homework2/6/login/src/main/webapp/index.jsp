<%-- 
    Document   : login
    Created on : 2023年2月23日, 下午9:34:15
    Author     : Adam
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
        <h1>login</h1>
        <form method="post" action="loginServlet">
            name:<input name="uname" type="text"><br>
            password:<input name="upwd" type="password"><br>
            <input type="submit" value="submit"><br>
            <span style="color: red;font-size: 12px">${msg}</span>
        </center>
    </body>
</html>
