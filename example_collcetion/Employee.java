package example_collcetion;

public class Employee {
    private String name;
    private char sex;
    private int salary;
    private int bonus;
    private String punish;

    public Employee() {
    }

    public Employee(String name, char sex, int salary, int bonus, String punish) {
        this.name = name;
        this.sex = sex;
        this.salary = salary;
        this.bonus = bonus;
        this.punish = punish;
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

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return this.bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public String getPunish() {
        return this.punish;
    }

    public void setPunish(String punish) {
        this.punish = punish;
    }

    @Override
    public String toString() {
        return "Employee" + "-->"+ "{" +
            " name='" + getName() + "'" +
            ", sex='" + getSex() + "'" +
            ", salary='" + getSalary() + "'" +
            ", bonus='" + getBonus() + "'" +
            ", punish='" + getPunish() + "'" +
            "}";
    }

}
