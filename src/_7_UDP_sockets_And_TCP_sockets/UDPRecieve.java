package _7_UDP_sockets_And_TCP_sockets;

import java.io.IOException;
import java.net.*;

/**
 * Created by jeffjorgensen on 02/01/2017.
 */
public class UDPRecieve {
    public static void main(String[] args) {

        //try catch for ip's UknownHostExeption
        try {

            InetAddress ip = InetAddress.getByName("localhost");
            int recieveport = 5555;

            //try catch for SocketExeption
            try {
                DatagramSocket socket = new DatagramSocket(recieveport, ip);


                while(true){
                    //byte-array to recieve msg
                    byte[] recieve = new byte[1024];

                    DatagramPacket packet = new DatagramPacket(recieve, recieve.length);

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
