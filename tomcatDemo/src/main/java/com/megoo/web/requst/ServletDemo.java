package com.megoo.web.requst;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * 姓名: com.megoo74
 * 事件: 2021/12/3 周五
 * 项目: mybatis
 */
@WebServlet("/demo1")
public class ServletDemo implements Servlet{

    public void init(ServletConfig servletConfig) throws ServletException {

    }

    public ServletConfig getServletConfig() {
        return null;
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("启动了");
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
