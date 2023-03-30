<%-- 
    Document   : index
    Created on : 2023年2月23日, 下午3:13:28
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
         <h1>Upload Excel file</h1>
        <form action="Excel.xls" enctype="multipart/form-data" method="Post" >
            <label for="uname">Enter Excel file name:</label>
            <input type="text" id="uname" name="uname"><br><br>
            <input type="file" name="file" size="50">
            
            <input type="submit" value="Upload File">
        </form>
    </body>
</html>
