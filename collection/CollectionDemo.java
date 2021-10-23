package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.function.Consumer;



/**
 * 集合体系特点
 */
public class CollectionDemo {
    public static void main(String[] args) {
        // 有序,重复,索引
    Collection<String> list = new ArrayList<>();
    list.add("java");
    list.add("java");
    list.add("mybotis");
    list.add("23");
    list.add("false");
    System.out.println(list);

    Collection<String> list1 = new HashSet<>();
    list1.add("java");
    list1.add("java");
    list1.add("mybotis");
    list1.add("23");
    list1.add("false");
    System.out.println(list1);

    Collection<Integer> list2 = new ArrayList<>();
    list2.add(23);
    list2.add(32);
    System.out.println(list2);
    // foreach 循环
    for (String lit : list) {
        System.out.println(lit);
    };
    System.out.println("----------------");
    //forEach 方法
    list2.forEach(new Consumer<Integer>(){
        @Override
        public void accept(Integer s){
            System.out.println(s);
        }
    });
    System.out.println("-------------------");
    // forEach 简化
    list2.forEach(s -> System.out.println(s));
    list.forEach(s -> System.out.println(s));
    list.forEach(System.out::println);

    }

}
