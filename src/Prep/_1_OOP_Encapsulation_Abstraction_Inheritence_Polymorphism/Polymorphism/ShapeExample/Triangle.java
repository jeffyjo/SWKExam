package Prep._1_OOP_Encapsulation_Abstraction_Inheritence_Polymorphism.Polymorphism.ShapeExample;

/**
 * Created by jeffjorgensen on 23/12/2016.
 */
public class Triangle implements Shape{
    private double area;
    private double height;
    private double baseLine;

    public Triangle(double height, double baseLine) {
        this.height = height;
        this.baseLine = baseLine;
    }

    @Override
    public void calcArea(double valA, double valB) {
        this.area = valA * valB / 2;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBaseLine() {
        return baseLine;
    }

    public void setBaseLine(double baseLine) {
        this.baseLine = baseLine;
    }
}
