package reflect;

/**
 * 姓名: megoo74
 * 事件: 2021/11/11
 * 项目: Study-java
 */
public class Students {
    private String name;
    private char sex;
    private double score;

    public Students() {
    }

    public Students(String name, char sex, double score) {
        this.name = name;
        this.sex = sex;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", score=" + score +
                '}';
    }
}
