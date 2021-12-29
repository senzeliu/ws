package org.example.network;

import com.sun.security.ntlm.Server;
import jdk.nashorn.internal.objects.annotations.Where;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

/**
 * @author liusenze
 * @Description:
 * @since 2021/12/29 5:47 下午
 */
public class SocketServer {

    public static void main(String[] args) throws UnknownHostException {

        ServerSocket serverSocket=null;
        Socket sock=null;
        InetAddress inetAddress=InetAddress.getByName("127.0.0.1");
        try {
            serverSocket =new ServerSocket(9999);
            sock=serverSocket.accept();
            InputStream in=sock.getInputStream();

            byte[] b=new byte[1028];

            ByteArrayOutputStream os=new ByteArrayOutputStream();
            while(in.read(b)!=-1){
                os.write();
            }

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
