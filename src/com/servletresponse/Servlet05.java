package com.servletresponse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 重定向和请求转发的区别
 */
@WebServlet("/s05")
public class Servlet05 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Servlet05...");

        //接收数据
        String uname = request.getParameter("uname");
        System.out.println(uname);

        //设置request的与对象
        request.setAttribute("upwd","123456");

        //请求转发
        //request.getRequestDispatcher("index.jsp").forward(request,response);

        //重定向
        response.sendRedirect("index.jsp");
    }
}
