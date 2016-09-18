package Wasserman.Zachary.Project2ATM;

import java.util.ArrayList;
import java.util.Scanner;


public class AccountManager {
    ArrayList<Account> accountList = new ArrayList<>();
    Account account;

    public void createAccount(){
        System.out.println("What is the name of the account holder?");
        Scanner input = new Scanner(System.in);
        String holderName = input.next();
        Account account = new Account(holderName, 0.0);
        System.out.println("What type of account do you want to create?");
        String type = input.next();
        System.out.println("You account number is " + account.getAccountNum());
        switch(type){
            case "checking":
                account.accountType = account.accountType.CHECKING;
                break;
            case "savings":
                account.accountType = account.accountType.SAVINGS;
                break;
            case "invastment":
                account.accountType = account.accountType.INVESTING;
        }
        accountList.add(account);

    }
    public Account getAccount(){
        System.out.println("Enter your Account Number");
        Scanner scan = new Scanner(System.in);
        int pin = scan.nextInt();
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getAccountNum() == pin) {
                System.out.println("Login successful!");
                 account = accountList.get(i);
                 return account;
            }
            else{
                System.out.println("Incorrect Account Number");
            }

        }
        return null;
    }


}
