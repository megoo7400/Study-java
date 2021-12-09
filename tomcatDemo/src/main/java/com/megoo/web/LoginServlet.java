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
import java.io.PrintWriter;
import java.util.List;

/**
 * 姓名: com.megoo74
 * 事件: 2021/12/4 周六
 * 项目: mybatis
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 接受用户名 密码
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        // 调用mybatis 使用
        // / 获取 SqlSession
       /* String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);*/
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 执行SQL语句
        UserMapper userMapper =  sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectOne(username,password);
        System.out.println(user);
        sqlSession.close();
        // 3 - user 判断
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer = resp.getWriter();
        if(user != null){
            // 成功
            writer.write("登录成功");
        }else {
            // 失败
            writer.write("登录失败");
        }
    }
}