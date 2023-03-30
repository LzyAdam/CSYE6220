package com.csye.Cartshop;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String uname=request.getParameter("uname");
        String upwd=request.getParameter("upwd");
        if(uname==null||"".equals(uname.trim())){
            request.setAttribute("msg", "username is null");
            request.getRequestDispatcher("login.jsp").forward(request, response);
            return;
        }
        if(upwd==null||"".equals(upwd.trim())){
            request.setAttribute("msg", "userpassword is null");
            request.getRequestDispatcher("login.jsp").forward(request, response);
            return;
        }
        if(!"admin".equals(upwd)||!"admin".equals(uname)){
            request.setAttribute("msg", "login failed");
            request.getRequestDispatcher("login.jsp").forward(request, response);
            return;
        }
        request.getSession().setAttribute("uname",uname);
        response.sendRedirect("index.jsp");
    }
}
