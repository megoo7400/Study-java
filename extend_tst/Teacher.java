package extend_tst;

public class Teacher {
    private String departMent;

    public void teach(){
        System.out.println("老师上课");
    }


    public String getDepartMent() {
        return this.departMent;
    }

    public void setDepartMent(String departMent) {
        this.departMent = departMent;
    }

}
