package Exam._7_UDP_sockets_And_TCP_sockets;

import java.net.InetAddress;

/**
 * Created by jeffjorgensen on 04/01/2017.
 */
public class UDPSend {
    public static void main(String[] args) {

        //fields to connect to recieve socket
        int sendPort = 5555;
        //InetAddress ip = InetAddress.getByName("localhost");

        //Initialize an unconnected DatagramSocket

        String msg = "Hi, this is the first message";

        //transform String to byte-array

        //Datagrampacket constructor used with byte-array, length, InetAddress and port

        //send packet with socket

    }
}
