package class_tst;

import java.util.ArrayList;

public class PorkTest {
    // 静态代码块 初始化一副 54 张扑克
    public static ArrayList<String> cards = new ArrayList<>();
    static{
        // 花色: "♣️","♠️","♦️","♥️"
        // 点数: "A","2","3","4","5","6","7","8","9","10","J","Q","K"
        // 大小王:
        String[] colors = {"♣️","♠️","♦️","♥️"};
        String[] sizes = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                cards.add(sizes[i] + colors[j]);
            }
        }
        cards.add("小王" + "大王");
    }

    public static void main(String[] args) {
        System.out.println(cards);
    }
}
