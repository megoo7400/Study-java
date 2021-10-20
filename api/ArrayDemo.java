package api;

import java.util.Arrays;
import java.util.Comparator;
/**
 * ArrayDemo
 */
public class ArrayDemo {

    public static void main(String[] args) {
        int[] arr = {10,2,55,23,24,100};
        System.out.println(arr);
        // 查看内容
        String rs = Arrays.toString(arr);
        System.out.println(rs);
        // 升序排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // 二分搜索技术,前提数据要排好序,才能查找
        int index = Arrays.binarySearch(arr, 55);
        System.out.println(index);
        // Comparator自定义数组的排序规则
        // arrays sort 的方法,默认值是升序排
        int[] ages = new int[]{11,23,22,10};
        Integer[] ages1 = {22,33,11,10};
        Arrays.sort(ages1,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                // if(o1 > o2){
                //     return 1;
                // }else if(o1 < o2){
                //     return -1;
                // }
                // return 0;
                return o2 - o1;
            }  
        });
        System.out.println(Arrays.toString(ages1));
        System.out.println("------对象比较起案例------");
        StudentArr[] students = new StudentArr[3];
        students[0] = new StudentArr("megoo", 23, 175.5);
        students[1] = new StudentArr("charlse", 18, 186.5);
        students[2] = new StudentArr("alex", 20, 195.8);
        System.out.println(Arrays.toString(students));
        // 对象排序规则
        Arrays.sort(students, new Comparator<StudentArr>(){
            @Override
            public int compare(StudentArr o1, StudentArr o2){
                //return o1.getAge() - o2.getAge();  年龄升序
                return Double.compare(o2.getHeight(), o1.getHeight());// 比较浮点型 用这个
            }
        });
        System.out.println(Arrays.toString(students));
    }
}