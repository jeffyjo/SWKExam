package _1_OOP_Encapsulation_Abstraction_Inheritence_Polymorphism.Encapsulation.AccesModifiers;

import _1_OOP_Encapsulation_Abstraction_Inheritence_Polymorphism.Encapsulation.AccesModifiers.myPackage.PublicAccessModifier;

/**
 * Created by jeffjorgensen on 22/12/2016.
 */
class ProtectedAccessModifier extends PublicAccessModifier {
    protected void SayHello() {
        System.out.println("hello");
    }
}