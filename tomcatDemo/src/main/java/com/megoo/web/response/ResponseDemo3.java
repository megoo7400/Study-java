package com.megoo.web.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * 姓名: com.megoo74
 * 事件: 2021/12/4 周六
 * 项目: mybatis
 */
@WebServlet("/resp3")
public class ResponseDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
//        System.out.println("resp2....");
        resp.setContentType("text/html;charset=utf-8");
        // 获取输出流
        PrintWriter writer = resp.getWriter();
        writer.write("你好呀");
        // content-type 设置头解析格式
//        resp.setHeader("content-type","text/html");

        writer.write("<h1>aaa</h1>");
        // write 流不用手动关闭
        // 写中文数据会乱码 --使用 resp.setContentType("text/html;charset=utf-8")将数据解析及字符编码设置在一起
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
