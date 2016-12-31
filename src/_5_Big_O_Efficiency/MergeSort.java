package _5_Big_O_Efficiency;

import java.util.Objects;

/**
 * Created by jeffjorgensen on 31/12/2016.
 */
public class MergeSort {
    private int[] array;
    private int[] tempMergArr;
    private int length;

    public void sort(int[] input){

        System.out.println("Original: ");
        printNumbers(input);
        System.out.println("_______________________________");

        this.array = input;
        this.length = input.length;
        Object[] intArrays = new Object[length];

        for (int i = 0; i < input.length; i++) {
            int newInt = input[i];
            int[] ints = {newInt};
            intArrays[i] = ints;
        }

        for (int i = 0; i < intArrays.length; i++) {
            printNumbers((int[]) intArrays[i]);
        }

    }

    private void swopPlace(int index1, int index2){



    }


    /*public void sort(int inputArr[]) {

        System.out.println("Original: ");
        printNumbers(inputArr);
        System.out.println("_______________________________");

        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }

    private void doMergeSort(int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }

        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;

        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }

        printNumbers(array);

    }
    */
    private void printNumbers(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.println("\n");
    }

}
