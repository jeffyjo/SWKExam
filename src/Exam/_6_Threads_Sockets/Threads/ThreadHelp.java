package Exam._6_Threads_Sockets.Threads;

/**
 * Created by jeffjorgensen on 04/01/2017.
 */
public class ThreadHelp extends Thread{
    private Thread t;
    private String threadName;
    PrintDemo  PD;

    ThreadHelp( String name,  PrintDemo pd) {
        threadName = name;
        PD = pd;
    }

    public void run() {
        synchronized(PD) {
            PD.printCount(t);
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start () {
        System.out.println("Starting " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}
