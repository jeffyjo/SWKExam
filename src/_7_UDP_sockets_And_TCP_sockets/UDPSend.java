package _7_UDP_sockets_And_TCP_sockets;

import java.io.IOException;
import java.net.*;

/**
 * Created by jeffjorgensen on 02/01/2017.
 */
public class UDPSend {
    public static void main(String[] args) {

        try {
            //variables to connect to recieve socket
            InetAddress ip = InetAddress.getByName("localhost");
            int sendPort = 5555;

            try {
                //Initialize an unconnected socket
                DatagramSocket socket = new DatagramSocket();

                String msg = "Hi, this is the first message";

                //transform String to byte-array
                byte[] send = msg.getBytes();

                //Datagrampacket constructor used with byte-array, length, InetAddress and port
                DatagramPacket packet = new DatagramPacket(send, send.length, ip , sendPort);

                try {
                    socket.send(packet);

                } catch (IOException e) {
                    e.printStackTrace();
                }

            } catch (SocketException e) {
                e.printStackTrace();
            }

        } catch (UnknownHostException uhe){
            uhe.printStackTrace();
        }
    }
}
