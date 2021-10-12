package atmpro.abstact_tst;

public class GlodenCard extends Card {
    
    @Override
    public void pay(double money){
        double rs = money * 0.8;
        double leftmoney = getMoney() - rs;
        
        System.out.println(getName() + "消费了" + rs
        + "您的金卡余额: " + leftmoney);
        setMoney(leftmoney);
    }
}
