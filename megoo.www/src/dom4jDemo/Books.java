package dom4jDemo;

import org.dom4j.io.SAXReader;

/**
 * 姓名: megoo74
 * 事件: 2021/11/14
 * 项目: Study-java
 */
public class Books {
    private  String title;
    private  String author;
    private  int year;
    private  double price;
    private  String category;

    public Books() {
    }

    public Books(String title, String author, int year, double price, String category) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
