package atmpro;

/**
 * Account 创建账户类
 * 
 * 
 */
public class Account {
    private String carId;
    private String userName;
    private String passWord;
    private double money;
    private double quotaMoney;


    public Account() {
    }


    public Account(String carId, String userName, String passWord, double quotaMoney) {
        this.carId = carId;
        this.userName = userName;
        this.passWord = passWord;
        this.quotaMoney = quotaMoney;
    }


    public String getCarId() {
        return this.carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return this.passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public double getMoney() {
        return this.money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getQuotaMoney() {
        return this.quotaMoney;
    }

    public void setQuotaMoney(double quotaMoney) {
        this.quotaMoney = quotaMoney;
    }


    
}