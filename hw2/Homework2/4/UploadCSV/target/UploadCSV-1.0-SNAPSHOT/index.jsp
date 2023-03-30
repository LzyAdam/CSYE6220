<%-- 
    Document   : index
    Created on : 2023年2月22日, 下午6:10:07
    Author     : Adam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Upload CSV file</title>
    </head>
    <body>
        <h1>Upload CSV file</h1>
        <form action="UploadServlet.xls" enctype="multipart/form-data" method="post" >
            <label for="uname">Enter CSV file name:</label>
            <input type="text" id="uname" name="uname"><br><br>
            <input type="file" name="myfile" size="50">
            <input type="submit" value="Upload File">
        </form>
    </body>
</html>
