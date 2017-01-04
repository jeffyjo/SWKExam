package Exam._6_Threads_Sockets.Threads;

/**
 * Created by jeffjorgensen on 04/01/2017.
 */
public class PrintDemo {
    public void printCount(Thread t) {
        try {
            for(int i = 50; i > 0; i--) {
                System.out.println("Counter from " + t.getName() + "  ---   "  + i );
            }
        }catch (Exception e) {
            System.out.println("Thread  interrupted.");
        }
    }
}
