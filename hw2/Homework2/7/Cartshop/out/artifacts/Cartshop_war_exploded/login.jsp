<%--
  Created by IntelliJ IDEA.
  User: Adam
  Date: 2/23/2023
  Time: 11:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<h1>login</h1>
<form method="post" action="loginServlet">
    name:<input name="uname" type="text"><br>
    password:<input name="upwd" type="password"><br>
    <input type="submit" value="submit"><br>
    <span style="color: red;font-size: 12px">${msg}</span>
</form>
</body>
</html>
