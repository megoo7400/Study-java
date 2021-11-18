package TCPDemo4;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * 姓名: megoo74
 * 事件: 2021/11/7
 * 项目: Study-java
 * 目标: 即时通信...,既要发也要收
 */
public class TCPClient {
    public static void main(String[] args)  {
        try {
            System.out.println("=====客户端=====");
            // 1/创建Socket通信管道请求的连接
            // host: 服务器的IP,,port: 服务器的端口
            Socket socket = new Socket("127.0.0.1", 8988);
            // 创建独立的线程,负责这个客户端的读消息(服务器可以随时转发过来消息)
            new ClientReaderThread(socket).start();
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

class ClientReaderThread extends Thread{
    private Socket socket;
    public ClientReaderThread(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();
            // 4.缓冲字符输入流,消息的读出
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            // 5.按照行读取消息
            String msg;
            while ((msg = br.readLine()) != null){
                System.out.println("收到消息: " + msg);
            }
        } catch (Exception e) {
            System.out.println("服务端把您踢出去了````");
        }
    }
}
