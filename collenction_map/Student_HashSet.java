package collenction_map;

import java.util.Objects;

public class Student_HashSet {
    private String name;
    private int age;
    private char sex;


    public Student_HashSet() {
    }

    public Student_HashSet(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public char getSex() {
        return this.sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", age='" + getAge() + "'" +
            ", sex='" + getSex() + "'" +
            "}";
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Student_HashSet)) {
            return false;
        }
        Student_HashSet student_HashSet = (Student_HashSet) o;
        return Objects.equals(name, student_HashSet.name) && age == student_HashSet.age && sex == student_HashSet.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }


}
