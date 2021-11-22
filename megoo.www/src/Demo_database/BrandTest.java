package Demo_database;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * 姓名: megoo74
 * 事件: 2021/11/21
 * 项目: Study-java
 * // 查询数据
 * 1 - sql:
 * 2 - 参数
 * 3 - 结果 List<Brand> 进行封装
 * // 添加数据
 * 1 - sql
 * 2 - 参数
 * 3 - 结果
 * // 修改数据
 * // 删除数据
 */
public class BrandTest {

    @Test
    public void testSelectAll() throws Exception {
        // 获取连接:
        Properties prop = new Properties();
        prop.load(new FileInputStream("/Users/a1/java-study/Study-java/megoo.www/druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
        // 获取数据库连接
        Connection conn = dataSource.getConnection();

        String sql = "select * from tb_brand";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        // 封装对象
        Brand brand = null;
        List<Brand> brands = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String brand_Name = rs.getString("brand_name");
            String company_Name = rs.getString("company_name");
            int ordered = rs.getInt("ordered");
            String description = rs.getString("description");
            int status_Brand = rs.getInt("status_brand");
            // 分装对象
            brand = new Brand();
            brand.setId(id);
            brand.setBrand_Name(brand_Name);
            brand.setCompany_Name(company_Name);
            brand.setOrdered(ordered);
            brand.setDescription(description);
            brand.setStatus_Brand(status_Brand);
            // 分装集合
            brands.add(brand);

        }
        System.out.println(brands);
        // 释放资源
        rs.close();
        pstmt.close();
        conn.close();
    }

    /*
    * private String brand_Name;
    private String company_Name;
    private Integer ordered;
    private String description;
    private Integer status_Brand;
    * String brandname, String companynae, int order, String desciption, int status
    * */
    @Test
    public void vtestInsert() throws Exception {
        String brand_Name = "香飘飘";
        String company_Name = "小漂漂公司";
        Integer ordered = 1;
        String description = "绕地球一圈";
        Integer status_Brand = 1;
        Properties prop = new Properties();
        prop.load(new FileInputStream("/Users/a1/java-study/Study-java/megoo.www/druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
        // 获取数据库连接
        Connection conn = dataSource.getConnection();
        String sql = " insert into tb_brand(brand_name,company_name,ordered,description,status_brand) values(?,?,?,?,?);";

        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,brand_Name);
        pstmt.setString(2,company_Name);
        pstmt.setInt(3,ordered);
        pstmt.setString(4,description);
        pstmt.setInt(5,status_Brand);
        int count =  pstmt.executeUpdate();
        System.out.println(count > 0);
        pstmt.close();
        conn.close();
    }

    @Test
    public void testModify() throws Exception{
        String brand_Name = "香飘飘";
        String company_Name = "小漂漂公司";
        Integer ordered = 1000;
        String description = "绕地球三圈";
        Integer status_Brand = 1;
        Integer id = 5;

        Properties prop = new Properties();
        prop.load(new FileInputStream("/Users/a1/java-study/Study-java/megoo.www/druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
        // 获取数据库连接
        Connection conn = dataSource.getConnection();
        // update tb_brand set brand_name = ?,company_name =?,ordered=?,description=?,status_brand=? where id=?;
        String sql = "update tb_brand set brand_name = ?,company_name =?,ordered=?,description=?,status_brand=? where id=?;";

        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,brand_Name);
        pstmt.setString(2,company_Name);
        pstmt.setInt(3,ordered);
        pstmt.setString(4,description);
        pstmt.setInt(5,status_Brand);
        pstmt.setInt(6,id);

        int count =  pstmt.executeUpdate();
        System.out.println(count > 0);
        pstmt.close();
        conn.close();
    }

    @Test
    public void testDelete() throws Exception{

        Integer id = 6;

        Properties prop = new Properties();
        prop.load(new FileInputStream("/Users/a1/java-study/Study-java/megoo.www/druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
        // 获取数据库连接
        Connection conn = dataSource.getConnection();
        // delete from tb_brand where id = ?;
        String sql = "delete from tb_brand where id = ?;";

        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setInt(1,id);

        int count =  pstmt.executeUpdate();
        System.out.println(count > 0);
        pstmt.close();
        conn.close();
    }
}