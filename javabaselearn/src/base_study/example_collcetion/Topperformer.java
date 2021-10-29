package example_collcetion;

public class Topperformer {
    private String name;
    private int money;


    public Topperformer() {
    }

    public Topperformer(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return this.money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", money='" + getMoney() + "'" +
            "}";
    }

}
