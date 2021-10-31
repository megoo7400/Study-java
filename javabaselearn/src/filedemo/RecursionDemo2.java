public class RecursionDemo2 {
    public static int totalNum = 0;
    public static int lastBottleNum; //剩余的瓶子
    public static int lastCoverNum; // 剩余的盖子
    public static void main(String[] args) {
        buy(10);
        System.out.println("购买酒的总数: " + totalNum);
        System.out.println("剩余盖子数: " + lastCoverNum);
        System.out.println("剩余瓶子数: " + lastBottleNum);
    }

    public static void buy(int money) {
        // 看买多少瓶酒
        int buyNum = money / 2;
    
        totalNum += buyNum;
        // 统计本轮总的盖子数才能换
        int coverNum = lastCoverNum + buyNum;
        int bottleNum = lastBottleNum + buyNum;
         // 统计可以换算的总金额
        int allMoney = 0;
        if(coverNum >= 4){
            allMoney += (coverNum / 4) * 2;
        }
        lastCoverNum = coverNum % 4;
         
        if(bottleNum >= 2){
            allMoney += (bottleNum / 2) * 2;
        }
        lastBottleNum = bottleNum % 2;
        if (allMoney >= 2) {
            buy(allMoney);
        }
    }
}
