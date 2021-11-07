import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ServiceDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("-----服务端启动-----");
        // 创建接收端对象
        DatagramSocket socket = new DatagramSocket(8888);
        //数据包接受对象
        byte[] buffer = new byte[1024*64];
        DatagramPacket packet = new DatagramPacket(buffer,buffer.length );
        // 接受数据方法
        socket.receive(packet);
        // 取出数据
        String rs = new String(buffer);
        System.out.println("收到了: " + rs);
        socket.close();
    }
}
