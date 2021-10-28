package example_collcetion;

import java.util.stream.Stream;

public class StreamStudy {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(4,4,3,3,2,2,1,1,0,12,43,12);
        /**
         * filter : 过滤流中的某些元素（条件自建）
         * limit（n），获取n歌元素
         * skip（n）：跳过前n个元素
         * distinct（n）：通过流中元素的hashCode（）和equals（）去除重复
         * 以上四个可以不同属性执行链式操作
         */

         Stream<Integer> newStream = stream.filter(s -> s < 12) // 4,4,3,3,2,2,1,1,0
            .distinct(); // 4,3,2,1,0
            // .skip(1); // 3,2,1,0
            // .limit(3); // 3,2,1
        newStream.forEach(System.out::print);
    }
}
