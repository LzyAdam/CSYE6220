<%-- 
    Document   : index
    Created on : 2023年2月8日, 上午9:08:35
    Author     : Adam
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="index.jsp" method="post" >
            <input type="file" name="filepath" size="50">
            <input type="submit" value="Upload File">
        </form>>
        <%
            Class.forName("org.relique.jdbc.csv.CsvDriver");
            String url="jdbc:relique:csv:D:/";
//            url=request.getParameter("filepath");
//            out.println("filepath"+url);
//            String url=request.getParameter("file");
//            Part part=request.getPart("Upload File");
//            String filename=part.getSubmittedFileName();
//            String filepath=request.getServletContext().getRealPath("/");
//            part.write(filepath+"/"+filename);
            
//            String url=null;
//            for(Part p:request.getParts()){
//                 url=p.getSubmittedFileName();
//            }

            Connection con = DriverManager.getConnection(url);
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("Select * from parking_facilities");
            out.println("<table border='1'>");
            while(rs.next()){
            out.println("<tr>");
                String col1=rs.getString(1);
                String col2=rs.getString(2);
                String col3=rs.getString(3);
                String col4=rs.getString(4);
                String col5=rs.getString(5);
                String col6=rs.getString(6);
                String col7=rs.getString(7);
                String col8=rs.getString(8);
                String col9=rs.getString(9);
                String col10=rs.getString(10);
                String col11=rs.getString(11);
                String col12=rs.getString(12);
//                String col13=rs.getString(13);
                
                out.println("<td>"+col1+"</td>");
                out.println("<td>"+col2+"</td>");
                out.println("<td>"+col3+"</td>");
                out.println("<td>"+col4+"</td>");
                out.println("<td>"+col5+"</td>");
                out.println("<td>"+col6+"</td>");
                out.println("<td>"+col7+"</td>");
                out.println("<td>"+col8+"</td>");
                out.println("<td>"+col9+"</td>");
                out.println("<td>"+col10+"</td>");
               out.println("<td>"+col11+"</td>");
                out.println("<td>"+col12+"</td>");
//                out.println("<td>"+col13+"</td>");
                
            out.println("<tr>");               
                
            }
            out.println("</table>");
        %>
        
        
    </body>
</html>
