package api;

public class Test {
    public static void main(String[] args) {
        // toString
        StudentArr s = new StudentArr("zhou",'男',18);
        System.out.println(s.toString());
        System.out.println(s);
        System.out.println("==============");


    }
}

class Student{
    private String name;
    private char sex;
    private int age;


    public Student() {
    }

    public Student(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return this.sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "Student { name=" + name +", sex ="
        +sex +", age=" + age +"}";
    }

}