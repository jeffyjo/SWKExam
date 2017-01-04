package Prep._3_ADT_Set_List;

import java.util.*;

/**
 * Created by jeffjorgensen on 29/12/2016.
 */
public class RunSetAndList {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        Set<Integer> integerSet = new HashSet<>();

        int[] numbers = {30, 10, 600, 123, 122, 134565, 36, 77};

        for (int i = 0; i < numbers.length; i++) {
            integerList.add(numbers[i]);
            integerSet.add(numbers[i]);
        }

        /*
        integerList.add(a.hashCode());
        integerList.add(a.hashCode());
        integerList.add(a1.hashCode());

        integerSet.add(a.hashCode());
        integerSet.add(a.hashCode());
        integerSet.add(a1.hashCode());


        System.out.println(integerSet);
        System.out.println("__________");

        integerSet.spliterator();

        */

        //Difference between storing data in set and list
        System.out.println(integerList);
        System.out.println("_________");
        System.out.println(integerSet);


        //try to add duplicates
        integerList.add(30);
        integerSet.add(30);

        System.out.println("------------------------------------");

        System.out.println(integerList);
        System.out.println("_________");
        System.out.println(integerSet);


        //treeSet sorts its data
        Set<Integer> treeSet = new TreeSet<>(integerSet);

        System.out.println();
        System.out.println("This is a treeSet");
        System.out.println(treeSet);

    }
}
