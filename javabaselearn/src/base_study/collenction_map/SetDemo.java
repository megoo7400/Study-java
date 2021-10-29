package collenction_map;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> sets = new HashSet<>();
        sets.add("MySQL");
        sets.add("MySQL");
        sets.add("java");
        sets.add("java");
        sets.add("HTML");
        System.out.println(sets);// 集合都是打内容的
        // 有序,不重复,无索引
        Set<String> sets1 = new LinkedHashSet<>();
        sets1.add("MySQL");
        sets1.add("MySQL");
        sets1.add("java");
        sets1.add("java");
        sets1.add("HTML");
        System.out.println(sets1);// 集合都是打内容的
    }
}
