package Wasserman.Zachary.Project2ATM;


import java.util.ArrayList;
import java.util.Scanner;

public class UserManager {
    protected ArrayList<User> userList = new ArrayList<>();

    User user;

    public void createUser(){
        System.out.println("Enter User Name");
        Scanner scan2 = new Scanner(System.in);
        String userName = scan2.nextLine();
        User user = new User(userName);
        userList.add(user);
        System.out.println(user.getPIN()+ ": is your new pin");

    }
    public void printUserList(){
        for (User x : userList){
            System.out.println(x);
        }
    }

    public User getUser(int pin) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getPIN() == pin) {
                System.out.println("Login successful!");
                user = userList.get(i);
                return user;
            }
            else{
                System.out.println("Incorrect PIN");
            }
        }
            return null;

        }
    }

