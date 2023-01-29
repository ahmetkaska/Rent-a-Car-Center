package object;

import java.util.ArrayList;

/**
 *
 * @author ahmetkaska
 */

public class Car {

    static int id = 0;
    private String brand;
    private String model;
    private int price;
    private String numberPlate;
   
    public Car() {
        this("Not Information", "Not Information", 0, "Not Information");
    }

    public Car(String brand, String model, int price, String numberPlate) {
        id++;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.numberPlate = numberPlate;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.brand = model;
    }

    public String getModel() {
        return model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }
    
    

    public void showCar() {
        System.out.println("--- Car Information ---");
        String message = "Brand : " + getBrand() + "\nModel : " + getModel() + "\nPrice : " + getPrice() +  "\nCar Id : " + this.id + "\nNumber Plate : " + getNumberPlate()  ;
        System.out.println(message);
    }

    @Override
    public String toString() {
        return  " Brand : " + getBrand() + " Model : " + getModel() + " Price : " + getPrice() + " Car Id : " + this.id + " Number Plate : " + getNumberPlate()  ;
    }
}
