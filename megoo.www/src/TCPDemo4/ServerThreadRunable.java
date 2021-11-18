package TCPDemo4;

import java.io.*;
import java.net.Socket;

/**
 * 姓名: megoo74
 * 事件: 2021/11/8
 * 项目: Study-java
 */
public class ServerThreadRunable implements Runnable {
    private Socket socket;
    public ServerThreadRunable(Socket socket){
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
                // 消息进行端口转发 ,,全部的socket转发
                sendMsgToAll(msg);
            }
        } catch (Exception e) {
            System.out.println(socket.getRemoteSocketAddress() + "下线了");
            TCPService.allOnlineSockets.remove(socket);
        }
    }

    private void sendMsgToAll(String msg) throws IOException {
        for (Socket socket: TCPService.allOnlineSockets) {
            PrintStream ps = new PrintStream(socket.getOutputStream());
            ps.println(msg);
            ps.flush();
        }
    }
}
