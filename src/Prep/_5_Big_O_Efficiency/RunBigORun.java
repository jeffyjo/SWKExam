package Prep._5_Big_O_Efficiency;

//http://www.java2novice.com/java-sorting-algorithms/

/**
 * Created by jeffjorgensen on 30/12/2016.
 */
public class RunBigORun {
    public static void main(String[] args) {

        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1, 9, 12, 13, 1000, 2346, 1343546, 345, 12, 54532, 13, 56, 33, 8, 4356, 45,34 ,76, 12, 546, 12 ,65, 87, 56, 98, 45 };
        int[] input2 = { 4, 2, 9, 6, 23, 12, 34, 0, 1, 9, 12, 13, 1000, 2346, 1343546, 345, 12, 54532, 13, 56, 33, 8, 4356, 45,34 ,76, 12, 546, 12 ,65, 87, 56, 98, 45 };

        //Sorting - make bubble sort and a more fancy sort
        BubbleSort bubbleSort = new BubbleSort();
        long start = System.nanoTime();
        bubbleSort.bubbleSort(input);
        long stop = System.nanoTime();

        System.out.println("Time for executing: " + (int) (stop - start)/1000);

        SelectionSort selectionSort = new SelectionSort();

        long startMerge = System.nanoTime();
        selectionSort.doSelectionSort(input2);
        long stopMerge = System.nanoTime();
        System.out.println("Time for executing: " + (int) (stopMerge - startMerge)/1000);

        //searching - make linear sort and a more fancy searching
        int key = 10;
        int[] ints = {1, 2, 3, 6, 7, 10, 78};

        LinearSearch linearSearch = new LinearSearch();

        int index = linearSearch.linearSearch(ints, key);

        System.out.println("The key with value: " + key + " is at index " + index);

        //BinarySearch binarySearch = new BinarySearch();

        //int index2 = binarySearch.binarySearch(ints, key);

        //System.out.println("The key with value: " + key + " is at index " + index2);
    }
}
