package _5_Big_O_Efficiency;

/**
 * Created by jeffjorgensen on 31/12/2016.
 */
public class SelectionSort {
    public int[] doSelectionSort(int[] arr){

        System.out.println("Original: ");
        printNumbers(arr);
        System.out.println("_______________________________");

        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }

            printNumbers(arr);

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }

        printNumbers(arr);
        return arr;
    }

    private void printNumbers(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.println("\n");
    }

}
