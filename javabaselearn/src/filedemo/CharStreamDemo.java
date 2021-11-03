import java.io.FileReader;
import java.io.Reader;

/**
 * CharStreamDemo
 * 学习字符流
 * 构造器----
 * 方法 ----
 */
public class CharStreamDemo {

    public static void main(String[] args) throws Exception {
        // 创建一个字符输入流
        Reader fr = new FileReader("Study-java.iml");
        // 读取一个字符
        // int code = fr.read();
        // System.out.println((char)code);
        // 遍历来读取字符
        int code1;
        while ((code1 = fr.read()) != -1) {
            System.out.print((char)code1);
        }
        char[] buffer = new char[1024]; // 1k 字符
        int len;
        while ((len = fr.read(buffer)) != -1) {
            String rs = new String(buffer, 0, len);
            System.out.println(rs);
        }

        
    }
}