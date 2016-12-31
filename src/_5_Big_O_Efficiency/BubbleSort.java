package _5_Big_O_Efficiency;

/**
 * Created by jeffjorgensen on 30/12/2016.
 */
public class BubbleSort {


    public void bubbleSort(int[] array){
        int length = array.length;
        int nextIndex;

        //boolean checks for swopNumbers() in the current iteration
        boolean changed = false;

        System.out.println("Original: ");
        printNumbers(array);
        System.out.println("_______________________________");

        for (int i = 0; i < length ; i++) {
            changed = false;
            for (int j = 0; j < length - 1; j++) {
                nextIndex = j + 1;

                //change '>' to '<' for reverse order
                if(array[j] > array[nextIndex]){
                    swopNumbers(j, nextIndex, array);
                    changed = true;
                }
            }

            //Nothing swopped - numbers are in order
            if (changed == false){
                return;
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
