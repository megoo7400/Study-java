package extend_tst;

public class Student extends Role{
    private String className;
    public void writeInfo(){
        System.out.println("lalalalla");

    }

    public String getClassName() {
        return this.className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

}
