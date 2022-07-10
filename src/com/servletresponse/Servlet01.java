package com.servletresponse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/s01")
public class Servlet01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置服务端编码
        /*response.setCharacterEncoding("UTF-8");
        //设置客户端编码
        response.setHeader("content-type","text/html;charset=UTF-8");
*/
        //同时设置客户端编码和服务段编码
        response.setContentType("text/html;charset=UTF-8");
        //获取输出流
        PrintWriter writer = response.getWriter();

        //输出数据
        writer.write("<h2>你好</h2>");
    }
}
