package object;

import java.util.ArrayList;

/**
 *
 * @author ahmetkaska
 */
public class User {
    // Atribute of users
    public static int userID = 0;
    private String name;
    private String surname;
    private int age;
    private String email;
    private String password;
    private int balance;
    
    // I used this() function to assign default values ​​if missing value is sent to object constructor method.
    public User(){
        this("Not Information", "Not Information", 0, "Not Information", "Not Information", 0);
    }
    
    // Constructor
    public User(String name, String surname, int age, String email, String password, int balance) {

        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.password = password;
        this.balance = balance;
        userID++;

    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // Show user
    public void showUser() {
        String show = "--> Name : " + getName() + " - Surname : " + getSurname() + " - Age : " + getAge() + " - Email : " + getEmail() + " - Password : " + getPassword() + " - Balance : " + getBalance();
        System.out.println(show);
    }

    // Overriding for elemen of userList is an object. So i overrided toString() method.
    @Override
    public String toString() {
        return "Name : " + getName() + " - Surname : " + getSurname() + " - Age : " + getAge() + " - Email : " + getEmail() + " - Password : " + getPassword() + " - Balance : " + getBalance();

    }

}
