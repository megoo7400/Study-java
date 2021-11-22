package JDBCdemo;

import java.sql.*;

/**
 * 姓名: megoo74
 * 事件: 2021/11/20
 * 项目: Study-java
 * JDBC 快速入门
 */
public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/javaWeb?useUnicode=true&characterEncoding=utf8";
        String username = "root";
        String password = "12345";
        Connection conn =  DriverManager.getConnection(url,username,password);
        // 定义SQL语句
        String sql = "select * from student";
        // 获取执行SQL的对象
        Statement stmt = conn.createStatement();

        //执行SQL DQL
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()){
            String id = rs.getString("SId");
            String name = rs.getString("Sname");
            String age = rs.getString("Sage");
            String sex = rs.getString("Ssex");
            System.out.print("编号: " + id);
            System.out.print(" 姓名: " + name);
            System.out.print(" 年龄: " + age);
            System.out.println(" 性别: " + sex);
        }

        stmt.close();
        conn.close();
        rs.close();

    }

}
