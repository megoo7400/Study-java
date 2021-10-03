package first;

import java.util.Scanner;

public class PrintScore {
    public static void main(String[] args) {
        int[] scores = new int[6];
        // 录入分数
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
           System.out.println("请输入第"+ (i + 1) + "个评委的分数: ");
           int score = sc.nextInt();
           scores[i] = score; 
        }

        // 遍历数组的每个数据
        int max = scores[0];
        int min = scores[0];
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] > max){
                max = scores[i];
            }

            if(scores[i] < min){
                min = scores[i];
            }

            sum += scores[i];
        }

        double avag = (sum - max -min) * 1.0 / (scores.length - 2);
        System.out.println("选手最终得分: " + avag);
        System.out.println("选手最高得分: " + max);
        System.out.println("选手最低得分: " + min);
        sc.close();
    }
}
