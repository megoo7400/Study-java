package collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * UnDemo
 */
public class UnDemo {

    public static void main(String[] args) {
        // 不可变集合:
        List<Double> lists = List.of(569.4, 700.5, 523.8);
        System.out.println(lists);

        Set<String> names = Set.of("megoo", "jack", "nihao ");
        System.out.println(names);

        Map<String, Integer> maps = Map.of("huiwei", 2, "java", 3, "watch", 4);
        System.out.println(maps); 
    }
}