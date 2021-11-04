import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileDeleteStrategy;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import ch.qos.logback.core.util.FileUtil;

public class Commons_Io_Demo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // IOUtils.copy(new FileInputStream("users.properties"), 复制操作
        //  new FileOutputStream("users_copy.properties"));

        // FileUtils.copyDirectory(srcDir, destDir); 文件与文件夹,,文件夹与文件夹之间的关系
        // FileUtils.deleteDirectory(directory); 删除文件夹及其内容....
        // NIO2.0  官方自己更新的IO框架.. path.of()

    }
}
