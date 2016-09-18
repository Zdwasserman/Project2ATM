package Wasserman.Zachary.Project2ATM;

import java.util.ArrayList;


public class Account {
    private static int accountNumCounter = 1;
    private int accountNum;
    private String accountHolderName;
    //private Enum accountType;
    private Double balance;
    //private enum status;


    public enum Status{
        OPEN, CLOSE
    }
    public enum AccountType{
        SAVINGS, CHECKING, INVESTING
    }

    public Status status;
    public AccountType accountType;

    // constructer for account object
    public Account(String accountHolderName, Double balance){
        this.accountNum = accountNumCounter++;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = balance;
        this.status = status.OPEN;


    }
    // Return account balance
    public Double getBalance(){
        return balance;
    }
    //Return account number
    public int getAccountNum(){return accountNum;}
    // Change account balance
    public void setBalance(Double balance){
        this.balance = balance;
    }
    // Change account type
    public void setAccountType(AccountType accountType){
        this.accountType = accountType;
    }



}
