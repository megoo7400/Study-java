package first;

public class Opertar {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 3;
        // System.out.println(a + b);
        // System.out.println(a - b);
        // System.out.println(a * b);
        // System.out.println(a / b);
        // System.out.println(a % b);
        // System.out.println(a * 1.0/ b);

        // 三位数,打印三位数的每个数字
        int data = 589;
        int ge = data % 10;
        int shi = data /10 % 10;
        int bai = data / 100;
        System.out.println(ge);
        System.out.println(shi);
        System.out.println(bai);
    }
}
