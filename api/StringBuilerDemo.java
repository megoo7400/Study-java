package api;
/**
    学会StringBuilder字符串使用,
 */
public class StringBuilerDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("b");
        sb.append(1);
        sb.append("]");
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder();
        sb1.append("str").append("hello");
        System.out.println(sb1);
        sb1.reverse();
        System.out.println(sb1);
        // 拼接字符串的手段,最终的结果还是返回StringBuilder对象
        // 最终的目的还是要恢复到String类型,需要 toString()变成字符串
        


    }
}
