package Prep._2_InterfaceAndGenerics;

/**
 * Created by jeffjorgensen on 23/12/2016.
 */
public class NonGenericsExampleWithInsts {
    private int i;
    private int j;

    public NonGenericsExampleWithInsts(int i, int j) {
        this.i = i;
        this.j = j;
        System.out.println("i=" + i + " j=" + j);
    }

    public void swopIt(){
        int temp = i;
        i = j;
        j = temp;

        System.out.println("i="+ i + " j=" + j);
    }
}
