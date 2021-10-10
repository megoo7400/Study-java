package class_tst;

public class CodeTest {
    /**
     * 随着类被加载而执行,且是优先于main执行
     */
    
    static{
        System.out.println("====静态代码块被自动触发了====");
    }
    // 学习代码块的知识
    // 作用: 在程序加载时,为静态数据初始化做准备
    public static void main(String[] args) {
        System.out.println("====main被执行了====");
    }
}
