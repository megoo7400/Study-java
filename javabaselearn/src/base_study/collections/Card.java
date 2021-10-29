package collections;

public class Card {
    private String  size;
    private String color;
    private int index; // 牌的大小属性


    public Card() {
    }

    public Card(String size, String color,int index) {
        this.size = size;
        this.color = color;
        this.index = index;
    }

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return size + color; 
    }

}
