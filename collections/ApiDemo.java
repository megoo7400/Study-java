package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ApiDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        // addall()
        Collections.addAll(names, "megoo","jack","Tom","chen");
        System.out.println(names);
        // shuffle - 洗牌 -随机
        Collections.shuffle(names);
        System.out.println(names);

        //sort 排序 -- list排序,另有比较器版本
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 12,33,22,14,18);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        // 方式二 --- > 操作的元素是List。
       

    }
}
