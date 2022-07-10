package com.servletresponse;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/s03")
public class Servlet03 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Srevlet03");
        //接收数据
        String uname = request.getParameter("uname");
        System.out.println("Servlet03-uname = "+uname);

        //设置客户端的编码及响应类型
        ServletOutputStream out = response.getOutputStream();
        response.setHeader("content-type","text/html;charset=UTF-8");
        out.write("<h2>你好!你好<h2>".getBytes("UTF-8"));
        //重定向到s04
        response.sendRedirect("s04");
    }
}
