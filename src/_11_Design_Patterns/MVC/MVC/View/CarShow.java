package _11_Design_Patterns.MVC.MVC.View;

import _11_Design_Patterns.MVC.MVC.Controller.CarShop;

/**
 * Created by jeffjorgensen on 23/12/2016.
 */
public class CarShow {
    public static void main(String[] args) {

        //ArrayList<Car> cars = new ArrayList<>();

        CarShop carShop = new CarShop();

        carShop.createCar("Audi", "RS3", 500);
        carShop.createCar("Ford", "Fiesta", 30);

        System.out.println(carShop);

    }
}
