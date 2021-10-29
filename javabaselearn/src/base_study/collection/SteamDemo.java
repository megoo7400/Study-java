package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SteamDemo {
    public static void main(String[] args) {
        //  初步体验Stream流的方便与快捷

        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三丰", "张无忌", "周芷若", "赵敏", "张强");
        System.out.println(names);

        List<String> zhangList = new ArrayList<>();
        for (String name : names) {
            if(name.startsWith("张")){
                zhangList.add(name);
            }
        }
        System.out.println(zhangList);

        List<String> zhangThreeList = new ArrayList<>();
        for (String name : names) {
            if(name.length() == 3){
                zhangThreeList.add(name);
            }
        }
        System.out.println(zhangThreeList);

        // 使用Steam流实现
        names.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));
    }
}
