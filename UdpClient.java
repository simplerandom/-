package udp;

import java.io.IOException;
import java.net.*;

/**
 * @author likun
 * @date 2019-12-18
 * @time 14:11:19
 */
public class UdpClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        DatagramPacket datagramPacket = new DatagramPacket("hell".getBytes(), "hell".getBytes().length, InetAddress.getLocalHost(), 11111);


        datagramSocket.send(datagramPacket);
datagramSocket.close();}}
