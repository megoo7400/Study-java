package first;

public class ForForDemo {
    public static void main(String[] args) {
        // 5tian ,每次说三次 对不起.
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("对不起");
            }
            System.out.println("---------------");
        }
        System.out.println("=========================");
        for (int i = 0; i < 4.; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
