package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {
        // 集合获取
        Collection<String> list = new ArrayList<>();
        Stream<String> s = list.stream();
        // map 获取
        Map<String, Integer> maps = new HashMap<>();
        Stream<String> keyStream = maps.keySet().stream();
        Stream<Integer> valueStream = maps.values().stream();
        Stream<Map.Entry<String, Integer>> keyAndValueStream =maps.entrySet().stream();
        // 数组
        String[] names = {"zhangwuji", "xiaozhao", "zhouzhiruo", "sun"};
        Stream<String> nameStream =  Arrays.stream(names);

        Stream<String> nameStream1 = Stream.of(names);


    }
}
