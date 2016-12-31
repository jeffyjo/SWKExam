package _1_OOP_Encapsulation_Abstraction_Inheritence_Polymorphism.Encapsulation.Encapsulation;

/**
 * Created by jeffjorgensen on 22/12/2016.
 */
public class EncapsulationMain {

    public static void main(String[] args) {
        Person p = new Person("John", 23);

        System.out.println(p);

        p.setName("newName");

        System.out.println(p);

        //No encap
        PersonNoEncap pne = new PersonNoEncap("Janis", 90);

        System.out.println(pne);

        pne.name = "Hi";

        System.out.println(pne);

    }
}
