package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author likun
 * @date 2019-12-18
 * @time 14:45:30
 */
public class TcpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12345);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
      int a;
        while ((a=inputStream.read())!=-1){
            System.out.println((char) a);
        }
    }
}
