package DruidDemo;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileReader;
import java.sql.Connection;
import java.util.Properties;

/**
 * 姓名: megoo74
 * 事件: 2021/11/21
 * 项目: Study-java
 */
public class DruidDemo {
    public static void main(String[] args) throws Exception {
        // 导入包,完成配置
        // 加载配置文件

        // 获取连接池对象
        Properties prop = new Properties();
        prop.load(new FileInputStream("/Users/a1/java-study/Study-java/megoo.www/druid.properties"));
        DataSource dataSource= DruidDataSourceFactory.createDataSource(prop);
        // 获取数据库连接
        Connection connection = dataSource.getConnection();

        System.out.println(connection);
        //System.out.println(System.getProperty("user.dir"));

    }
}
