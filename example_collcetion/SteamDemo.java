package example_collcetion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SteamDemo {
    public static int allMoney;
    public static int allMoney1;
    public static void main(String[] args) {
        List<Employee> one = new ArrayList<>();
        one.add(new Employee("megoo", '男', 30000, 25000,null));
        one.add(new Employee("venmon", '男', 4000, 5000,null));
        one.add(new Employee("doris", '女', 4500, 7000,"顶撞上次"));
        one.add(new Employee("larson", '男', 25000, 20000,null));

        List<Employee> two = new ArrayList<>();
        two.add(new Employee("stanly",'男', 15000, 9000, null));
        two.add(new Employee("anna",'女', 5000, 4000, null));
        two.add(new Employee("rebaca",'女', 5000, 5000, "被打"));
        two.add(new Employee("Satan",'女', 9000, 19000, "被打"));
        two.add(new Employee("vin",'男', 15000, 29000, "下毒"));

        // 最高工资的员工找出来,制定大小规则
        // Employee e = one.stream().max((e1, e2) -> ((e1.getSalary() + e1.getBonus()) - (e2.getSalary() + e2.getBonus()))).get();
        // System.out.println(e);

        Topperformer t = one.stream().max((e1, e2) -> ((e1.getSalary() + e1.getBonus()) - (e2.getSalary() + e2.getBonus())))
        .map(e -> new Topperformer(e.getName(), e.getSalary() + e.getBonus())).get();

        Topperformer t1 = two.stream().max((e1, e2) -> ((e1.getSalary() + e1.getBonus()) - (e2.getSalary() + e2.getBonus())))
        .map(e -> new Topperformer(e.getName(), e.getSalary() + e.getBonus())).get();

        // 统计平均工资,去掉最高工资和最低工资
        //new Employee(e -> (e.getName(),e.getSex(),e.getSalary(),e.getBonus(),e.getPunish()));
        System.out.println("一部优秀员工: "+ t);
        System.out.println("二部优秀员工: "+ t1);
        // 检查一部员工排序内容是否有问题:::::::
        //Stream<Employee> steams = one.stream().sorted((e2, e1) -> ((e1.getSalary() + e1.getBonus()) - (e2.getSalary() + e2.getBonus())));
        //steams.forEach(System.out::println);
        // 按降序(收入)排序后,出去最低,最高的工资,求平均数
        //---------------------------------------------------
        // 检查二部员工排序内容是否有问题:::::::
        // Stream<Employee> steams = two.stream().sorted((e2, e1) -> ((e1.getSalary() + e1.getBonus()) - (e2.getSalary() + e2.getBonus())));
        // steams.forEach(System.out::println);
        // 按降序(收入)排序后,出去最低,最高的工资,求平均数

        one.stream().sorted((e2, e1) -> ((e1.getSalary() + e1.getBonus()) - (e2.getSalary() + e2.getBonus()))).skip(1).limit(one.size() -2 )
        .forEach(e -> {
            allMoney += (e.getSalary() + e.getBonus());
        });
        System.out.println("开发一部的平均工资: " + allMoney / (one.size() - 2));

        // 合并流的方式来进行操作: 两个部门平均工资,去掉最低和最高
        Stream<Employee> s1 = one.stream();
        
        Stream<Employee> s2 = two.stream();
        Stream<Employee> s3 = Stream.concat(s1, s2);
    
        // 看看S3流中是否是 两个部门的 员工对象,打印看看.
        // s3.forEach(System.out::println);----->>>>>>> 会报 IllegalStateException 错误,,,,??????--- 未解决

        s3.sorted((e2, e1) -> ((e1.getSalary() + e1.getBonus()) - (e2.getSalary() + e2.getBonus()))).skip(1).limit(one.size() + two.size() -2 )
        .forEach(e -> {
            allMoney1 += (e.getSalary() + e.getBonus());
        });
        System.out.println("开发二部的平均工资: " + allMoney1 / (one.size() + two.size() - 2));

    }
}
