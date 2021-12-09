package com.megoo.mapper;

import com.megoo.pojo.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BrandMapper {
    List<Brand> selectAll();
    List<Brand> selectById(Integer id);
//    方式一:
//    List<Brand> selectByConditions1(@Param("orders") Integer order,@Param("companyName") String name);
//    方式二
//    List<Brand> selectByConditions1( Map map);
//    方式三
    List<Brand> selectByConditions1(Brand brand);

    List<Brand> selectByConditionSingle(Brand brand);

    void add(Brand brand);

    int update(Brand brand);

    void deleteById(int id);

    void deleteByIds(int[] ids);


}
