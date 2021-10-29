package first;

public class ArrayDemo {
    public static void main(String[] args) {
        // 学会试用静态初始化的方式
        // 数据类型[] 数组名 = new 数据类型[]{}
        int[] ages = new int[]{12,13,14};
        // 简化格式
        int[] ages2 = {12,12,14};
        System.out.println(ages[2]);
        System.out.println(ages2.length);
        System.out.println("++++++++++++++++++");
        //动态数组的初始化及使用
        double[] scores =new double[2];
        scores[0] = 99.5;
        scores[1] = 88.0;
        System.out.println("===================");
        //数组的遍历
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }
    }
}
