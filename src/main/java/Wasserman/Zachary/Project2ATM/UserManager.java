package Wasserman.Zachary.Project2ATM;


import java.util.ArrayList;
import java.util.Scanner;

public class UserManager {
    // a list that holds all user objects
    public ArrayList<User> userList = new ArrayList<>();

    User user;
    // creates a user and stores it in userList
    public void createUser(String userName){
        User user = new User(userName);
        userList.add(user);
        System.out.println(user.getPIN()+ ": is your new pin");

    }
    // unused - prints content of user list
    public void printUserList(){
        for (User x : userList){
            System.out.println(x);
        }
    }
    // searches user list for specified user and returns it
    public User getUser(int pin) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getPIN() == pin) {
                System.out.println("Login successful!");
                user = userList.get(i);
                return user;
            }
        }
            return null;

        }
    }

