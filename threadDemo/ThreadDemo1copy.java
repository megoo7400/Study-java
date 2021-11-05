import java.util.concurrent.ThreadPoolExecutor;

/**
 * ThreadDemo1
 */
public class ThreadDemo1copy {
    public static void main(String[] args) {
        Account1 acc = new Account1("12345678", 10000.0);
        // 创建两个线程,,定义线程类
        new DrawThread1(acc, "megoo").start();
        new DrawThread1(acc, "alex").start();

        Account1 acc1 = new Account1("2233445", 10000);
        new DrawThread1(acc1, "1-megoo").start();
        new DrawThread1(acc1, "1-alex").start();

       
    }

}

class DrawThread1 extends Thread {

    private Account1 acc;

    public DrawThread1(Account1 acc, String name) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        acc.drawMoney(10000.0);
    }
}

class Account1 {
    private String carID;
    private double money;

    public Account1() {
    }
    // 方法加 synchronized
    public synchronized void drawMoney(double d) {
        // 谁来取钱
        String u = Thread.currentThread().getName();
        // 判断账户是否够..
        // synchronized (this) {
            if (this.money >= d) {
                System.out.println(u + "取钱成功,取了" + d);
                this.money -= d;
                System.out.println(u + "取钱后,剩余: " + this.money);
            } else {
                System.out.println(u + "来取钱...余额不足");
            }
        // }

    }

    public Account1(String carID, double money) {
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