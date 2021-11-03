import java.io.Serializable;

public class ObjectOutputClass implements Serializable{
    private String logName;
    private String userName;
    private String passWord;
    private char sex;
    private String phone;
    private double money;


    public ObjectOutputClass() {
    }

    public ObjectOutputClass(String logName, String userName, String passWord, char sex, String phone, double money) {
        this.logName = logName;
        this.userName = userName;
        this.passWord = passWord;
        this.sex = sex;
        this.phone = phone;
        this.money = money;
    }

    public  String getLogName() {
        return this.logName;
    }

    public void setLogName(String logName) {
        this.logName = logName;
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

    public char getSex() {
        return this.sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getMoney() {
        return this.money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "{" +
            " logName='" + getLogName() + "'" +
            ", userName='" + getUserName() + "'" +
            ", passWord='" + getPassWord() + "'" +
            ", sex='" + getSex() + "'" +
            ", phone='" + getPhone() + "'" +
            ", money='" + getMoney() + "'" +
            "}";
    }

}
