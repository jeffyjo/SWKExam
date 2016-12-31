package _2_InterfaceAndGenerics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jeffjorgensen on 22/12/2016.
 */
public class InterfaceMain implements InterfaceTest {
    @Override
    public void sayHi() {
        System.out.println("hihi");
    }

    public static void main(String[] args) {
        InterfaceMain interfaceMain = new InterfaceMain();

        interfaceMain.sayHi();
        System.out.println(InterfaceTest.a);


        //Generic
        //list with unknown type. not-null
        List<?> l = new ArrayList<>();

        /*Not possible to add non-null values*/

        //l.add(1);
        //l.add(String);
        //l.add(Object);
        l.add(null);

        int first = 1;
        int second = 2;
        NonGenericsExampleWithInsts non = new NonGenericsExampleWithInsts(first, second);
        non.swopIt();

        String hello = "Hello";
        String world = "World";
        NonGenericsExampleWithStrings nos = new NonGenericsExampleWithStrings(hello, world);
        nos.swopIt();

        System.out.println("__________________");

        GenericsExample<Integer> genInt = new GenericsExample<>(first, second);
        genInt.swopIt();

        GenericsExample<String> genString = new GenericsExample<>(hello, world);
        genString.swopIt();

    }
}
