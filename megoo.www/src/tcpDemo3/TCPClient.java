package tcpDemo3;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 姓名: megoo74
 * 事件: 2021/11/7
 * 项目: Study-java
 * 目标: 完成Socket 网络编程客户端的多发多收
 */
public class TCPClient {
    public static void main(String[] args)  {
        try {
            System.out.println("=====客户端=====");
            // 1/创建Socket通信管道请求的连接
            // host: 服务器的IP,,port: 服务器的端口
            Socket socket = new Socket("127.0.0.1", 8988);
            // 2/从socket获取得到一个字节输出流,负责发送数据
            OutputStream os = socket.getOutputStream();
            // 3/ 把低级的字节流包装成打印流
            PrintStream ps = new PrintStream(os);
            // 4/ 发送数据
            Scanner sc = new Scanner(System.in);
            while(true){
                System.out.println("请说: ");
                String msg = sc.nextLine();
                ps.println(msg);
                ps.flush();
            }
//        socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
