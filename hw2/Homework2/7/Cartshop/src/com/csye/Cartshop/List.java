package com.csye.Cartshop;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

@WebServlet(name = "List")
public class List extends HttpServlet {





    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext application=getServletContext() ;
        ServletConfig config=getServletConfig() ;
        response.setContentType("text/html;charset=gb2312");
        PrintWriter out=response.getWriter();
        HttpSession session =request.getSession();
        request.setCharacterEncoding("gb2312");

        //cart
        HashMap shoppingCar=(HashMap) ((HttpSession) session).getAttribute("shoppingCar");
        //check cart
        if(shoppingCar!=null)
        {
            Set show=shoppingCar.entrySet();
            Iterator it=show.iterator();
            while(it.hasNext())
            {
                ((PrintWriter) out).print(it.next()+"<br>");
            }
        }
        else
            out.print("cart empty！");


    }
    protected void doPost(HttpServletRequest request,HttpServletResponse response)
            throws ServletException,java.io.IOException
    {
        doGet(request,response);
    }




}
