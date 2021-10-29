package collenction_map;

import java.util.HashSet;
import java.util.Set;

/**
 *     - 案例: 创建一个存储学生对象的集合,存储多个学生对象,
 *       使用程序实现在控制台遍历该集合,
 *       要求:学生对象的成员变量值相同,我们就认为是同一个对象

 */
public class SetDome {

    public static void main(String[] args) {
        Set<Student_HashSet> sets = new HashSet<>();
        Student_HashSet s1 = new Student_HashSet("megoo",23,'男');
        Student_HashSet s2 = new Student_HashSet("jack chen",28,'男');
        Student_HashSet s3 = new Student_HashSet("megoo",23,'男');
        
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        sets.add(s1);
        sets.add(s2);
        sets.add(s3);

        System.out.println(sets);

        // 先看哈希值,在判断equals

    }
}