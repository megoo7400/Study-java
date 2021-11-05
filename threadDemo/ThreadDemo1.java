

/**
 * ThreadDemo1
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        Account acc = new Account("12345678", 10000.0);
        // 创建两个线程,,定义线程类
        new DrawThread(acc,"megoo").start();
        new DrawThread(acc, "alex").start();
    }
    
}

class DrawThread extends Thread{

    private Account acc;
    public DrawThread(Account acc, String name) {
        super(name);
        this.acc = acc;
    }
    @Override
    public void run() {
       acc.drawMoney(10000.0); 
    }
}

class Account{
    private String carID;
    private double money;

    public Account() {
    }

    public void drawMoney(double d) {
        // 谁来取钱
        String u = Thread.currentThread().getName();
        // 判断账户是否够..
        if (this.money >= d){
            System.out.println(u + "取钱成功,取了" + d);
            this.money -= d;
            System.out.println(u + "取钱后,剩余: " + this.money);
        }else{
            System.out.println(u + "来取钱...余额不足");
        }

    }

    public Account(String carID, double money) {
        this.carID = carID;
        this.money = money;
    }

    public String getCarID() {
        return this.carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public double getMoney() {
        return this.money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

}