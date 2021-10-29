package first;

/**
 * 学会使用IF分支结构01:
 */
public class IfDemo01 {

    public static void main(String[] args) {
        int hearBeat = 30;
        if(hearBeat < 60 || hearBeat > 100){
            System.out.println("您的心跳数据是: " + hearBeat + ". 需要进一步检查!");
        }
        System.out.println("检查结束");

        double money = 5999;
        if (money >= 1314) {
            System.out.println("发送红包成功....");
        } else {
            System.out.println("您自己没有钱,就别发了...");
        }

        double grace = 100;
        if (grace < 60) {
            System.out.println("您的级别是C");
        } else if (grace >= 60 && grace < 80) {
            System.out.println("您的级别是B");
        } else if (grace >= 80 && grace < 90) {
            System.out.println("您的级别是B+");
        } else {
            System.out.println("您的级别是A");
        }
    }
}