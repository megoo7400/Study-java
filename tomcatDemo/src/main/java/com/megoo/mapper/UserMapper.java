package com.megoo.mapper;

import com.megoo.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 姓名: com.megoo74
 * 事件: 2021/12/5 周日
 * 项目: mybatis
 */
public interface UserMapper {
    // 根据用户名 密码 查询用户对象
    @Select("select * from tb_login where username = #{username} and password = #{password};")
    User selectOne(@Param("username") String username,@Param("password") String password);
    @Select("select * from tb_login where username = #{username} ;")
    User selectByUsername(String username);
    @Insert("insert into tb_login values(null,#{username} ,#{password} )")
    void  add(User user);
}
