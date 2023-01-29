package object;

import java.util.Scanner;

/**
 *
 * @author ahmetkaska
 */
public class UserLogin {

    public boolean login(User user) {

        Scanner input = new Scanner(System.in);
        String userName;
        String password;
        System.out.println("Please enter your user name : ");
        userName = input.next();
        System.out.println("Please enter your password : ");
        password = input.next();
        System.out.println("*****************************************************************************************");
        // Returns true if the username and password received from the user and the username and password of the user object passed as a parameter to the function match. Otherwise it returns false.
        if (user.getName().equals(userName) && user.getPassword().equals(password)) {
            return true;
        } else {
            return false;
        }

    }

}
