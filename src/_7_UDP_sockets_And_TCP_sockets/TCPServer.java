package _7_UDP_sockets_And_TCP_sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by jeffjorgensen on 02/01/2017.
 */
public class TCPServer {
    public static void main(String[] args) {

        int port = 5555;

        try {
            ServerSocket serverSocket = new ServerSocket(port);

            System.out.println("Server started on: " + port);

            Socket socket = serverSocket.accept();
            System.out.println("Client Connected: " + socket.getLocalAddress());

            DataInputStream in = new DataInputStream(socket.getInputStream());
                //DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            while(true) {
                System.out.println(in.readUTF());

                /*
                String msg = "Welcome to server on port: " + port;
                out.writeUTF(msg);
                out.flush();
                */

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
