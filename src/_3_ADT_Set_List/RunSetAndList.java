package _3_ADT_Set_List;

import java.util.*;

/**
 * Created by jeffjorgensen on 29/12/2016.
 */
public class RunSetAndList {
    public static void main(String[] args) {

        List<Integer> stringList = new ArrayList<>();
        Set<Integer> stringSet = new HashSet<>();

        int[] numbers = {30, 10, 600, 123, 122, 134565, 36, 77};

        for (int i = 0; i < numbers.length; i++) {
            stringList.add(numbers[i]);
            stringSet.add(numbers[i]);
        }

        /*
        stringList.add(a.hashCode());
        stringList.add(a.hashCode());
        stringList.add(a1.hashCode());

        stringSet.add(a.hashCode());
        stringSet.add(a.hashCode());
        stringSet.add(a1.hashCode());


        System.out.println(stringSet);
        System.out.println("__________");

        stringSet.spliterator();

        */

        //Difference between storing data in set and list
        System.out.println(stringList);
        System.out.println("_________");
        System.out.println(stringSet);


        //try to add duplicates
        stringList.add(30);
        stringSet.add(30);

        System.out.println("------------------------------------");

        System.out.println(stringList);
        System.out.println("_________");
        System.out.println(stringSet);


        //treeSet sorts its data
        Set<Integer> treeSet = new TreeSet<>(stringSet);

        System.out.println();
        System.out.println("This is a treeSet");
        System.out.println(treeSet);

    }
}
