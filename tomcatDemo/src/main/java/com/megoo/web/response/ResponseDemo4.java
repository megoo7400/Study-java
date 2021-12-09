package com.megoo.web.response;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 姓名: com.megoo74
 * 事件: 2021/12/4 周六
 * 项目: mybatis
 */
@WebServlet("/resp4")
public class ResponseDemo4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//     读取文件
        FileInputStream fis = new FileInputStream("/Users/a1/java-study/tomcatDemo/src/main/webapp/test.html");
        // 获取字节输出流
        ServletOutputStream os = resp.getOutputStream();
        // 把文件写入流中
//        byte[] buff = new byte[1024];
//        int len = 0;
//        while ((len = fis.read(buff)) != -1){
//            os.write(buff,0,len);
//            fis.close();
//        }
        // 工具类来完成以上操作
        IOUtils.copy(fis,os);
        fis.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
