package tcp;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author likun
 * @date 2019-12-18
 * @time 14:43:35
 */
public class TcpClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 12345);

    socket.getOutputStream().write("hh".getBytes());
    socket.close();



    }
}
