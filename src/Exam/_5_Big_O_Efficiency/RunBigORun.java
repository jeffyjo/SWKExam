package Exam._5_Big_O_Efficiency;

/**
 * Created by jeffjorgensen on 04/01/2017.
 */
public class RunBigORun {
    public static void main(String[] args) {

        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1, 9, 12, 13, 1000, 2346, 1343546, 345, 12, 54532};
        int[] input2 = { 4, 2, 9, 6, 23, 12, 34, 0, 1, 9, 12, 13, 1000, 2346, 1343546, 345, 12, 54532};

        //sort with bubblesort and selectionsort

        long startBubble = System.nanoTime();
        long stopBubble = System.nanoTime();

        long startSelection = System.nanoTime();
        long stopSelection = System.nanoTime();

        System.out.println("Execution time = " + (int)  (stopBubble - startBubble)/1000);
        System.out.println("Execution time = " + (int) (stopSelection - startSelection)/1000);
















        //Search with linearSearch and binarySearch

        int[] input3 = {0, 1, 2, 4, 6, 9, 9, 12, 12, 12, 13, 23, 34, 345, 1000, 2346, 54532, 1343546};

        long startLinear = System.nanoTime();
        long stopLinear = System.nanoTime();

        long startBinary = System.nanoTime();
        long stopBinary = System.nanoTime();

        System.out.println("Execution time = " + (int) (stopLinear - startLinear)/1000);
        System.out.println("Execution time = " + (int) (stopBinary - startBinary)/1000);


    }
}
