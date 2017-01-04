package Prep._1_OOP_Encapsulation_Abstraction_Inheritence_Polymorphism.Abstraction;

/**
 * Created by jeffjorgensen on 22/12/2016.
 */
public abstract class LivingThing {
    private String name;

    public LivingThing(String name) {
        this.name = name;
    }

    public String toString(){
        return name;
    }

    public abstract void sayHi();

}
