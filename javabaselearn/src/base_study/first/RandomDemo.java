package first;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();
        int data = r.nextInt(100) + 1;
        // System.out.println(data);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("输入数字(1-100): ");
            int guessNum = sc.nextInt();
            if (guessNum == data) {
                System.out.println("恭喜您,猜对了!!");
                break;
            }else if(guessNum > data){
                System.out.println("您猜的数字太大了");
            }else{
                System.out.println("您猜的数字太小了");
            }
        }
            sc.close();
    }
}
