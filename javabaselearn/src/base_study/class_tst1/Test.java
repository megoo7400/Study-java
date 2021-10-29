package class_tst1;


/**
 * 学习:内部类的使用形式
 */

public class Test {
    public static void main(String[] args) {
        
        // Swimming s = new Student();
        // go(s);

        // 匿名内部类,重写方法,直接创建对象(实际是不能创建对象)
        Swimming s = new Swimming(){
            @Override
            public void swim(){
                System.out.println("hanpp---");
            }
        };
        go(s);
    }
    public static void go(Swimming a){
        System.out.println("START`````");
        a.swim();
        System.out.println("END-----");
    }
}
// class Student implements Swimming{
//     @Override
//     public void swim(){
//         System.out.println("hanppy");
//     }
// }

interface Swimming{
    void swim();
}