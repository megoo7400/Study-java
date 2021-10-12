package atmpro.abstact_tst;

public abstract class Card {
    private String name;
    private double money;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return this.money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public abstract void pay(double money);
}
