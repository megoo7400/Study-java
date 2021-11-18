package JunitDemo;

import org.junit.Assert;
import org.junit.Test;

/**
 * 姓名: megoo74
 * 事件: 2021/11/9
 * 项目: Study-java
 */
public class TestUserService {
    // 一个业务,一个测试方法
    // 公开的,无惨树,无返回
    // @Test 标记
    @Test
    public void testloginName(){
        UserService userService = new UserService();
        String rs =  userService.loginName("admin", "12345");

        // 进行预期结果的正确性测试: 断言
        Assert.assertEquals("功能业务可能出现问题", "登录成功", rs);
    }

    @Test
    public void testSelectNames(){
        UserService userService = new UserService();
        userService.selectNames();
    }
}
