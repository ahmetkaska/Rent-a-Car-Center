package object;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author ahmetkaska
 */
public class main {

    public static void main(String[] args) throws InterruptedException {

        ArrayList<RentCar> rentCarList = new ArrayList<RentCar>(); // For keep rent car object referance. 
        Scanner input = new Scanner(System.in);
        int rentCarNo;        // Variable for defined to get the car rental center numbers from the user.
        String carPlate;      // Variable for defined to get the car number plate from the user.
        // Cars for testing.
        Car car = new Car("Mercedes", "G", 700000, "36GS1905");
        Car car2 = new Car("BMW", "5.20i", 300000, "34BMW1905");
        Car car3 = new Car("Maserati", "2017", 200000, "36AK1905");
        Car car4 = new Car("Mazda", "2010", 600000, "34FAA1905");
        Car car5 = new Car("Mustang", "2011", 3300000, "04KA1905");
        Car car6 = new Car("Ferrari", "2009", 2100000, "34GSS1905");

        Car car7 = new Car("Golf", "A", 43000, "34NU1905");
        Car car8 = new Car("Bugatti", "2022", 1300000, "16BU1905");
        Car car9 = new Car("TOGG", "2023", 14531453, "25ER1905");
        Car car10 = new Car("Murat", "131", 20000, "47M1905");
        Car car11 = new Car("Volvo", "s90", 500000, "34CZR1905");
        Car car12 = new Car("Porshe", "2022", 1200000, "36AT1905");

        Car car13 = new Car("Mercedes", "G", 700000, "36GS1905");
        Car car14 = new Car("BMW", "5.20i", 300000, "34BMW1905");
        Car car15 = new Car("Maserati", "2017", 200000, "36AK1905");
        Car car16 = new Car("Mazda", "2010", 600000, "34FAA1905");
        Car car17 = new Car("Mustang", "2011", 3300000, "04KA1905");
        Car car18 = new Car("Ferrari", "2009", 2100000, "34GSS1905");

        Car car19 = new Car("Mercedes", "G", 700000, "36GS1905");
        Car car20 = new Car("BMW", "5.20i", 300000, "34BMW1905");
        Car car21 = new Car("Maserati", "2017", 200000, "36AK1905");
        Car car22 = new Car("Mazda", "2010", 600000, "34FAA1905");
        Car car23 = new Car("Mustang", "2011", 3300000, "04KA1905");
        Car car24 = new Car("Ferrari", "2009", 2100000, "34GSS1905");

        // Rent Cars for testing. I added the cars to the rent car lists.
        RentCar rentCar1 = new RentCar(100, "Kaska Rent a Car", "Sultangazi", "0537 *** ** **");
        //rentCar1.informationOfRentCar();
        rentCar1.carList.add(car);
        rentCar1.carList.add(car2);
        rentCar1.carList.add(car3);
        rentCar1.carList.add(car4);
        rentCar1.carList.add(car5);
        rentCar1.carList.add(car6);
        //rentCar1.showCarList();
        //System.out.println("\n----------------------------------------------------------------\n");
        RentCar rentCar2 = new RentCar(101, "EYP Rent a Car", "Florya", "0546 *** ** **");
        //rentCar2.informationOfRentCar();
        rentCar2.carList.add(car7);
        rentCar2.carList.add(car8);
        rentCar2.carList.add(car9);
        rentCar2.carList.add(car10);
        rentCar2.carList.add(car11);
        rentCar2.carList.add(car12);
        //rentCar2.showCarList();
        //System.out.println("\n----------------------------------------------------------------\n");
        RentCar rentCar3 = new RentCar(103, "BZM Motors", "Yenikoy", "0212 *** ** **");
        rentCar3.carList.add(car13);
        rentCar3.carList.add(car14);
        rentCar3.carList.add(car15);
        rentCar3.carList.add(car16);
        rentCar3.carList.add(car17);
        rentCar3.carList.add(car18);
        //System.out.println("\n----------------------------------------------------------------\n");
        RentCar rentCar4 = new RentCar(104, "Yolcu 360", "Kadikoy", "0850 *** ** **");
        rentCar4.carList.add(car19);
        rentCar4.carList.add(car20);
        rentCar4.carList.add(car21);
        rentCar4.carList.add(car22);
        rentCar4.carList.add(car23);
        rentCar4.carList.add(car24);

        // Users for testing
        User user1 = new User("Ahmet", "Kaska", 24, "ahmet@gmail.com", "363636", 100000000);
        rentCar1.userList.add(user1);
        User user2 = new User("Ali", "Ak", 22, "ali@gmail.com", "252525", 50000);
        rentCar1.userList.add(user2);

        // I added the generated object references to the list of rental car companies.
        rentCarList.add(rentCar1);
        rentCarList.add(rentCar2);
        rentCarList.add(rentCar3);
        rentCarList.add(rentCar4);

        // Menu
        System.out.println("\n\n                                                            ---- Welcome to Rent Car Center ---- ".toUpperCase(Locale.ITALY));
        for (int a = 0; a < rentCarList.size(); a++) {
            for (int b = 0; b < rentCarList.get(a).userList.size(); b++) {
                while (true) {  // infinity loop for confirm user
                    UserLogin login = new UserLogin(); // confirm page
                    if (login.login(rentCarList.get(a).userList.get(b))) { // With the object reference generated from the UserLogin class, I sent the elements in the user list of each element of the list where the car rental centers are kept to the login function.
                        rentCarList.get(a).userList.get(b).showUser(); // I showed the information of the user who returned the true value from the login function
                        System.out.println("******************************************************************************************************");
                        System.out.println("");
                        for (int i = 0; i < rentCarList.size(); i++) {
                            System.out.println((i + 1) + " " + rentCarList.get(i).toString()); // I showed the car rental centers. Here, I override the toString() method because each element of the list of rental centers is an object.
                        }
                        System.out.println("Please choice a rent car.");
                        rentCarNo = input.nextInt(); // I asked the user for the car rental center number.
                        System.out.println("-------");
                        for (int i = 0; i < rentCarList.size(); i++) {

                            if (rentCarList.get(i).getNo() == rentCarNo) { // If the car rental center number entered by the user matches the number of any car rental center, the condition will return true.
                                rentCarList.get(i).informationOfRentCar(); // I showed the information of the car rental center whose condition was correct.
                                System.out.println("***************************  Our Cars   ***************************");
                                rentCarList.get(i).showCarList(); // I showed the information of the vehicles belonging to the car rental center.
                                System.out.println("********************************************************************\nPlease enter the license plate of the vehicle you want to buy.");
                                carPlate = input.next(); // I asked the user to enter the license plate of the car they want to buy.
                                for (int j = 0; j < rentCarList.get(i).carList.size(); j++) {
                                    if (rentCarList.get(i).carList.get(j).getNumberPlate().equals(carPlate)) { // The condition will be true if the license plate entered matches one of the vehicles in the list.
                                        rentCarList.get(i).takeCar(user1, rentCarList.get(i).carList.get(j)); // And I have included the vehicle purchase function.
                                        break; // for out side this loop
                                    }

                                }
                                System.out.println("************************************************************************");
                                System.out.println("--- List of cars we sell ---");
                                rentCarList.get(i).showSoldCarList();
                                System.out.println("************************************************************************");
                                System.out.println("--- Current car list ---");
                                rentCarList.get(i).showCarList();
                                return; // for finished operations and out side infinity loop
                            }

                        }

                    } else {
                        Thread.sleep(2000);
                        System.out.println("Your user name or password is wrong !!\nTry Again..");
                    }

                }

            }
        }

    }

}
