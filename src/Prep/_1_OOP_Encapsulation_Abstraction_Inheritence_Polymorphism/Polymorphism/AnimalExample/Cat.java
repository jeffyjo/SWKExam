package Prep._1_OOP_Encapsulation_Abstraction_Inheritence_Polymorphism.Polymorphism.AnimalExample;

/**
 * Created by jeffjorgensen on 22/12/2016.
 */
public class Cat extends Animal{

    @Override
    public void saySound() {
        System.out.println("Miaw");
    }
}