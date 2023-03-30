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

@WebServlet(name = "Add")
public class Add extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext application=getServletContext() ;
        ServletConfig config=getServletConfig() ;
        response.setContentType("text/html;charset=gb2312");
        PrintWriter out=response.getWriter();
        HttpSession session =request.getSession();
        request.setCharacterEncoding("gb2312");

        //get quntity
        String id=request.getParameter("itemID");
        String num=request.getParameter("quantity");
        if(id!=null && num.length()!=0)
        {  //get cart
            HashMap shoppingCar=(HashMap)session.getAttribute("shoppingCar");
            if(shoppingCar==null)
                shoppingCar=new HashMap();
            //add to cart
            String onum=(String)shoppingCar.get(id);
            if(onum==null)
                shoppingCar.put(id,num);
            else
            {
                int n1=Integer.parseInt(num);
                int n2=Integer.parseInt(onum);
                String result=String.valueOf(n1+n2);
                shoppingCar.put(id,result);
            }
            //Cart  save in session
            session.setAttribute("shoppingCar",shoppingCar);
        }
        else  //warning
            System.out.print("ID Empty！");
        //list
        response.sendRedirect("index.jsp");

    }
    protected void doPost(HttpServletRequest request,HttpServletResponse response)
            throws ServletException,java.io.IOException
    {
        doGet(request,response);
    }





}
