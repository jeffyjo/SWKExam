package Exam._11_Design_Patterns.MVC.MVC.Controller;

import Exam._11_Design_Patterns.MVC.MVC.Model.Car;

import java.util.ArrayList;

/**
 * Created by jeffjorgensen on 23/12/2016.
 */
public class CarShop {
    private ArrayList<Car> cars = new ArrayList<>();

    public CarShop(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public CarShop(){}

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public void addCar(Car c){
        cars.add(c);
    }

    public void createCar(String manufacter, String model, int HP){
        Car c = new Car(manufacter, model, HP);
        addCar(c);
    }

    //what if cars-array is empty
    public void showCars(){
        for (Car c : cars) {
            System.out.println(c.toString());
        }
    }

    @Override
    public String toString() {
        return "CarShop{" +
                "cars=" + cars +
                '}';
    }
}
