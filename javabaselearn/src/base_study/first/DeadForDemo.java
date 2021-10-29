package first;

import java.util.Scanner;

public class DeadForDemo {
    public static void main(String[] args) {
        int okPassword = 520;
        Scanner scaner =  new Scanner(System.in);
        while (true) {
            System.out.println("输入您的正确密码: ");
            int password = scaner.nextInt();
            if (password == okPassword) {
                System.out.println("登录成功....");
                break;
            } else {
                System.out.println("您输入的密码错误!!!");
            }
        }
            scaner.close();
    }
}
