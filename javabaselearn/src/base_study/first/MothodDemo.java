package first;

/**
 * 方法案列
 */
public class MothodDemo {

    public static void main(String[] args) {
       
        System.out.println(sum(10,20));
        System.out.println("+++++++++++++++");
        System.out.println(add(100));
        System.out.println("+++++++++++++++");
        check(100);
        System.out.println("+++++++++++++++");
        int[] ages = {12,23,61,99};
        int max = getArrMax(ages);
        System.out.println(max);
        System.out.println("==================");
        change(ages);
    }
    // 方法写法
    public static int sum(int a , int b) {
        int c = a + b;
        return c;
    }
    
    // 前 n 项和方法
    public static int add(int n){
        int add = 0;
        for (int i = 0; i <= n; i++) {
            add += i;
        }
        return add;
    }

    // 判断奇偶
    public static void check(int num) {
        if (num  % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
    }

    // 任意数组的最大值
    public static int getArrMax(int[] a){
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }

    // 引用类型的参数传递情况
    public static void change(int[] arr) {
        System.out.println(arr[1]);
        arr[1] = 55;
        System.out.println(arr[1]);
    }
}