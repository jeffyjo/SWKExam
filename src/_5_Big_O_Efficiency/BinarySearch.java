package _5_Big_O_Efficiency;

/**
 * Created by jeffjorgensen on 30/12/2016.
 */
public class BinarySearch {

    public int binarySearch(int[] array, int key){

        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == array[mid]) {
                return mid;
            }
            if (key < array[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }


}
