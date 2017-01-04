package Prep._6_Threads_Sockets;

/**
 * Created by jeffjorgensen on 31/12/2016.
 */
public class LongCounter {
    //Hvad er volatine
    private volatile long count = 0;

    public void increment(){
        //Hvad er synchronized
        synchronized(this){
            count = count + 1;
        }
    }

    public long get(){
        return count;
    }
}
