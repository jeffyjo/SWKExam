package Prep._1_OOP_Encapsulation_Abstraction_Inheritence_Polymorphism.Polymorphism;

import Prep._1_OOP_Encapsulation_Abstraction_Inheritence_Polymorphism.Polymorphism.AnimalExample.Animal;
import Prep._1_OOP_Encapsulation_Abstraction_Inheritence_Polymorphism.Polymorphism.AnimalExample.Cat;
import Prep._1_OOP_Encapsulation_Abstraction_Inheritence_Polymorphism.Polymorphism.AnimalExample.Dog;
import Prep._1_OOP_Encapsulation_Abstraction_Inheritence_Polymorphism.Polymorphism.ShapeExample.Rectangle;
import Prep._1_OOP_Encapsulation_Abstraction_Inheritence_Polymorphism.Polymorphism.ShapeExample.Triangle;

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
