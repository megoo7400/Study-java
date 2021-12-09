package com.megoo.web;

import com.megoo.mapper.UserMapper;
import com.megoo.pojo.User;
import com.megoo.util.SqlSessionFactoryUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

/**
 * 姓名: com.megoo74
 * 事件: 2021/12/4 周六
 * 项目: mybatis
 */
@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 接受用户数据
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        // 封装 user对象
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        // 调用mapper 根据用户名查询对象
        /*String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);*/
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 执行SQL语句
        UserMapper userMapper =  sqlSession.getMapper(UserMapper.class);
        User u = userMapper.selectByUsername(username);

        // 判断用户对象 null
        if(u==null){
            // 可用,添加
            userMapper.add(user);
            // 提交事务
            sqlSession.commit();
            sqlSession.close();
        }else {
            // 不可用,添加逻辑
            resp.setContentType("text/html;charset=utf-8");
            resp.getWriter().write("用户已存在");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}