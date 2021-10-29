package class_tst;

public class User {
    public static int onLineNumber;

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        // 类名访问静态变量: 类名.变量
        // 不推荐 对象.变量 来访问
        User.onLineNumber++;
        // 实例变量: 对象.成员变量
        // 需要先创建---对象,实例对象才能访问
        User u1  = new User("zhubajie", 36);
        System.out.println(u1.getName()+u1.getAge());
        System.out.println("验证码: " + VerifyTool.createString(6));
    }
}
