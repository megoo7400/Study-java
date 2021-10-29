package collenction_map;

import java.util.Arrays;


public class MethodDemo {
    public static void main(String[] args) {
        sum();
        sum(10);
        sum(10, 20, 30);
        sum(new int[]{10,20,30,40,50});
    }
    // 可变参数 int... nums 其本质是数组，及可在方法体中使用数组的操作
    public static void sum(int... nums){
        System.out.println("元素个数: " + nums.length);
        System.out.println("元素内容: " + Arrays.toString(nums));
        int s = 0;
        for (int i = 0; i < nums.length; i++) {
            s += nums[i];
        }
        System.out.println("元素的和为: " + s);
    }
}
