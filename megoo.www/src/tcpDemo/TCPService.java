package tcpDemo;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 姓名: megoo74
 * 事件: 2021/11/7
 * 项目: Study-java
 * 目标: TCP的服务端的开发,接受消息
 */
public class TCPService {
    public static void main(String[] args)  {

        try {
            System.out.println("=====服务端=====");
            // 1.创建ServerSocket,注册端口
           ServerSocket serverSocket = new ServerSocket(7777);
            // 2. 调用一个accept()方法,建立Socket通道
            Socket socket = serverSocket.accept();
            // 3.从Socket管道,得到一个字节输入流
            InputStream is = socket.getInputStream();
            // 4.缓冲字符输入流,消息的读出
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            // 5.按照行读取消息
            String msg;
            if ((msg = br.readLine()) != null){
                System.out.println(socket.getRemoteSocketAddress() + ": " +msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
