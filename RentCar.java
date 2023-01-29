package object;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ahmetkaska
 */
public class RentCar {

    // Rent a Car Attribures and Lists
    // I defined object list. But I am not initilaize this object list (arraylist or reference list).
    ArrayList<Car> carList;
    ArrayList<User> userList;
    ArrayList<Car> soldCarList;
    private int no;
    private String name;
    private String address;
    private String telephoneNumber;

    // I used this() function to assign default values ​​if missing value is sent to object constructor method.
    public RentCar() {
        this(0, "Not Information", "Not Information", "Not Information");
    }

    // I do initilaize arrayList inside constructor. Because, every car rental center created should have these lists. 
    public RentCar(int no, String name, String address, String telephoneNumber) {
        carList = new ArrayList<Car>();
        soldCarList = new ArrayList<Car>();
        userList = new ArrayList<>();
        this.no = no;
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;

    }

    // Getters and Setters
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    // Show information of rent a car.
    public void informationOfRentCar() {
        String message = "\n!!! Hello everyone. Welcome to  " + getName() + ". You can easily be contac us. Addreess : " + getAddress() + " and Telephone : " + getTelephoneNumber() + ".\n";
        System.out.println(message);
    }
    // Show element of user list

    public void showUserList() {

        for (int i = 0; i < userList.size(); i++) {
            System.out.println((i + 1) + ". " + userList.get(i).toString());
            System.out.println("//////////////////////////////////////////////////////////////");

        }
    }
    // Show element of car list

    public void showCarList() {
        for (int i = 0; i < carList.size(); i++) {
            System.out.println((i + 1) + ". " + carList.get(i).toString());
            System.out.println("//////////////////////////////////////////////////////////////");
        }

    }
    // The takeCar() function takes user and car objects as parameters.
    public void takeCar(User user, Car car) {
        System.out.println("Hi dear " + user.getName() + " " + user.getSurname());
        if (user.getBalance() >= car.getPrice()) { // The condition is true if the user's balance is greater than or equal to the price of the car. 
            soldCarList.add(car); // And I added the car to the list of cars sold 
            System.out.println(car.getBrand() + " is best choice.");
            System.out.println("************************************************************************");
            car.showCar(); // I show car
            carList.remove(car); // I removed the car the list of car. Because, car is already sold.
        } else {
            System.out.println("Unfortunately we are unable to process your transaction. Dear " + user.getName() + " " + user.getSurname() + ". Your your balance is below the price of the car. ");

        }
    }
    // Show element of sold car list

    public void showSoldCarList() {
        for (int i = 0; i < soldCarList.size(); i++) {
            System.out.println((i + 1) + ". " + soldCarList.get(i).toString());
            System.out.println("//////////////////////////////////////////////////////////////");
        }

    }

    // Overriding for element of rentCarList is an object. So i overrided toString() method.
    @Override
    public String toString() {
        return getNo() + " -->  Name : " + getName() + " Address : " + getAddress() + " Telephone Number : " + getTelephoneNumber();
    }

}
