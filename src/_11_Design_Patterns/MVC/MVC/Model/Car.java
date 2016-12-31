package _11_Design_Patterns.MVC.MVC.Model;

/**
 * Created by jeffjorgensen on 23/12/2016.
 */
public class Car {
    private String manufacter;
    private String model;
    private int horsePW;

    public Car(String manufacter, String model, int horsePW) {
        this.manufacter = manufacter;
        this.model = model;
        this.horsePW = horsePW;
    }

    public String getManufacter() {
        return manufacter;
    }

    public void setManufacter(String manufacter) {
        this.manufacter = manufacter;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePW() {
        return horsePW;
    }

    public void setHorsePW(int horsePW) {
        this.horsePW = horsePW;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacter='" + manufacter + '\'' +
                ", model='" + model + '\'' +
                ", horsePW=" + horsePW +
                '}';
    }
}
