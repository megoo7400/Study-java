package demo;

public class Student {
    private String studyId;
    private String name;
    private int age;
    private String clsaaName;

    public Student() {
    }

    public Student(String studyId, String name, int age, String clsaaName) {
        this.studyId = studyId;
        this.name = name;
        this.age = age;
        this.clsaaName = clsaaName;
    }

    public String getStudyId() {
        return this.studyId;
    }

    public void setStudyId(String studyId) {
        this.studyId = studyId;
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

    public String getClsaaName() {
        return this.clsaaName;
    }

    public void setClsaaName(String clsaaName) {
        this.clsaaName = clsaaName;
    }

}
