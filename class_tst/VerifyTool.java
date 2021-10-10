package class_tst;

import java.util.Random;

public class VerifyTool {
    // 私有化 只能用 类.方法,方便,又节约内存
    private VerifyTool(){

    }

    public static String createString(int n) {
        String chars = "abcdefgfijklmn0123456789";
        String code = "";
        
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int index = r.nextInt(chars.length());
            code += chars.charAt(index);
        }
        return code;
    }
}
