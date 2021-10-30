import java.io.File;
import java.text.SimpleDateFormat;

public class FileDemo {
    public static void main(String[] args) {
        // 创建文件对象
        // 
        // 绝对路劲 和 相对路劲
        File f = new File("javabaselearn/README.md");// 相对路劲,同一个工程里就可以使用相对路径
        // File f = new File("/Users/a1/java-study/Study-java/javabaselearn/README.md") // 绝对路劲
        long size = f.length(); // 文件的字节大小
        System.out.println(size);

        // 文件夹
        // 获取绝对路劲
        System.out.println(f.getAbsolutePath());
        // 获取定义时的路劲
        System.out.println(f.getPath());
        // 获取文件名
        System.out.println(f.getName());
        // 获取文件最后修改时间
        System.out.println(new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(f.lastModified()));



    }
}
