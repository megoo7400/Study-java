package demo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSearch {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("20180302", "叶孤城", 23, "护理一班"));
        students.add(new Student("20180303", "东方不", 23, "推拿一班"));
        students.add(new Student("20180304", "西门吹", 26, "中医一班"));
        students.add(new Student("20180305", "梅超风", 22, "按摩一班"));
        students.add(new Student("20180306", "南宫烈", 21, "畜牧一班"));
        // 遍历对象数据
        System.out.println("学号: " + "\t\t\t" + "姓名: " + "\t\t" + "年龄: " + "\t\t" + "班级");
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println(student.getStudyId()+ "\t\t" + student.getName()
             + "\t\t" + student.getAge() + "\t\t" + student.getClsaaName());

        }

        //搜索
        Scanner sc = new Scanner(System.in);
       while(true){
            System.out.println("输入学号: ");
            String id = sc.next();
            Student student = getStudentById(students, id);
            if (student == null) {
                System.out.println("查无此人");
            } else {
                System.out.println(student.getStudyId()+ "\t\t" + student.getName()
                + "\t\t" + student.getAge() + "\t\t" + student.getClsaaName());
            }
       }       

    }

    public static Student getStudentById(ArrayList<Student> students, String id){
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if(s.getStudyId().equals(id)){
                return s;
            }
        }
        return null;
    }
    
}
