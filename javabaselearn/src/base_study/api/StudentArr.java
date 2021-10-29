package api;

public class StudentArr {
    private String name;
    private int age;
    private double height;


    public StudentArr() {
    }

    public StudentArr(String string, int i, double d) {
        this.name = string;
        this.age = i;
        this.height = d;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", age='" + getAge() + "'" +
            ", height='" + getHeight() + "'" +
            "}";
    }

}
