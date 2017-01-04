package Prep._1_OOP_Encapsulation_Abstraction_Inheritence_Polymorphism.Abstraction;

/**
 * Created by jeffjorgensen on 22/12/2016.
 */
public class Person extends LivingThing{
    private int age;

    public Person(String name) {
        super(name);
    }

    public Person(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + super.toString() +
                ", age=" + age +
                '}';
    }

    @Override
    public void sayHi() {

    }
}
