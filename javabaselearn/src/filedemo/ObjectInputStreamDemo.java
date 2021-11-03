import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class ObjectInputStreamDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        File f = new File("javabaselearn/src/filedemo/dat.txt");
        // 对象饭序列化,,,放到内存中
        ObjectInputStream iis = new ObjectInputStream(new FileInputStream(f));
        ArrayList<ObjectOutputClass> olist = (ArrayList<ObjectOutputClass>) iis.readObject();
        for (ObjectOutputClass o : olist) {
            System.out.println(o);
        }
        iis.close();
       
        
    }
}
