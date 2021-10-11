package extend_tst;

public class Role {
    private String name;
    private int age;

    public void queryCourse(){
        System.out.println(name + "查看课表:");
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

}
