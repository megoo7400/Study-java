package TCPdemo2;


import java.net.ServerSocket;
import java.net.Socket;

/**
 * 姓名: megoo74
 * 事件: 2021/11/7
 * 项目: Study-java
 * 目标: TCP的服务端的开发,接受消息
 * // 多个客户端的消息接受
 *
 */
public class TCPService {
    public static void main(String[] args)  {

        try {
            System.out.println("=====服务端=====");
            // 1.创建ServerSocket,注册端口
            ServerSocket serverSocket = new ServerSocket(8989);
            // 2. 调用一个accept()方法,建立Socket通道
            // 定义一个死循环,由主线程负责不断的接受客户端的socket管道连接.
           while (true){
               // 每接受一个socket的管道,给一个独立的子线程负责读取
               Socket socket = serverSocket.accept();
               //上线
               System.out.println(socket.getRemoteSocketAddress()+"上线了");
               // 给独立的线程
               new ServerReaderDemo2(socket).start();
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
