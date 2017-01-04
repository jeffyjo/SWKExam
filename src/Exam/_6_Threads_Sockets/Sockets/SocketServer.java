package Exam._6_Threads_Sockets.Sockets;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by jeffjorgensen on 04/01/2017.
 */
public class SocketServer {
    private ServerSocket serverSocket;

    //initialize new serverSocket-object with portNumber
    public SocketServer(int port) {

    }

    //implement runnable and method


    //accept client-request


    // in loop create input stream and print msg



    public static void main(String[] args) {
        int port = 5555;
        Thread t = new Thread(() -> {
            //Declare and initialize new SocketServer-object
            //call implemented function
        });
        t.start();
    }

}
