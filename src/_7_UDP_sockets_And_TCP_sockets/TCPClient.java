package _7_UDP_sockets_And_TCP_sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * Created by jeffjorgensen on 02/01/2017.
 */
public class TCPClient {
    public static void main(String[] args) {

        try {
            InetAddress ip = InetAddress.getByName("localhost");
            int port = 5555;

            Socket socket = new Socket(ip, port);

            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            //DataInputStream in = new DataInputStream(socket.getInputStream());

            //reads from socket
            //String recieveMsg = in.readUTF();
            //System.out.println(recieveMsg);

            Scanner sc = new Scanner(System.in);

            while (true) {
                try {
                    //writes to socket
                    System.out.println("Write msg ----");
                    String msg = sc.nextLine();

                    out.writeUTF(msg);
                    out.flush();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        } catch (UnknownHostException uhe) {
            uhe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
