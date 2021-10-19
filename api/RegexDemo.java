package api;

public class RegexDemo {
    public static void main(String[] args) {
        System.out.println(checkQQ("353835953"));
        System.out.println(checkQQ("kk7788"));
        System.out.println("下面是正则表达式的方式实现----");
        System.out.println(checkQQ2("353835953"));
        System.out.println(checkQQ2("kk7788"));
    }

    public static boolean checkQQ(String qq) {
        //判断长度
        if(qq ==null || qq.length() < 6 || qq.length() > 20){
            return false;
        }
        //判断全部是数字
        for (int i = 0; i < qq.length(); i++) {
            char ch = qq.charAt(i);
            // 是否不是数字
            if(ch < '0' || ch > '9'){
                return false;
            }
        }

        return true;
    }

    // 正则表达式
    public static boolean checkQQ2(String qq){
        return qq != null && qq.matches("\\d{6,20}");
    }
}
