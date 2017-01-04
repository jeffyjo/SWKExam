package Prep._1_OOP_Encapsulation_Abstraction_Inheritence_Polymorphism.Abstraction;

/**
 * Created by jeffjorgensen on 22/12/2016.
 */
public class AbstractionMain {
    public static void main(String[] args) {

        Person p = new Person("Per_son");

        LivingThing person = new Person("John");

        System.out.println(p);
        System.out.println(person);

        LivingThing livingThing = new LivingThing("hi") {
            @Override
            public void sayHi() {

            }
        };



    }
}
