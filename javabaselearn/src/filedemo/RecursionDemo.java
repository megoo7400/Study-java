import java.util.Scanner;


public class RecursionDemo {
    public static void main(String[] args) {
        System.out.println("输入您想算的阶乘数: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        // long result = recruisionFunc(number);
        // String r = String.valueOf(result);
        long result1 = sum(number);
        // System.out.println(r);
        System.out.println(result1);
        sc.close();

    }
    public static int  recruisionFunc(int num){
        if(num == 1){
            return 1;
        }else{
            return recruisionFunc(num-1)*num;
        }
    }

    public static int sum(int n) {
        if(n == 1){
            return 1;
        }else{
            return sum(n - 1 ) + n;
        }
    }
}
