package com.megoo.mapper;

import com.megoo.pojo.Brand;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 姓名: com.megoo74
 * 事件: 2021/12/7 周二
 * 项目: mybatis
 */
public interface BrandMapper {
    /*
    *查询所有
    *
    */
    @Select("select * from tb_brand")
    @ResultMap("brandResultMap")
    List<Brand> selectAll();

    @Insert("insert into tb_brand values (null,#{brandName} ,#{companyName} ,#{orders} ,#{description} ,#{status} )")
    void add(Brand brand);

    @Select("select * from tb_brand where id = #{id}")
    @ResultMap("brandResultMap")
    Brand selectById(int id);

    @Update("update tb_brand set brand_name=#{brandName} ,company_name=#{companyName} " +
            ",ordered=#{orders} ,description=#{description} ,status=#{status} where id=#{id} ")
    void update(Brand brand);

    @Delete("delete from tb_brand where id = #{id} ")
    void deleteById(int id);
}
