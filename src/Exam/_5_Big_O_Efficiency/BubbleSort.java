package Exam._5_Big_O_Efficiency;

/**
 * Created by jeffjorgensen on 04/01/2017.
 */
public class BubbleSort {

    public void bubbleSort(int[] array){
        int length = array.length;
        int nextIndex;

        System.out.println("Original: ");
        printNumbers(array);
        System.out.println("_______________________________");

        for (int i = 0; i < length ; i++) {
            for (int j = 0; j < length - 1; j++) {
                nextIndex = j + 1;

                //change '>' to '<' for reverse order
                if(array[j] > array[nextIndex]){
                    swopNumbers(j, nextIndex, array);
                }
            }

            printNumbers(array);

        }
    }

    private void swopNumbers(int index1, int index2, int[] array){

        int temp;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private void printNumbers(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.println("\n");
    }

}
