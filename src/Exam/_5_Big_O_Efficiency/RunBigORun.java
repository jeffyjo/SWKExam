package Exam._5_Big_O_Efficiency;

/**
 * Created by jeffjorgensen on 04/01/2017.
 */
public class RunBigORun {
    public static void main(String[] args) {

        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1, 9, 12, 13, 1000, 2346, 1343546, 345, 12, 54532, 13, 56, 33, 8, 4356, 45,34 ,76, 12, 546, 12 ,65, 87, 56, 98, 45 };

        //sort with bubblesort and selectionsort
        long startBubble = System.nanoTime();
        long stopBubble = System.nanoTime();

        long startSelection = System.nanoTime();
        long stopSelection = System.nanoTime();

        //Search with linearSearch and binarySearch
        long startLinear = System.nanoTime();
        long stopLinear = System.nanoTime();

        long startBinary = System.nanoTime();
        long stopBinary = System.nanoTime();

    }
}
