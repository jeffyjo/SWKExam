package Prep._2_InterfaceAndGenerics;

/**
 * Created by jeffjorgensen on 23/12/2016.
 */
public class NonGenericsExampleWithStrings {
    private String s1;
    private String s2;

    public NonGenericsExampleWithStrings(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;

        System.out.println("s1=" + s1 + " s2=" + s2);

    }

    public void swopIt(){
        String temp = s1;
        s1 = s2;
        s2 = temp;

        System.out.println("s1=" + s1 + " s2=" + s2);

    }

}
