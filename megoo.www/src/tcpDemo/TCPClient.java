package tcpDemo;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

/**
 * 姓名: megoo74
 * 事件: 2021/11/7
 * 项目: Study-java
 * 目标: 完成Socket 网络编程客户端的一发一收
 */
public class TCPClient {
    public static void main(String[] args)  {
        try {
            System.out.println("=====客户端=====");
            // 1/创建Socket通信管道请求的连接
            // host: 服务器的IP,,port: 服务器的端口
            Socket socket = new Socket("127.0.0.1", 7777);
            // 2/从socket获取得到一个字节输出流,负责发送数据
            OutputStream os = socket.getOutputStream();
            // 3/ 把低级的字节流包装成打印流
            PrintStream ps = new PrintStream(os);
            // 4/ 发送数据
            ps.println("我是TCP的客户端,我已经与你对接,并发出要求: 约吗?");
            ps.flush();

//        socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
