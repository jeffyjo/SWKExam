package _1_OOP_Encapsulation_Abstraction_Inheritence_Polymorphism.Encapsulation.Polymorphism;

import _1_OOP_Encapsulation_Abstraction_Inheritence_Polymorphism.Encapsulation.Polymorphism.AnimalExample.Animal;
import _1_OOP_Encapsulation_Abstraction_Inheritence_Polymorphism.Encapsulation.Polymorphism.AnimalExample.Cat;
import _1_OOP_Encapsulation_Abstraction_Inheritence_Polymorphism.Encapsulation.Polymorphism.AnimalExample.Dog;
import _1_OOP_Encapsulation_Abstraction_Inheritence_Polymorphism.Encapsulation.Polymorphism.ShapeExample.Rectangle;
import _1_OOP_Encapsulation_Abstraction_Inheritence_Polymorphism.Encapsulation.Polymorphism.ShapeExample.Triangle;

/**
 * Created by jeffjorgensen on 22/12/2016.
 */
public class PolymorphismMain {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.saySound();

        Animal b = new Dog();
        b.saySound();

        Animal c = new Cat();
        c.saySound();

        Rectangle rectangle = new Rectangle(30, 40);
        Triangle triangle = new Triangle(10, 30);

        rectangle.calcArea(rectangle.getHeight(), rectangle.getLength());
        System.out.println(rectangle.getArea());
    }
}
