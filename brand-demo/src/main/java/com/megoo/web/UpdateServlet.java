package com.megoo.web;

import com.megoo.pojo.Brand;
import com.megoo.service.BrandService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 姓名: com.megoo74
 * 事件: 2021/12/4 周六
 * 项目: mybatis
 */
@WebServlet("/updateServlet")
public class UpdateServlet extends HttpServlet {
    private BrandService service = new BrandService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String id = req.getParameter("id");
        String brandName = req.getParameter("brandName");
        String companyName = req.getParameter("companyName");
        String orders = req.getParameter("orders");
        String description = req.getParameter("description");
        String status = req.getParameter("status");

        Brand brand = new Brand();
        brand.setId(Integer.parseInt(id));
        brand.setBrandName(brandName);
        brand.setCompanyName(companyName);
        brand.setOrders(Integer.parseInt(orders));
        brand.setDescription(description);
        brand.setStatus(Integer.valueOf(status));

        service.update(brand);

        // 转发到查询所有的servlet
        req.getRequestDispatcher("/selectAllServlet").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}