package Wasserman.Zachary.Project2ATM;

import java.util.ArrayList;
import java.util.Scanner;


public class AccountManager {
    // a list that holds all bank accounts
    public ArrayList<Account> accountList = new ArrayList<>();

    Account account;

    // Cre
    public void createAccount(String name, String type){
       account.setAccountHolderName(name);
        switch(type){
            case "checking":
                account.accountType = account.accountType.CHECKING;
                break;
            case "savings":
                account.accountType = account.accountType.SAVINGS;
                break;
            case "investment":
                account.accountType = account.accountType.INVESTING;
        }
        accountList.add(account);

    }
    public Account getAccount(int accnum){
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getAccountNum() == accnum) {
                System.out.println("account accessed!");
                 account = accountList.get(i);
                 return account;
            }
            else{
                System.out.println("Incorrect Account Number");
            }

        }
        return null;
    }
    public void deleteAccount(Account account) {
        if (account.getBalance() == 0){
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i) == account) {
                accountList.remove(i);
            }
            else {
                System.out.println("Request denied!! account balance does not equal zero");
            }
        }

        }
    }
    }
