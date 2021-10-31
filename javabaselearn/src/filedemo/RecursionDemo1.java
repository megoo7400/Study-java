import java.io.File;


public class RecursionDemo1 {
    /**
     * 去 /user/a1 找文件
     * @param args
     */
    public static void main(String[] args) {
        // File f = new File("README.md");
        // System.out.println(f.getAbsolutePath());
        searchFile(new File("/Users/a1/java-study"), "RecursionDemo.java");
    }

    public static void searchFile(File dir, String fileName) {
        if (dir != null && dir.isDirectory()) {
            // 提取当前目录的一级文件对象
            File[] files = dir.listFiles();
            if (files != null && files.length > 0) {
                for (File file : files) {
                    //判断当前是文件还是文件夹
                    if (file.isFile()) {
                        // 是不是要找的文件
                        if(file.getName().contains(fileName)){
                            System.out.println("找到了,文件位置是: "+ file.getAbsolutePath());
                        }
                    } else {
                        searchFile(file, fileName); 
                    }
                }
            }
        } else {
            System.out.println("搜索不对....");
        }
    }
}
