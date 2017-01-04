package Prep._7_UDP_sockets_And_TCP_sockets;

import java.io.IOException;
import java.net.*;

/**
 * Created by jeffjorgensen on 02/01/2017.
 */
public class UDPRecieve {
    public static void main(String[] args) {

        //try catch for ip's UknownHostExeption
        try {

            //fields to listen to a port
            InetAddress ip = InetAddress.getByName("localhost");
            int recieveport = 5555;

            //try catch for SocketExeption
            try {
                //Create DatagramSocket
                DatagramSocket socket = new DatagramSocket(recieveport, ip);

                //In while loop
                while(true){
                    //initialize byte-array to recieve msg
                    byte[] recieve = new byte[1024];

                    //Initialize packet to recieve msg
                    DatagramPacket packet = new DatagramPacket(recieve, recieve.length);

                    //Use socket to recieve msg
                    try {
                        socket.receive(packet);

                        String msg = new String(recieve);
                        System.out.println(msg);

                        //Substring the message, to only get the message
                        String sub = msg.substring(0, msg.indexOf(0));
                        System.out.println(sub);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            } catch (SocketException se){
                se.printStackTrace();
            }
        } catch (UnknownHostException uhe){
            uhe.printStackTrace();
        }

    }
}
