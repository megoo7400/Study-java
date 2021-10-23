package api;

import java.util.Arrays;
// import java.util.Comparator;

/**
 * LandamDemo
 */
public class LandamDemo {

    public static void main(String[] args) {
        Integer[] ages = {11,23,22,10};
        //Integer[] ages1 = {22,33,11,10};
         //原版,未简化
        // Arrays.sort(ages1,new Comparator<Integer>(){
        //     @Override
        //     public int compare(Integer o1, Integer o2){
        //         return o2 - o1;
        //     }  
        // });

        //Arrays.sort(ages,(Int o1, Int o2) -> { return o2 -o1;});
        // 简化类型,
        //Arrays.sort(ages,( o1, o2) -> { return o2 -o1;});
        // 再次简化;;大括号,return,分号
        Arrays.sort(ages,( o1, o2) -> o2 -o1);    
        
        Arrays.sort(ages,( o1, o2) -> o2 -o1);

        System.out.println(Arrays.toString(ages));
    }
}