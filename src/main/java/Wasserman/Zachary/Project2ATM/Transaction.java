package Wasserman.Zachary.Project2ATM;

/**
 * Created by zacharywasserman on 9/18/16.
 */
public class Transaction {
    private Double amount;
    private int accountNum;
    private String description;
    AccountManager accManager = new AccountManager();

    // a constructor for all transactions
    public Transaction(Double amount, int accountNum, String description){
        this.amount = amount;
        this.accountNum = accountNum;
        this.description = description;
    }
     public double getAmount(){
         return amount;
     }
    public int getAccountNum(){
        return accountNum;
    }
    public String getDescription(){
        return description;
    }

        //withdraws money from an account
        public Double withdraw(Account account, Double amount){
            account.setBalance(account.getBalance()  - amount);
            return account.getBalance();
        }
        //deposits money into user accounts
        public Double deposit(Account account, Double amount){
            account.setBalance(account.getBalance() + amount);
            return account.getBalance();
        }
        //transfers money from one account to another
        public void transfer(Account account1,Account account2, Double amount){
            AccountManager accMan = new AccountManager();
            System.out.println("What account do you want to transfer money to?");
            withdraw(account1, amount);
            deposit(account2, amount);


        }
        // returns an account balance
        public Double balance(Account account){
            return account.getBalance();
        }
    }


