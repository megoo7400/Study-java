package JunitDemo;

/**
 * 姓名: megoo74
 * 事件: 2021/11/9
 * 项目: Study-java
 */
public class UserService {
    public String loginName (String loginName, String passWord) {
        if("admin".equals(loginName) && "12345".equals(passWord)){
            return "登录成功";
        }else {
            return "用户名或者密码有问题";
        }
    }

    public void selectNames(){
        System.out.println(10/2);
        System.out.println("查询全部用户名称成功~~~~");
    }
}
