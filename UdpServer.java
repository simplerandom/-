package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;

/**
 * @author likun
 * @date 2019-12-18
 * @time 14:23:34
 */
public class UdpServer {
    public static void main(String[] args) throws IOException {


        DatagramSocket server = new DatagramSocket(11111);
        byte[] bytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes, 1024);

        server.receive(packet);
        System.out.println(packet.getAddress().getHostAddress());
        System.out.println(packet.getAddress());
        byte[] data = packet.getData();
        String s = Arrays.toString(data);
        System.out.println(s);
        System.out.println(packet.getSocketAddress());


    }
}
