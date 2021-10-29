package mapdemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *  认识Map对象,无序,不重复,无索引,值无要求
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        maps.put("鸿星尔克", 3);
        maps.put("Java", 1);
        maps.put("枸杞", 50);
        maps.put(null, null);
        System.out.println(maps);

        //     - LinkedHashMap: 有序,不重复,无索引,值不做要求
        Map<String, Integer> maps1 = new LinkedHashMap<>();
        maps1.put("鸿星尔克", 3);
        maps1.put("Java", 1);
        maps1.put("枸杞", 50);
        maps1.put(null, null);
        System.out.println(maps1);
    }
}
