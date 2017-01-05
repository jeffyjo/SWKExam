package Exam._6_Threads_Sockets.Threads;

/**
 * Created by jeffjorgensen on 04/01/2017.
 */
public class ThreadTest extends Thread{
    private Thread thread;
    private String threadName;
    PrintDemo printDemo;

    //constructor with name and pd
    public ThreadTest( String name,  PrintDemo pd) {
        threadName = name;
        printDemo = pd;
        System.out.println("thread " + threadName + " is created");
    }

    //Override methods and initialize thread with this and name. call start() from super-class


    //run calls method in PrintDemo
    ////make run() synchronized with printDemo
}
