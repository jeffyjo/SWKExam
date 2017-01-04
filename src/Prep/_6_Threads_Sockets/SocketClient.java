package Prep._6_Threads_Sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by jeffjorgensen on 02/01/2017.
 */
public class SocketClient {
    public static void main(String[] args) {
        String serverName = "localhost";
        int port = 5555;

        try{
            System.out.println("Connected to server");
            Socket client = new Socket(serverName, port);

            System.out.println("Connected to " + client.getRemoteSocketAddress());

            DataOutputStream out = new DataOutputStream(client.getOutputStream());
            DataInputStream in = new DataInputStream(client.getInputStream());

            out.writeUTF("Hello from" + client.getLocalAddress());
            out.flush();

            System.out.println(in.readUTF());

        } catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
