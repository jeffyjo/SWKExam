package _1_OOP_Encapsulation_Abstraction_Inheritence_Polymorphism.Encapsulation.Polymorphism.ShapeExample;

/**
 * Created by jeffjorgensen on 23/12/2016.
 */
public class Rectangle implements Shape {
    private double area;
    private double height;
    private double length;

    public Rectangle(double height, double length) {
        this.height = height;
        this.length = length;
    }

    @Override
    public void calcArea(double valA, double valB) {
        this.area = valA * valB;
    }

    public double getArea() {
        return area;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
