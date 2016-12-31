package _1_OOP_Encapsulation_Abstraction_Inheritence_Polymorphism.Encapsulation.AccesModifiers.myPackage2;

import _1_OOP_Encapsulation_Abstraction_Inheritence_Polymorphism.Encapsulation.AccesModifiers.myPackage.*;

/**
 * Created by jeffjorgensen on 22/12/2016.
 */
class AccessModifiersMain extends PublicAccessModifier{
    public static void main(String[] args) {

        PublicAccessModifier p = new PublicAccessModifier();

        //TO-DO: make this work

        //System.out.println(p.privateString);
        //System.out.println(p.defaultString);
        //System.out.println(p.protectedString);
        System.out.println(p.publicString);

    }
}
