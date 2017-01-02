package _6_Threads_Sockets;

import org.omg.SendingContext.RunTime;

import java.util.ArrayList;
import java.util.concurrent.ThreadFactory;

/**
 * Created by jeffjorgensen on 31/12/2016.
 */
public class Main {

    //TODO: Sockets

    public static boolean isPrime(long n) {
        if (n != 2 && n % 2 == 0) return false;
        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        ArrayList<Thread> threads = new ArrayList<>();
        int noOfThreads = Runtime.getRuntime().availableProcessors();
        LongCounter longCounter = new LongCounter();
        long maxNumber = 10_000_000;

        System.out.println("number of threads: " + noOfThreads);

        for (int th = 0; th < noOfThreads; th++) {
            Thread t = new Thread(() -> {

                for (int i = 0; i < threads.size(); i++) {

                    for (int j = (int) ((maxNumber / noOfThreads) * i); j < (int) (maxNumber / noOfThreads) * (i + 1); j++) {
                        if (isPrime(j)) {
                            System.out.println(j + " is prime");
                            longCounter.increment();
                        }
                    }
                }

            });
            threads.add(t);

        //TODO: Finish this one - make logic

        }

        for (Thread t: threads) {
            System.out.println("Starting thread: " + t.getName());
            t.start();
        }

        System.out.println(longCounter.get());

        for (Thread t: threads) {
            try {
                t.join();
                System.out.println(t.getName() + " has stopped");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(longCounter.get());
    }
}