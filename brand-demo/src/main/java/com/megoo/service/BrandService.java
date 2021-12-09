package com.megoo.service;

import com.megoo.mapper.BrandMapper;
import com.megoo.pojo.Brand;
import com.megoo.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * 姓名: com.megoo74
 * 事件: 2021/12/7 周二
 * 项目: mybatis
 */
public class BrandService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    public List<Brand> selectAll(){

        SqlSession sqlSession = factory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> brands = mapper.selectAll();
        sqlSession.close();
        return brands;

    }

    public void add(Brand brand){
        SqlSession sqlSession = factory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);


        mapper.add(brand);
        sqlSession.commit();
        sqlSession.close();
    }

    public Brand selectById(int id) {

        SqlSession sqlSession = factory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        Brand brand = mapper.selectById(id);
        sqlSession.close();
        return brand;
    }

    public void update(Brand brand){
        SqlSession sqlSession = factory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);


        mapper.update(brand);
        sqlSession.commit();
        sqlSession.close();
    }

    public void deleteById(int id) {

        SqlSession sqlSession = factory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        mapper.deleteById(id);
        sqlSession.commit();
        sqlSession.close();

    }
}
