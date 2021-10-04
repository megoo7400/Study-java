package demo;

/**
 * StringDemo
 * 引用类型
 * 指向对象地址
 * 不可更改内容
 */
public class StringDemo {

    public static void main(String[] args) {
        String name = "liuyance";
        name  += "yidaben";
        System.out.println(name);
        // yi
        String word = "I love you";
        // er 理论写法
        String s1 = new String();
        String s2 = new String("i love you");
        // 常用写法
        char[] chs = {'a', 'b','c'};
        String  s3 = new String(chs);
        byte[] bytes = {97,75,122, 1};
        String s4 = new String(bytes);

    }
}