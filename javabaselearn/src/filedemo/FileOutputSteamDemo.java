import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputSteamDemo {
    public static void main(String[] args) throws IOException {
        // 创建写入流::::
        // 覆盖管道....(file,append: true) --- > 追加文本
        OutputStream os = new FileOutputStream("outputstream.txt", true);
        os.write('a');
        os.write(98);
        os.write("\r\n".getBytes());
        // os.write('敬'); 
        // write 默认是写入一个字节:

        byte[] buffer = "敬小平".getBytes();
        os.write(buffer);

        // os.flush();
        os.close();
        

    }
}
