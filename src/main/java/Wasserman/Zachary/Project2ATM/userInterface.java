package Wasserman.Zachary.Project2ATM;

import javax.security.auth.login.AccountNotFoundException;
import java.util.Scanner;


public class userInterface {
    UserManager manager = new UserManager();
    AccountManager accManager = new AccountManager();
    TransactionManager transManager = new TransactionManager();


    User user;

    public void menu() {
        User user1 = new User("bob");
        Account testAcc1 = new Account("bob", 0.0);
        Account testAcc2 = new Account("bob", 0.0);
        manager.userList.add(user1);
        accManager.accountList.add(testAcc1);
        accManager.accountList.add(testAcc2);
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
                        this.user = manager.getUser(pin);
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
            System.out.println("5) View log");
            System.out.println("6) log out");
            Scanner input = new Scanner(System.in);
            int selection = input.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("How much money would you like to withdrawal?");
                    Double amount = input.nextDouble();
                    Transaction atm = new Transaction(amount, accManager.account.getAccountNum(), "withdrawn");
                    atm.withdraw(accManager.account, amount);
                    System.out.println(amount + " withdrawn from account");

                    transManager.transactionList.add(atm);
                    break;
                case 2:
                    System.out.println("How much money do you want to deposit?");
                    amount = input.nextDouble();
                    atm = new Transaction(amount, accManager.account.getAccountNum(), "deposited");
                    atm.deposit(accManager.account, amount);
                    System.out.println(amount + " deposited to your account");
                    transManager.transactionList.add(atm);
                    break;
                case 3:
                    System.out.println("How much money do you want to transfer?");
                    amount = input.nextDouble();
                    System.out.println("What account do you want to tranfer money to?");
                    atm = new Transaction(amount, accManager.account.getAccountNum(), "transfered");
                    //atm.transfer(accManager.account, amount);
                    break;
                case 4:
                    atm = new Transaction(0.0, accManager.account.getAccountNum(), "check balance");
                    System.out.println("your balance is: " +  atm.balance(accManager.account));
                    transManager.transactionList.add(atm);
                    break;
                case 5:
                    transManager.printTransaction();
                    break;
                case 6:
                    logOut = true;
            }
        }
    }
}
