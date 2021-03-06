package com.megoo.web;

import com.megoo.pojo.Brand;
import com.megoo.service.BrandService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 姓名: com.megoo74
 * 事件: 2021/12/7 周二
 * 项目: mybatis
 */
@WebServlet("/selectAllServlet")
public class SelectAllServlet  extends HttpServlet {
    private BrandService service = new BrandService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Brand> brands = service.selectAll();

        req.setAttribute("brands",brands);
        req.getRequestDispatcher("/brand.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
