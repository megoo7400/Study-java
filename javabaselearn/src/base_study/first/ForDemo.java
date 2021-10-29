package first;

public class ForDemo {
    public static void main(String[] args) {
        // 学习 for 循环
        // 打印3次 hello.
        for(int i = 0; i < 3; i++){
            System.out.println("hello world");
        }
        System.out.println("--------------------");
        int sum = 0;
        int  cout = 0; //个数
        // for (int i = 0; i < 6; i++) {
        //     sum += i;
        // }
        // System.out.println(sum);
        System.out.println("--------------------");
        for (int i = 1; i < 11; i+=2) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println("--------------------");
        for (int i = 100; i < 999; i++) {
           int ge = i % 10;
           int shi = i / 10 % 10;
           int bai = i / 100;
           int shui = ge*ge*ge + shi*shi*shi + bai*bai*bai;
           if (shui == i){
               System.out.print(i +"\t");
               cout++; 
           }
        }
        System.out.println(cout);
    }
}
