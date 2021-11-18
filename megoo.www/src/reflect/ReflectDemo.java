package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 姓名: megoo74
 * 事件: 2021/11/11
 * 项目: Study-java
 * 获取 class 类对象的方式
 * -- class对象/  constructor / filed / method / 反射的机制
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 获取Class类对象的方式
        // 方式一 class.forName(全类名) 获取对象
        Class<?> cl = Class.forName("reflect.Students"); // 包名+类名 --> 全类名
        System.out.println(cl);
        // 方式二 类名.class 获取对象
        Class<?> c = Students.class;
        System.out.println(c);
        // 方法三 对象.getClass() 获取对象对应的Class对象
        Students s = new Students();
        Class<?> cc = s.getClass();
        System.out.println(cc);

        // 获取Class对象的构造器对象
        Constructor<?>[] constructors = cc.getConstructors();
        // 遍历构造器
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getName()+ "==>" + constructor.getParameterCount());
        }

        // 获取构造器 来创建对象 -- > newInstance()
        Students st = (Students) constructors[0].newInstance();
        Students st1 = (Students) constructors[1].newInstance("megoo", '男', 89.9);
        System.out.println(st1.toString());
    }
}
