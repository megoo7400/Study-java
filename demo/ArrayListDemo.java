package demo;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //定义一个电影类:
        //定义一个Arraylist对象,存储影片对象
        ArrayList<Movie> movies = new ArrayList<>();

        // 创建电影对象封装
        Movie m1 = new Movie();
        Movie m2 = new Movie();
        Movie m3 = new Movie();
        m1.setName("<肖申克的救赎>");
        m1.setScore(9.7);
        m1.setActor("罗宾逊");

        m2.setName("<霸王别姬>");
        m2.setScore(9.6);
        m2.setActor("张国荣");

        m3.setName("<阿甘正传>");
        m3.setScore(9.5);
        m3.setActor("汤姆.汉克斯");

        movies.add(m1);
        movies.add(m2);
        movies.add(m3);
        System.out.println(movies);
        // 遍历对象并展示出来
        for (int i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);
            System.out.println("片名: " + movie.getName());
            System.out.println("评分: " + movie.getScore());
            System.out.println("主演: " + movie.getActor());
            System.out.println(movie);
        }

    }
}
