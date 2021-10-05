package demo;

import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        // 创建arrylist 对象
        ArrayList list = new ArrayList();
        list.add("java");
        list.add("黑马");

        System.out.println(list);
        System.out.println("=============");
        list.add(1, "赵敏");
        System.out.println(list);
        System.out.println("=============");
        ArrayList<String> list2 =  new ArrayList();
        list2.add("mysql");
        list2.add("hahah");
        System.out.println(list2);
    }
}
