import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        // 字节流完成文件的复制....一切文件类型的复制.
        // 创建一个字节流 流入通道...
        InputStream is = new FileInputStream("Study-java.iml");
        // 创建一个字节流,输出通道
        OutputStream os = new FileOutputStream("outputstream.txt", true);
        // 定义一个字节数组,来转移数据
        byte[] buffer = new byte[1024];
        int len;
        while ((len = is.read(buffer)) != -1) {
            os.write(buffer,0,len);
        }
        System.out.println("复制完成了`````");
        is.close();
        os.close();

    }
}
