package Prep.AccessModifier.AccessModifierB;

import Prep.AccessModifier.*;

/**
 * Created by jeffjorgensen on 03/01/2017.
 */

public class AccesB extends AccessA {

    //Cannot override default access modifier-methods

    //Can override protected access modifier-methods
    @Override
    protected void msg() {
        System.out.println("Hello from child-class");
    }

    public static void main(String args[]) {
        //AccesA obj = new AccesA();//Compile Time Error
        //obj.msg();//Compile Time Error

        AccesB t = new AccesB();
        t.msg();

    }
}

