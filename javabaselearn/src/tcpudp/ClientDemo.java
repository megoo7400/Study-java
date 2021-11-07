import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class ClientDemo {
   
    public static void main(String[] args) throws Exception {
        System.out.println("====客户端启动======");
        // 创建发送对象
        DatagramSocket socket = new DatagramSocket();
        // 创建一个数据包对象,封装数据
        /**
         * public DatagramPacket(byte buf[], int length,
                          InetAddress address, int port)
         */
        byte[] buffer = "我是CSGO数据".getBytes();
        DatagramPacket packet = new DatagramPacket("我是CSGO数据".getBytes(),buffer.length 
                                                    , InetAddress.getLocalHost(), 8888);
        // 3 发送数据
        socket.send(packet);

        socket.close();
    }
}
