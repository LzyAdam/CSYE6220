<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <form action="j_security_check" method="post">
        <table >
            <TR><TD>User name: <INPUT TYPE="TEXT" NAME="j_username">
            <TR><TD>Password: <INPUT TYPE="PASSWORD" NAME="j_password">
            <TR><TH><INPUT TYPE="SUBMIT" VALUE="Log In">
        </table>
</form>
</body>
</html>
