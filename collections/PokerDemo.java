package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



/**
 * 提前主备好54张牌
 * 完成  洗牌，发牌，牌排序， 逻辑。
 * 
 */

public class PokerDemo {
    
    public static void main(String[] args) {
        // 静态集合定义 54张牌；
        // 洗牌： shuffle（）
        Collections.shuffle(allCards);
        System.out.println("----------------------------------------");
        System.out.println("洗牌后： " + allCards);
        // 发牌 定义三个玩家
        List<Card> linhuchong = new ArrayList<>();
        List<Card> jiumozhi = new ArrayList<>();
        List<Card> renyingying = new ArrayList<>();
        // 发51张，剩余三张。。。。
        
        for (int i = 0; i < allCards.size() - 3; i++) {
            Card c = allCards.get(i);
            if( i % 3 == 0){
                // 玩家揭牌
                linhuchong.add(c);
            }else if( i % 3 == 1){
                jiumozhi.add(c);
            }else if( i % 3 == 2){
                renyingying.add(c);
            }
        }
        // 拿到最后三张牌List(s ,e)方法
        List<Card> lastCards = allCards.subList(allCards.size() - 3 , allCards.size());
        // 给玩家的牌排序（从大到小排序）
        sortCards(linhuchong);
        sortCards(jiumozhi);
        sortCards(renyingying);
        
        // 输出玩家的牌
        System.out.println("-----------------------------------------");
        System.out.println("chong: " + linhuchong);
        System.out.println("jiu: " + jiumozhi);
        System.out.println("ren: " + renyingying);
        System.out.println("Last: " + lastCards);
    }
    // 排序
    private static void sortCards(List<Card> cards) {
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2){
                return o2.getIndex() - o1.getIndex();
            }
        });
    }

    public static List<Card> allCards = new ArrayList<>();
    
    static{
        // 花色: "♣️","♠️","♦️","♥️"
        // 点数: "A","2","3","4","5","6","7","8","9","10","J","Q","K"
        // 大小王:
        String[] sizes = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] colors = {"♣️","♠️","♦️","♥️"};
        // 组合点数花色
        int index = 0; // 定义牌的大小
        for (int i = 0; i < sizes.length; i++) {
            index++;
            for (int j = 0; j < colors.length; j++) {
                // 封装成一个牌对象
                Card c = new Card(sizes[i],colors[j],index);
                // 存入到集合容器中
                allCards.add(c);
            }
        }
        Card c1 = new Card("","小", ++index);
        Card c2 = new Card("","大", ++index);

        Collections.addAll(allCards, c1, c2);
        System.out.println("新牌： " + allCards);

        


    }
}
