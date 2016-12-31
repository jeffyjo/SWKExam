package _2_InterfaceAndGenerics;

import java.util.Iterator;
import java.util.List;

/**
 * Created by jeffjorgensen on 22/12/2016.
 */
public class GenericsExample<E> {
    private E first;
    private E second;

    public GenericsExample(E first, E second) {
        this.first = first;
        this.second = second;

        System.out.println("first=" + first + " second=" + second);
    }

    public void swopIt(){
        E temp = first;
        first = second;
        second = temp;

        System.out.println("first=" + first + " second=" + second);
    }
}
