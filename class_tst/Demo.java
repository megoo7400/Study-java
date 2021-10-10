package class_tst;

public class Demo {
    public static void main(String[] args) {
        Fu f = new Fu();
        f.show();
        Zi z = new Zi();
        z.method();
        z.show(); // 子类继承父类的方法属性
    }
}
