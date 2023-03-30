package com.csye6200.excel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.Part;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Adam
 */
@WebServlet(urlPatterns = {"/Excel.xls"})
public class Excel extends HttpServlet {

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
            throws ServletException, IOException, FileUploadException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
//        
            List<FileItem> multifiles=sf.parseRequest(request);
            String fn=null;
            for(FileItem item: multifiles){
                item.write(new File("D:\\netbeantomcat\\Excel"+item.getName()));
                fn=item.getName();
            }
            out.println("file upload....");
            out.println("<br>");
            out.println("filename is : "+fn);
            out.println("<br>");
            
            
            
            
          
            
            
            String filePath = "D:\\netbeantomcat\\Excel"+fn;
            out.println("filePath is : "+filePath);
            out.println("<br>");
            Workbook workbook;
            
            try (FileInputStream inputStream = new FileInputStream(filePath)) {
                workbook = WorkbookFactory.create(inputStream);
                // Get the first sheet in the workbook
                Sheet sheet = workbook.getSheetAt(0);
                // Iterate over the rows in the sheet
                out.println("<table border='1'>");
                
                for (Row row : sheet) {
                    
                    out.println("<tr>");
                    // Iterate over the cells in the row
                    for (Cell cell : row) {
                        // Do something with the cell value
                        out.println("<td>");
                        out.println(cell.toString());
                        out.println("</td>");
                    }
                    out.println("</tr>");
                    
                }
                out.println("</table>");
            }
            
            workbook.close();
           
            
            
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Excel</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Excel at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        } catch (Exception ex) {
            Logger.getLogger(Excel.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (Exception ex) {
            Logger.getLogger(Excel.class.getName()).log(Level.SEVERE, null, ex);
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
