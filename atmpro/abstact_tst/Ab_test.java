package atmpro.abstact_tst;

public class Ab_test {
    public static void main(String[] args) {
        GlodenCard gcard = new GlodenCard();
        gcard.setName("megoo");
        gcard.setMoney(10000.0);
        gcard.pay(1000.0);
    }
}
