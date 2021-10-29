package bean;
/**
    定义一个电影类,包含:
    片名 -- 主演 -- 评分 -- 时长 -- 票价 -- 余票
 */

import java.util.Date;

public class Movie {
    private String name;
    private String actor;
    private double score;
    private double time;
    private int lefNum;
    private double price;
    private Date startTime;


    public Movie() {
    }

    public Movie(String name, String actor,  double time, int lefNum, double price, Date startTime) {
        this.name = name;
        this.actor = actor;
        
        this.time = time;
        this.lefNum = lefNum;
        this.price = price;
        this.startTime = startTime;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return this.actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public double getScore() {
        return this.score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getTime() {
        return this.time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public int getLefNum() {
        return this.lefNum;
    }

    public void setLefNum(int lefNum) {
        this.lefNum = lefNum;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    
}
