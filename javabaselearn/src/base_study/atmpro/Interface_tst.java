package atmpro;

public interface Interface_tst {
    // ========jdk8以前只能定义========
    // 接口中的成员
    //常量,方法
    public static final String SCHOOL_NAME = "heima";
    // or
    int AGE = 25;
    // 抽象方法:
    public abstract void run();
    public abstract void eat();
    // public abstract 可以省略
    void walk();
    // 接口不能创建对象;
    
}
