package Prep._6_Threads_Sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

/**
 * Created by jeffjorgensen on 02/01/2017.
 */
public class SocketServer implements Runnable{
    private ServerSocket serverSocket;

    public SocketServer(int port) throws IOException{
        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(10000);
    }

    @Override
    public void run() {
        while(true){
            System.out.println("Waiting for client to connect on " + serverSocket.getLocalPort());

            try {
                Socket server = serverSocket.accept();

                DataInputStream in = new DataInputStream(server.getInputStream());
                DataOutputStream out = new DataOutputStream(server.getOutputStream());

                System.out.println(in.readUTF());

                out.writeUTF("Thank you for connecting to serverSocket");
                out.flush();

            }catch (SocketTimeoutException soe){
                soe.printStackTrace();
                System.out.println("Socket timeout");
                break;
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Disconnected ...");
                break;
            }
        }
    }

    public static void main(String[] args) {
        int port = 5555;
        Thread t = new Thread(() -> {
            try {
                SocketServer socketServer = new SocketServer(port);
                socketServer.run();
            } catch(IOException ioe){
                ioe.printStackTrace();
                System.out.println("Port not available");
            }
        });
        t.start();
    }
}
