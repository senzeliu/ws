package org.example.network;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

/**
 * @author liusenze
 * @Description:
 * @since 2021/12/29 5:47 下午
 */
public class SocketClient {

    public static void main(String[] args) throws UnknownHostException {

        Socket sock=null;
        InetAddress inetAddress=InetAddress.getByName("127.0.0.1");
        try {
            sock =new Socket(inetAddress,9999);
            OutputStream os=sock.getOutputStream();
            os.write("hello,world".getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (sock!=null){
                try {
                    sock.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
