package datastruction;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("html");

        System.out.println(list);

        // 索引获取元素
        list.get(1);
        // 改数据
        list.add(2, "heima");
        list.set(0, "megoo");
        
    }
}
