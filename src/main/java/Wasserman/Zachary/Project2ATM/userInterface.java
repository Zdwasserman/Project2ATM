package Wasserman.Zachary.Project2ATM;

import java.util.Scanner;


public class userInterface {
    UserManager manager = new UserManager();
    AccountManager accManager = new AccountManager();
    ATM atm = new ATM();


    public void menu() {
        boolean loggedIn = false;
        while (loggedIn == false) {
            System.out.println("User options >>> ");
            System.out.println("--------------------");
            System.out.println("1) log in");
            System.out.println("2) Create user");
            Scanner input = new Scanner(System.in);
            int selection = input.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("Enter your PIN");

                    int pin = input.nextInt();
                    manager.getUser(pin);
                    if (manager.user != null) {
                        loggedIn = true;
                    }
                    break;
                case 2:
                    manager.createUser();
                    break;
                //case 3: manager.printUserList();
            }
        }
        boolean inAccount = false;
        while (inAccount == false) {
            System.out.println("Account options >>> ");
            System.out.println("--------------------");
            System.out.println("1) Select an account");
            System.out.println("2) Create an account");
            Scanner input = new Scanner(System.in);
            int selection = input.nextInt();
            switch (selection) {
                case 1:
                    accManager.getAccount();
                    if (accManager.account != null) {
                        inAccount = true;
                    }
                    break;
                case 2:
                    accManager.createAccount();
                    break;
            }

        }
        boolean logOut = false;
        while (logOut == false) {
            System.out.println("Account options >>> ");
            System.out.println("--------------------");
            System.out.println("1) Withdraw");
            System.out.println("2) Deposit");
            System.out.println("3) Transfer");
            System.out.println("4) Balance");
            Scanner input = new Scanner(System.in);
            int selection = input.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("How much money would you like to withdrawal?");
                    Double amount = input.nextDouble();
                    atm.withdraw(accManager.account, amount);
                    System.out.println(amount + " withdrawn from account");
                    break;
                case 2:
                    System.out.println("How much money do you want to deposit?");
                    amount = input.nextDouble();
                    atm.deposit(accManager.account, amount);
                    System.out.println(amount + " deposited to your account");
                    break;
                case 3:
                    atm.transfer();
                    break;
                case 4:
                    System.out.println("your balance is: " +  atm.balance(accManager.account));

                    break;
                case 5:
                    logOut = true;
            }
        }
    }
}
