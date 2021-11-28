import com.megoo.mapper.BrandMapper;
import com.megoo.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 姓名: megoo74
 * 事件: 2021/11/28
 * 项目: mybatis
 */
public class MybatisTest {
    // 查询所有的数据 -- 显示所有的数据,
    // 期中使用代码片 将数据库与类名一致化.
    @Test
    public void selectAllTest() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> brands = brandMapper.selectAll();
        System.out.println(brands);
        sqlSession.close();
    }

    @Test
    public void selectById() throws IOException {
        Integer id = 1006;
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> brands = brandMapper.selectById(id);
        System.out.println(brands);
        sqlSession.close();
    }

    @Test
    public void selectByConditions1() throws IOException {
//        @Param 注解方式 一
        Integer orders = 100 ;
        String companyName = "华为";
        companyName = "%" + companyName + "%";
//      方式二
//        Map map = new HashMap<>();
//        map.put("orders",orders);
//        map.put("companyName",companyName);
//      方式三
        Brand brand = new Brand();
        brand.setOrder(orders);
        brand.setCompanyName(companyName);

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
//        List<Brand> brands = brandMapper.selectByConditions1(orders,companyName);  // 方式一
//        List<Brand> brands = brandMapper.selectByConditions1(map);  // 方式二
        List<Brand> brands = brandMapper.selectByConditions1(brand);
        System.out.println(brands);
    }

    @Test
    public void selectConditionSingle() throws IOException {
//        Integer orders = 100 ;
        String companyName = "华为";
        companyName = "%" + companyName + "%";

        Brand brand = new Brand();
//        brand.setOrder(orders);
        brand.setCompanyName(companyName);

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> brands = brandMapper.selectByConditionSingle(brand);
        System.out.println(brands);
        sqlSession.close();
    }

    @Test
    public void testAdd() throws IOException {
        int status = 1;
        String companyName = "波导手机";
        String brandName = "波导";
        String description = "手机中的战斗机";
        int orders = 100;


        //封装对象
        Brand brand = new Brand();
        brand.setStatus(status);
        brand.setCompanyName(companyName);
        brand.setBrandName(brandName);
        brand.setDescription(description);
        brand.setOrder(orders);

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        brandMapper.add(brand);
        sqlSession.close();

    }
    @Test
    public void testUpdate() throws IOException {
        int status = 1;
        String companyName = "波导手机";
        String brandName = "波导";
        String description = "波导手机,手机中的战斗机";
        int orders = 200;
        int id = 1004;


        //封装对象
        Brand brand = new Brand();
        brand.setStatus(status);
//        brand.setCompanyName(companyName);
//        brand.setBrandName(brandName);
        brand.setDescription(description);
//        brand.setOrder(orders);
        brand.setId(id);

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        int count = brandMapper.update(brand);
        System.out.println(count);

        sqlSession.close();

    }

    @Test
    public void testDeleteById() throws IOException {
        //接收参数

        int id = 1006;


        //1. 获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //SqlSession sqlSession = sqlSessionFactory.openSession(true);

        //3. 获取Mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //4. 执行方法

        brandMapper.deleteById(id);

        //提交事务
        sqlSession.commit();

        //5. 释放资源
        sqlSession.close();

    }

    @Test
    public void testDeleteByIds() throws IOException {
        //接收参数

        int[] ids = {1005,1007};


        //1. 获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //SqlSession sqlSession = sqlSessionFactory.openSession(true);

        //3. 获取Mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //4. 执行方法

        brandMapper.deleteByIds(ids);

        //提交事务
        sqlSession.commit();

        //5. 释放资源
        sqlSession.close();

    }
}