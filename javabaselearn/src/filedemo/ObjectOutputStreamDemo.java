import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws Exception {
        ArrayList<ObjectOutputClass> list = new ArrayList<>();
        // 创建对象
        ObjectOutputClass c = new ObjectOutputClass();
        c.setLogName("zyf888");
        c.setPassWord("123456");
        c.setUserName("大汉刘德华");
        c.setSex('男');
        c.setPhone("1111111");
        list.add(c);
        ObjectOutputClass c1 = new ObjectOutputClass();
        c1.setLogName("gzl000");
        c1.setPassWord("123456");
        c1.setUserName("大汉关之琳");
        c1.setSex('女');
        c1.setPhone("2222222");
        list.add(c1);
        // 对象序列化 ,不许要实现implements Serializable 接口...
        // 包装字节输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("javabaselearn/src/filedemo/dat.txt"));
        oos.writeObject(list);
       // oos.writeObject(c1);
        oos.close();
    }
}
