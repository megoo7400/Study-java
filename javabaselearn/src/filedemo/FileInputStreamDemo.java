import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * FileInputStream
 */
public class FileInputStreamDemo {

    public static void main(String[] args) throws IOException {
        // 创建一个文件字节流
        InputStream is = new FileInputStream("javabaselearn/src/filedemo/data.txt");
        // 定义一个字节数组,用于读取数据
        byte[] buffer = new byte[3];
        int len;
        // System.out.println("读取了几个字节: " + len);
        // String rs = new String(buffer);
        // System.out.println(rs);

        
        // int len1 = is.read(buffer);
        // System.out.println("读取了几个字节: " + len1);
        // String rs1 = new String(buffer);
        // System.out.println(rs1);

        // int len2 = is.read(buffer);
        // System.out.println("读取了几个字节: " + len2);
        // String rs2 = new String(buffer);
        // System.out.println(rs2);

        while ((len = is.read(buffer))!= -1) {
            System.out.println(new String(buffer,0,len));
            // 赌多少倒多少......读中文与英文混合 会有乱码...
            // 复制是没有问题的.
        }

        is.close();

        File f = new File("Study-java.iml");
        System.out.println(new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(f.lastModified()));

        // 一次读完全部字节;;;;;
        InputStream is1 = new FileInputStream("Study-java.iml");
        File f1 = new File("Study-java.iml");
        // 定义一个字节数组与文件大小一样
        // byte[] buffer1 = new byte[(int) f1.length()];
        // int len3 = is1.read(buffer1);
        // System.out.println("读取了多少个字节: " + len3);
        // System.out.println("文件的大小: " + f1.length());

        // System.out.println(new String(buffer1));
        System.out.println("=======API - readAllBytes()========");
        // JAVA 自定义的API - readAllBytes();
        byte[] buffer2 = is1.readAllBytes();
        System.out.println(new String(buffer2));

        is1.close();

    }
}