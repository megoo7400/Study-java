package TCPdemo2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * 姓名: megoo74
 * 事件: 2021/11/8
 * 项目: Study-java
 */
public class ServerReaderDemo2 extends Thread{
    private Socket socket;
    public ServerReaderDemo2(Socket socket){
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
                System.out.println(socket.getRemoteSocketAddress() + ": " + msg);
            }
        } catch (Exception e) {
            System.out.println(socket.getRemoteSocketAddress() + "下线了");
        }
    }
}
