/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.uploadcsv;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.relique.jdbc.csv.CsvDriver;
import java.sql.*;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author Adam
 */
@WebServlet("/UploadServlet.xls")
@MultipartConfig
public class UploadServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        
        OutputStream out=response.getOutputStream();
        PrintWriter pw=new PrintWriter(new BufferedWriter(new OutputStreamWriter(out)));
        
        String uname= request.getParameter("uname");
        System.out.println("filename"+uname);
        Part part=request.getPart("myfile");
        //file name saved
        String fileName=part.getSubmittedFileName();
        System.out.println("111111111fileName"+fileName);
        //all path
        
        String filePath= request.getServletContext().getRealPath("/");
        part.write(filePath+"/"+fileName);
        System.out.println("filePath"+filePath);
        
        
        /*****************************************/
        Class.forName("org.relique.jdbc.csv.CsvDriver");
            //String url=filePath+"/"+fileName;
            String url="jdbc:relique:csv:D:/";
            //String url="jdbc:relique:csv:D";
            System.out.println("url"+url);
            //Connection con = DriverManager.getConnection(filePath);
//            Statement stmt;
            
            String filenamesub=fileName.substring(0, fileName.lastIndexOf("."));
            System.out.println("filenamesub"+filenamesub);
            System.out.println("1111111111111111111");
            Connection con = DriverManager.getConnection(url);
            System.out.println("22222222222222222222");
            Statement stmt = (Statement) con.createStatement();
            System.out.println("333333333333333333333");
            ResultSet rs=stmt.executeQuery("SELECT * FROM " + filenamesub );
           // ResultSet rs=stmt.executeQuery("Select * from parking_facilities");
//            stmt = conn.createStatement();
//			rs = stmt.executeQuery("SELECT * FROM " + filename);
            //ResultSet rs=stmt.executeQuery("Select *");
            System.out.println("4444444444444");
            pw.println("filePath"+filePath);
            pw.println("filenamesub"+filenamesub);
            pw.println("<table border='1'>");
            while(rs.next()){
            pw.println("<tr>");
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
                
                pw.println("<td>"+col1+"</td>");
                pw.println("<td>"+col2+"</td>");
                pw.println("<td>"+col3+"</td>");
                pw.println("<td>"+col4+"</td>");
                pw.println("<td>"+col5+"</td>");
                pw.println("<td>"+col6+"</td>");
                pw.println("<td>"+col7+"</td>");
                pw.println("<td>"+col8+"</td>");
                pw.println("<td>"+col9+"</td>");
                pw.println("<td>"+col10+"</td>");
               pw.println("<td>"+col11+"</td>");
                pw.println("<td>"+col12+"</td>");
//                out.println("<td>"+col13+"</td>");
                
            pw.println("<tr>");               
                
            }
            pw.println("</table>");
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UploadServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UploadServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UploadServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UploadServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
