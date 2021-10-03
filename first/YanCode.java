package first;

import java.util.Random;
import java.util.Scanner;

public class YanCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入几位的验证码: ");
        int n = sc.nextInt();
        System.out.println("随机验证码为: " + code(n));
        sc.close();
    }

    public static String code(int n) {
        String code = "";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int type = r.nextInt(3);
            switch (type) {
                case 0:
                    char ch = (char)(r.nextInt(26) + 65);
                    code += ch;
                    break;
                case 1:
                    char ch1 = (char)(r.nextInt(26) + 97);
                    code += ch1;
                    break;

                case 2:
                    code += r.nextInt(10);
                    break;
            }
        }
        return code;
    }
}
