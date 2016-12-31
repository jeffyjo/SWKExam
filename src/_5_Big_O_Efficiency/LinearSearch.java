package _5_Big_O_Efficiency;

/**
 * Created by jeffjorgensen on 30/12/2016.
 */
public class LinearSearch {

    //Search for specific integer in array
    public int linearSearch(int[] array, int key){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }

        return -1;

    }

}
