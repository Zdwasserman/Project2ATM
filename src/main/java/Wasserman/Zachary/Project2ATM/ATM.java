package Wasserman.Zachary.Project2ATM;

import java.util.Scanner;

/**
 * Created by zacharywasserman on 9/16/16.
 */
public class ATM {

    public Double withdraw(Account account, Double amount){
        account.setBalance(account.getBalance()  - amount);
        return account.getBalance();
    }
    public Double deposit(Account account, Double amount){
        account.setBalance(account.getBalance() + amount);
        return account.getBalance();
    }
    public void transfer(){

    }
    public Double balance(Account account){
        return account.getBalance();
    }
}
